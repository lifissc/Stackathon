import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EMART005Component } from './emart005.component';
import { BsModalService,BsModalRef} from 'ngx-bootstrap/modal';
import { ModalModule } from 'ngx-bootstrap/modal'
import {RouterTestingModule} from "@angular/router/testing";

describe('EMART005Component', () => {
  let component: EMART005Component;
  let fixture: ComponentFixture<EMART005Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [RouterTestingModule,ModalModule.forRoot()],
      declarations: [ EMART005Component ],
      providers:[BsModalService,BsModalRef]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EMART005Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('Component will be created', () => {
    expect(component.ngOnInit()).toBeUndefined();
  });
});
