package p000;

/* renamed from: bspq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bspq extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bspq f146567d;

    /* renamed from: f */
    private static volatile bxxk f146568f;

    /* renamed from: a */
    public int f146569a;

    /* renamed from: b */
    public bspp f146570b;

    /* renamed from: c */
    public bspm f146571c;

    /* renamed from: e */
    private byte f146572e = 2;

    static {
        bspq bspq = new bspq();
        f146567d = bspq;
        bxvk.m124024a(bspq.class, bspq);
    }

    private bspq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f146572e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f146572e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f146567d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0004ဉ\u0003", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bspq();
        } else {
            if (i2 == 4) {
                return new bxvd(f146567d);
            }
            if (i2 == 5) {
                return f146567d;
            }
            bxxk bxxk = f146568f;
            if (bxxk == null) {
                synchronized (bspq.class) {
                    bxxk = f146568f;
                    if (bxxk == null) {
                        bxxk = new bxve(f146567d);
                        f146568f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
