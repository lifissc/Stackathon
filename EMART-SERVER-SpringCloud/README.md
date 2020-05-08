
# Services

admin-server:  
   port: 9002  
   des:  service watch  
  
conf-server:  
   port: 9004  
   des:  distribution configurature center  
  
eureka-server:  
   port: 9003  
   des:  service signup center  
  
account-service:  
   port: 8080  
   des:  user service  
   api:  
         /acc/login  
         /acc/signup  
  
product-service:  
   port: 8081  
   des:  product service  
   api:  
         /prd/productInfo  
         /prd/productList  
         /prd/catagory  
         /prd/subcatagory  
         /prd/addProduct  
         /prd/updateProduct  
         /prd/addCart  
         /prd/updateCart  
         /prd/deleteCart  
         /prd/addDiscount  
         /prd/discounts  
         /prd/discountInfo  

order-service:  
   port: 8083  
   des:  order service  
   api:  
         /order/createOrder  
         /order/viewPurchaseHistory  
         /order/viewSellReport  
         
  
payment-service:  
   port: 8082  
   des:  payment service  
   api:  
         /payment/pay  
  
Start guide:  
   
First: start eureka-server,admin-server,conf-server  
Second: start account,product,order,payment  

