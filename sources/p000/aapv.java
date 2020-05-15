package p000;

/* renamed from: aapv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aapv extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final aapv f28840e;

    /* renamed from: f */
    private static volatile bxxk f28841f;

    /* renamed from: a */
    public int f28842a;

    /* renamed from: b */
    public long f28843b;

    /* renamed from: c */
    public long f28844c;

    /* renamed from: d */
    public long f28845d;

    static {
        aapv aapv = new aapv();
        f28840e = aapv;
        GeneratedMessageLite.m124024a(aapv.class, aapv);
    }

    private aapv() {
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
            return GeneratedMessageLite.m124022a(f28840e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new aapv();
        } else {
            if (i2 == 4) {
                return new bxvd(f28840e);
            }
            if (i2 == 5) {
                return f28840e;
            }
            bxxk bxxk = f28841f;
            if (bxxk == null) {
                synchronized (aapv.class) {
                    bxxk = f28841f;
                    if (bxxk == null) {
                        bxxk = new bxve(f28840e);
                        f28841f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
