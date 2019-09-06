# MiFabulosaApp

## Probar aplicación ##

-	compilar aplicacion angular y generar ficheros

		npm install

- arrancar servidor integrado angular y lanzar el navegador

	    ng serve -o


## creacion de la primera aplicacion en angular 4 "mi-fabulosa-app" ##

Aqui resumo el detalle de acciones realizadas:

- creamos una nueva aplicación angular 4 donde los selectores tienen como prefijo mfa

	    ng new mi-fabulosa-app --prefix mfa

- arrancar servidor integrado angular y lanzar el navegador

	    ng serve -o

- consultar todos los flags de un comando de angular

	`ng generate component --help`
	
	    ng g c --help

- crear componente barra de navegación
	
	> 	ng generate component navbar -is --flat
	-is --inline-style: no crear el fichero css del componente
	--flat: indicamos que no se cree en un nuevo directorio

		ng g c navbar -is --flat --prefix mfa

- crear nuevo componente "gallery"

		ng g c gallery --prefix mfa


- Mejorar el componente "gallery" al estilo angular, crear nuevo componente "image-list" y el componente "image"

		cd src/app/gallery
		ng g c image-list -is --prefix mfa

		cd image-list
		ng g c image -is --flat --prefix mfa

- A continuación refactorizo al estilo angular.
		

- Creamos el modelo (desde el raíz de la aplicación):

		mkdir \src\app\models
		cd \src\app\models
	
	>creamos una nueva clase archivo.ts como modelo de una imagen "image.ts"

		ng g cl image

- probamos el modelo para una imagen

- Creo una lista de objetos del modelo Image desde el componente image-list, con la intención de inyectárselo al componente hijo "image"

- creamos un servicio para manejar la lista de imagenes y asi poder ser usado desde cualquier componente de la aplicacion.

- creo el directorio "services".

		mkdir \src\app\services
		cd \src\app\services
	
	>creamos una nueva clase de servicio archivo.ts como servicio de imagenes

		ng g s image

- mejoro la aplicación, obtener detalle de la imagen seleccionada

- crear componente image-detail

		ng g c image-detail --prefix mfa

- event binding enlazo un evento del dom con un método del componente. De modo que cuando seleccionemos una imagen se muestre su detalle.

      input bindind con []

      output binding con ()

- crear 2 paginas/secciones nuevas: contact y about

		ng g c contact --prefix mfa
		ng g c about --prefix mfa

- añadir un enrutador para poder navegar con el menú de navegación

- usar routerLink en vez de href, para no tener que recargar la pagina

- arreglar la pagina activa del menu, para ello usamos routerLinkActive

- mejorar la estructura del enrutador. creamos app.routers.ts y modificar app.module.ts

- Usar Servicio Angular HTTP.

- crear un componente de administración

		ng g c admin
		ng g c admin-images-list
		ng g c dashboard --flat

- crear panel administración imágenes


- formularios
	- crear un componente de administración

		ng g c admin-image-create

	- modificar el formulario, para que se comporte como un formulario en angular.

- conectar formulario con backend por medio del servicio

- redireccionar el formulario a la pagina de lista de las imágenes

- modificamos las reglas de validación del formulario
	template driven   ---> validacion de formulario basada en plantilla.

- modifico el backend, ahora está creado con spring-boot-rest, es el módulo middleware-images-api


- Usar Param Routes

	- creamos el nuevo componente
	
		`cd src/app/admin`

		`ng g c admin-image-edit`


	- Con esto creamos:
		- admin-image-edit.component.css
    	- admin-image-edit.component.spec.ts
		- admin-image-edit.component.html
		- admin-image-edit.component.ts


	- modificamos el fichero de rutas para añadir la nueva ruta al nuevo componente:
	
 		`\mi-fabulosa-app\src\app\admin.routes.ts`
	


	- añado el nuevo componente a la aplicación
		`\mi-fabulosa-app\src\app\app.module.ts`


- Crear API editar Imágenes.

	- incluimos las nuevas llamadas en el servicio para editar las imágenes, modificamos el archivo `image.service.ts` incluyendo el método getImage(id: String).
	
	- inyectamos el servicio a la clase del componente de edición de imágenes `admin-image-edit.component.ts` de modo que en el método onInit obtenemos los datos de la imagen.

	- En el backend incluyo el método para obtener una imagen con un id.
	y hago arreglos con la persistencia en memoria, añadiendo un sequence.

- Two Way Binding: queremos enlazar el modelo al control del formulario, así si se modifica el modelo se refleja en la view y al revés.

	- En el backend incluyo el método para actualizar una imagen con un id.

	- incluimos las nuevas llamadas de update en el servicio para editar las imágenes, modificamos el archivo `image.service.ts` incluyendo el método updateImage(image: Object).
	
	- actualizamos los datos que cambien en el modelo, modificando `admin-image-edit.component.ts` de modo que en el método onInit obtenemos los datos de la imagen, que hay en el modelo y añado la llamada al método de actualizar en el componente.

	- actualizamos el html del componente `admin-image-edit.component.html`siendo muy similar al formulario de creación de la imagen pero cambiando el método al que llamamos en este caso updateImage(image) y usando el doble binding.


## urls

http://localhost:4200/gallery

http://localhost:4200/admin

http://localhost:4200/admin/images

http://localhost:4200/admin/images/edit/1


This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 1.4.1.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `-prod` flag for a production build.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).
Before running the tests make sure you are serving the app via `ng serve`.

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).
