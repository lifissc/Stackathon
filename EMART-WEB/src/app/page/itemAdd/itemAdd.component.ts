import { Component, OnInit } from '@angular/core';
import { BsModalService, BsModalRef } from 'ngx-bootstrap/modal';

@Component({
  selector: 'app-itemAdd',
  templateUrl: './itemAdd.component.html',
  styleUrls: ['./itemAdd.component.css', '../../app.component.css']
})
export class ITEMADDComponent implements OnInit {
  constructor(private modalService: BsModalService, private emart007ModelRef: BsModalRef) { }

  ngOnInit(): void {
  }
  sendSet() {
    this.emart007ModelRef.hide()
  }
}
