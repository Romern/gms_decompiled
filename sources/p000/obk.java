package p000;

/* renamed from: obk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class obk extends obn {

    /* renamed from: a */
    private final boolean f37129a;

    /* renamed from: b */
    private final boolean f37130b;

    /* renamed from: c */
    private final boolean f37131c;

    public obk(boolean z, boolean z2, boolean z3) {
        this.f37129a = z;
        this.f37130b = z2;
        this.f37131c = z3;
    }

    /* renamed from: a */
    public final boolean mo21938a() {
        return this.f37129a;
    }

    /* renamed from: b */
    public final boolean mo21939b() {
        return this.f37130b;
    }

    /* renamed from: c */
    public final boolean mo21940c() {
        return this.f37131c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof obn) {
            obn obn = (obn) obj;
            return this.f37129a == obn.mo21938a() && this.f37130b == obn.mo21939b() && this.f37131c == obn.mo21940c();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((!this.f37129a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (!this.f37130b ? 1237 : 1231)) * 1000003;
        if (this.f37131c) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.f37129a;
        boolean z2 = this.f37130b;
        boolean z3 = this.f37131c;
        StringBuilder sb = new StringBuilder(101);
        sb.append("GalMessageFilter{videoAckLoggable=");
        sb.append(z);
        sb.append(", audioMediaAckLoggable=");
        sb.append(z2);
        sb.append(", audioGuidanceAckLoggable=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
