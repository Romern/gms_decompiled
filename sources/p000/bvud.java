package p000;

/* renamed from: bvud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvud extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvud f157654d;

    /* renamed from: e */
    private static volatile bxxk f157655e;

    /* renamed from: a */
    public int f157656a;

    /* renamed from: b */
    public int f157657b;

    /* renamed from: c */
    public String f157658c = "";

    static {
        bvud bvud = new bvud();
        f157654d = bvud;
        bxvk.m124024a(bvud.class, bvud);
    }

    private bvud() {
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
            return bxvk.m124022a(f157654d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", bvuc.m121469b(), "c"});
        } else if (i2 == 3) {
            return new bvud();
        } else {
            if (i2 == 4) {
                return new bxvd(f157654d);
            }
            if (i2 == 5) {
                return f157654d;
            }
            bxxk bxxk = f157655e;
            if (bxxk == null) {
                synchronized (bvud.class) {
                    bxxk = f157655e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157654d);
                        f157655e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
