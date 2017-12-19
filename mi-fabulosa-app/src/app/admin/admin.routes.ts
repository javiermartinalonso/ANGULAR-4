import {Routes} from "@angular/router";
import {AdminImagesListComponent} from "./admin-images-list/admin-images-list.component";
import {DashboardComponent} from "./dashboard.component";
import {AdminImageCreateComponent} from "../admin-image-create/admin-image-create.component";
import {AdminImageEditComponent} from './admin-image-edit/admin-image-edit.component';

export const adminRoutes: Routes = [
  { path: '', component: DashboardComponent},
  { path: 'images', component: AdminImagesListComponent},
  { path: 'images/create', component: AdminImageCreateComponent},
  { path: 'images/edit/:id', component: AdminImageEditComponent }

];
