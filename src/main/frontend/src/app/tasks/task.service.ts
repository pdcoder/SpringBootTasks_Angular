import { Injectable } from '@angular/core';
import {Http} from "@angular/http";
import {Task} from "./task.model";

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  onTaskAdded = new Event;

  Emitter<Task>();

  constructor(private http: Http) {}

  getTasks(){
    return this.http.get('/api/tasks')
      .map(
        (response: Response) => {
          return response.json();
        }
      );
  }

  addTask(task: Task) {
    return this.http.post('/api/tasks/save', task)
      .map(
        (response: Response) => {
          return response.json();
        }
      );
  }

  saveTask(task: Task, checked: boolean) {
    // we are updating the task to what the value of checked is
    task.completed = checked;
    return this.http.post('/api/tasks/save', task)
      .map(
        (response: Response) => {
          return response.json();
        }
      );
  }

}
