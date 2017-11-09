### Run
Run mock backend with\
`java -jar async-1.0-SNAPSHOT.jar`

### Available endpoints
ALL ACCOUNTS\
`curl localhost:8080/accounts`

ACCOUNT DETAILS - param accountId\
`curl localhost:8080/accounts/1`

ACCOUNT SPECIAL DEALS - param accountId\
`curl localhost:8080/accounts/2/deals`

ALL PAYMENTS\
`curl localhost:8080/payments`

PAYMENT DETAILS - param paymentId\
 `curl localhost:8080/payments/1`

ALL PAYMENT TYPES\
`curl localhost:8080/payments/types`

PAYMENT TYPE DETAILS - param paymentType (INTERNAL, DOMESTIC, INTERNATIONAL)\
 `curl localhost:8080/payment/types/INTERNAL`

ADDITIONAL PAYMENT HEADERS  - param paymentId and paymentType\
`curl localhost:8080/payment/1/headers/DOMESTIC`

PERMISSIONS  - param userId\
 `curl localhost:8080/permissions/1`