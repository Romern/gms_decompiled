package p000;

/* renamed from: cbfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbfm extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbfm f176935d;

    /* renamed from: e */
    private static volatile bxxk f176936e;

    /* renamed from: a */
    public String f176937a = "";

    /* renamed from: b */
    public int f176938b;

    /* renamed from: c */
    public bxwc f176939c = bxxn.f165040b;

    static {
        cbfm cbfm = new cbfm();
        f176935d = cbfm;
        GeneratedMessageLite.m124024a(cbfm.class, cbfm);
    }

    private cbfm() {
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
            return GeneratedMessageLite.m124022a(f176935d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"a", "b", "c", cbfu.class});
        } else if (i2 == 3) {
            return new cbfm();
        } else {
            if (i2 == 4) {
                return new bxvd(f176935d);
            }
            if (i2 == 5) {
                return f176935d;
            }
            bxxk bxxk = f176936e;
            if (bxxk == null) {
                synchronized (cbfm.class) {
                    bxxk = f176936e;
                    if (bxxk == null) {
                        bxxk = new bxve(f176935d);
                        f176936e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
