package p000;

/* renamed from: bdpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdpj extends bdpp {

    /* renamed from: a */
    private final boolean f106211a;

    /* renamed from: b */
    private final int f106212b;

    /* renamed from: c */
    private final bdpn f106213c;

    /* renamed from: d */
    private final boolean f106214d;

    public bdpj(boolean z, int i, bdpn bdpn, boolean z2) {
        this.f106211a = z;
        this.f106212b = i;
        this.f106213c = bdpn;
        this.f106214d = z2;
    }

    /* renamed from: a */
    public final boolean mo58264a() {
        return this.f106211a;
    }

    /* renamed from: b */
    public final int mo58265b() {
        return this.f106212b;
    }

    /* renamed from: c */
    public final bdpn mo58266c() {
        return this.f106213c;
    }

    /* renamed from: d */
    public final boolean mo58267d() {
        return this.f106214d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdpp) {
            bdpp bdpp = (bdpp) obj;
            return this.f106211a == bdpp.mo58264a() && this.f106212b == bdpp.mo58265b() && this.f106213c.equals(bdpp.mo58266c()) && this.f106214d == bdpp.mo58267d();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = ((((((!this.f106211a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f106212b) * 1000003) ^ this.f106213c.hashCode()) * 1000003;
        if (this.f106214d) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        boolean z = this.f106211a;
        int i = this.f106212b;
        String valueOf = String.valueOf(this.f106213c);
        boolean z2 = this.f106214d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 117);
        sb.append("TikTokTraceConfigurations{enabled=");
        sb.append(z);
        sb.append(", sampleRatePerSecond=");
        sb.append(i);
        sb.append(", dynamicSampler=");
        sb.append(valueOf);
        sb.append(", recordTimerDuration=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
