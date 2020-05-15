package p000;

/* renamed from: btnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btnr extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btnr f149678b;

    /* renamed from: c */
    private static volatile bxxk f149679c;

    /* renamed from: a */
    public boolean f149680a;

    static {
        btnr btnr = new btnr();
        f149678b = btnr;
        GeneratedMessageLite.m124024a(btnr.class, btnr);
    }

    private btnr() {
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
            return GeneratedMessageLite.m124022a(f149678b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btnr();
        } else {
            if (i2 == 4) {
                return new bxvd(f149678b);
            }
            if (i2 == 5) {
                return f149678b;
            }
            bxxk bxxk = f149679c;
            if (bxxk == null) {
                synchronized (btnr.class) {
                    bxxk = f149679c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149678b);
                        f149679c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
