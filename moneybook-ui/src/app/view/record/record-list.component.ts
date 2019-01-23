import {Component, ElementRef, Injector, OnDestroy, OnInit} from "@angular/core";
import {AbstractComponent} from "../abstract/abstract.component";
import {RecordService} from "../../service/record.service";

@Component({
  selector: 'app-record-list',
  templateUrl: './record-list.component.html',
})
export class RecordListComponent extends AbstractComponent implements OnInit, OnDestroy {


  public records: any;

  constructor(protected elementRef: ElementRef,
              protected  injector: Injector,
              private recoredService: RecordService) {
    super(elementRef, injector);
  }

  ngOnDestroy() {

  }

  ngOnInit() {
    this.init()

  }

  public init() {
    console.info('Hello world');
    this.recoredService.getRecord().subscribe((result)=> {
      this.records = result;
    })
  }

}
