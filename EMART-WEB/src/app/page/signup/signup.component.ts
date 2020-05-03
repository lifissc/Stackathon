import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router'
import { ComponentService } from '../../component.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css', '../../app.component.css']
})
export class SIGNUPComponent {
  public inputShow : Boolean;
  userInfo:any = {
    userID: ''
  }
  constructor(public router: Router, private componentService: ComponentService) { }

  ngOnInit(): void {
    this.inputShow = true
  }
  showBuyerInput() {
    this.inputShow = true
  }
  showSellerInput() {
    this.inputShow = false
  }
  signupClick() {
    this.componentService.setLoginFlg(true);
    this.componentService.setUserInfo(this.userInfo)
    if (!this.inputShow) {
      this.router.navigate(['/itemListSeller'])
    } else {
      this.router.navigate(['/itemListBuyer'])
    }
  }
}
