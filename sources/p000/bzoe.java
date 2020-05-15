package p000;

/* renamed from: bzoe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzoe extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzoe f170799d;

    /* renamed from: e */
    private static volatile bxxk f170800e;

    /* renamed from: a */
    public bzoa f170801a;

    /* renamed from: b */
    public String f170802b = "";

    /* renamed from: c */
    public String f170803c = "";

    static {
        bzoe bzoe = new bzoe();
        f170799d = bzoe;
        GeneratedMessageLite.m124024a(bzoe.class, bzoe);
    }

    private bzoe() {
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
            return GeneratedMessageLite.m124022a(f170799d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzoe();
        } else {
            if (i2 == 4) {
                return new bxvd(f170799d);
            }
            if (i2 == 5) {
                return f170799d;
            }
            bxxk bxxk = f170800e;
            if (bxxk == null) {
                synchronized (bzoe.class) {
                    bxxk = f170800e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170799d);
                        f170800e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
