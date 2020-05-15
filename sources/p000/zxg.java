package p000;

/* renamed from: zxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zxg extends bxvk implements bxxd {

    /* renamed from: c */
    public static final zxg f56090c;

    /* renamed from: e */
    private static volatile bxxk f56091e;

    /* renamed from: a */
    public float f56092a;

    /* renamed from: b */
    public float f56093b;

    /* renamed from: d */
    private int f56094d;

    static {
        zxg zxg = new zxg();
        f56090c = zxg;
        bxvk.m124024a(zxg.class, zxg);
    }

    private zxg() {
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
            return bxvk.m124022a(f56090c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new zxg();
        } else {
            if (i2 == 4) {
                return new bxvd(f56090c);
            }
            if (i2 == 5) {
                return f56090c;
            }
            bxxk bxxk = f56091e;
            if (bxxk == null) {
                synchronized (zxg.class) {
                    bxxk = f56091e;
                    if (bxxk == null) {
                        bxxk = new bxve(f56090c);
                        f56091e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
