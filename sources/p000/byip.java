package p000;

/* renamed from: byip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byip extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final byip f166587c;

    /* renamed from: d */
    public static final bxvj f166588d;

    /* renamed from: f */
    private static volatile bxxk f166589f;

    /* renamed from: a */
    public boolean f166590a;

    /* renamed from: b */
    public boolean f166591b;

    /* renamed from: e */
    private int f166592e;

    static {
        byip byip = new byip();
        f166587c = byip;
        GeneratedMessageLite.m124024a(byip.class, byip);
        bygn bygn = bygn.f166357a;
        byip byip2 = f166587c;
        f166588d = GeneratedMessageLite.m124006a(bygn, byip2, byip2, 158511070, bxzf.MESSAGE);
    }

    private byip() {
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
            return GeneratedMessageLite.m124022a(f166587c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"e", "a", "b"});
        } else if (i2 == 3) {
            return new byip();
        } else {
            if (i2 == 4) {
                return new bxvd(f166587c);
            }
            if (i2 == 5) {
                return f166587c;
            }
            bxxk bxxk = f166589f;
            if (bxxk == null) {
                synchronized (byip.class) {
                    bxxk = f166589f;
                    if (bxxk == null) {
                        bxxk = new bxve(f166587c);
                        f166589f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
