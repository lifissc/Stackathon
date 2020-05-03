import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import {RouterTestingModule} from "@angular/router/testing";
import { BsModalService,BsModalRef} from 'ngx-bootstrap/modal';
import { ModalModule } from 'ngx-bootstrap/modal'
import { ITEMLISTBUYERComponent } from './itemListBuyer.component';

describe('ITEMLISTBUYERComponent', () => {
  let component: ITEMLISTBUYERComponent;
  let fixture: ComponentFixture<ITEMLISTBUYERComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [RouterTestingModule,ModalModule.forRoot()],
      declarations: [ ITEMLISTBUYERComponent ],
      providers:[BsModalService,BsModalRef]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ITEMLISTBUYERComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('Component will be created', () => {
    expect(component.ngOnInit()).toBeUndefined();
  });
});
