package p000;

/* renamed from: ytx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ytx extends ytz {

    /* renamed from: b */
    private final int f54625b;

    /* renamed from: c */
    private final int f54626c;

    /* renamed from: d */
    private final int f54627d;

    public ytx(int i, int i2, int i3) {
        this.f54625b = i;
        this.f54626c = i2;
        this.f54627d = i3;
    }

    /* renamed from: a */
    public final int mo30774a() {
        return this.f54625b;
    }

    /* renamed from: b */
    public final int mo30775b() {
        return this.f54626c;
    }

    /* renamed from: c */
    public final int mo30776c() {
        return this.f54627d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ytz) {
            ytz ytz = (ytz) obj;
            return this.f54625b == ytz.mo30774a() && this.f54626c == ytz.mo30775b() && this.f54627d == ytz.mo30776c();
        }
    }

    public final int hashCode() {
        return ((((this.f54625b ^ 1000003) * 1000003) ^ this.f54626c) * 1000003) ^ this.f54627d;
    }
}
