import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { LOGINComponent } from './emaloginrt002.component';
import {RouterTestingModule} from "@angular/router/testing";
import { HttpClientModule } from "@angular/common/http"

describe('LOGINComponent', () => {
  let component: LOGINComponent;
  let fixture: ComponentFixture<LOGINComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [RouterTestingModule,HttpClientModule],
      declarations: [LOGINComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LOGINComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('Component will be created', () => {
    expect(component.ngOnInit()).toBeUndefined();
  });
});
