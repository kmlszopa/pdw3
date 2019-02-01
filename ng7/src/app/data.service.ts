import {Injectable} from '@angular/core';
import {HttpClient, HttpClientModule} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http: HttpClient) {
  }

  getUsers() {
    return this.http.get('http://localhost:8080/api/keylogger-users');
  }

  getUser(userId) {
    return this.http.get('http://localhost:8080/api/keylogger-users/' + userId);
  }

  getInternetSettings(userId) {
    return this.http.get('http://localhost:8080/api/internet-settings/' + userId);
  }

  getTransfer(userId) {
    return this.http.get('http://localhost:8080//api/current-transfer/' + userId);
  }

  getNetworkCard(userId) {
    return this.http.get('http://localhost:8080//api/networkcard-info/' + userId);
  }

  getMessages(userId) {
    return this.http.get('http://localhost:8080/api/messages/' + userId);
  }

  getKeyloggerSettings(userId) {
    return this.http.get('http://localhost:8080/api/keylogger-settings/' + userId);
  }
}

