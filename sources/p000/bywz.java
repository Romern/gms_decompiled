package p000;

/* renamed from: bywz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bywz extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bywz f168689d;

    /* renamed from: e */
    private static volatile bxxk f168690e;

    /* renamed from: a */
    public int f168691a;

    /* renamed from: b */
    public byxb f168692b;

    /* renamed from: c */
    public long f168693c;

    static {
        bywz bywz = new bywz();
        f168689d = bywz;
        GeneratedMessageLite.m124024a(bywz.class, bywz);
    }

    private bywz() {
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
            return GeneratedMessageLite.m124022a(f168689d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဉ\u0000\u0004ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bywz();
        } else {
            if (i2 == 4) {
                return new bxvd(f168689d);
            }
            if (i2 == 5) {
                return f168689d;
            }
            bxxk bxxk = f168690e;
            if (bxxk == null) {
                synchronized (bywz.class) {
                    bxxk = f168690e;
                    if (bxxk == null) {
                        bxxk = new bxve(f168689d);
                        f168690e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
