package es.jmartin.middelware.images.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.jmartin.middelware.images.api.model.dto.Image;
import es.jmartin.middelware.images.api.model.repository.ImagesRepository;

@RestController
@RequestMapping("/api/v1")
//@RequestMapping("/cursoangular.app/api/v1")
public class ImageRest {

	@Autowired
	ImagesRepository imagesRepository;
	
	@RequestMapping(value = "/images", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Image> findAll() {
		
		Iterable<Image> listaImagenes = imagesRepository.findAll();
	        
	    return listaImagenes;
	}
	
	
	
	@RequestMapping(value = "/images", method= RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Image> add(@RequestBody Image image) {
				
		imagesRepository.save(image);
		       
	    return findAll();
	}	
}
