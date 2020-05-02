import { Component, OnInit, NgModule,Input, Output, EventEmitter } from '@angular/core';
import {Router} from '@angular/router'
import { ComponentService } from '../../component.service';
import { LoginService } from '../../service/login.service'

@Component({
  selector: 'app-emart002',
  templateUrl: './emart002.component.html',
  styleUrls: ['./emart002.component.css', '../../app.component.css']
})
export class EMART002Component implements OnInit {
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
      this.router.navigate(['/emart003'])
    } else {
      this.router.navigate(['/emart006'])
    }
  }
}
