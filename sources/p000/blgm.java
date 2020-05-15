package p000;

import java.util.Arrays;

/* renamed from: blgm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blgm {

    /* renamed from: a */
    public static final blgm f126444a = new blgm();

    /* renamed from: b */
    public blgl f126445b = blgl.KIND_NOT_SET;

    /* renamed from: c */
    private Object f126446c = null;

    private blgm() {
    }

    /* renamed from: f */
    public static blgk m107133f() {
        return new blgk();
    }

    /* renamed from: a */
    public final double mo66490a() {
        if (this.f126445b == blgl.NUMBER_VALUE) {
            return ((Double) this.f126446c).doubleValue();
        }
        return 0.0d;
    }

    /* renamed from: b */
    public final String mo66491b() {
        return this.f126445b == blgl.STRING_VALUE ? (String) this.f126446c : "";
    }

    /* renamed from: c */
    public final boolean mo66492c() {
        if (this.f126445b == blgl.BOOL_VALUE) {
            return ((Boolean) this.f126446c).booleanValue();
        }
        return false;
    }

    /* renamed from: d */
    public final blgh mo66493d() {
        return this.f126445b == blgl.STRUCT_VALUE ? (blgh) this.f126446c : blgh.f126427a;
    }

    /* renamed from: e */
    public final blge mo66494e() {
        return this.f126445b == blgl.LIST_VALUE ? (blge) this.f126446c : blge.f126421a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blgm) {
            blgm blgm = (blgm) obj;
            return bkwv.m106779a(this.f126446c, blgm.f126446c) && this.f126445b == blgm.f126445b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f126446c, this.f126445b});
    }

    public blgm(blgk blgk) {
        this.f126446c = blgk.f126435b;
        this.f126445b = blgk.f126434a;
    }
}
