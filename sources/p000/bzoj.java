package p000;

/* renamed from: bzoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzoj extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzoj f170819d;

    /* renamed from: e */
    private static volatile bxxk f170820e;

    /* renamed from: a */
    public bzoa f170821a;

    /* renamed from: b */
    public bxwc f170822b = bxxn.f165040b;

    /* renamed from: c */
    public String f170823c = "";

    static {
        bzoj bzoj = new bzoj();
        f170819d = bzoj;
        GeneratedMessageLite.m124024a(bzoj.class, bzoj);
    }

    private bzoj() {
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
            return GeneratedMessageLite.m124022a(f170819d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001\t\u0003Ț\u0004Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzoj();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (short[]) null);
            }
            if (i2 == 5) {
                return f170819d;
            }
            bxxk bxxk = f170820e;
            if (bxxk == null) {
                synchronized (bzoj.class) {
                    bxxk = f170820e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170819d);
                        f170820e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
