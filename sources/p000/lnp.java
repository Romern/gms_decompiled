package p000;

/* renamed from: lnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lnp extends lpb {

    /* renamed from: a */
    private final bdyx f26462a;

    /* renamed from: b */
    private final boolean f26463b;

    public lnp(bdyx bdyx, boolean z) {
        this.f26462a = bdyx;
        this.f26463b = z;
    }

    /* renamed from: a */
    public final bdyx mo15296a() {
        return this.f26462a;
    }

    /* renamed from: b */
    public final boolean mo15297b() {
        return this.f26463b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lpb) {
            lpb lpb = (lpb) obj;
            return this.f26462a.equals(lpb.mo15296a()) && this.f26463b == lpb.mo15297b();
        }
    }

    public final int hashCode() {
        return ((this.f26462a.hashCode() ^ 1000003) * 1000003) ^ (!this.f26463b ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f26462a);
        boolean z = this.f26463b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 66);
        sb.append("PhenotypeFlagWrapper{phenotypeFlag=");
        sb.append(valueOf);
        sb.append(", gmsCoreRestartRequired=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
