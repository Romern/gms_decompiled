package p000;

/* renamed from: bdrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdrr extends bdrx {

    /* renamed from: a */
    public final long f106324a;

    /* renamed from: b */
    public final bdrw f106325b;

    /* renamed from: c */
    public final boolean f106326c;

    public bdrr(long j, bdrw bdrw, boolean z) {
        this.f106324a = j;
        this.f106325b = bdrw;
        this.f106326c = z;
    }

    /* renamed from: a */
    public final long mo58328a() {
        return this.f106324a;
    }

    /* renamed from: b */
    public final bdrw mo58329b() {
        return this.f106325b;
    }

    /* renamed from: c */
    public final boolean mo58330c() {
        return this.f106326c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdrx) {
            bdrx bdrx = (bdrx) obj;
            return this.f106324a == bdrx.mo58328a() && this.f106325b.equals(bdrx.mo58329b()) && this.f106326c == bdrx.mo58330c();
        }
    }

    public final int hashCode() {
        long j = this.f106324a;
        return (!this.f106326c ? 1237 : 1231) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f106325b.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.f106324a;
        String valueOf = String.valueOf(this.f106325b);
        boolean z = this.f106326c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 107);
        sb.append("DownloadDeletionsOptions{timeoutMillis=");
        sb.append(j);
        sb.append(", reason=");
        sb.append(valueOf);
        sb.append(", uploadPushNotificationPayloads=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
