package p000;

/* renamed from: bwrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwrt extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwrt f160796b;

    /* renamed from: c */
    public static final bxvj f160797c;

    /* renamed from: e */
    private static volatile bxxk f160798e;

    /* renamed from: a */
    public int f160799a;

    /* renamed from: d */
    private int f160800d;

    static {
        bwrt bwrt = new bwrt();
        f160796b = bwrt;
        bxvk.m124024a(bwrt.class, bwrt);
        bwoi bwoi = bwoi.f160451f;
        bwrt bwrt2 = f160796b;
        f160797c = bxvk.m124006a(bwoi, bwrt2, bwrt2, 264984587, bxzf.MESSAGE);
    }

    private bwrt() {
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
            return bxvk.m124022a(f160796b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "a", bwrr.f160795a});
        } else if (i2 == 3) {
            return new bwrt();
        } else {
            if (i2 == 4) {
                return new bxvd(f160796b);
            }
            if (i2 == 5) {
                return f160796b;
            }
            bxxk bxxk = f160798e;
            if (bxxk == null) {
                synchronized (bwrt.class) {
                    bxxk = f160798e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160796b);
                        f160798e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
