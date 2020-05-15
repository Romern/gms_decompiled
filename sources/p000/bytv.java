package p000;

/* renamed from: bytv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bytv extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bytv f167717g;

    /* renamed from: h */
    private static volatile bxxk f167718h;

    /* renamed from: a */
    public int f167719a;

    /* renamed from: b */
    public String f167720b = "";

    /* renamed from: c */
    public int f167721c;

    /* renamed from: d */
    public String f167722d = "";

    /* renamed from: e */
    public int f167723e;

    /* renamed from: f */
    public int f167724f;

    static {
        bytv bytv = new bytv();
        f167717g = bytv;
        GeneratedMessageLite.m124024a(bytv.class, bytv);
    }

    private bytv() {
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
            return GeneratedMessageLite.m124022a(f167717g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0004င\u0003\u0005င\u0004\u0006ဌ\u0001", new Object[]{"a", "b", "d", "e", "f", "c", bytt.f167716a});
        } else if (i2 == 3) {
            return new bytv();
        } else {
            if (i2 == 4) {
                return new bxvd(f167717g);
            }
            if (i2 == 5) {
                return f167717g;
            }
            bxxk bxxk = f167718h;
            if (bxxk == null) {
                synchronized (bytv.class) {
                    bxxk = f167718h;
                    if (bxxk == null) {
                        bxxk = new bxve(f167717g);
                        f167718h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
