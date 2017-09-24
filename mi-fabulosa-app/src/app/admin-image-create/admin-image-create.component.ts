import { Component, OnInit } from '@angular/core';
import { Image } from '../models/image';

@Component({
  selector: 'mfa-admin-image-create',
  templateUrl: './admin-image-create.component.html',
  styleUrls: ['./admin-image-create.component.css']
})
export class AdminImageCreateComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  createImage(image: Image)
  {
    console.log(image);
  }
}
