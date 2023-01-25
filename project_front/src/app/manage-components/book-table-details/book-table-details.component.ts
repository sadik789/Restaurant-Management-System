import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-book-table-details',
  templateUrl: './book-table-details.component.html',
  styleUrls: ['./book-table-details.component.css']
})
export class BookTableDetailsComponent {
Array!:any
 book_tid!:number
    user_name!:string
    user_email!:string
    date!:string
    time!:string
    Description!:string
    
constructor(private http:HttpClient){

this.get()
}

get(){
this.http.get("http://localhost:8080/book/getBookTable").subscribe((data)=>{
  this.Array=data
})
}

update(id:number){
  let body={
    "book_tid":this.book_tid,
    "user_name":this.user_name,
    "user_email":this.user_email,
    "date":this.date,
    "time":this.time,
    "Description":this.Description
  }
this.http.put("http://localhost:8080/book/updateBTable"+"/"+id,body).subscribe((data)=>{
  console.log(data)
  alert("update")
 
   this.user_name=""
   this.user_email=""
   this.date=""
   this.time=""
   this.Description=""
})
}
put(arr:any){
   this.book_tid=arr.book_tid;
   this.user_name=arr.user_name
   this.user_email=arr.user_email
   this.date=arr.date
   this.time=arr.time
   this.Description=this.Description
}
delete(id:number){
this.http.delete("http://localhost:8080/book/deleteBTable"+"/"+id).subscribe((data)=>{
  alert("delete")
})
}
}
