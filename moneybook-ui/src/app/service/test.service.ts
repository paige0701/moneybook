import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs/internal/Observable";
import {User} from "../domain/User";
import {catchError, tap} from "rxjs/operators";

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class TestService {

  private testUrl: string = 'http://localhost:8081/api/test';  // URL to web api

  constructor(private http: HttpClient) {

  }

  /** GET heroes from the server */
  getUsers (): Observable<User[]> {
    return this.http.get<User[]>(this.testUrl, httpOptions)
      .pipe(tap((result) => {ynn
        return result;
        })
      );
  }
}
