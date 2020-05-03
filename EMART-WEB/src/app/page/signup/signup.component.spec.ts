import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import {RouterTestingModule} from "@angular/router/testing";
import { SIGNUPComponent } from './signup.component';

describe('SIGNUPComponent', () => {
  let component: SIGNUPComponent;
  let fixture: ComponentFixture<SIGNUPComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [RouterTestingModule],
      declarations: [ SIGNUPComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SIGNUPComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('Component will be created', () => {
    expect(component.ngOnInit()).toBeUndefined();
  });
});
