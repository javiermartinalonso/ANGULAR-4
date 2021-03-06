import { Component, OnInit, Input } from '@angular/core';
import { Image } from '../../models/image';
import { ImageService } from '../../services/image/image.service';
import {Observable} from 'rxjs/Rx';

@Component({
  selector: 'mfa-image-list',
  templateUrl: './image-list.component.html',
  styles: []
})
export class ImageListComponent implements OnInit {
  /* creo una lista de objetos observables para poder obtener los objetos a través de un apirest
   del modelo Image, con la intención de inyectarselo al componente hijo "image"*/
  images: Observable<Image[]>;
  /* imagen seleccionada con el output binding del evento OnSelect*/
  selectedImage: Image;

  constructor( private imageService: ImageService ) { }

  ngOnInit() {
    /*life cicle. hook durante el ciclo de vida de la inicialización del componente
    llamamos al metodo del servicio para obtener el contenido del objeto "images"
    */
    this.images = this.imageService.getImages();
  }

  onSelect(image: Image) {
    this.selectedImage = image;
  }

}
