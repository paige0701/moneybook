import {Component, ElementRef, Injector, OnDestroy, OnInit} from '@angular/core';
import {AbstractComponent} from "../abstract/abstract.component";

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
})
export class HeaderComponent extends AbstractComponent implements OnInit, OnDestroy {

  constructor(protected elementRef: ElementRef,
              protected  injector: Injector) {
    super(elementRef, injector);
  }

  ngOnInit() {
    super.ngOnInit();
  }


  ngOnDestroy() {
    super.ngOnDestroy();
  }

}
