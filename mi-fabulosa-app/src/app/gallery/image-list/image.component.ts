import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'mfa-image',
  templateUrl: './image.component.html',
  styles: [`
    img {
      -webkit-box-shadow: 0px 1px 6px 1px rgba(0,0,0,0.75);
      -moz-box-shadow: 0px 1px 6px 1px rgba(0,0,0,0.75);
      box-shadow: 0px 1px 6px 1px rgba(0,0,0,0.75);
      margin-bottom:10px;
    }
    
    img:hover {
      filter: gray; /* IE6-9 */
      -webkit-filter: grayscale(1); /* Google Chrome, Safari 6+ & Opera 15+ */
    }
  `]
})
export class ImageComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
