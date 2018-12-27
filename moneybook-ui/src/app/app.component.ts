import {Component, Injector } from '@angular/core';
import {AbstractComponent} from "./component/abstract/abstract.component";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent extends AbstractComponent{
  title = 'app';

  constructor( injector : Injector) {
    super(injector);
  }

}
