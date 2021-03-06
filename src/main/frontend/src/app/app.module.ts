import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import {FormsModule} from "@angular/forms";
import { AppComponent } from './app.component';
import { TasksAddComponent } from './tasks/tasks-add/tasks-add.component';
import { TasksListComponent } from './tasks/tasks-list/tasks-list.component';
import { TasksComponent } from './tasks/tasks.component';
import {TaskService} from "./tasks/task.service";
import {HttpModule} from "@angular/http";

@NgModule({
  declarations: [
    AppComponent,
    TasksAddComponent,
    TasksListComponent,
    TasksComponent
  ],
  imports: [
    BrowserModule,
    NgbModule,
    FormsModule,
    HttpModule
  ],
  providers: [TaskService],
  bootstrap: [AppComponent]
})
export class AppModule { }
