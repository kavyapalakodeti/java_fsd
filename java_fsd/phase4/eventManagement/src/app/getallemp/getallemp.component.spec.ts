import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetallempComponent } from './getallemp.component';

describe('GetallempComponent', () => {
  let component: GetallempComponent;
  let fixture: ComponentFixture<GetallempComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetallempComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetallempComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
