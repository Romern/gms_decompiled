package p000;

/* renamed from: bziw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bziw extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bziw f170247c;

    /* renamed from: e */
    private static volatile bxxk f170248e;

    /* renamed from: a */
    public bzio f170249a;

    /* renamed from: b */
    public bxwc f170250b = bxxn.f165040b;

    /* renamed from: d */
    private int f170251d;

    static {
        bziw bziw = new bziw();
        f170247c = bziw;
        bxvk.m124024a(bziw.class, bziw);
    }

    private bziw() {
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
            return bxvk.m124022a(f170247c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", bzit.class});
        } else if (i2 == 3) {
            return new bziw();
        } else {
            if (i2 == 4) {
                return new bxvd(f170247c);
            }
            if (i2 == 5) {
                return f170247c;
            }
            bxxk bxxk = f170248e;
            if (bxxk == null) {
                synchronized (bziw.class) {
                    bxxk = f170248e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170247c);
                        f170248e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
