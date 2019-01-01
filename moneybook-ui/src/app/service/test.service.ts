import {Injectable, Injector} from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs/internal/Observable";
import {User} from "../domain/User";
import {tap} from "rxjs/operators";
import {AbstractService} from "./abstract.service";

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({providedIn: 'root'})
export class TestService extends AbstractService {

  constructor(private http: HttpClient, protected injector: Injector) {
    super(injector);
  }

  /** GET heroes from the server */
  getUsers (): Observable<User[]> {
    return this.http.get<User[]>(this.baseUrl+'test', httpOptions)
      .pipe(tap((result) => {
        return result;
        })
      );
  }
}
