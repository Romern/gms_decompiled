package p000;

import java.math.BigDecimal;
import java.util.Currency;

/* renamed from: ciju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciju implements breq {

    /* renamed from: a */
    private final long f190464a;

    /* renamed from: b */
    private final BigDecimal f190465b;

    /* renamed from: c */
    private final Currency f190466c;

    /* renamed from: d */
    private final long f190467d;

    /* renamed from: e */
    private final int f190468e;

    public ciju(long j, BigDecimal bigDecimal, Currency currency, long j2, int i) {
        this.f190464a = j;
        this.f190465b = bigDecimal;
        this.f190466c = currency;
        this.f190467d = j2;
        this.f190468e = i;
    }

    /* renamed from: a */
    public final long mo60902a() {
        return this.f190464a;
    }

    /* renamed from: b */
    public final BigDecimal mo60903b() {
        return this.f190465b;
    }

    /* renamed from: c */
    public final Currency mo60904c() {
        return this.f190466c;
    }

    /* renamed from: d */
    public final long mo60905d() {
        return this.f190467d;
    }

    /* renamed from: e */
    public final int mo60906e() {
        return this.f190468e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ciju) {
            ciju ciju = (ciju) obj;
            if (this.f190464a == ciju.f190464a && this.f190467d == ciju.f190467d && this.f190468e == ciju.f190468e && this.f190465b.equals(ciju.f190465b)) {
                Currency currency = this.f190466c;
                if (currency != null) {
                    return currency.equals(ciju.f190466c);
                }
                return ciju.f190466c == null;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f190464a;
        int hashCode = ((((int) (j ^ (j >>> 32))) * 31) + this.f190465b.hashCode()) * 31;
        Currency currency = this.f190466c;
        int hashCode2 = currency != null ? currency.hashCode() : 0;
        long j2 = this.f190467d;
        return ((((hashCode + hashCode2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f190468e;
    }

    public final String toString() {
        long j = this.f190464a;
        String valueOf = String.valueOf(this.f190465b);
        String valueOf2 = String.valueOf(this.f190466c);
        long j2 = this.f190467d;
        int i = this.f190468e;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 140 + String.valueOf(valueOf2).length());
        sb.append("QuicPayTransactionInfo{transactionId=");
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
