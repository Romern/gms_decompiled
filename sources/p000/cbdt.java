package p000;

/* renamed from: cbdt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbdt extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbdt f176788d;

    /* renamed from: e */
    private static volatile bxxk f176789e;

    /* renamed from: a */
    public int f176790a = 0;

    /* renamed from: b */
    public Object f176791b;

    /* renamed from: c */
    public String f176792c = "";

    static {
        cbdt cbdt = new cbdt();
        f176788d = cbdt;
        GeneratedMessageLite.m124024a(cbdt.class, cbdt);
    }

    private cbdt() {
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
            return GeneratedMessageLite.m124022a(f176788d, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001=\u0000\u0002Ȼ\u0000\u0003Ȉ", new Object[]{"b", "a", "c"});
        } else if (i2 == 3) {
            return new cbdt();
        } else {
            if (i2 == 4) {
                return new bxvd(f176788d);
            }
            if (i2 == 5) {
                return f176788d;
            }
            bxxk bxxk = f176789e;
            if (bxxk == null) {
                synchronized (cbdt.class) {
                    bxxk = f176789e;
                    if (bxxk == null) {
                        bxxk = new bxve(f176788d);
                        f176789e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
