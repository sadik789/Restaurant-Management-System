import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ManageComponent } from './manage/manage.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { AboutComponent } from './about/about.component';
import { CheafAddComponent } from './manage-components/cheaf-add/cheaf-add.component';
import { CheafDetailsComponent } from './manage-components/cheaf-details/cheaf-details.component';
import { BookAddComponent } from './manage-components/book-add/book-add.component';
import { BookTableDetailsComponent } from './manage-components/book-table-details/book-table-details.component';

@NgModule({
  declarations: [
    AppComponent,
    ManageComponent,
    HomeComponent,
    HeaderComponent,
    DashboardComponent,
    AboutComponent,
    CheafAddComponent,
    CheafDetailsComponent,
    BookAddComponent,
    BookTableDetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    FormsModule,
    HttpClientModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
