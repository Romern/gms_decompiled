package p000;

/* renamed from: andf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class andf extends andj {

    /* renamed from: a */
    private final long f76661a;

    /* renamed from: b */
    private final int f76662b;

    /* renamed from: c */
    private final long f76663c;

    /* renamed from: d */
    private final boolean f76664d;

    /* renamed from: e */
    private final boolean f76665e;

    /* renamed from: f */
    private final boolean f76666f;

    /* renamed from: g */
    private final long f76667g;

    public andf(long j, int i, long j2, boolean z, boolean z2, boolean z3, long j3) {
        this.f76661a = j;
        this.f76662b = i;
        this.f76663c = j2;
        this.f76664d = z;
        this.f76665e = z2;
        this.f76666f = z3;
        this.f76667g = j3;
    }

    /* renamed from: a */
    public final long mo41720a() {
        return this.f76661a;
    }

    /* renamed from: b */
    public final int mo41721b() {
        return this.f76662b;
    }

    /* renamed from: c */
    public final long mo41722c() {
        return this.f76663c;
    }

    /* renamed from: d */
    public final boolean mo41723d() {
        return this.f76664d;
    }

    /* renamed from: e */
    public final boolean mo41724e() {
        return this.f76665e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof andj) {
            andj andj = (andj) obj;
            return this.f76661a == andj.mo41720a() && this.f76662b == andj.mo41721b() && this.f76663c == andj.mo41722c() && this.f76664d == andj.mo41723d() && this.f76665e == andj.mo41724e() && this.f76666f == andj.mo41726f() && this.f76667g == andj.mo41727g();
        }
    }

    /* renamed from: f */
    public final boolean mo41726f() {
        return this.f76666f;
    }

    /* renamed from: g */
    public final long mo41727g() {
        return this.f76667g;
    }

    public final int hashCode() {
        long j = this.f76661a;
        int i = this.f76662b;
        long j2 = this.f76663c;
        int i2 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ i) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        int i3 = 1237;
        int i4 = (((i2 ^ (!this.f76664d ? 1237 : 1231)) * 1000003) ^ (!this.f76665e ? 1237 : 1231)) * 1000003;
        if (this.f76666f) {
            i3 = 1231;
        }
        long j3 = this.f76667g;
        return ((int) ((j3 >>> 32) ^ j3)) ^ ((i4 ^ i3) * 1000003);
    }

    public final String toString() {
        long j = this.f76661a;
        int i = this.f76662b;
        long j2 = this.f76663c;
        boolean z = this.f76664d;
        boolean z2 = this.f76665e;
        boolean z3 = this.f76666f;
        long j3 = this.f76667g;
        StringBuilder sb = new StringBuilder(223);
        sb.append("ContactMetadata{contactId=");
        sb.append(j);
        sb.append(", timesContacted=");
        sb.append(i);
        sb.append(", lastTimeContacted=");
        sb.append(j2);
        sb.append(", isStarred=");
        sb.append(z);
        sb.append(", hasCustomRingtone=");
        sb.append(z2);
        sb.append(", sendToVoicemail=");
        sb.append(z3);
        sb.append(", lastUpdatedTimestamp=");
        sb.append(j3);
        sb.append("}");
        return sb.toString();
    }
}
