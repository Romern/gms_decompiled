package p000;

import java.math.BigDecimal;
import java.util.Arrays;

/* renamed from: bnvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnvc implements Comparable {

    /* renamed from: a */
    final BigDecimal f132215a;

    /* renamed from: b */
    final BigDecimal f132216b;

    /* renamed from: c */
    final BigDecimal f132217c;

    public bnvc(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        this.f132215a = bigDecimal;
        this.f132216b = bigDecimal2;
        this.f132217c = bigDecimal3;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bnvc bnvc = (bnvc) obj;
        int compareTo = this.f132215a.compareTo(bnvc.f132215a);
        if (compareTo == 0 && (compareTo = this.f132216b.compareTo(bnvc.f132216b)) == 0) {
            return this.f132217c.compareTo(bnvc.f132217c);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bnvc) {
            bnvc bnvc = (bnvc) obj;
            if (!this.f132215a.equals(bnvc.f132215a) || !this.f132216b.equals(bnvc.f132216b) || !this.f132217c.equals(bnvc.f132217c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f132215a, this.f132216b, this.f132217c});
    }
}
