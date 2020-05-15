package p000;

/* renamed from: bwwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwwz extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwwz f161308d;

    /* renamed from: e */
    private static volatile bxxk f161309e;

    /* renamed from: a */
    public int f161310a;

    /* renamed from: b */
    public int f161311b;

    /* renamed from: c */
    public int f161312c;

    static {
        bwwz bwwz = new bwwz();
        f161308d = bwwz;
        bxvk.m124024a(bwwz.class, bwwz);
    }

    private bwwz() {
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
            return bxvk.m124022a(f161308d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", bwwy.m122386b(), "c", bwwy.m122386b()});
        } else if (i2 == 3) {
            return new bwwz();
        } else {
            if (i2 == 4) {
                return new bxvd(f161308d);
            }
            if (i2 == 5) {
                return f161308d;
            }
            bxxk bxxk = f161309e;
            if (bxxk == null) {
                synchronized (bwwz.class) {
                    bxxk = f161309e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161308d);
                        f161309e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
