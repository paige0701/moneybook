import {Component, ElementRef, Injector, OnDestroy, OnInit} from '@angular/core';
import {AbstractComponent} from "../abstract/abstract.component";

@Component({
  selector: 'app-layout',
  templateUrl: './layout.component.html',
})
export class LayoutComponent extends AbstractComponent implements OnInit, OnDestroy {

  constructor(protected elementRef: ElementRef, protected  injector: Injector) {
    super(elementRef, injector);
  }

  ngOnInit() {
    super.ngOnInit();
  }


  ngOnDestroy() {
    super.ngOnDestroy();
  }

}
