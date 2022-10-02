import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username: any;
  password: any;
  errorMessage='invalid credentials';
  invalidLogin=false;
  constructor( private router: Router) { }

  ngOnInit() {
  }
valid(){
  if(this.username=='kavya' && this.password=='kavya123' ){
    this.router.navigate(['afterlogin'])
    this.invalidLogin=false;
    // console.log(this.username);
    // console.log(this.password)
  }
  else{
    this.invalidLogin=true;
  }

}

}
