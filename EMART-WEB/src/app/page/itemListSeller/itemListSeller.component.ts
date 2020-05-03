import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import { BsModalService, BsModalRef } from 'src/app/page/itemDetail/node_modules/src/app/page/itemListBuyer/node_modules/ngx-bootstrap/modal';
import { ITEMADDComponent } from '../itemAdd/itemAdd.component';
import { ITEMUPDATEComponent } from '../itemUpdate/itemUpdate.component';
import { ComponentService } from '../../component.service';

@Component({
  selector: 'app-itemListSeller',
  templateUrl: './itemListSeller.component.html',
  styleUrls: ['./itemListSeller.component.css', '../../app.component.css']
})
export class ITEMLISTSELLERComponent implements OnInit {
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
    // to itemUpdate
    const initialState = {
      prdctInfo: item
    };
    this.modalRef = this.modalService.show(ITEMUPDATEComponent, {initialState});
  }
  addItem() {
    // to itemAdd
    this.modalRef = this.modalService.show(ITEMADDComponent);
  }
}
