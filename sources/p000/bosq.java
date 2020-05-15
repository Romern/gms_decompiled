package p000;

/* renamed from: bosq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bosq extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bosq f134637e;

    /* renamed from: f */
    private static volatile bxxk f134638f;

    /* renamed from: a */
    public int f134639a;

    /* renamed from: b */
    public int f134640b;

    /* renamed from: c */
    public boolean f134641c;

    /* renamed from: d */
    public boolean f134642d;

    static {
        bosq bosq = new bosq();
        f134637e = bosq;
        GeneratedMessageLite.m124024a(bosq.class, bosq);
    }

    private bosq() {
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
            return GeneratedMessageLite.m124022a(f134637e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bosq();
        } else {
            if (i2 == 4) {
                return new bxvd(f134637e);
            }
            if (i2 == 5) {
                return f134637e;
            }
            bxxk bxxk = f134638f;
            if (bxxk == null) {
                synchronized (bosq.class) {
                    bxxk = f134638f;
                    if (bxxk == null) {
                        bxxk = new bxve(f134637e);
                        f134638f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
