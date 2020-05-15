package p000;

/* renamed from: bkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkw extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bkw f5040e;

    /* renamed from: f */
    private static volatile bxxk f5041f;

    /* renamed from: a */
    public int f5042a;

    /* renamed from: b */
    public long f5043b;

    /* renamed from: c */
    public long f5044c;

    /* renamed from: d */
    public long f5045d;

    static {
        bkw bkw = new bkw();
        f5040e = bkw;
        GeneratedMessageLite.m124024a(bkw.class, bkw);
    }

    private bkw() {
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
            return GeneratedMessageLite.m124022a(f5040e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0004ဂ\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bkw();
        } else {
            if (i2 == 4) {
                return new bxvd(f5040e);
            }
            if (i2 == 5) {
                return f5040e;
            }
            bxxk bxxk = f5041f;
            if (bxxk == null) {
                synchronized (bkw.class) {
                    bxxk = f5041f;
                    if (bxxk == null) {
                        bxxk = new bxve(f5040e);
                        f5041f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
