import {Component, OnInit} from '@angular/core';
import {FormGroup, FormControl} from '@angular/forms';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {DataService} from '../data.service';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-edit-details',
  templateUrl: './edit-details.component.html',
  styleUrls: ['./edit-details.component.scss']
})
export class EditDetailsComponent implements OnInit {
  userForm: FormGroup;
  user: Object;
  userId;

  constructor(private route: ActivatedRoute, private httpClient: HttpClient, private data: DataService) {
    this.route.params.subscribe(
      params => {
        return this.user = this.userId = params.id;
      });
    this.userForm = this.getForm();
  }

  ngOnInit() {
    this.data.getUser(this.user).subscribe(data => {
      this.user = data;
    });
  }

  getForm(): FormGroup {
    return new FormGroup({
      computerName: new FormControl(),
      username: new FormControl(),
      description: new FormControl()
    });
  }

  onSubmit() {
    this.editUser();
  }


  private editUser() {
    const headers = new HttpHeaders()
      .set('Content-Type', 'application/json');
    let computerName = this.userForm.get('computerName').value;
    let username = this.userForm.get('username').value;
    let description = this.userForm.get('description').value;

    if (!computerName) {
      computerName = this.user.computerName;
    }

    if (!username) {
      username = this.user.username;
    }

    if (!description) {
      description = this.user.description;
    }

    this.httpClient.post('http://localhost:8080/api/keylogger-users/' + this.userId,
      {
        computerName,
        username,
        description
      }, {headers})
      .subscribe(
        data => {
          console.log('POST Request is successful ', data);
        },
        error => {
          console.log('Error in post request Iwona :(', error);
        }
      );
  }

  private deleteUser() {
    const headers = new HttpHeaders()
      .set('Content-Type', 'application/json');

    this.httpClient.delete('http://localhost:8080/api/keylogger-users/' + this.userId,
      {headers})
      .subscribe(
        data => {
          console.log('Delete request is successful ', data);
        },
        error => {
          console.log('Error in post request Iwona :(', error);
        }
      );
  }
}
