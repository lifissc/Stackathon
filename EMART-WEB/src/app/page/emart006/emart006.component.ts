import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import { BsModalService, BsModalRef } from 'ngx-bootstrap/modal';
import { EMART007Component } from '../emart007/emart007.component';
import { EMART008Component } from '../emart008/emart008.component';
import { ComponentService } from '../../component.service';

@Component({
  selector: 'app-emart006',
  templateUrl: './emart006.component.html',
  styleUrls: ['./emart006.component.css', '../../app.component.css']
})
export class EMART006Component implements OnInit {
  public productList?: any;
  modalRef: BsModalRef;
  constructor(public router: Router,private modalService: BsModalService, private componentService: ComponentService) { }

  ngOnInit(): void {
    this.productList = [
      {
          thumb: '',
          name: 'xxxx',
          price: '30000',
          seller: 'NNNN',
          amount: '20',
          txt: 'Edit',
          category: 'aa',
          subCategory: 'bb',
          discount: '1000',
          description: 'kfaposjoivgwhepoighowvawgr'
      },
      {
          thumb: '',
          name: 'yyyy',
          price: '20000',
          seller: 'MMMM',
          amount: '100',
          txt: 'Edit',
          category: 'cc',
          subCategory: 'dd',
          discount: '1010',
          description: 'nwrotqgnirg'
      },
      {
          thumb: '',
          name: 'zzzz',
          price: '25000',
          seller: 'KKKK',
          amount: '200',
          txt: 'Edit',
          category: 'ee',
          subCategory: 'ff',
          discount: '3000',
          description: 'znvlznoihg'
      }
    ]
  }
  edit(item) {
    // to emart008
    const initialState = {
      prdctInfo: item
    };
    this.modalRef = this.modalService.show(EMART008Component, {initialState});
  }
  addItem() {
    // to emart007
    this.modalRef = this.modalService.show(EMART007Component);
  }
}
