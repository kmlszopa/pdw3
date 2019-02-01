import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {UsersComponent} from './users/users.component';
import {DetailsComponent} from './details/details.component';
import {AddUserComponent} from './add-user/add-user.component';
import {EditDetailsComponent} from './edit-details/edit-details.component';
import {MessagesComponent} from './messages/messages.component';
import {CurrentTransferComponent} from './current-transfer/current-transfer.component';
import {InternetSettingsComponent} from './internet-settings/internet-settings.component';
import {NetworkCardComponent} from './network-card/network-card.component';

const routes: Routes = [
  {path: '', component: UsersComponent},
  {path: 'details/:id', component: DetailsComponent},
  {path: 'add-user', component: AddUserComponent},
  {path: 'edit-details/:id', component: EditDetailsComponent},
  {path: 'messages/:id', component: MessagesComponent},
  {path: 'current-transfer/:id', component: CurrentTransferComponent},
  {path: 'internet-settings/:id', component: InternetSettingsComponent},
  {path: 'network-card/:id', component: NetworkCardComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
