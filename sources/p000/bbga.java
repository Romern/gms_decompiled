package p000;

/* renamed from: bbga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bbga extends bbgh {

    /* renamed from: a */
    private final bbfz f102575a;

    /* renamed from: b */
    private final long f102576b;

    public bbga(bbfz bbfz, long j) {
        if (bbfz != null) {
            this.f102575a = bbfz;
            this.f102576b = j;
            return;
        }
        throw new NullPointerException("Null value");
    }

    /* renamed from: a */
    public final bbfz mo56125a() {
        return this.f102575a;
    }

    /* renamed from: b */
    public final long mo56126b() {
        return this.f102576b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbgh) {
            bbgh bbgh = (bbgh) obj;
            return this.f102575a.equals(bbgh.mo56125a()) && this.f102576b == bbgh.mo56126b();
        }
    }

    public final int hashCode() {
        int hashCode = this.f102575a.hashCode();
        long j = this.f102576b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f102575a);
        long j = this.f102576b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58);
        sb.append("ValueWithTimestamp{value=");
        sb.append(valueOf);
        sb.append(", timestamp=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
