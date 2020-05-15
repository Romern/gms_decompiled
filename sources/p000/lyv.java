package p000;

/* renamed from: lyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lyv extends lzd {

    /* renamed from: a */
    private final long f33220a;

    /* renamed from: b */
    private final int f33221b;

    /* renamed from: c */
    private final long f33222c;

    /* renamed from: d */
    private final boolean f33223d;

    public lyv(long j, int i, long j2, boolean z) {
        this.f33220a = j;
        this.f33221b = i;
        this.f33222c = j2;
        this.f33223d = z;
    }

    /* renamed from: a */
    public final long mo19761a() {
        return this.f33220a;
    }

    /* renamed from: b */
    public final int mo19762b() {
        return this.f33221b;
    }

    /* renamed from: c */
    public final long mo19763c() {
        return this.f33222c;
    }

    /* renamed from: d */
    public final boolean mo19764d() {
        return this.f33223d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lzd) {
            lzd lzd = (lzd) obj;
            return this.f33220a == lzd.mo19761a() && this.f33221b == lzd.mo19762b() && this.f33222c == lzd.mo19763c() && this.f33223d == lzd.mo19764d();
        }
    }

    public final int hashCode() {
        long j = this.f33220a;
        int i = this.f33221b;
        long j2 = this.f33222c;
        return (!this.f33223d ? 1237 : 1231) ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ i) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        long j = this.f33220a;
        int i = this.f33221b;
        long j2 = this.f33222c;
        boolean z = this.f33223d;
        StringBuilder sb = new StringBuilder(132);
        sb.append("ContactMetadata{contactId=");
        sb.append(j);
        sb.append(", timesContacted=");
        sb.append(i);
        sb.append(", lastTimeContacted=");
        sb.append(j2);
        sb.append(", isStarred=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
