import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { validateConfig } from '@angular/router/src/config';

@Component({
  selector: 'app-chp',
  templateUrl: './chp.component.html',
  styleUrls: ['./chp.component.css']
})
export class ChpComponent implements OnInit {
cup: any;
nep: any;
np: any;
username: any;
password: any
afterchp=false;
  constructor(private router: Router) { }

  ngOnInit() {
  }
  valid(){
    if(this.cup==='kavya123'){
      this.np=this.nep;
      alert("password change successfull");
      this.afterchp=true;
      this.router.navigate(['afterlogin'])
    }
    else{
      alert("invalid credentials");
      this.afterchp=false;
    }
    
  }

}
