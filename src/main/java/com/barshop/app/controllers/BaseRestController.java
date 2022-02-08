package com.barshop.app.controllers;

import org.springframework.http.ResponseEntity;

public interface BaseRestController<T, I> {

	public abstract ResponseEntity<Object> findAll();

//	public abstract ResponseEntity<Object> createOrUpdate(@RequestBody T object);
//	
//	public abstract ResponseEntity<Object> createAll(@RequestBody List<T> object);	
//
//	public abstract ResponseEntity<Object> findById(@PathVariable I id);	
//		
//	public abstract ResponseEntity<Object> deleteById(@PathVariable I id);
//	
//	public abstract ResponseEntity<Object> count();
	
}