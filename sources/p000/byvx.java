package p000;

/* renamed from: byvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byvx extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final byvx f168529e;

    /* renamed from: f */
    private static volatile bxxk f168530f;

    /* renamed from: a */
    public int f168531a;

    /* renamed from: b */
    public int f168532b;

    /* renamed from: c */
    public long f168533c;

    /* renamed from: d */
    public long f168534d;

    static {
        byvx byvx = new byvx();
        f168529e = byvx;
        GeneratedMessageLite.m124024a(byvx.class, byvx);
    }

    private byvx() {
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
            return GeneratedMessageLite.m124022a(f168529e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new byvx();
        } else {
            if (i2 == 4) {
                return new bxvd(f168529e);
            }
            if (i2 == 5) {
                return f168529e;
            }
            bxxk bxxk = f168530f;
            if (bxxk == null) {
                synchronized (byvx.class) {
                    bxxk = f168530f;
                    if (bxxk == null) {
                        bxxk = new bxve(f168529e);
                        f168530f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
