package p000;

import java.math.BigDecimal;
import java.util.Currency;

/* renamed from: bepn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bepn implements breq {

    /* renamed from: a */
    private final long f111993a;

    /* renamed from: b */
    private final BigDecimal f111994b;

    /* renamed from: c */
    private final Currency f111995c;

    /* renamed from: d */
    private final long f111996d;

    /* renamed from: e */
    private final int f111997e;

    public bepn(long j, BigDecimal bigDecimal, Currency currency, long j2, int i) {
        this.f111993a = j;
        this.f111994b = bigDecimal;
        this.f111995c = currency;
        this.f111996d = j2;
        this.f111997e = i;
    }

    /* renamed from: a */
    public final long mo60902a() {
        return this.f111993a;
    }

    /* renamed from: b */
    public final BigDecimal mo60903b() {
        return this.f111994b;
    }

    /* renamed from: c */
    public final Currency mo60904c() {
        return this.f111995c;
    }

    /* renamed from: d */
    public final long mo60905d() {
        return this.f111996d;
    }

    /* renamed from: e */
    public final int mo60906e() {
        return this.f111997e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bepn bepn = (bepn) obj;
            if (this.f111993a == bepn.f111993a && this.f111996d == bepn.f111996d && this.f111997e == bepn.f111997e) {
                BigDecimal bigDecimal = this.f111994b;
                if (bigDecimal == null ? bepn.f111994b != null : !bigDecimal.equals(bepn.f111994b)) {
                    return false;
                }
                Currency currency = this.f111995c;
                if (currency != null) {
                    return currency.equals(bepn.f111995c);
                }
                return bepn.f111995c == null;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f111993a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        BigDecimal bigDecimal = this.f111994b;
        int i2 = 0;
        int hashCode = (i + (bigDecimal != null ? bigDecimal.hashCode() : 0)) * 31;
        Currency currency = this.f111995c;
        if (currency != null) {
            i2 = currency.hashCode();
        }
        long j2 = this.f111996d;
        return ((((hashCode + i2) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + this.f111997e;
    }

    public final String toString() {
        long j = this.f111993a;
        String valueOf = String.valueOf(this.f111994b);
        String valueOf2 = String.valueOf(this.f111995c);
        long j2 = this.f111996d;
        int i = this.f111997e;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 139 + String.valueOf(valueOf2).length());
        sb.append("ApTestTransactionInfo{transactionId=");
        sb.append(j);
        sb.append(", amount=");
        sb.append(valueOf);
        sb.append(", currency=");
        sb.append(valueOf2);
        sb.append(", transactionTimeMillis=");
        sb.append(j2);
        sb.append(", type=");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }
}
