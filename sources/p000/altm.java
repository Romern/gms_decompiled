package p000;

/* renamed from: altm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class altm {

    /* renamed from: a */
    public String f74223a;

    /* renamed from: b */
    public String f74224b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof altm)) {
            altm altm = (altm) obj;
            return bmxi.m108538a(this.f74223a, altm.f74223a) && bmxi.m108538a(this.f74224b, altm.f74224b);
        }
    }

    public final int hashCode() {
        String str = this.f74223a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        String str2 = this.f74224b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
