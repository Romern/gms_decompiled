package p000;

/* renamed from: bttt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bttt extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bttt f150392d;

    /* renamed from: e */
    private static volatile bxxk f150393e;

    /* renamed from: a */
    public int f150394a;

    /* renamed from: b */
    public String f150395b = "";

    /* renamed from: c */
    public bzvu f150396c;

    static {
        bttt bttt = new bttt();
        f150392d = bttt;
        GeneratedMessageLite.m124024a(bttt.class, bttt);
    }

    private bttt() {
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
            return GeneratedMessageLite.m124022a(f150392d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bttt();
        } else {
            if (i2 == 4) {
                return new bxvd(f150392d);
            }
            if (i2 == 5) {
                return f150392d;
            }
            bxxk bxxk = f150393e;
            if (bxxk == null) {
                synchronized (bttt.class) {
                    bxxk = f150393e;
                    if (bxxk == null) {
                        bxxk = new bxve(f150392d);
                        f150393e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
