import { Component, Input, ViewChild } from '@angular/core';
import {Router} from '@angular/router'
import { ComponentService } from './component.service';

@Component(
  {
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'EMART';
  loginFlg: Boolean;
  userInfo: any = {
    userID:''
  };
  constructor(public router: Router, private componentService: ComponentService) { }
  ngOnInit(): void {

  }
  ngOnchanges(): void { }
  ngDoCheck() {
    this.loginFlg = this.componentService.getLoginFlg()
    this.userInfo = this.componentService.getUserInfo()
  }
  doLogout() {
    this.componentService.setLoginFlg(false);
    this.router.navigate(['/emart002'])
  }
}
