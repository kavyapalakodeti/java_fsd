import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { AfterloginComponent } from './afterlogin/afterlogin.component';
import { HttpClientModule } from '@angular/common/http';
import { GetallempComponent } from './getallemp/getallemp.component';
import { GetempbyidComponent } from './getempbyid/getempbyid.component';
//import { PostempComponent } from './postemp/postemp.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { LoginComponent } from './login/login.component';
import { PostemployeeComponent } from './postemployee/postemployee.component';
import { PutempComponent } from './putemp/putemp.component';
import { ChpComponent } from './chp/chp.component';

@NgModule({
  declarations: [
    AppComponent,
   LoginComponent,
    AfterloginComponent,
    GetallempComponent,
    GetempbyidComponent,
    PostemployeeComponent,
    PutempComponent,
    ChpComponent,
   // PostempComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
    //ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
