import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ApiService } from '../service/api.service';


@Component({
  selector: 'app-getempbyid',
  templateUrl: './getempbyid.component.html',
  styleUrls: ['./getempbyid.component.css']
})
export class GetempbyidComponent implements OnInit {
  employeeData!:any;
  rowin: number;
  arr1: Array<any>;
  constructor(private route: ActivatedRoute,private api:ApiService) { }

  ngOnInit() {
    this.rowin=this.route.snapshot.params['rowin']
    this.getempbyid(this.rowin);
  }
  getempbyid(row: any){
  this.api.getEmployeebyid(row).subscribe(res=>{
    this.employeeData=res;
  // var arr=[];
  // for(var i in res)
  //   arr.push(res[i]);
  //   console.log(arr);
  //   this.arr1=arr;
  //   console.log(this.arr1);
  })
}
delallemp(row: any){
  this.api.deleteEmployee(row).subscribe(res=>{
    alert("Employee deleted");
    //this.getallemp();
  })
}
getallemp(){
  this.api.getEmployee().subscribe(res=>{
    this.employeeData=res;
  })
}

}
