import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InternetSettingsComponent } from './internet-settings.component';

describe('InternetSettingsComponent', () => {
  let component: InternetSettingsComponent;
  let fixture: ComponentFixture<InternetSettingsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InternetSettingsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InternetSettingsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
