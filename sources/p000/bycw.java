package p000;

/* renamed from: bycw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bycw extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bycw f165723i;

    /* renamed from: j */
    private static volatile bxxk f165724j;

    /* renamed from: a */
    public int f165725a;

    /* renamed from: b */
    public bxtx f165726b = bxtx.f164797b;

    /* renamed from: c */
    public bxtx f165727c = bxtx.f164797b;

    /* renamed from: d */
    public bxtx f165728d = bxtx.f164797b;

    /* renamed from: e */
    public bxtx f165729e = bxtx.f164797b;

    /* renamed from: f */
    public bxtx f165730f = bxtx.f164797b;

    /* renamed from: g */
    public bxtx f165731g = bxtx.f164797b;

    /* renamed from: h */
    public bxtx f165732h = bxtx.f164797b;

    static {
        bycw bycw = new bycw();
        f165723i = bycw;
        bxvk.m124024a(bycw.class, bycw);
    }

    private bycw() {
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
            return bxvk.m124022a(f165723i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005ည\u0004\u0006ည\u0005\u0007ည\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bycw();
        } else {
            if (i2 == 4) {
                return new bxvd(f165723i);
            }
            if (i2 == 5) {
                return f165723i;
            }
            bxxk bxxk = f165724j;
            if (bxxk == null) {
                synchronized (bycw.class) {
                    bxxk = f165724j;
                    if (bxxk == null) {
                        bxxk = new bxve(f165723i);
                        f165724j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
