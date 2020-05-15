package p000;

import java.util.Arrays;

/* renamed from: blhp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blhp {

    /* renamed from: a */
    public static final blhp f126557a = new blhp();

    /* renamed from: b */
    public blho f126558b = blho.KIND_NOT_SET;

    /* renamed from: c */
    private Object f126559c = null;

    private blhp() {
    }

    /* renamed from: c */
    public static blhn m107177c() {
        return new blhn();
    }

    /* renamed from: a */
    public final blgm mo66553a() {
        return this.f126558b == blho.JSON ? (blgm) this.f126559c : blgm.f126444a;
    }

    /* renamed from: b */
    public final String mo66554b() {
        return this.f126558b == blho.REFERENCED_ID ? (String) this.f126559c : "";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blhp) {
            blhp blhp = (blhp) obj;
            return bkwv.m106779a(this.f126559c, blhp.f126559c) && this.f126558b == blhp.f126558b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f126559c, this.f126558b});
    }

    public blhp(blhn blhn) {
        this.f126559c = blhn.f126547b;
        this.f126558b = blhn.f126546a;
    }
}
