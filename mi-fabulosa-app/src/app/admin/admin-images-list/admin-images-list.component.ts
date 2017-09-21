import { Component, OnInit } from '@angular/core';
import {Observable} from 'rxjs/Observable';
import { Image } from '../../models/image';
import {ImageService} from '../../services/image/image.service';

@Component({
  selector: 'mfa-admin-images-list',
  templateUrl: './admin-images-list.component.html',
  styleUrls: ['./admin-images-list.component.css']
})
export class AdminImagesListComponent implements OnInit {
	images: Observable<Image[]>;

  constructor(private imageService: ImageService) { }

  ngOnInit() {
  this.images = this.imageService.getImages();
}

}
