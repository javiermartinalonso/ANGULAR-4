import { Component, OnInit, Input } from '@angular/core';
import { Image } from '../../models/image';

@Component({
  selector: 'mfa-image-list',
  templateUrl: './image-list.component.html',
  styles: []
})
export class ImageListComponent implements OnInit {
  /* creo un objeto del modelo Image, con la intención de inyectarselo al componente hijo "image"*/
  image =  new Image ('1', 'Primera Imagen', 'Descripción Primera imagen', 'https://videotutoriales.com/maspa/maspa1.jpg', 'https://videotutoriales.com/maspa/maspa1-1.jpg');

  constructor() { }

  ngOnInit() {
  }

}
