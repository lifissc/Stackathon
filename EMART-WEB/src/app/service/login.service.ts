import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http"

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  constructor(private http:HttpClient) { }
  doLogin(param) {
    console.log(param)
    // API waiting
    // Stub Data
    const url = '../../assets/data.json'
    return this.http.get(url)
  }
}
