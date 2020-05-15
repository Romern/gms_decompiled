package p000;

/* renamed from: cadg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cadg extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cadg f172664c;

    /* renamed from: e */
    private static volatile bxxk f172665e;

    /* renamed from: a */
    public int f172666a;

    /* renamed from: b */
    public double f172667b = 1.0d;

    /* renamed from: d */
    private int f172668d;

    static {
        cadg cadg = new cadg();
        f172664c = cadg;
        bxvk.m124024a(cadg.class, cadg);
    }

    private cadg() {
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
            return bxvk.m124022a(f172664c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002က\u0001", new Object[]{"d", "a", cade.f172663a, "b"});
        } else if (i2 == 3) {
            return new cadg();
        } else {
            if (i2 == 4) {
                return new bxvd(f172664c);
            }
            if (i2 == 5) {
                return f172664c;
            }
            bxxk bxxk = f172665e;
            if (bxxk == null) {
                synchronized (cadg.class) {
                    bxxk = f172665e;
                    if (bxxk == null) {
                        bxxk = new bxve(f172664c);
                        f172665e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
