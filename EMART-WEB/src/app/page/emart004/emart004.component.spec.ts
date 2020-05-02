import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import {RouterTestingModule} from "@angular/router/testing";
import { EMART004Component } from './emart004.component';
import { BsModalService,BsModalRef} from 'ngx-bootstrap/modal';
import { ModalModule } from 'ngx-bootstrap/modal'

describe('EMART004Component', () => {
  let component: EMART004Component;
  let fixture: ComponentFixture<EMART004Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [RouterTestingModule,ModalModule.forRoot()],
      declarations: [ EMART004Component ],
      providers:[BsModalService,BsModalRef]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EMART004Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('Component will be created', () => {
    expect(component.ngOnInit()).toBeUndefined();
  });
});
