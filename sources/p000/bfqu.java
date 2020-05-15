package p000;

/* renamed from: bfqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfqu {

    /* renamed from: a */
    final int f114943a;

    /* renamed from: b */
    final int f114944b;

    /* renamed from: c */
    final int f114945c;

    public bfqu(int i, int i2, int i3) {
        this.f114944b = i;
        this.f114945c = i2;
        this.f114943a = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bfqu) {
            bfqu bfqu = (bfqu) obj;
            return this.f114944b == bfqu.f114944b && this.f114945c == bfqu.f114945c && this.f114943a == bfqu.f114943a;
        }
    }

    public final int hashCode() {
        return (((this.f114943a * 31) + this.f114944b) * 31) + this.f114945c;
    }
}
