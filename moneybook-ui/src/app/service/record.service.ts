import {Injectable, Injector} from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs/internal/Observable";
import {tap} from "rxjs/operators";
import {AbstractService} from "./abstract.service";

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({providedIn: 'root'})
export class RecordService extends AbstractService {

  constructor(private http: HttpClient, protected injector: Injector) {
    super(injector);
  }


  /**
   * Returns
   */
  public getRecord (): Observable<any> {
    return this.http.get<any>(this.baseUrl+'record', httpOptions)
      .pipe(tap((result) => {
          return result;
        })
      );
  }
}
