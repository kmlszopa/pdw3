import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {DataService} from '../data.service';

@Component({
  selector: 'app-messages',
  templateUrl: './messages.component.html',
  styleUrls: ['./messages.component.scss']
})
export class MessagesComponent implements OnInit {
  messageDatas: Object;
  user: Object;

  constructor(private route: ActivatedRoute, private data: DataService) {
    this.route.params.subscribe(params => this.user = params.id);
  }

  ngOnInit() {
    this.data.getUser(this.user).subscribe(
      data => this.user = data
    );

    this.data.getMessages(this.user).subscribe(
      data => this.messageDatas = data
    );
  }
}
