import { Component, OnInit } from '@angular/core';
import { BsModalService, BsModalRef } from 'src/app/page/itemListBuyer/node_modules/ngx-bootstrap/modal';

@Component({
  selector: 'app-itemDetail',
  templateUrl: './itemDetail.component.html',
  styleUrls: ['./itemDetail.component.css', '../../app.component.css']
})
export class ITEMDETAILComponent implements OnInit {
  prdctInfo?: any;
  productListInfo?: any;
  constructor(private modalService: BsModalService, private bsModalRef: BsModalRef) {}
  ngOnInit(): void {
    this.productListInfo = Object.assign({}, this.prdctInfo)
  }
  addToCart(item) {
    this.bsModalRef.hide()
  }
}
