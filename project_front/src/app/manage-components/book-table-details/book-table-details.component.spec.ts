import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BookTableDetailsComponent } from './book-table-details.component';

describe('BookTableDetailsComponent', () => {
  let component: BookTableDetailsComponent;
  let fixture: ComponentFixture<BookTableDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BookTableDetailsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BookTableDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
