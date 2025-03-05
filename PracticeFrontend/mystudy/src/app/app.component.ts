import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { PracticeCssComponent } from './src/app/practice-css/practice-css.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,PracticeCssComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'mystudy';
}
