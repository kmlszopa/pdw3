import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import {ReactiveFormsModule} from '@angular/forms';
import {AppRoutingModule} from './app-routing.module';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {AppComponent} from './app.component';
import {NavComponent} from './nav/nav.component';
import {UsersComponent} from './users/users.component';
import {DetailsComponent} from './details/details.component';
import {AddUserComponent} from './add-user/add-user.component';
import {EditDetailsComponent} from './edit-details/edit-details.component';
import {MessagesComponent} from './messages/messages.component';
import {CurrentTransferComponent} from './current-transfer/current-transfer.component';
import {InternetSettingsComponent} from './internet-settings/internet-settings.component';
import {NetworkCardComponent} from './network-card/network-card.component';
import {MatButtonModule, MatCheckboxModule} from '@angular/material';
import {MatButtonToggleModule} from '@angular/material/button-toggle';
import {MatSlideToggleModule} from '@angular/material/slide-toggle';


@NgModule({
  declarations: [
    AppComponent,
    NavComponent,
    UsersComponent,
    DetailsComponent,
    AddUserComponent,
    EditDetailsComponent,
    MessagesComponent,
    CurrentTransferComponent,
    InternetSettingsComponent,
    NetworkCardComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatCheckboxModule,
    MatButtonToggleModule,
    MatSlideToggleModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
