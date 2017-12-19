import { Injectable } from '@angular/core';
import { Image } from '../../models/image';
import {Http, Response} from '@angular/http';
import 'rxjs/Rx';
import {Observable} from 'rxjs/Rx';

@Injectable()
export class ImageService {

  // incluyo el modulo http
  constructor(private http: Http) {
  }

  getImages(): Observable<Image[]> {

    //return this.http.get('http://cursoangular.app/api/v1/images').map((response: Response)   
    return this.http.get('http://localhost:8080/api/v1/images').map((response: Response) => response.json());
  }

  addImage(image: Object): Observable<Image[]> {
    //return this.http.post('http://cursoangular.app/api/v1/images', image)
    return this.http.post('http://localhost:8080/api/v1/images', image)
      .map((response: Response) => response.json())
      .catch((error: any) => Observable.throw(error.json().error || {message: 'Error del Servidor'} ));
  }

}
