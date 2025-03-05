import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PracticeBootstrapComponent } from './practice-bootstrap.component';

describe('PracticeBootstrapComponent', () => {
  let component: PracticeBootstrapComponent;
  let fixture: ComponentFixture<PracticeBootstrapComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PracticeBootstrapComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PracticeBootstrapComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
