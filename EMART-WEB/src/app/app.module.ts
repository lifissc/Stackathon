import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';

import { LOGINComponent } from './page/login/login.component';
import { SIGNUPComponent } from './page/signup/signup.component';
import { ITEMLISTBUYERComponent } from './page/itemListBuyer/itemListBuyer.component';
import { ITEMDETAILComponent } from './page/itemDetail/itemDetail.component';
import { ITEMCARTComponent } from './page/itemCart/itemCart.component';
import { ITEMLISTSELLERComponent } from './page/itemListSeller/itemListSeller.component';
import { ITEMADDComponent } from './page/itemAdd/itemAdd.component';
import { ITEMUPDATEComponent } from './page/itemUpdate/itemUpdate.component';
import { ITEMSELLREPORTComponent } from './page/itemSellReport/itemSellReport.component';

import { ModalModule } from 'ngx-bootstrap/modal';
import { TabsModule } from 'ngx-bootstrap/tabs';
import { ProductComponent } from './page/product/product.component';
import { CommonModule } from '@angular/common';
import {HttpClientModule} from "@angular/common/http";
import { AlertModule } from 'ngx-bootstrap/alert';


@NgModule({
  declarations: [
    AppComponent,
    LOGINComponent,
    SIGNUPComponent,
    ITEMLISTBUYERComponent,
    ITEMDETAILComponent,
    ITEMCARTComponent,
    ITEMLISTSELLERComponent,
    ITEMADDComponent,
    ITEMUPDATEComponent,
    ITEMSELLREPORTComponent,
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
