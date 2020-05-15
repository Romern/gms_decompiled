package p000;

/* renamed from: uqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class uqi {

    /* renamed from: a */
    protected final int f48534a;

    /* renamed from: b */
    protected final utr f48535b;

    public uqi(int i, utr utr) {
        sdo.m34959a(utr);
        this.f48534a = i;
        this.f48535b = utr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uqi) {
            uqi uqi = (uqi) obj;
            return this.f48534a == uqi.f48534a && this.f48535b.asBinder().equals(uqi.f48535b.asBinder());
        }
    }

    public final int hashCode() {
        return ((this.f48534a + 527) * 31) + this.f48535b.asBinder().hashCode();
    }
}
