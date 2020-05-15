package p000;

/* renamed from: btlf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btlf extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btlf f149359c;

    /* renamed from: d */
    private static volatile bxxk f149360d;

    /* renamed from: a */
    public long f149361a;

    /* renamed from: b */
    public int f149362b;

    static {
        btlf btlf = new btlf();
        f149359c = btlf;
        GeneratedMessageLite.m124024a(btlf.class, btlf);
    }

    private btlf() {
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
            return GeneratedMessageLite.m124022a(f149359c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btlf();
        } else {
            if (i2 == 4) {
                return new bxvd(f149359c);
            }
            if (i2 == 5) {
                return f149359c;
            }
            bxxk bxxk = f149360d;
            if (bxxk == null) {
                synchronized (btlf.class) {
                    bxxk = f149360d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149359c);
                        f149360d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
