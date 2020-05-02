import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import { ComponentService } from '../../component.service';
import { AlertComponent } from 'ngx-bootstrap/alert/alert.component';

@Component({
  selector: 'app-emart005',
  templateUrl: './emart005.component.html',
  styleUrls: ['./emart005.component.css', '../../app.component.css']
})
export class EMART005Component implements OnInit {
  alerts: any[] = [{
    type: '',
    msg: '',
    timeout: 0
  }];
  productList: any = [
    {
        thumb: '@images/food.jpg',
        name: 'xxxx',
        buyAccount: '2',
        txt: 'delete from cart',
        checked: false
    },
    {
        thumb: '../../../app/images/food.jpg',
        name: 'yyyy',
        buyAccount: '1',
        txt: 'delete from cart',
        checked: false
    },
    {
        thumb: '../../../app/images/food.jpg',
        name: 'zzzz',
        buyAccount: '3',
        txt: 'delete from cart',
        checked: false
    }
  ];
  discountShow: Boolean;
  constructor(public router: Router, private componentService: ComponentService) { }

  ngOnInit(): void {
  }
  itemListPageBack() {
    this.router.navigate(['/emart003'])
  }
  deletePrdct() {}
  addAccount(row) {
    row.buyAccount = row.buyAccount+1
  }
  delAccount(row) {
    if(row.buyAccount>0){
      row.buyAccount = row.buyAccount - 1
    }
  }
  applyDiscountClick() {
    this.discountShow = !this.discountShow
  }
  checkEvent(item,i) {
    console.log(i, item)
  }
  doCheckout(): void {
    this.alerts.push({
      type: 'warning',
      msg: `You have successfully purchased`,
      timeout: 1300
    });
  }
  onClosed(dismissedAlert: AlertComponent): void {
    this.alerts = this.alerts.filter(alert => alert !== dismissedAlert);
  }
}
