package p000;

/* renamed from: bqsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqsy extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bqsy f141597i;

    /* renamed from: j */
    private static volatile bxxk f141598j;

    /* renamed from: a */
    public int f141599a;

    /* renamed from: b */
    public bqsz f141600b;

    /* renamed from: c */
    public bxtx f141601c = bxtx.f164797b;

    /* renamed from: d */
    public bxtx f141602d = bxtx.f164797b;

    /* renamed from: e */
    public bxtx f141603e = bxtx.f164797b;

    /* renamed from: f */
    public bxtx f141604f = bxtx.f164797b;

    /* renamed from: g */
    public bxtx f141605g = bxtx.f164797b;

    /* renamed from: h */
    public bxtx f141606h = bxtx.f164797b;

    static {
        bqsy bqsy = new bqsy();
        f141597i = bqsy;
        bxvk.m124024a(bqsy.class, bqsy);
    }

    private bqsy() {
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
            return bxvk.m124022a(f141597i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bqsy();
        } else {
            if (i2 == 4) {
                return new bxvd(f141597i);
            }
            if (i2 == 5) {
                return f141597i;
            }
            bxxk bxxk = f141598j;
            if (bxxk == null) {
                synchronized (bqsy.class) {
                    bxxk = f141598j;
                    if (bxxk == null) {
                        bxxk = new bxve(f141597i);
                        f141598j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
