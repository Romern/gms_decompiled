package p000;

/* renamed from: bpcr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpcr extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bpcr f135823i;

    /* renamed from: j */
    private static volatile bxxk f135824j;

    /* renamed from: a */
    public int f135825a;

    /* renamed from: b */
    public int f135826b;

    /* renamed from: c */
    public int f135827c;

    /* renamed from: d */
    public int f135828d;

    /* renamed from: e */
    public int f135829e;

    /* renamed from: f */
    public int f135830f;

    /* renamed from: g */
    public int f135831g;

    /* renamed from: h */
    public int f135832h;

    static {
        bpcr bpcr = new bpcr();
        f135823i = bpcr;
        bxvk.m124024a(bpcr.class, bpcr);
    }

    private bpcr() {
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
            return bxvk.m124022a(f135823i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bpcr();
        } else {
            if (i2 == 4) {
                return new bxvd(f135823i);
            }
            if (i2 == 5) {
                return f135823i;
            }
            bxxk bxxk = f135824j;
            if (bxxk == null) {
                synchronized (bpcr.class) {
                    bxxk = f135824j;
                    if (bxxk == null) {
                        bxxk = new bxve(f135823i);
                        f135824j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
