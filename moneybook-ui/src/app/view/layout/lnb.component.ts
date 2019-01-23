import {Component, ElementRef, Injector, OnDestroy, OnInit} from "@angular/core";
import {AbstractComponent} from "../abstract/abstract.component";

@Component({
  selector: 'layout-lnb',
  templateUrl: './lnb.component.html',
})
export class LNBComponent extends AbstractComponent implements OnInit, OnDestroy {

  constructor(protected elementRef: ElementRef,
              protected  injector: Injector) {
    super(elementRef, injector);
  }

  ngOnDestroy() {

  }

  ngOnInit() {

  }

}
