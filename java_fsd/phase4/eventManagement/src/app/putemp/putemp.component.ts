import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { EmployeeModel } from '../postemployee/postempmodel';
import { ApiService } from '../service/api.service';

@Component({
  selector: 'app-putemp',
  templateUrl: './putemp.component.html',
  styleUrls: ['./putemp.component.css']
})
export class PutempComponent implements OnInit {
  fn:any;
  ln:any;
  eid:any;
  email:any;
  employeeData!:any;
  rowin: number;
  employeeModelObj: EmployeeModel=new EmployeeModel;

  constructor(private route: ActivatedRoute,private api:ApiService) { }
  

  ngOnInit() {
    this.rowin=this.route.snapshot.params['rowin']
    console.log(this.rowin)
   // this.putEmployeeDetails(this.rowin);
    
  }
  putEmployeeDetails(){
    // console.log(this.fn)
    // console.log(this.ln)
    // console.log(this.eid)
    // console.log(this.email)

     this.employeeModelObj.first_name=this.fn
    this.employeeModelObj.last_name=this.ln
    this.employeeModelObj.email=this.email
    this.api.putEmployeebyid(this.employeeModelObj,this.rowin)
    .subscribe(res=>{
      console.log(res);
      alert("employee Updated Sucessfully");
     })

  }
}
