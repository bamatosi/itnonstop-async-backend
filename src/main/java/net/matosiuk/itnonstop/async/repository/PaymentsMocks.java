package net.matosiuk.itnonstop.async.repository;

import net.matosiuk.itnonstop.async.model.PaymentDetails;
import net.matosiuk.itnonstop.async.model.PaymentTypeDetails;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.vavr.API.$;
import static io.vavr.API.Case;
import static io.vavr.API.Match;

@Repository
public class PaymentsMocks {
    private HashMap<Integer,PaymentDetails> payments = new HashMap();

    public PaymentsMocks() {
        this.payments.put(1, new PaymentDetails(1, 1, 4, 1, "INTERNAL", "MobileBank", "Fab Street 16", BigDecimal.valueOf(111.23), "Take my money"));
        this.payments.put(2, new PaymentDetails(2, 2, 5, 2, "DOMESTIC", "Big Money Bank", "Super Street 16", BigDecimal.valueOf(1000), "Take more of my money"));
        this.payments.put(3, new PaymentDetails(3, 3, 6, 3, "INTERNATIONAL", "Some Bank", "Kraśnicka 1", BigDecimal.valueOf(12.69), "Lunch"));
        this.payments.put(4, new PaymentDetails(4, 1, 7, 1, "INTERNAL", "MobileBank", "T. Zana 39a", BigDecimal.valueOf(99.99), "Just keep it"));
        this.payments.put(5, new PaymentDetails(5, 2, 8, 2, "DOMESTIC", "Big Money Bank", "Lorem ipsum", BigDecimal.valueOf(100), "Random payment"));
        this.payments.put(6, new PaymentDetails(6, 3, 1, 3, "INTERNATIONAL", "MobileBank", "Superb 16", BigDecimal.valueOf(10), "Pocket money"));
        this.payments.put(7, new PaymentDetails(7, 1, 2, 1, "DOMESTIC", "Some Bank", "Aleje Raclawickie 11/21", BigDecimal.valueOf(24), "Something"));
        this.payments.put(8, new PaymentDetails(8, 2, 3, 2, "INTERNAL", "MobileBank", "Secret 16", BigDecimal.valueOf(65.99), "Internet for June 187"));
        this.payments.put(9, new PaymentDetails(9, 3, 4, 3, "INTERNATIONAL", "Some Bank", "More secret 11", BigDecimal.valueOf(100), "Order no 134"));
        this.payments.put(10, new PaymentDetails(10, 1, 5, 1, "DOMESTIC", "Some Bank", "Street Know Name", BigDecimal.valueOf(200), "Invoice 17/11/234"));
    }

    public PaymentDetails getPayment(int paymentId) {
        return (paymentId>=1 && paymentId<=10) ? this.payments.get(paymentId) : null;
    }

    public List<PaymentDetails> getAllPayments() {
        return new ArrayList<>(this.payments.values());
    }

    public PaymentTypeDetails getPaymentTypeDetails(String type) {
        return Match(type).of(
            Case($("INTERNAL"), new PaymentTypeDetails(type, "Internal payment", BigDecimal.ZERO)),
            Case($("DOMESTIC"), new PaymentTypeDetails(type, "Domestic payment", BigDecimal.valueOf(2.30))),
            Case($("INTERNATIONAL"), new PaymentTypeDetails(type, "International payment", BigDecimal.valueOf(10.00))),
            Case($(), new PaymentTypeDetails(type, "Unknown payment", BigDecimal.ZERO))
        );
    }

    public List<String> getAllPaymentTypes() {
        List<String> types = new ArrayList<>();
        types.add("INTERNAL");
        types.add("DOMESTIC");
        types.add("INTERNATIONAL");
        return types;
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
