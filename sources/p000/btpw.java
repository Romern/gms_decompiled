package p000;

/* renamed from: btpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btpw extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btpw f149899b;

    /* renamed from: c */
    private static volatile bxxk f149900c;

    /* renamed from: a */
    public btnf f149901a;

    static {
        btpw btpw = new btpw();
        f149899b = btpw;
        GeneratedMessageLite.m124024a(btpw.class, btpw);
    }

    private btpw() {
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
            return GeneratedMessageLite.m124022a(f149899b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btpw();
        } else {
            if (i2 == 4) {
                return new bxvd(f149899b);
            }
            if (i2 == 5) {
                return f149899b;
            }
            bxxk bxxk = f149900c;
            if (bxxk == null) {
                synchronized (btpw.class) {
                    bxxk = f149900c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149899b);
                        f149900c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
