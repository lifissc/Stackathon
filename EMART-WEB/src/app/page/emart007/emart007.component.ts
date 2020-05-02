import { Component, OnInit } from '@angular/core';
import { BsModalService, BsModalRef } from 'ngx-bootstrap/modal';

@Component({
  selector: 'app-emart007',
  templateUrl: './emart007.component.html',
  styleUrls: ['./emart007.component.css', '../../app.component.css']
})
export class EMART007Component implements OnInit {
  constructor(private modalService: BsModalService, private emart007ModelRef: BsModalRef) { }

  ngOnInit(): void {
  }
  sendSet() {
    this.emart007ModelRef.hide()
  }
}
