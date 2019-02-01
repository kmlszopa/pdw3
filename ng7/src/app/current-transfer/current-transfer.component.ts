import {Component, OnInit} from '@angular/core';
import {DataService} from '../data.service';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-current-transfer',
  templateUrl: './current-transfer.component.html',
  styleUrls: ['./current-transfer.component.scss']
})
export class CurrentTransferComponent implements OnInit {

  transfer: Object;
  user: Object;

  constructor(private route: ActivatedRoute, private data: DataService) {
    this.route.params.subscribe(params => this.user = params.id);
  }

  ngOnInit() {
    this.data.getUser(this.user).subscribe(
      data => this.user = data
    );

    this.data.getTransfer(this.user).subscribe(
      data => this.transfer = data
    );
  }
}
