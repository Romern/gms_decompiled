package p000;

/* renamed from: bzms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzms extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzms f170645d;

    /* renamed from: f */
    private static volatile bxxk f170646f;

    /* renamed from: a */
    public bzlt f170647a;

    /* renamed from: b */
    public bxwc f170648b = bxxn.f165040b;

    /* renamed from: c */
    public bzmb f170649c;

    /* renamed from: e */
    private int f170650e;

    static {
        bzms bzms = new bzms();
        f170645d = bzms;
        GeneratedMessageLite.m124024a(bzms.class, bzms);
    }

    private bzms() {
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
            return GeneratedMessageLite.m124022a(f170645d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0001\u0002\u001b\u0003ဉ\u0002", new Object[]{"e", "a", "b", bzlx.class, "c"});
        } else if (i2 == 3) {
            return new bzms();
        } else {
            if (i2 == 4) {
                return new bxvd(f170645d);
            }
            if (i2 == 5) {
                return f170645d;
            }
            bxxk bxxk = f170646f;
            if (bxxk == null) {
                synchronized (bzms.class) {
                    bxxk = f170646f;
                    if (bxxk == null) {
                        bxxk = new bxve(f170645d);
                        f170646f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
