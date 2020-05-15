package p000;

/* renamed from: baov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class baov extends baqa {

    /* renamed from: a */
    public final long f101442a;

    /* renamed from: b */
    public final long f101443b;

    /* renamed from: c */
    public final bnhe f101444c;

    public baov(long j, long j2, bnhe bnhe) {
        this.f101442a = j;
        this.f101443b = j2;
        this.f101444c = bnhe;
    }

    /* renamed from: a */
    public final long mo55838a() {
        return this.f101442a;
    }

    /* renamed from: b */
    public final long mo55839b() {
        return this.f101443b;
    }

    /* renamed from: c */
    public final bnhe mo55840c() {
        return this.f101444c;
    }

    /* renamed from: d */
    public final bapz mo55841d() {
        return new bapz(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof baqa) {
            baqa baqa = (baqa) obj;
            return this.f101442a == baqa.mo55838a() && this.f101443b == baqa.mo55839b() && this.f101444c.equals(baqa.mo55840c());
        }
    }

    public final int hashCode() {
        long j = this.f101442a;
        long j2 = this.f101443b;
        return this.f101444c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        long j = this.f101442a;
        long j2 = this.f101443b;
        String valueOf = String.valueOf(this.f101444c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 79);
        sb.append("DirtyCounters{read=");
        sb.append(j);
        sb.append(", write=");
        sb.append(j2);
        sb.append(", triggers=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
