import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule,Routes } from '@angular/router'

import { LOGINComponent } from './page/login/login.component';
import { SIGNUPComponent } from './page/signup/signup.component';
import { ITEMLISTBUYERComponent } from './page/itemListBuyer/itemListBuyer.component';
import { ITEMDETAILComponent } from './page/itemDetail/itemDetail.component';
import { ITEMCARTComponent } from './page/itemCart/itemCart.component';
import { ITEMLISTSELLERComponent } from './page/itemListSeller/itemListSeller.component';
import { ITEMADDComponent } from './page/itemAdd/itemAdd.component';
import { ITEMUPDATEComponent } from './page/itemUpdate/itemUpdate.component';
import { ITEMSELLREPORTComponent } from './page/itemSellReport/itemSellReport.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: '/login',
    pathMatch: 'full'
  },
  {
    path: 'login',
    component: LOGINComponent,
  },
  {
    path: 'signup',
    component: SIGNUPComponent
  },
  {
    path: 'itemListBuyer',
    component: ITEMLISTBUYERComponent
  },
  {
    path: 'itemDetail',
    component: ITEMDETAILComponent
  },
  {
    path: 'itemCart',
    component: ITEMCARTComponent
  },
  {
    path: 'itemListSeller',
    component: ITEMLISTSELLERComponent
  },
  {
    path: 'itemAdd',
    component: ITEMADDComponent
  },
  {
    path: 'itemUpdate',
    component: ITEMUPDATEComponent
  },
  {
    path: 'itemSellReport',
    component: ITEMSELLREPORTComponent
  }
]

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
