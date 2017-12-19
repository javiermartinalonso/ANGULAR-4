import {Component, OnDestroy, OnInit} from '@angular/core';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-admin-image-edit',
  templateUrl: './admin-image-edit.component.html',
  styleUrls: ['./admin-image-edit.component.css']
})
export class AdminImageEditComponent implements OnInit, OnDestroy {
  id: any;
  params: any;

  constructor(private activatedRoute: ActivatedRoute) { }

  ngOnInit() {
    // Al iniciarse el componente envolvemos los parámetros en un observable
    // esperando a que el parámetro id cambie
    this.params = this.activatedRoute.params.subscribe(params => this.id = params['id']);
  }

  ngOnDestroy() {
    // Cuando el componentes es destruido, dejamos de subscribirnos 
    // al cambio en los parámetros y liberamos asi memoria
    this.params.unsubscribe();
  }
}
