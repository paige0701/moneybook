import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { TestService } from "./service/test.service";
import { HttpClientModule} from "@angular/common/http";
import {RouterModule, Routes} from "@angular/router";
import {TestComponent} from "./component/test.component";

const routes: Routes = [
  { path: '', redirectTo: '/api/test', pathMatch: 'full' },
  { path: 'api/test', component : TestComponent }
];

@NgModule({
  declarations: [
    AppComponent,
    TestComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(
      routes
    )
  ],
  exports : [RouterModule],
  providers: [TestService],
  bootstrap: [AppComponent]
})
export class AppModule { }
