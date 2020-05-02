import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import { ComponentService } from '../../component.service';

@Component({
  selector: 'app-emart009',
  templateUrl: './emart009.component.html',
  styleUrls: ['./emart009.component.css', '../../app.component.css']
})
export class EMART009Component implements OnInit {
  productList?:any;
  constructor(public router: Router, private componentService: ComponentService) { }

  ngOnInit(): void {
    this.productList = [
      {
          thumb: '@images/food.jpg',
          name: 'xxxx',
          price: '1000',
          buyAccount: '2',
          buyer: 'ddddd',
          buyDate: '2020/04/20'
      },
      {
          thumb: '../../../app/images/food.jpg',
          name: 'yyyy',
          price: '1000',
          buyAccount: '1',
          buyer: 'ee',
          buyDate: '2020/04/01'
      },
      {
          thumb: '../../../app/images/food.jpg',
          name: 'zzzz',
          price: '1000',
          buyAccount: '3',
          buyer: 'aaa',
          buyDate: '2020/02/11'
      }
    ]
  }
  itemListPageBack() {
    this.router.navigate(['/emart006'])
  }
}
