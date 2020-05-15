package p000;

import java.math.BigDecimal;
import java.util.Objects;

/* renamed from: awm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awm {

    /* renamed from: a */
    private static final BigDecimal f2443a = new BigDecimal(20);

    /* renamed from: b */
    private static final BigDecimal f2444b = new BigDecimal(90);

    /* renamed from: c */
    private static final BigDecimal f2445c = new BigDecimal(180);

    /* renamed from: d */
    private static final BigDecimal f2446d = new BigDecimal(4);

    /* renamed from: e */
    private static final BigDecimal f2447e = new BigDecimal(5);

    /* renamed from: f */
    private final String f2448f;

    public awm(double d, double d2) {
        double d3;
        int min = Math.min(12, 15);
        if (min < 4 || (min < 10 && (min & 1) == 1)) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Illegal code length ");
            sb.append(min);
            throw new IllegalArgumentException(sb.toString());
        }
        double min2 = Math.min(Math.max(d, (double) (-f2444b.intValue())), (double) f2444b.intValue());
        while (d2 < ((double) (-f2445c.intValue()))) {
            int intValue = f2445c.intValue();
            double d4 = (double) (intValue + intValue);
            Double.isNaN(d4);
            d2 += d4;
        }
        while (d2 >= ((double) f2445c.intValue())) {
            int intValue2 = f2445c.intValue();
            double d5 = (double) (intValue2 + intValue2);
            Double.isNaN(d5);
            d2 -= d5;
        }
        if (min2 == f2444b.doubleValue()) {
            if (min > 10) {
                d3 = Math.pow((double) f2443a.intValue(), -3.0d) / Math.pow((double) f2447e.intValue(), (double) (min - 10));
            } else {
                d3 = Math.pow((double) f2443a.intValue(), Math.floor((double) ((min / -2) + 2)));
            }
            min2 -= d3 * 0.9d;
        }
        BigDecimal bigDecimal = new BigDecimal(min2 + f2444b.doubleValue());
        BigDecimal bigDecimal2 = new BigDecimal(d2 + f2445c.doubleValue());
        StringBuilder sb2 = new StringBuilder();
        BigDecimal bigDecimal3 = f2443a;
        BigDecimal multiply = bigDecimal3.multiply(bigDecimal3);
        BigDecimal bigDecimal4 = f2443a;
        BigDecimal multiply2 = bigDecimal4.multiply(bigDecimal4);
        int i = 0;
        while (i < min) {
            if (i >= 10) {
                multiply = multiply.divide(f2447e);
                multiply2 = multiply2.divide(f2446d);
                BigDecimal divide = bigDecimal.divide(multiply, 0, 3);
                BigDecimal divide2 = bigDecimal2.divide(multiply2, 0, 3);
                bigDecimal = bigDecimal.subtract(multiply.multiply(divide));
                bigDecimal2 = bigDecimal2.subtract(multiply2.multiply(divide2));
                sb2.append("23456789CFGHJMPQRVWX".charAt((divide.intValue() * f2446d.intValue()) + divide2.intValue()));
                i++;
            } else {
                multiply = multiply.divide(f2443a);
                multiply2 = multiply2.divide(f2443a);
                BigDecimal divide3 = bigDecimal.divide(multiply, 0, 3);
                BigDecimal divide4 = bigDecimal2.divide(multiply2, 0, 3);
                bigDecimal = bigDecimal.subtract(multiply.multiply(divide3));
                bigDecimal2 = bigDecimal2.subtract(multiply2.multiply(divide4));
                sb2.append("23456789CFGHJMPQRVWX".charAt(divide3.intValue()));
                sb2.append("23456789CFGHJMPQRVWX".charAt(divide4.intValue()));
                i += 2;
            }
            if (i == 8) {
                sb2.append('+');
            }
        }
        if (i < 8) {
            while (i < 8) {
                sb2.append('0');
                i++;
            }
            sb2.append('+');
        }
        this.f2448f = sb2.toString();
    }

    /* renamed from: a */
    public static String m2271a(double d, double d2) {
        return new awm(d, d2).f2448f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f2448f, ((awm) obj).f2448f);
    }

    public final int hashCode() {
        String str = this.f2448f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return this.f2448f;
    }
}
