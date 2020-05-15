package p000;

/* renamed from: bzgm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzgm extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzgm f169948c;

    /* renamed from: d */
    private static volatile bxxk f169949d;

    /* renamed from: a */
    public int f169950a;

    /* renamed from: b */
    public bzev f169951b;

    static {
        bzgm bzgm = new bzgm();
        f169948c = bzgm;
        bxvk.m124024a(bzgm.class, bzgm);
    }

    private bzgm() {
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
            return bxvk.m124022a(f169948c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzgm();
        } else {
            if (i2 == 4) {
                return new bxvd(f169948c);
            }
            if (i2 == 5) {
                return f169948c;
            }
            bxxk bxxk = f169949d;
            if (bxxk == null) {
                synchronized (bzgm.class) {
                    bxxk = f169949d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169948c);
                        f169949d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
