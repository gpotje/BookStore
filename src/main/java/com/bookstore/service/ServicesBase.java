package com.bookstore.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import java.util.function.Function;

public class ServicesBase {
	
	@Autowired
	protected ModelMapper modelMapper;
	
	protected <D, T> D convertEntityToDTO(final T model, final Class<D> dtoClass) {
		return model != null ? modelMapper.map(model, dtoClass) : null;
	}
	
	protected <D,T> D convertToDTO(final T model, final Class<D> dtoClass) {
		return model != null ? modelMapper.map(model, dtoClass) : null ;
	}

	protected <T, R> Page<R> convertPage(Page<T> sourcePage,Function <T, R> mapper) {
		return sourcePage.map(mapper);
	}
	protected <D, T> List<D> convertToDTO(final Iterable<T> models, final Class<D> dtoClass) {
		List<D> dtos = new ArrayList<>();
		for (T model : models) {
			dtos.add(modelMapper.map(model, dtoClass));
		}

		return dtos;
	
	}
}
