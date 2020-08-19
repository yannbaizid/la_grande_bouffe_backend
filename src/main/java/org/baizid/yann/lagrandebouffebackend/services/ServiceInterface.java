package org.baizid.yann.lagrandebouffebackend.services;

import java.util.List;
import java.util.Optional;

public interface ServiceInterface<T> {
	public T save(T object);
	public Optional<T>  findById(int id);
	public List<T> findAll();
}
