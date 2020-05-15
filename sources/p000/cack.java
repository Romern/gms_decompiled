package p000;

/* renamed from: cack */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cack extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cack f172565d;

    /* renamed from: e */
    private static volatile bxxk f172566e;

    /* renamed from: a */
    public int f172567a;

    /* renamed from: b */
    public String f172568b = "";

    /* renamed from: c */
    public String f172569c = "";

    static {
        cack cack = new cack();
        f172565d = cack;
        bxvk.m124024a(cack.class, cack);
    }

    private cack() {
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
            return bxvk.m124022a(f172565d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cack();
        } else {
            if (i2 == 4) {
                return new bxvd(f172565d);
            }
            if (i2 == 5) {
                return f172565d;
            }
            bxxk bxxk = f172566e;
            if (bxxk == null) {
                synchronized (cack.class) {
                    bxxk = f172566e;
                    if (bxxk == null) {
                        bxxk = new bxve(f172565d);
                        f172566e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
