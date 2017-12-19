package es.jmartin.middelware.images.api.controller;

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
	

	
	
	@RequestMapping(value = "/images", method= RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public Image update(@PathVariable Image image) {
		
		//TODO que pasa con el control de errores o no existe la imagen que queremos actualizar
		Image imageUpdated = imagesRepository.save(image);
	    
//		imageUpdatedimagesRepository.findById(idImage).orElse(null);
        
	    return imageUpdated;
	    
	    
	    
	    
//		log.info("[updateWorksheet] INICIO WorksheetID="+worksheetId);
//		try{
//			Worksheet persistedWorksheet = worksheetService.updateWorksheet(worksheet, worksheetId);
//			if(persistedWorksheet==null){
//				log.error("[updateWorksheet] Worksheet NOTFOUND WorksheetID="+worksheetId);
//				response.sendError(HttpServletResponse.SC_NOT_FOUND, "Error updateWorksheet; Worksheet NOTFOUND WorksheetId" + worksheetId);
//				return;
//			}
//			
//			worksheetService.rebuildWorksheetPDF("updateWorksheet", persistedWorksheet);
// 		}catch(Exception e){
//			log.error("[updateWorksheet] ERROR WorksheetID="+worksheetId+"; e="+e.toString(), e);
//			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error updateWorksheet; WorksheetId" + worksheetId);
//		}	    
	    
	    
	    
	    
	}	
	
	
	@RequestMapping(value = "/images/{idImage}", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Image findById(@PathVariable Integer idImage) {
	    
		Image image = imagesRepository.findById(idImage).orElse(null);
        
	    return image;
	}	
	
}
