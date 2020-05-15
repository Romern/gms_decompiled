package p000;

/* renamed from: cejg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cejg extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cejg f182761c;

    /* renamed from: d */
    private static volatile bxxk f182762d;

    /* renamed from: a */
    public int f182763a = 0;

    /* renamed from: b */
    public Object f182764b;

    static {
        cejg cejg = new cejg();
        f182761c = cejg;
        bxvk.m124024a(cejg.class, cejg);
    }

    private cejg() {
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
            return bxvk.m124022a(f182761c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", ceje.class, cejf.class, cejd.class});
        } else if (i2 == 3) {
            return new cejg();
        } else {
            if (i2 == 4) {
                return new bxvd(f182761c);
            }
            if (i2 == 5) {
                return f182761c;
            }
            bxxk bxxk = f182762d;
            if (bxxk == null) {
                synchronized (cejg.class) {
                    bxxk = f182762d;
                    if (bxxk == null) {
                        bxxk = new bxve(f182761c);
                        f182762d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
