import { Component, OnInit } from '@angular/core';
import { BsModalService, BsModalRef } from 'ngx-bootstrap/modal';

@Component({
  selector: 'app-emart004',
  templateUrl: './emart004.component.html',
  styleUrls: ['./emart004.component.css', '../../app.component.css']
})
export class EMART004Component implements OnInit {
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
