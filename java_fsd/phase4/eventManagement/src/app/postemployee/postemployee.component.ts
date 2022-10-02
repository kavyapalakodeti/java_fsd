import { Component, OnInit } from '@angular/core';
import { EmployeeModel } from './postempmodel';
import { ApiService } from '../service/api.service';


@Component({
  selector: 'app-postemployee',
  templateUrl: './postemployee.component.html',
  styleUrls: ['./postemployee.component.css']
})
export class PostemployeeComponent implements OnInit {
  fn:any;
  ln:any;
  eid:any;
  email:any;
  // seed:any;
  // s:any;
  employeeModelObj: EmployeeModel=new EmployeeModel();

  constructor(private api:ApiService) { }

  ngOnInit() {
    
  
//this.postEmployeeDetails();
  }
  
  postEmployeeDetails(){
    // console.log(this.fn)
    // console.log(this.ln)
    // console.log(this.eid)
    // console.log(this.email)

     this.employeeModelObj.first_name=this.fn
    this.employeeModelObj.last_name=this.ln
    this.employeeModelObj.email=this.email
     this.employeeModelObj.id=this.eid
    this.api.postEmployee(this.employeeModelObj)
    .subscribe(res=>{
      console.log(res);
      alert("employee Added scucessfully");
     })

  }
  // test(){
  //   console.log(this.seed);
  //   console.log(this.s)
  // }

}
