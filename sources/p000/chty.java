package p000;

import java.util.Arrays;

/* renamed from: chty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chty {

    /* renamed from: a */
    public final chuv f189169a;

    /* renamed from: b */
    public final Object f189170b;

    private chty(chuv chuv) {
        this.f189170b = null;
        bmxy.m108582a(chuv, "status");
        this.f189169a = chuv;
        bmxy.m108596a(!chuv.mo85689a(), "cannot use OK status: %s", chuv);
    }

    /* renamed from: a */
    public static chty m149568a(chuv chuv) {
        return new chty(chuv);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            chty chty = (chty) obj;
            return bmxi.m108538a(this.f189169a, chty.f189169a) && bmxi.m108538a(this.f189170b, chty.f189170b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f189169a, this.f189170b});
    }

    public final String toString() {
        if (this.f189170b != null) {
            bmxt a = bmxu.m108563a(this);
            a.mo66885a("config", this.f189170b);
            return a.toString();
        }
        bmxt a2 = bmxu.m108563a(this);
        a2.mo66885a("error", this.f189169a);
        return a2.toString();
    }

    /* renamed from: a */
    public static chty m149569a(Object obj) {
        return new chty(obj);
    }

    private chty(Object obj) {
        bmxy.m108582a(obj, "config");
        this.f189170b = obj;
        this.f189169a = null;
    }
}
