import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ImageService} from './services/image/image.service';
import { HttpModule } from "@angular/http";
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar.component';
import { GalleryComponent } from './gallery/gallery.component';
import { ImageListComponent } from './gallery/image-list/image-list.component';
import { ImageComponent } from './gallery/image-list/image.component';
import { ImageDetailComponent } from './gallery/image-detail/image-detail.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { routes} from './app.routes';
import { AdminComponent } from './admin/admin.component';
import { AdminImagesListComponent } from './admin/admin-images-list/admin-images-list.component';
import { DashboardComponent } from './admin/dashboard.component';
import { AdminImageCreateComponent } from './admin-image-create/admin-image-create.component';
import { AdminImageEditComponent } from './admin/admin-image-edit/admin-image-edit.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    GalleryComponent,
    ImageListComponent,
    ImageComponent,
    ImageDetailComponent,
    ContactComponent,
    AboutComponent,
    AdminComponent,
    AdminImagesListComponent,
    DashboardComponent,
    AdminImageCreateComponent,
    AdminImageEditComponent
  ],
  imports: [
    routes,
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [ImageService],
  bootstrap: [AppComponent]
})
export class AppModule { }
