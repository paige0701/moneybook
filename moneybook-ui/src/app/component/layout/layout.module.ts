/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import { NgModule } from '@angular/core';
import {RouterModule, Routes} from "@angular/router";
import {LayoutComponent} from "./layout.component";
import {LNBComponent} from "./lnb.component";

const layoutRoutes: Routes = [
  {
    path: '', component: LayoutComponent,
    children: [
      // { path: '', redirectTo: 'workspace', pathMatch: 'full' },
      // { path: 'workspace', loadChildren: 'app/workspace/workspace.module#WorkspaceModule' },
    ]
  }
];

@NgModule({
  imports: [
    RouterModule.forChild(layoutRoutes)
  ],
  declarations: [
    LayoutComponent,
    LNBComponent
  ],
  providers: [
  ]
})
export class LayoutModule {
}
