import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AfterloginComponent } from './afterlogin/afterlogin.component';
import { ChpComponent } from './chp/chp.component';
import { GetallempComponent } from './getallemp/getallemp.component';
import { GetempbyidComponent } from './getempbyid/getempbyid.component';
import { LoginComponent } from './login/login.component';
import { PostemployeeComponent } from './postemployee/postemployee.component';
import { PutempComponent } from './putemp/putemp.component';

//import { PostempComponent } from './postemp/postemp.component';

const routes: Routes = [
  {path:'login',component:LoginComponent},
  {path:'chp',component:ChpComponent},
  {path:'putemp/:rowin',component:PutempComponent},
  {path:'afterlogin',component:AfterloginComponent},
  {path:'getallemp',component:GetallempComponent},
  {path:'getempbyid/:rowin',component:GetempbyidComponent},
  {path:'postemp',component:PostemployeeComponent},

  




];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
