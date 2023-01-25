import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-cheaf-details',
  templateUrl: './cheaf-details.component.html',
  styleUrls: ['./cheaf-details.component.css']
})
export class CheafDetailsComponent {
  Array!:any[];
   
  cheaf_id!:number;
  cheaf_firstname!:string;
  cheaf_lastname!:string;
  cheaf_gender!:string;
  cheaf_email!:string;
  cheaf_address!:string;
  cheaf_education!:string;
constructor(private http:HttpClient){
this.get()
}
  get(){
    this.http.get("http://localhost:8080/cheaf/get").subscribe((data:any)=>{
      console.log(data)
      this.Array=data
    })
    }
    
    update(id:number){
      let body={
        "cheaf_id":this.cheaf_id,
        "cheaf_firstname":this.cheaf_firstname,
        "cheaf_lastname":this.cheaf_lastname,
        "cheaf_email":this.cheaf_email,
        "cheaf_address":this.cheaf_address,
        "cheaf_gender":this.cheaf_gender,
        "cheaf_education":this.cheaf_education
         }
    this.http.put("http://localhost:8080/cheaf/update"+"/"+id,body).subscribe((data)=>{
      console.log(data)
      alert("update")
     this.get()
      this. cheaf_firstname="";
  this.  cheaf_lastname="";
  this. cheaf_gender="";
  this.  cheaf_email="";
  this.  cheaf_address=""
  this.  cheaf_education=""
    })
    }
    put(arr:any){
      this.cheaf_id=arr.cheaf_id
      this. cheaf_firstname=arr.cheaf_firstname
  this.  cheaf_lastname=arr.cheaf_lastname
  this. cheaf_gender=arr.cheaf_gender
  this.  cheaf_email=arr.cheaf_email
  this.  cheaf_address=arr.cheaf_address
    this.  cheaf_education=arr.cheaf_education
    }
    delete(id:number){
    this.http.delete("http://localhost:8080/cheaf/delete"+"/"+id).subscribe((data)=>{
      alert("delete")
    })
    }
 
}
