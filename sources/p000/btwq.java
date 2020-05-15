package p000;

/* renamed from: btwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btwq {

    /* renamed from: a */
    public final long f152748a;

    /* renamed from: b */
    public final int f152749b;

    /* renamed from: c */
    public final float f152750c;

    public btwq(long j, int i) {
        this(j, i, -1.0f);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof btwq) {
            btwq btwq = (btwq) obj;
            if (this.f152748a == btwq.f152748a && this.f152749b == btwq.f152749b && Float.compare(this.f152750c, btwq.f152750c) == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f152748a;
        return ((((((int) (j ^ (j >>> 32))) + 527) * 31) + this.f152749b) * 31) + Float.floatToIntBits(this.f152750c);
    }

    public final String toString() {
        String str = (String) btxf.f152795a.get(Integer.valueOf(this.f152749b));
        long j = this.f152748a;
        float f = this.f152750c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55);
        sb.append(str);
        sb.append(" time: ");
        sb.append(j);
        sb.append(" confidence: ");
        sb.append(f);
        return sb.toString();
    }

    public btwq(long j, int i, float f) {
        this.f152748a = j;
        this.f152749b = i;
        this.f152750c = f;
    }
}
