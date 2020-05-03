import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import {RouterTestingModule} from "@angular/router/testing";
import { ITEMUPDATEComponent } from './itemUpdate.component';
import { BsModalService,BsModalRef} from 'src/app/page/itemAdd/node_modules/src/app/page/itemListSeller/node_modules/src/app/page/itemDetail/node_modules/src/app/page/itemListBuyer/node_modules/ngx-bootstrap/modal';
import { ModalModule } from 'src/app/page/itemAdd/node_modules/src/app/page/itemListSeller/node_modules/src/app/page/itemDetail/node_modules/src/app/page/itemListBuyer/node_modules/ngx-bootstrap/modal'

describe('ITEMUPDATEComponent', () => {
  let component: ITEMUPDATEComponent;
  let fixture: ComponentFixture<ITEMUPDATEComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [RouterTestingModule,ModalModule.forRoot()],
      declarations: [ ITEMUPDATEComponent ],
      providers:[BsModalService,BsModalRef]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ITEMUPDATEComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('Component will be created', () => {
    expect(component.ngOnInit()).toBeUndefined();
  });
});
