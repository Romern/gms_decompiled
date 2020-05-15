package p000;

/* renamed from: cbfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbfx extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cbfx f176983d;

    /* renamed from: e */
    private static volatile bxxk f176984e;

    /* renamed from: a */
    public String f176985a = "";

    /* renamed from: b */
    public bzrt f176986b;

    /* renamed from: c */
    public bzrt f176987c;

    static {
        cbfx cbfx = new cbfx();
        f176983d = cbfx;
        bxvk.m124024a(cbfx.class, cbfx);
    }

    private cbfx() {
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
            return bxvk.m124022a(f176983d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbfx();
        } else {
            if (i2 == 4) {
                return new bxvd(f176983d);
            }
            if (i2 == 5) {
                return f176983d;
            }
            bxxk bxxk = f176984e;
            if (bxxk == null) {
                synchronized (cbfx.class) {
                    bxxk = f176984e;
                    if (bxxk == null) {
                        bxxk = new bxve(f176983d);
                        f176984e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
