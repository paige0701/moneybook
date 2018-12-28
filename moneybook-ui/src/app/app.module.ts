import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {HttpClientModule} from "@angular/common/http";
import {RouterModule, Routes} from "@angular/router";

import {AppComponent} from './app.component';
import {TestService} from "./service/test.service";
import {LayoutModule} from "./component/layout/layout.module";


const routes: Routes = [
  { path: '', loadChildren: 'app/component/layout/layout.module#LayoutModule' },
];

@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    LayoutModule,
    RouterModule.forRoot(
      routes
    )
  ],
  exports : [RouterModule],
  providers: [TestService],
  bootstrap: [AppComponent]
})
export class AppModule { }
