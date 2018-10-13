import {Component, OnInit} from "@angular/core";
import {Task} from "./task.model";
import {Http} from "@angular/http";

@Component({
  selector: 'app-tasks',
  templateUrl: './tasks.component.html',
  styleUrls: ['./tasks.component.css']
})
export class TasksComponent implements OnInit {

  constructor(private http: Http) {}

  ngOnInit() {

  }
}
