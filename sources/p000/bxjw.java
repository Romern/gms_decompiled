package p000;

/* renamed from: bxjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxjw extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxjw f163692e;

    /* renamed from: f */
    private static volatile bxxk f163693f;

    /* renamed from: a */
    public int f163694a;

    /* renamed from: b */
    public bxjx f163695b;

    /* renamed from: c */
    public int f163696c;

    /* renamed from: d */
    public long f163697d;

    static {
        bxjw bxjw = new bxjw();
        f163692e = bxjw;
        GeneratedMessageLite.m124024a(bxjw.class, bxjw);
    }

    private bxjw() {
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
            return GeneratedMessageLite.m124022a(f163692e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", bxjy.f163703a, "d"});
        } else if (i2 == 3) {
            return new bxjw();
        } else {
            if (i2 == 4) {
                return new bxvd(f163692e);
            }
            if (i2 == 5) {
                return f163692e;
            }
            bxxk bxxk = f163693f;
            if (bxxk == null) {
                synchronized (bxjw.class) {
                    bxxk = f163693f;
                    if (bxxk == null) {
                        bxxk = new bxve(f163692e);
                        f163693f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
