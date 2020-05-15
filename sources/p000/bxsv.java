package p000;

/* renamed from: bxsv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxsv extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxsv f164751e;

    /* renamed from: f */
    private static volatile bxxk f164752f;

    /* renamed from: a */
    public int f164753a;

    /* renamed from: b */
    public bxrf f164754b;

    /* renamed from: c */
    public bxwc f164755c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f164756d = bxxn.f165040b;

    static {
        bxsv bxsv = new bxsv();
        f164751e = bxsv;
        GeneratedMessageLite.m124024a(bxsv.class, bxsv);
    }

    private bxsv() {
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
            return GeneratedMessageLite.m124022a(f164751e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", "b", "c", bxsd.class, "d", bxse.class});
        } else if (i2 == 3) {
            return new bxsv();
        } else {
            if (i2 == 4) {
                return new bxvd(f164751e);
            }
            if (i2 == 5) {
                return f164751e;
            }
            bxxk bxxk = f164752f;
            if (bxxk == null) {
                synchronized (bxsv.class) {
                    bxxk = f164752f;
                    if (bxxk == null) {
                        bxxk = new bxve(f164751e);
                        f164752f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
