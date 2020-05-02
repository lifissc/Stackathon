import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ComponentService {
  loginFlg = false;
  userInfo = {};
  constructor() {}
  setLoginFlg(flg) {
    this.loginFlg = flg
  }
  setUserInfo(info) {
    this.userInfo = info
  }
  getLoginFlg() {
    return this.loginFlg
  }
  getUserInfo() {
    return this.userInfo
  }
  clearLoginFlg() {
    this.loginFlg = false;
    return this.loginFlg;
  }
}
