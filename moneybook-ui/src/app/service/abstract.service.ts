import {Injectable, Injector} from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export abstract class AbstractService {

  protected constructor(protected injector: Injector) {

  }
}
