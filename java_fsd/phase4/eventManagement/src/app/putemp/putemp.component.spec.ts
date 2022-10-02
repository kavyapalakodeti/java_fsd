import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PutempComponent } from './putemp.component';

describe('PutempComponent', () => {
  let component: PutempComponent;
  let fixture: ComponentFixture<PutempComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PutempComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PutempComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
