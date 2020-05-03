import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { BsModalService, BsModalRef } from 'src/app/page/itemAdd/node_modules/src/app/page/itemListSeller/node_modules/src/app/page/itemDetail/node_modules/src/app/page/itemListBuyer/node_modules/ngx-bootstrap/modal';

@Component({
  selector: 'app-itemUpdate',
  templateUrl: './itemUpdate.component.html',
  styleUrls: ['./itemUpdate.component.css', '../../app.component.css']
})
export class ITEMUPDATEComponent implements OnInit {
  // @Output() private getPrdctList = new EventEmitter<Object>()
  prdctInfo?: any;
  changePrdctInfo: any = {
    thumb: '',
    name: '',
    price: '',
    seller: '',
    amount: '',
    txt: '',
    category: '',
    subCategory: '',
    discount: '',
    description: ''
  };
  constructor(private modalService: BsModalService, private emart008ModelRef: BsModalRef) {
  }

  ngOnInit(): void {
    this.changePrdctInfo = Object.assign({}, this.prdctInfo)
  }
  updateSet() {
    this.emart008ModelRef.hide()
  }
}
