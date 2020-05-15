package p000;

/* renamed from: cbqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbqj extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cbqj f178031e;

    /* renamed from: f */
    private static volatile bxxk f178032f;

    /* renamed from: a */
    public cbph f178033a;

    /* renamed from: b */
    public cbpe f178034b;

    /* renamed from: c */
    public String f178035c = "";

    /* renamed from: d */
    public cbqk f178036d;

    static {
        cbqj cbqj = new cbqj();
        f178031e = cbqj;
        GeneratedMessageLite.m124024a(cbqj.class, cbqj);
    }

    private cbqj() {
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
            return GeneratedMessageLite.m124022a(f178031e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ\u0004\t", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cbqj();
        } else {
            if (i2 == 4) {
                return new bxvd(f178031e);
            }
            if (i2 == 5) {
                return f178031e;
            }
            bxxk bxxk = f178032f;
            if (bxxk == null) {
                synchronized (cbqj.class) {
                    bxxk = f178032f;
                    if (bxxk == null) {
                        bxxk = new bxve(f178031e);
                        f178032f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
