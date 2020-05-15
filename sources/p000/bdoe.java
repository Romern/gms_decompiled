package p000;

/* renamed from: bdoe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdoe extends bdoj {

    /* renamed from: a */
    private final boolean f106129a;

    /* renamed from: b */
    private final boolean f106130b;

    /* renamed from: c */
    private final bmxv f106131c;

    public bdoe(boolean z, boolean z2, bmxv bmxv) {
        this.f106129a = z;
        this.f106130b = z2;
        this.f106131c = bmxv;
    }

    /* renamed from: a */
    public final boolean mo58226a() {
        return this.f106129a;
    }

    /* renamed from: b */
    public final boolean mo58227b() {
        return this.f106130b;
    }

    /* renamed from: c */
    public final bmxv mo58228c() {
        return this.f106131c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdoj) {
            bdoj bdoj = (bdoj) obj;
            return this.f106129a == bdoj.mo58226a() && this.f106130b == bdoj.mo58227b() && this.f106131c.equals(bdoj.mo58228c());
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((!this.f106129a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (this.f106130b) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        boolean z = this.f106129a;
        boolean z2 = this.f106130b;
        String valueOf = String.valueOf(this.f106131c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 82);
        sb.append("StorageConfigurations{enabled=");
        sb.append(z);
        sb.append(", manualCapture=");
        sb.append(z2);
        sb.append(", dirStatsConfigurations=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
