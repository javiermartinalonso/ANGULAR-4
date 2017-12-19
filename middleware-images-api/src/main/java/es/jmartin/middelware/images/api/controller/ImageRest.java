package es.jmartin.middelware.images.api.controller;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
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

	/** logger */
	private static Logger log = LoggerFactory.getLogger(ImageRest.class);
	
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
		
	
	@RequestMapping(value = "/images/{idImage}", method= RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public void update(@PathVariable Integer idImage, @RequestBody Image image, HttpServletResponse response) throws IOException {
		
		log.info("[update Image] idImage=" + idImage);
		
		try{
			Optional<Image> persistedImage = imagesRepository.findById(idImage);
			
			if(persistedImage.isPresent()){
				imagesRepository.save(image);
			}
			else
			{
				log.error("[update Image] Image NOTFOUND idImage="+idImage);
				response.sendError(HttpServletResponse.SC_NOT_FOUND, "Error [update Image] Image NOTFOUND idImage="+idImage);
				return;
			}
 		}catch(Exception e){		
			log.error("[update Image] ERROR idImage="+idImage+"; e="+e.toString(), e);
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error [update Image] idImage="+idImage);			
		} 
	}	
	
	
	@RequestMapping(value = "/images/{idImage}", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Image findById(@PathVariable Integer idImage) {
	    
		Image image = imagesRepository.findById(idImage).orElse(null);
        
	    return image;
	}	
	
}
