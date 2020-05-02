import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import {RouterTestingModule} from "@angular/router/testing";
import { EMART008Component } from './emart008.component';
import { BsModalService,BsModalRef} from 'ngx-bootstrap/modal';
import { ModalModule } from 'ngx-bootstrap/modal'

describe('EMART008Component', () => {
  let component: EMART008Component;
  let fixture: ComponentFixture<EMART008Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [RouterTestingModule,ModalModule.forRoot()],
      declarations: [ EMART008Component ],
      providers:[BsModalService,BsModalRef]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EMART008Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('Component will be created', () => {
    expect(component.ngOnInit()).toBeUndefined();
  });
});
