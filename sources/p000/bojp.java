package p000;

/* renamed from: bojp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bojp extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bojp f133316d;

    /* renamed from: e */
    private static volatile bxxk f133317e;

    /* renamed from: a */
    public int f133318a;

    /* renamed from: b */
    public String f133319b = "";

    /* renamed from: c */
    public String f133320c = "";

    static {
        bojp bojp = new bojp();
        f133316d = bojp;
        bxvk.m124024a(bojp.class, bojp);
    }

    private bojp() {
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
            return bxvk.m124022a(f133316d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bojp();
        } else {
            if (i2 == 4) {
                return new bxvd(f133316d);
            }
            if (i2 == 5) {
                return f133316d;
            }
            bxxk bxxk = f133317e;
            if (bxxk == null) {
                synchronized (bojp.class) {
                    bxxk = f133317e;
                    if (bxxk == null) {
                        bxxk = new bxve(f133316d);
                        f133317e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
