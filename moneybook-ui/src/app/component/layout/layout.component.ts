import {Component, ElementRef, Injector, OnDestroy, OnInit} from '@angular/core';
import {AbstractComponent} from "../abstract/abstract.component";
import {TestService} from "../../service/test.service";

@Component({
  selector: 'app-layout',
  templateUrl: './layout.component.html',
})
export class LayoutComponent extends AbstractComponent implements OnInit, OnDestroy {

  constructor(protected elementRef: ElementRef, protected  injector: Injector,
              protected testService: TestService) {
    super(elementRef, injector);
  }


  public users;

  ngOnInit() {
    super.ngOnInit();
    this.testService.getUsers().subscribe((result) => {
      this.users = result;
    })
  }


  ngOnDestroy() {
    super.ngOnDestroy();
  }

}
