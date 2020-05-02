import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';

import { EMART002Component } from './page/emart002/emart002.component';
import { EMART001Component } from './page/emart001/emart001.component';
import { EMART003Component } from './page/emart003/emart003.component';
import { EMART004Component } from './page/emart004/emart004.component';
import { EMART005Component } from './page/emart005/emart005.component';
import { EMART006Component } from './page/emart006/emart006.component';
import { EMART007Component } from './page/emart007/emart007.component';
import { EMART008Component } from './page/emart008/emart008.component';
import { EMART009Component } from './page/emart009/emart009.component';

import { ModalModule } from 'ngx-bootstrap/modal';
import { TabsModule } from 'ngx-bootstrap/tabs';
import { ProductComponent } from './page/product/product.component';
import { CommonModule } from '@angular/common';
import {HttpClientModule} from "@angular/common/http";
import { AlertModule } from 'ngx-bootstrap/alert';


@NgModule({
  declarations: [
    AppComponent,
    EMART002Component,
    EMART001Component,
    EMART003Component,
    EMART004Component,
    EMART005Component,
    EMART006Component,
    EMART007Component,
    EMART008Component,
    EMART009Component,
    ProductComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ModalModule.forRoot(),
    TabsModule.forRoot(),
    CommonModule,
    HttpClientModule,
    AlertModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
