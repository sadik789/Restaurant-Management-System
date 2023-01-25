import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CheafAddComponent } from './cheaf-add.component';

describe('CheafAddComponent', () => {
  let component: CheafAddComponent;
  let fixture: ComponentFixture<CheafAddComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CheafAddComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CheafAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
