import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-book-add',
  templateUrl: './book-add.component.html',
  styleUrls: ['./book-add.component.css']
})
export class BookAddComponent {
  book_tid!:number
  user_name!:string
  user_email!:string
  date!:string
  time!:string
  Description!:string

constructor(private http:HttpClient){

}

  save(){
let body={
  "book_tid":this.book_tid,
  "user_name":this.user_name,
  "user_email":this.user_email,
  "date":this.date,
  "time":this.time,
  "Description":this.Description
}

this.http.post("http://localhost:8080/book/addTable",body).subscribe((data)=>{
alert("save.")
this.user_name=""
this.user_email=""
this.date=""
this.time=""
this.Description=""
})
  }
}
