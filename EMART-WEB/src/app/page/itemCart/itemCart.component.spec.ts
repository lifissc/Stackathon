import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ITEMCARTComponent } from './itemCart.component';
import { BsModalService,BsModalRef} from 'src/app/page/itemDetail/node_modules/src/app/page/itemListBuyer/node_modules/ngx-bootstrap/modal';
import { ModalModule } from 'src/app/page/itemDetail/node_modules/src/app/page/itemListBuyer/node_modules/ngx-bootstrap/modal'
import {RouterTestingModule} from "@angular/router/testing";

describe('ITEMCARTComponent', () => {
  let component: ITEMCARTComponent;
  let fixture: ComponentFixture<ITEMCARTComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [RouterTestingModule,ModalModule.forRoot()],
      declarations: [ ITEMCARTComponent ],
      providers:[BsModalService,BsModalRef]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ITEMCARTComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('Component will be created', () => {
    expect(component.ngOnInit()).toBeUndefined();
  });
});
