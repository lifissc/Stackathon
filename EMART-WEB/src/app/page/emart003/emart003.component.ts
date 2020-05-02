import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import { BsModalService, BsModalRef } from 'ngx-bootstrap/modal';
import { EMART004Component } from '../emart004/emart004.component';
import { ComponentService } from '../../component.service';

@Component({
  selector: 'app-emart003',
  templateUrl: './emart003.component.html',
  styleUrls: ['./emart003.component.css', '../../app.component.css']
})
export class EMART003Component implements OnInit {
  productList: any = [
    {
        thumb: '',
        name: 'xxxx',
        price: '30000',
        seller: 'NNNN',
        buyAccount: '',
        productID: '1',
        description: 'good product',
        cataLog: 'nothing',
        discount: '11111111'
    },
    {
        thumb: '',
        name: 'yyyy',
        price: '20000',
        seller: 'MMMM',
        buyAccount: '',
        productID:'2',
        description: 'very good',
        cataLog: 'nothing',
        discount: '222222222'
    },
    {
        thumb: '',
        name: 'zzzz',
        price: '25000',
        seller: 'KKKK',
        buyAccount: '',
        productID:'3',
        description: 'better product',
        cataLog: 'nothing',
        discount: '3333333'
    }
  ];
  purchaseHistoryTable: any = [
    {
        thumb: '',
        name: 'xxxx',
        price: '30000',
        seller: 'NNNN',
        buyAccount: '1',
        buyDate: '2019/02/02',
        productID:'1',
        description: 'better product',
        cataLog: 'nothing',
        discount: '11111111'
    },
    {
        thumb: '',
        name: 'yyyy',
        price: '20000',
        seller: 'MMMM',
        buyAccount: '3',
        buyDate: '2019/12/11',
        productID:'2',
        description: 'better product',
        cataLog: 'nothing',
        discount: '222222'
    },
    {
        thumb: '',
        name: 'zzzz',
        price: '25000',
        seller: 'KKKK',
        buyAccount: '1',
        buyDate: '2020/01/30',
        productID:'3',
        description: 'better product',
        cataLog: 'nothing',
        discount: '333333333333'
    }
  ];
  modalRef: BsModalRef;
  constructor(public router: Router,private modalService: BsModalService, private componentService: ComponentService) { }
  ngOnInit(): void {
  }
  goToCart() {
    this.router.navigate(['/emart005'])
  }
  addToCart(item) {
  }
  openModal(item) {
    const initialState = {
      prdctInfo: item
    };
    this.modalRef = this.modalService.show(EMART004Component, {initialState});
  }
}
