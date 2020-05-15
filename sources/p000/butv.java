package p000;

/* renamed from: butv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class butv extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final butv f154881f;

    /* renamed from: g */
    private static volatile bxxk f154882g;

    /* renamed from: a */
    public int f154883a;

    /* renamed from: b */
    public String f154884b = "";

    /* renamed from: c */
    public String f154885c = "";

    /* renamed from: d */
    public int f154886d;

    /* renamed from: e */
    public String f154887e = "0.0.0.0";

    static {
        butv butv = new butv();
        f154881f = butv;
        GeneratedMessageLite.m124024a(butv.class, butv);
    }

    private butv() {
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
            return GeneratedMessageLite.m124022a(f154881f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new butv();
        } else {
            if (i2 == 4) {
                return new bxvd(f154881f);
            }
            if (i2 == 5) {
                return f154881f;
            }
            bxxk bxxk = f154882g;
            if (bxxk == null) {
                synchronized (butv.class) {
                    bxxk = f154882g;
                    if (bxxk == null) {
                        bxxk = new bxve(f154881f);
                        f154882g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
