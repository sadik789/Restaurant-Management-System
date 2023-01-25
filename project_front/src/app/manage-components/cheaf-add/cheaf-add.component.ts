import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-cheaf-add',
  templateUrl: './cheaf-add.component.html',
  styleUrls: ['./cheaf-add.component.css']
})
export class CheafAddComponent {

  Array!:any[];
   
   cheaf_id!:number;
   cheaf_firstname!:string;
   cheaf_lastname!:string;
   cheaf_gender!:string;
   cheaf_email!:string;
   cheaf_address!:string;
   cheaf_education!:string;


  
  constructor(private http:HttpClient){

  }
  save(){
  let body={
  "cheaf_firstname":this.cheaf_firstname,
  "cheaf_lastname":this.cheaf_lastname,
  "cheaf_email":this.cheaf_email,
  "cheaf_address":this.cheaf_address,
  "cheaf_gender":this.cheaf_gender,
  "cheaf_education":this.cheaf_education
   }

   this.http.post("http://localhost:8080/cheaf/add",body).subscribe((data:any)=>{
    alert("save")

    this.Array=data;
    
  this. cheaf_firstname="";
  this.  cheaf_lastname="";
  this. cheaf_gender="";
  this.  cheaf_email="";
  this.  cheaf_address=""
  this.  cheaf_education=""
   })
  }
}
