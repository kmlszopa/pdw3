import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {DataService} from '../data.service';

@Component({
  selector: 'app-internet-settings',
  templateUrl: './internet-settings.component.html',
  styleUrls: ['./internet-settings.component.scss']
})
export class InternetSettingsComponent implements OnInit {

  user: Object;
  settings: Object;
  color = 'accent';
  checked = false;
  disabled = false;

  constructor(private route: ActivatedRoute, private data: DataService) {
    this.route.params.subscribe(params => this.user = params.id);
  }

  ngOnInit() {
    this.data.getUser(this.user).subscribe(
      data => this.user = data
    );

    this.data.getInternetSettings(this.user).subscribe(
      data => this.settings = data
    );
  }

}
