package p000;

/* renamed from: bcvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcvb extends bcvd {

    /* renamed from: a */
    private final bcwp f104981a;

    /* renamed from: b */
    private final int f104982b;

    public bcvb(bcwp bcwp, int i) {
        this.f104981a = bcwp;
        this.f104982b = i;
    }

    /* renamed from: a */
    public final bcwp mo57585a() {
        return this.f104981a;
    }

    /* renamed from: b */
    public final int mo57586b() {
        return this.f104982b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcvd) {
            bcvd bcvd = (bcvd) obj;
            return this.f104981a.equals(bcvd.mo57585a()) && this.f104982b == bcvd.mo57586b();
        }
    }

    public final int hashCode() {
        return ((this.f104981a.hashCode() ^ 1000003) * 1000003) ^ this.f104982b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104981a);
        int i = this.f104982b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 74);
        sb.append("ImageDownloadRequestArgs{lighterMediaId=");
        sb.append(valueOf);
        sb.append(", downloadRequestType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
