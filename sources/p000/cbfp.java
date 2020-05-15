package p000;

/* renamed from: cbfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbfp extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cbfp f176947e;

    /* renamed from: f */
    private static volatile bxxk f176948f;

    /* renamed from: a */
    public cbey f176949a;

    /* renamed from: b */
    public int f176950b;

    /* renamed from: c */
    public int f176951c;

    /* renamed from: d */
    public String f176952d = "";

    static {
        cbfp cbfp = new cbfp();
        f176947e = cbfp;
        bxvk.m124024a(cbfp.class, cbfp);
    }

    private cbfp() {
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
            return bxvk.m124022a(f176947e, "\u0000\u0004\u0000\u0000\u0002\u0005\u0004\u0000\u0000\u0000\u0002\u0004\u0003\u0004\u0004Ȉ\u0005\t", new Object[]{"b", "c", "d", "a"});
        } else if (i2 == 3) {
            return new cbfp();
        } else {
            if (i2 == 4) {
                return new bxvd(f176947e);
            }
            if (i2 == 5) {
                return f176947e;
            }
            bxxk bxxk = f176948f;
            if (bxxk == null) {
                synchronized (cbfp.class) {
                    bxxk = f176948f;
                    if (bxxk == null) {
                        bxxk = new bxve(f176947e);
                        f176948f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
