package com.nagarro.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nagarro.user.VO.ResponseTemplateVO;
import com.nagarro.user.entity.Person;
import com.nagarro.user.repository.UserRepository;

import com.nagarro.user.VO.Product;
//import com.nagarro.user.vo.ResponseTemplateVO;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RestTemplate restTemplate;

	public Person savePerson(Person person) {
		// TODO Auto-generated method stub
		return userRepository.save(person);
	}



	public ResponseTemplateVO getPersonWithProduct(Long userId) {
		 //TODO Auto-generated method stub
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Person person = userRepository.findByUserId(userId);
		Product product = 
			restTemplate.getForObject("http://PRODUCT-SERVICE/products/" + person.productId,Product.class);
			vo.setPerson(person);
		vo.setProduct(product);
		return vo;
	}

}
