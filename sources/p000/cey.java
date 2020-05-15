package p000;

import java.security.MessageDigest;

/* renamed from: cey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cey implements cdg {

    /* renamed from: b */
    private final cdg f6642b;

    /* renamed from: c */
    private final cdg f6643c;

    public cey(cdg cdg, cdg cdg2) {
        this.f6642b = cdg;
        this.f6643c = cdg2;
    }

    /* renamed from: a */
    public final void mo3732a(MessageDigest messageDigest) {
        this.f6642b.mo3732a(messageDigest);
        this.f6643c.mo3732a(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cey) {
            cey cey = (cey) obj;
            return this.f6642b.equals(cey.f6642b) && this.f6643c.equals(cey.f6643c);
        }
    }

    public final int hashCode() {
        return (this.f6642b.hashCode() * 31) + this.f6643c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6642b);
        String valueOf2 = String.valueOf(this.f6643c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(valueOf2).length());
        sb.append("DataCacheKey{sourceKey=");
        sb.append(valueOf);
        sb.append(", signature=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }
}
