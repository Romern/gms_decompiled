package p000;

/* renamed from: arhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arhy extends bxvk implements bxxd {

    /* renamed from: d */
    public static final arhy f87760d;

    /* renamed from: e */
    private static volatile bxxk f87761e;

    /* renamed from: a */
    public int f87762a;

    /* renamed from: b */
    public int f87763b;

    /* renamed from: c */
    public String f87764c = "";

    static {
        arhy arhy = new arhy();
        f87760d = arhy;
        bxvk.m124024a(arhy.class, arhy);
    }

    private arhy() {
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
            return bxvk.m124022a(f87760d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new arhy();
        } else {
            if (i2 == 4) {
                return new bxvd(f87760d);
            }
            if (i2 == 5) {
                return f87760d;
            }
            bxxk bxxk = f87761e;
            if (bxxk == null) {
                synchronized (arhy.class) {
                    bxxk = f87761e;
                    if (bxxk == null) {
                        bxxk = new bxve(f87760d);
                        f87761e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
