package p000;

/* renamed from: axwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axwx {

    /* renamed from: a */
    final String f96633a;

    /* renamed from: b */
    final boolean f96634b;

    public axwx(String str, boolean z) {
        this.f96633a = str;
        this.f96634b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof axwx) {
            axwx axwx = (axwx) obj;
            return this.f96633a.equals(axwx.f96633a) && this.f96634b == axwx.f96634b;
        }
    }

    public final int hashCode() {
        return ((this.f96633a.hashCode() + 629) * 37) + (this.f96634b ? 1 : 0);
    }
}
