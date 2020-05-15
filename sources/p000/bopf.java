package p000;

/* renamed from: bopf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bopf extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bopf f134114b;

    /* renamed from: c */
    private static volatile bxxk f134115c;

    /* renamed from: a */
    public long f134116a;

    static {
        bopf bopf = new bopf();
        f134114b = bopf;
        GeneratedMessageLite.m124024a(bopf.class, bopf);
    }

    private bopf() {
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
            return GeneratedMessageLite.m124022a(f134114b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bopf();
        } else {
            if (i2 == 4) {
                return new bxvd(f134114b);
            }
            if (i2 == 5) {
                return f134114b;
            }
            bxxk bxxk = f134115c;
            if (bxxk == null) {
                synchronized (bopf.class) {
                    bxxk = f134115c;
                    if (bxxk == null) {
                        bxxk = new bxve(f134114b);
                        f134115c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
