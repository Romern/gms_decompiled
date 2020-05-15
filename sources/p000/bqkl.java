package p000;

/* renamed from: bqkl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqkl extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bqkl f141000e;

    /* renamed from: f */
    private static volatile bxxk f141001f;

    /* renamed from: a */
    public int f141002a;

    /* renamed from: b */
    public long f141003b;

    /* renamed from: c */
    public boolean f141004c;

    /* renamed from: d */
    public long f141005d;

    static {
        bqkl bqkl = new bqkl();
        f141000e = bqkl;
        GeneratedMessageLite.m124024a(bqkl.class, bqkl);
    }

    private bqkl() {
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
            return GeneratedMessageLite.m124022a(f141000e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bqkl();
        } else {
            if (i2 == 4) {
                return new bxvd(f141000e);
            }
            if (i2 == 5) {
                return f141000e;
            }
            bxxk bxxk = f141001f;
            if (bxxk == null) {
                synchronized (bqkl.class) {
                    bxxk = f141001f;
                    if (bxxk == null) {
                        bxxk = new bxve(f141000e);
                        f141001f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
