import {RouterModule, Routes} from "@angular/router";
import {RecordListComponent} from "./record-list.component";
import {NgModule} from "@angular/core";
import {FormsModule} from "@angular/forms";
import {CommonModule} from "@angular/common";

const recordRoutes: Routes = [
  {
    path: '', component: RecordListComponent,
    children: [
      // { path: '', redirectTo: 'workspace', pathMatch: 'full' },
      // { path: 'workspace', loadChildren: 'app/workspace/workspace.module#WorkspaceModule' },
    ]
  }
];

@NgModule({
  imports: [
    RouterModule.forChild(recordRoutes),
    FormsModule,
    CommonModule
  ],
  declarations: [
    RecordListComponent
  ],
  providers: [
  ]
})
export class RecordModule {
}
