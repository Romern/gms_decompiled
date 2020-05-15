package p000;

/* renamed from: bvsn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvsn extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bvsn f157502e;

    /* renamed from: f */
    private static volatile bxxk f157503f;

    /* renamed from: a */
    public int f157504a;

    /* renamed from: b */
    public long f157505b;

    /* renamed from: c */
    public long f157506c;

    /* renamed from: d */
    public long f157507d;

    static {
        bvsn bvsn = new bvsn();
        f157502e = bvsn;
        GeneratedMessageLite.m124024a(bvsn.class, bvsn);
    }

    private bvsn() {
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
            return GeneratedMessageLite.m124022a(f157502e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bvsn();
        } else {
            if (i2 == 4) {
                return new bxvd(f157502e);
            }
            if (i2 == 5) {
                return f157502e;
            }
            bxxk bxxk = f157503f;
            if (bxxk == null) {
                synchronized (bvsn.class) {
                    bxxk = f157503f;
                    if (bxxk == null) {
                        bxxk = new bxve(f157502e);
                        f157503f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
