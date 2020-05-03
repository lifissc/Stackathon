import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import {RouterTestingModule} from "@angular/router/testing";
import { ITEMLISTSELLERComponent } from './itemListSeller.component';
import { BsModalService,BsModalRef} from 'src/app/page/itemDetail/node_modules/src/app/page/itemListBuyer/node_modules/ngx-bootstrap/modal';
import { ModalModule } from 'src/app/page/itemDetail/node_modules/src/app/page/itemListBuyer/node_modules/ngx-bootstrap/modal'
describe('ITEMLISTSELLERComponent', () => {
  let component: ITEMLISTSELLERComponent;
  let fixture: ComponentFixture<ITEMLISTSELLERComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [RouterTestingModule,ModalModule.forRoot()],
      declarations: [ ITEMLISTSELLERComponent ],
      providers:[BsModalService,BsModalRef]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ITEMLISTSELLERComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('Component will be created', () => {
    expect(component.ngOnInit()).toBeUndefined();
  });
});
