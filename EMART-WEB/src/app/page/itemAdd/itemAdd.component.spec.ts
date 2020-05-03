import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import {RouterTestingModule} from "@angular/router/testing";
import { ITEMADDComponent } from './itemAdd.component';
import { BsModalService,BsModalRef} from 'src/app/page/itemListSeller/node_modules/src/app/page/itemDetail/node_modules/src/app/page/itemListBuyer/node_modules/ngx-bootstrap/modal';
import { ModalModule } from 'src/app/page/itemListSeller/node_modules/src/app/page/itemDetail/node_modules/src/app/page/itemListBuyer/node_modules/ngx-bootstrap/modal'

describe('ITEMADDComponent', () => {
  let component: ITEMADDComponent;
  let fixture: ComponentFixture<ITEMADDComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [RouterTestingModule,ModalModule.forRoot()],
      declarations: [ ITEMADDComponent ],
      providers:[BsModalService,BsModalRef]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ITEMADDComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('Component will be created', () => {
    expect(component.ngOnInit()).toBeUndefined();
  });
});
