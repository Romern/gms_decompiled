package p000;

/* renamed from: yia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yia extends yiq {

    /* renamed from: a */
    private final yie f53847a;

    /* renamed from: b */
    private final boolean f53848b;

    public yia(yie yie, boolean z) {
        this.f53847a = yie;
        this.f53848b = z;
    }

    /* renamed from: a */
    public final yie mo30524a() {
        return this.f53847a;
    }

    /* renamed from: b */
    public final boolean mo30525b() {
        return this.f53848b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yiq) {
            yiq yiq = (yiq) obj;
            return this.f53847a.equals(yiq.mo30524a()) && this.f53848b == yiq.mo30525b();
        }
    }

    public final int hashCode() {
        return ((this.f53847a.hashCode() ^ 1000003) * 1000003) ^ (!this.f53848b ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f53847a);
        boolean z = this.f53848b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
        sb.append("TransformationNodeUpdate{node=");
        sb.append(valueOf);
        sb.append(", isNew=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
