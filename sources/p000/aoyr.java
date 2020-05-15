package p000;

/* renamed from: aoyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aoyr extends aoyx {

    /* renamed from: a */
    private final long f83863a;

    /* renamed from: b */
    private final int f83864b;

    /* renamed from: c */
    private final long f83865c;

    /* renamed from: d */
    private final boolean f83866d;

    public aoyr(long j, int i, long j2, boolean z) {
        this.f83863a = j;
        this.f83864b = i;
        this.f83865c = j2;
        this.f83866d = z;
    }

    /* renamed from: a */
    public final long mo47014a() {
        return this.f83863a;
    }

    /* renamed from: b */
    public final int mo47015b() {
        return this.f83864b;
    }

    /* renamed from: c */
    public final long mo47016c() {
        return this.f83865c;
    }

    /* renamed from: d */
    public final boolean mo47017d() {
        return this.f83866d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aoyx) {
            aoyx aoyx = (aoyx) obj;
            return this.f83863a == aoyx.mo47014a() && this.f83864b == aoyx.mo47015b() && this.f83865c == aoyx.mo47016c() && this.f83866d == aoyx.mo47017d();
        }
    }

    public final int hashCode() {
        long j = this.f83863a;
        int i = this.f83864b;
        long j2 = this.f83865c;
        return (!this.f83866d ? 1237 : 1231) ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ i) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        long j = this.f83863a;
        int i = this.f83864b;
        long j2 = this.f83865c;
        boolean z = this.f83866d;
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
