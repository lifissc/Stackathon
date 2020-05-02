import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { EMART002Component } from './emart002.component';
import {RouterTestingModule} from "@angular/router/testing";
import { HttpClientModule } from "@angular/common/http"

describe('EMART002Component', () => {
  let component: EMART002Component;
  let fixture: ComponentFixture<EMART002Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [RouterTestingModule,HttpClientModule],
      declarations: [EMART002Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EMART002Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('Component will be created', () => {
    expect(component.ngOnInit()).toBeUndefined();
  });
});
