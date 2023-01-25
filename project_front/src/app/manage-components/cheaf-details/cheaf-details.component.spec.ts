import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CheafDetailsComponent } from './cheaf-details.component';

describe('CheafDetailsComponent', () => {
  let component: CheafDetailsComponent;
  let fixture: ComponentFixture<CheafDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CheafDetailsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CheafDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
