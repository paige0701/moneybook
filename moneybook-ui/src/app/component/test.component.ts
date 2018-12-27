import {Component, Injector} from "@angular/core";
import {AbstractComponent} from "./abstract/abstract.component";
import {TestService} from "../service/test.service";

@Component({
  selector: 'test',
  templateUrl: './test.component.html',
})
export class TestComponent extends AbstractComponent{

  public list : any;

  constructor( injector : Injector, testService: TestService) {
    super(injector);
    testService.getUsers().subscribe((result) => {
      this.list = result;
    })
  }

}
