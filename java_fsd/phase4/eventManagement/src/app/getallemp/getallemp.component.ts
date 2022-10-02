import { Component, OnInit } from '@angular/core';
import { ApiService } from '../service/api.service';

@Component({
  selector: 'app-getallemp',
  templateUrl: './getallemp.component.html',
  styleUrls: ['./getallemp.component.css']
})
export class GetallempComponent implements OnInit {
  products: any = [];
  alldatas=[];
  employeeData!:any;
  constructor(private api:ApiService) { }

  ngOnInit() {
    this.getallemp();
  }
 
getallemp(){
  this.api.getEmployee().subscribe(res=>{
    this.employeeData=res;
  })
}
// getempbyid(row: any){
//   this.api.getEmployeebyid(row).subscribe(res=>{
//   var arr=[];
//   for(var i in res)
//     arr.push(res[i]);
//     console.log(arr);
//     this.employeeData=arr;
//   })
// }

// delallemp(row: any){
//   this.api.deleteEmployee(row).subscribe(res=>{
//     alert("Employee deleted");
//     this.getallemp();
//   })
// }
}
