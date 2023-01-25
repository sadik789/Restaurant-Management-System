import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { HomeComponent } from './home/home.component';
import { BookAddComponent } from './manage-components/book-add/book-add.component';
import { BookTableDetailsComponent } from './manage-components/book-table-details/book-table-details.component';
import { CheafAddComponent } from './manage-components/cheaf-add/cheaf-add.component';
import { CheafDetailsComponent } from './manage-components/cheaf-details/cheaf-details.component';
import { ManageComponent } from './manage/manage.component';

const routes: Routes = [
  {path:"",component:DashboardComponent,children:[
    {path:"manage",component:ManageComponent,children:[
      {path:"cheaf-add",component:CheafAddComponent},
      {path:"cheaf-details",component:CheafDetailsComponent},
      {path:"book-table",component:BookAddComponent},
      {path:"bookt-details",component:BookTableDetailsComponent}
    ]},
    {path:"home",component:HomeComponent},
    {path:"about",component:HomeComponent},
    {path:"contact",component:ManageComponent}
  ]},
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
