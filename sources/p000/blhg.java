package p000;

import java.util.Arrays;

/* renamed from: blhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blhg {

    /* renamed from: a */
    public static final blhg f126521a = new blhg();

    /* renamed from: b */
    public blhf f126522b = blhf.KIND_NOT_SET;

    /* renamed from: c */
    public String f126523c = "";

    /* renamed from: d */
    private Object f126524d = null;

    private blhg() {
    }

    /* renamed from: i */
    public static blhe m107164i() {
        return new blhe();
    }

    /* renamed from: a */
    public final blgr mo66530a() {
        return this.f126522b == blhf.CREATE ? (blgr) this.f126524d : blgr.f126463a;
    }

    /* renamed from: b */
    public final blhb mo66531b() {
        return this.f126522b == blhf.INSERT ? (blhb) this.f126524d : blhb.f126492a;
    }

    /* renamed from: c */
    public final blgu mo66532c() {
        return this.f126522b == blhf.DELETE ? (blgu) this.f126524d : blgu.f126474a;
    }

    /* renamed from: d */
    public final blhv mo66533d() {
        return this.f126522b == blhf.SET ? (blhv) this.f126524d : blhv.f126583a;
    }

    /* renamed from: e */
    public final blhx mo66534e() {
        return this.f126522b == blhf.UPDATE ? (blhx) this.f126524d : blhx.f126588a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blhg) {
            blhg blhg = (blhg) obj;
            return bkwv.m106779a(this.f126523c, blhg.f126523c) && bkwv.m106779a(this.f126524d, blhg.f126524d) && this.f126522b == blhg.f126522b;
        }
    }

    /* renamed from: f */
    public final blhd mo66536f() {
        return this.f126522b == blhf.MOVE ? (blhd) this.f126524d : blhd.f126499a;
    }

    /* renamed from: g */
    public final blgz mo66537g() {
        return this.f126522b == blhf.INDEX ? (blgz) this.f126524d : blgz.f126485a;
    }

    /* renamed from: h */
    public final blgo mo66538h() {
        return this.f126522b == blhf.COMPOUND ? (blgo) this.f126524d : blgo.f126450a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f126523c, this.f126524d, this.f126522b});
    }

    public blhg(blhe blhe) {
        this.f126523c = blhe.f126504b;
        this.f126524d = blhe.f126505c;
        this.f126522b = blhe.f126503a;
    }
}
