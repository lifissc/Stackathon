import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import {RouterTestingModule} from "@angular/router/testing";
import { ITEMSELLREPORTComponent } from './itemSellReport.component';

describe('ITEMSELLREPORTComponent', () => {
  let component: ITEMSELLREPORTComponent;
  let fixture: ComponentFixture<ITEMSELLREPORTComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [RouterTestingModule],
      declarations: [ ITEMSELLREPORTComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ITEMSELLREPORTComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('Component will be created', () => {
    expect(component.ngOnInit()).toBeUndefined();
  });
});
