package p000;

/* renamed from: kcg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kcg extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final kcg f23749b;

    /* renamed from: c */
    private static volatile bxxk f23750c;

    /* renamed from: a */
    public int f23751a;

    static {
        kcg kcg = new kcg();
        f23749b = kcg;
        GeneratedMessageLite.m124024a(kcg.class, kcg);
    }

    private kcg() {
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
            return GeneratedMessageLite.m124022a(f23749b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
        } else if (i2 == 3) {
            return new kcg();
        } else {
            if (i2 == 4) {
                return new bxvd(f23749b);
            }
            if (i2 == 5) {
                return f23749b;
            }
            bxxk bxxk = f23750c;
            if (bxxk == null) {
                synchronized (kcg.class) {
                    bxxk = f23750c;
                    if (bxxk == null) {
                        bxxk = new bxve(f23749b);
                        f23750c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
