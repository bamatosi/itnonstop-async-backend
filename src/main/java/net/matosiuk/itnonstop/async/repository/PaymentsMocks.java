package net.matosiuk.itnonstop.async.repository;

import net.matosiuk.itnonstop.async.model.PaymentDetails;
import net.matosiuk.itnonstop.async.model.PaymentTypeDetails;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static io.vavr.API.$;
import static io.vavr.API.Case;
import static io.vavr.API.Match;

@Repository
public class PaymentsMocks {
    public PaymentDetails getPaymentDetails(int paymentId) {
        return new PaymentDetails(
                paymentId,
                1,
                2,
                3,
                "INTERNAL",
                "Some bank",
                "Fab Street 16",
                BigDecimal.valueOf(111.23),
                "Take my money"
        );
    }

    public PaymentTypeDetails getPaymentTypeDetails(String type) {
        return Match(type).of(
            Case($("INTERNAL"), new PaymentTypeDetails(type, "Internal payment", BigDecimal.ZERO)),
            Case($("DOMESTIC"), new PaymentTypeDetails(type, "Domestic payment", BigDecimal.valueOf(2.30))),
            Case($("INTERNATIONAL"), new PaymentTypeDetails(type, "International payment", BigDecimal.valueOf(10.00))),
            Case($(), new PaymentTypeDetails(type, "Unknown payment", BigDecimal.ZERO))
        );
    }

    public Map<String,String> getHeaders(int paymentId, String type) {
        Map<String, String> out = new HashMap<>();
        out.put("K1", String.format("Value %d for %d in %s", 1, paymentId, type));
        out.put("K2", String.format("Value %d for %d in %s", 2, paymentId, type));
        out.put("K3", String.format("Value %d for %d in %s", 3, paymentId, type));
        out.put("K4", String.format("Value %d for %d in %s", 4, paymentId, type));
        out.put("K5", String.format("Value %d for %d in %s", 5, paymentId, type));
        out.put("K6", String.format("Value %d for %d in %s", 6, paymentId, type));
        out.put("K7", String.format("Value %d for %d in %s", 7, paymentId, type));
        return out;
    }
}
