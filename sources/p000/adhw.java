package p000;

/* renamed from: adhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adhw extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final adhw f61742b;

    /* renamed from: c */
    private static volatile bxxk f61743c;

    /* renamed from: a */
    public adia f61744a;

    static {
        adhw adhw = new adhw();
        f61742b = adhw;
        GeneratedMessageLite.m124024a(adhw.class, adhw);
    }

    private adhw() {
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
            return GeneratedMessageLite.m124022a(f61742b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new adhw();
        } else {
            if (i2 == 4) {
                return new bxvd(f61742b);
            }
            if (i2 == 5) {
                return f61742b;
            }
            bxxk bxxk = f61743c;
            if (bxxk == null) {
                synchronized (adhw.class) {
                    bxxk = f61743c;
                    if (bxxk == null) {
                        bxxk = new bxve(f61742b);
                        f61743c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
