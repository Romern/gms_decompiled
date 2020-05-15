package p000;

/* renamed from: ayqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayqy extends ayrl {

    /* renamed from: a */
    private final boolean f98312a;

    /* renamed from: b */
    private final long f98313b;

    /* renamed from: c */
    private final bmxv f98314c;

    /* renamed from: d */
    private final bmxv f98315d;

    public ayqy(boolean z, long j, bmxv bmxv, bmxv bmxv2) {
        this.f98312a = z;
        this.f98313b = j;
        this.f98314c = bmxv;
        this.f98315d = bmxv2;
    }

    /* renamed from: a */
    public final boolean mo54300a() {
        return this.f98312a;
    }

    /* renamed from: b */
    public final long mo54301b() {
        return this.f98313b;
    }

    /* renamed from: c */
    public final bmxv mo54302c() {
        return this.f98314c;
    }

    /* renamed from: d */
    public final bmxv mo54303d() {
        return this.f98315d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ayrl) {
            ayrl ayrl = (ayrl) obj;
            return this.f98312a == ayrl.mo54300a() && this.f98313b == ayrl.mo54301b() && this.f98314c.equals(ayrl.mo54302c()) && this.f98315d.equals(ayrl.mo54303d());
        }
    }

    public final int hashCode() {
        int i = !this.f98312a ? 1237 : 1231;
        long j = this.f98313b;
        return ((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ 2040732332) * 1000003) ^ this.f98315d.hashCode();
    }

    public final String toString() {
        boolean z = this.f98312a;
        long j = this.f98313b;
        String valueOf = String.valueOf(this.f98314c);
        String valueOf2 = String.valueOf(this.f98315d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 109 + String.valueOf(valueOf2).length());
        sb.append("ConnectionOptions{autoConnect=");
        sb.append(z);
        sb.append(", connectionTimeoutMillis=");
        sb.append(j);
        sb.append(", connectionPriority=");
        sb.append(valueOf);
        sb.append(", mtu=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
