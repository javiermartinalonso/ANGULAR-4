import {Component, OnDestroy, OnInit} from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {ImageService} from '../../services/image/image.service';
import { Image } from '../../models/image';


@Component({
  selector: 'mfa-admin-image-edit',
  templateUrl: './admin-image-edit.component.html',
  styleUrls: ['./admin-image-edit.component.css']
})
export class AdminImageEditComponent implements OnInit, OnDestroy {
  id: any;
  params: any;
  
  image = new Image('id', 'title', 'description', 'thumbnail', 'imageLink');
  constructor(private activatedRoute: ActivatedRoute, private imageService: ImageService) { }

  ngOnInit() {
    // Al iniciarse el componente envolvemos los parámetros en un observable
    // esperando a que el parámetro id cambie
    this.params = this.activatedRoute.params.subscribe(params => this.id = params['id']);
    this.imageService.getImage(this.id).subscribe(
      data => {
       console.log(data);
       this.image.description = data['description'];
       this.image.title = data['title'];
       this.image.imageLink = data['imageLink'];
       this.image.thumbnail = data['thumbnail'];
       this.image.id = data['id'];
      },
      error =>  console.log(<any>error));
  }

  ngOnDestroy() {
    // Cuando el componentes es destruido, dejamos de subscribirnos
    // al cambio en los parámetros y liberamos asi memoria
    this.params.unsubscribe();
  }

  updateImage(image) {
    this.imageService.updateImage(image)
    .subscribe(
      image  => {
        console.log(image);
      },
      error =>  console.log(<any>error));
  }
}
