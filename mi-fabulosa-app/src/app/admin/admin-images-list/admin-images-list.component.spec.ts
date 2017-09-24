import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminImagesListComponent } from './admin-images-list.component';

describe('AdminImagesListComponent', () => {
  let component: AdminImagesListComponent;
  let fixture: ComponentFixture<AdminImagesListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminImagesListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminImagesListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
