package p000;

/* renamed from: axvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axvs {

    /* renamed from: a */
    final String f96506a;

    /* renamed from: b */
    final long f96507b;

    /* renamed from: c */
    final boolean f96508c;

    public axvs(String str, long j, boolean z) {
        sdo.m34959a((Object) str);
        this.f96506a = str;
        this.f96507b = j;
        this.f96508c = z;
    }

    /* renamed from: a */
    static axvs m83323a(axvz axvz) {
        return new axvs(axvz.f96539a, axvz.f96541c, axvz.f96542d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof axvs) {
            axvs axvs = (axvs) obj;
            return this.f96507b == axvs.f96507b && this.f96508c == axvs.f96508c && this.f96506a.equals(axvs.f96506a);
        }
    }

    public final int hashCode() {
        int hashCode = this.f96506a.hashCode();
        long j = this.f96507b;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.f96508c ? 1 : 0);
    }
}
