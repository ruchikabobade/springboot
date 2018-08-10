package com.demo;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.demo.model.Author;

@RestController
public class ConsumerController {

	@Autowired
	LoadBalancerClient loadBalancer;
	@GetMapping(path="consume/{id}")
	public String consume(@PathVariable("id") int id)
	{
		ServiceInstance serviceInstance=loadBalancer.choose("author-provider");

		System.out.println(serviceInstance.getUri());

		String baseUrl=serviceInstance.getUri().toString()+"/authors/{id}";

		
		 Map<String, Integer> uriVariables = new HashMap<>();
		    uriVariables.put("id", id);
		    
		    RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<String> response=null;
			try{
				
				response=restTemplate.exchange(baseUrl,
						HttpMethod.GET, getHeaders(),String.class,uriVariables);
			}catch (Exception ex)
			{
				System.out.println(ex);
			}
			System.out.println("resp "+response.getBody());
			return response.getBody()
;//		 ResponseEntity<Author> responseEntity = new RestTemplate().getForEntity(
//			        baseUrl, Author.class,
//			        uriVariables);
//
//			    Author response = responseEntity.getBody();
//
//			    return new Author(response.getId(),response.getName(),response.getGenre());
	}
	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}
}
