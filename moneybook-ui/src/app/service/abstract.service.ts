import {Injectable, Injector} from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AbstractService {

  // 생성자
  constructor(protected injector: Injector) {

  }

  public baseUrl: string = '/api/';
}
