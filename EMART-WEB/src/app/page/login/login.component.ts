import { Component, OnInit, NgModule,Input, Output, EventEmitter } from '@angular/core';
import {Router} from '@angular/router'
import { ComponentService } from '../../component.service';
import { LoginService } from '../../service/login.service'

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css', '../../app.component.css']
})
export class LOGINComponent implements OnInit {
  public userInfo:any = {
    userID:'',
    password:''
  }
  userRes?:any;
  constructor(public router: Router,private componentService: ComponentService,private loginService: LoginService) {

  }

  ngOnInit(): void {
  }
  login(): void{
    this.componentService.setLoginFlg(true);
    this.loginService.doLogin(this.userInfo).subscribe(
      dataJson => {
        console.log(dataJson)
        this.componentService.setUserInfo(dataJson);
      },
      error => {
        console.log(error)
      }
    )

    if (this.userInfo.userID === '0000001' || this.userInfo.userID === '0000002' || this.userInfo.userID === '0000003') {
      this.router.navigate(['/itemListBuyer'])
    } else {
      this.router.navigate(['/itemListSeller'])
    }
  }
}
