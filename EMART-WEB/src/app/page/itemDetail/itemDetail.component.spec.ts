import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import {RouterTestingModule} from "@angular/router/testing";
import { ITEMDETAILComponent } from './itemDetail.component';
import { BsModalService,BsModalRef} from 'src/app/page/itemListBuyer/node_modules/ngx-bootstrap/modal';
import { ModalModule } from 'src/app/page/itemListBuyer/node_modules/ngx-bootstrap/modal'

describe('ITEMDETAILComponent', () => {
  let component: ITEMDETAILComponent;
  let fixture: ComponentFixture<ITEMDETAILComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [RouterTestingModule,ModalModule.forRoot()],
      declarations: [ ITEMDETAILComponent ],
      providers:[BsModalService,BsModalRef]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ITEMDETAILComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('Component will be created', () => {
    expect(component.ngOnInit()).toBeUndefined();
  });
});
