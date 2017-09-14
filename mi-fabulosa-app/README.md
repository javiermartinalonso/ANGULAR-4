# MiFabulosaApp


## creacion de la primera aplicacion en angular 4 "mi-fabulosa-app" ##


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
