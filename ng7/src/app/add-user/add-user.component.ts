import {Component, OnInit} from '@angular/core';
import {FormGroup, FormControl} from '@angular/forms';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {DataService} from '../data.service';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.scss']
})
export class AddUserComponent {
  userForm: FormGroup;

  constructor(private httpClient: HttpClient, private data: DataService) {
    this.userForm = this.getForm();
  }

  getForm(): FormGroup {
    return new FormGroup({
      computerName: new FormControl(),
      username: new FormControl(),
      description: new FormControl()
    });
  }

  onSubmit() {
    this.createUser();
  }

  createUser() {
    const headers = new HttpHeaders()
      .set('Content-Type', 'application/json');
    const computerName = this.userForm.get('computerName').value;
    const username = this.userForm.get('username').value;
    const description = this.userForm.get('description').value;

    this.httpClient.post('http://localhost:8080/api/keylogger-users',
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
}
