package p000;

/* renamed from: btjm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btjm extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btjm f149149c;

    /* renamed from: d */
    private static volatile bxxk f149150d;

    /* renamed from: a */
    public int f149151a;

    /* renamed from: b */
    public long f149152b;

    static {
        btjm btjm = new btjm();
        f149149c = btjm;
        GeneratedMessageLite.m124024a(btjm.class, btjm);
    }

    private btjm() {
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
            return GeneratedMessageLite.m124022a(f149149c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btjm();
        } else {
            if (i2 == 4) {
                return new bxvd(f149149c);
            }
            if (i2 == 5) {
                return f149149c;
            }
            bxxk bxxk = f149150d;
            if (bxxk == null) {
                synchronized (btjm.class) {
                    bxxk = f149150d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149149c);
                        f149150d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
