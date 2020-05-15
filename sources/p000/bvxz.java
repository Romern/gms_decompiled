package p000;

/* renamed from: bvxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvxz extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bvxz f158117g;

    /* renamed from: h */
    private static volatile bxxk f158118h;

    /* renamed from: a */
    public int f158119a;

    /* renamed from: b */
    public int f158120b;

    /* renamed from: c */
    public bxtx f158121c = bxtx.f164797b;

    /* renamed from: d */
    public long f158122d;

    /* renamed from: e */
    public int f158123e;

    /* renamed from: f */
    public int f158124f;

    static {
        bvxz bvxz = new bvxz();
        f158117g = bvxz;
        bxvk.m124024a(bvxz.class, bvxz);
    }

    private bvxz() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return bxvk.m124022a(f158117g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဏ\u0003\u0005ဏ\u0004", new Object[]{"a", "b", bvxy.f158116a, "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bvxz();
        } else {
            if (i2 == 4) {
                return new bxvd(f158117g);
            }
            if (i2 == 5) {
                return f158117g;
            }
            bxxk bxxk = f158118h;
            if (bxxk == null) {
                synchronized (bvxz.class) {
                    bxxk = f158118h;
                    if (bxxk == null) {
                        bxxk = new bxve(f158117g);
                        f158118h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
