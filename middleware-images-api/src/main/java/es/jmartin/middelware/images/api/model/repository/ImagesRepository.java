package es.jmartin.middelware.images.api.model.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import es.jmartin.middelware.images.api.model.dto.Image;

@Repository
public interface ImagesRepository extends PagingAndSortingRepository<Image, Integer> {

}
