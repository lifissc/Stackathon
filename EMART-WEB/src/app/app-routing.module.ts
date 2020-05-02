import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule,Routes } from '@angular/router'

import { EMART002Component } from './page/emart002/emart002.component';
import { EMART001Component } from './page/emart001/emart001.component';
import { EMART003Component } from './page/emart003/emart003.component';
import { EMART004Component } from './page/emart004/emart004.component';
import { EMART005Component } from './page/emart005/emart005.component';
import { EMART006Component } from './page/emart006/emart006.component';
import { EMART007Component } from './page/emart007/emart007.component';
import { EMART008Component } from './page/emart008/emart008.component';
import { EMART009Component } from './page/emart009/emart009.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: '/emart002',
    pathMatch: 'full'
  },
  {
    path: 'emart002',
    component: EMART002Component,
  },
  {
    path: 'emart001',
    component: EMART001Component
  },
  {
    path: 'emart003',
    component: EMART003Component
  },
  {
    path: 'emart004',
    component: EMART004Component
  },
  {
    path: 'emart005',
    component: EMART005Component
  },
  {
    path: 'emart006',
    component: EMART006Component
  },
  {
    path: 'emart007',
    component: EMART007Component
  },
  {
    path: 'emart008',
    component: EMART008Component
  },
  {
    path: 'emart009',
    component: EMART009Component
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
