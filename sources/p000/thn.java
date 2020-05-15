package p000;

/* renamed from: thn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class thn extends thw {

    /* renamed from: a */
    private final bngx f46034a;

    /* renamed from: b */
    private final bmxv f46035b;

    /* renamed from: c */
    private final bmxv f46036c;

    /* renamed from: d */
    private final bmxv f46037d;

    public thn(bngx bngx, bmxv bmxv, bmxv bmxv2, bmxv bmxv3) {
        this.f46034a = bngx;
        this.f46035b = bmxv;
        this.f46036c = bmxv2;
        this.f46037d = bmxv3;
    }

    /* renamed from: a */
    public final bngx mo26542a() {
        return this.f46034a;
    }

    /* renamed from: b */
    public final bmxv mo26543b() {
        return this.f46035b;
    }

    /* renamed from: c */
    public final bmxv mo26544c() {
        return this.f46036c;
    }

    /* renamed from: d */
    public final bmxv mo26545d() {
        return this.f46037d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof thw) {
            thw thw = (thw) obj;
            return bnkn.m109669a(this.f46034a, thw.mo26542a()) && this.f46035b.equals(thw.mo26543b()) && this.f46036c.equals(thw.mo26544c()) && this.f46037d.equals(thw.mo26545d());
        }
    }

    public final int hashCode() {
        return ((((((this.f46034a.hashCode() ^ 1000003) * 1000003) ^ this.f46035b.hashCode()) * 1000003) ^ this.f46036c.hashCode()) * 1000003) ^ this.f46037d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f46034a);
        String valueOf2 = String.valueOf(this.f46035b);
        String valueOf3 = String.valueOf(this.f46036c);
        String valueOf4 = String.valueOf(this.f46037d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 71 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("PostsCardData{posts=");
        sb.append(valueOf);
        sb.append(", targetGaiaId=");
        sb.append(valueOf2);
        sb.append(", viewerAccountName=");
        sb.append(valueOf3);
        sb.append(", viewerPageId=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
