import {Component, ElementRef, Injector} from '@angular/core';
import {AbstractComponent} from "./view/abstract/abstract.component";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent extends AbstractComponent{
  title = 'app';

  constructor(protected elementRef: ElementRef,
              protected  injector: Injector) {
    super(elementRef, injector);
  }

}
