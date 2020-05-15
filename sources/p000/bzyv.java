package p000;

/* renamed from: bzyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzyv extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzyv f171926d;

    /* renamed from: e */
    private static volatile bxxk f171927e;

    /* renamed from: a */
    public int f171928a;

    /* renamed from: b */
    public int f171929b;

    /* renamed from: c */
    public int f171930c;

    static {
        bzyv bzyv = new bzyv();
        f171926d = bzyv;
        GeneratedMessageLite.m124024a(bzyv.class, bzyv);
    }

    private bzyv() {
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
            return GeneratedMessageLite.m124022a(f171926d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", bzyu.f171925a, "c", bzys.f171924a});
        } else if (i2 == 3) {
            return new bzyv();
        } else {
            if (i2 == 4) {
                return new bxvd(f171926d);
            }
            if (i2 == 5) {
                return f171926d;
            }
            bxxk bxxk = f171927e;
            if (bxxk == null) {
                synchronized (bzyv.class) {
                    bxxk = f171927e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171926d);
                        f171927e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
