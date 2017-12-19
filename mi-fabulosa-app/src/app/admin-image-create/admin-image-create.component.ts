import { Component, OnInit } from '@angular/core';
import { ImageService} from '../services/image/image.service';
import { Router} from '@angular/router';


@Component({
  selector: 'mfa-admin-image-create',
  templateUrl: './admin-image-create.component.html',
  styleUrls: ['./admin-image-create.component.css']
})
export class AdminImageCreateComponent implements OnInit {

  // inyectamos el servicio
  constructor(private imageService: ImageService, private router: Router) { }

  ngOnInit() {
  }

   //crea la imagen y gestionamos los logs del servicio
   createImage(image) {
    this.imageService.addImage(image)
      .subscribe(
        image  => {
          console.log(image);
	        // ruta a la que queremos redirigirnos despues de enviar el formulario
          this.router.navigate(['/admin/images']);
        },
        error =>  console.log(<any>error));
  }
}
