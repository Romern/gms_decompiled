package p000;

/* renamed from: bosv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bosv extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bosv f134727i;

    /* renamed from: j */
    private static volatile bxxk f134728j;

    /* renamed from: a */
    public int f134729a;

    /* renamed from: b */
    public int f134730b;

    /* renamed from: c */
    public int f134731c;

    /* renamed from: d */
    public int f134732d;

    /* renamed from: e */
    public int f134733e;

    /* renamed from: f */
    public int f134734f;

    /* renamed from: g */
    public int f134735g;

    /* renamed from: h */
    public int f134736h;

    static {
        bosv bosv = new bosv();
        f134727i = bosv;
        GeneratedMessageLite.m124024a(bosv.class, bosv);
    }

    private bosv() {
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
            return GeneratedMessageLite.m124022a(f134727i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bosv();
        } else {
            if (i2 == 4) {
                return new bxvd(f134727i);
            }
            if (i2 == 5) {
                return f134727i;
            }
            bxxk bxxk = f134728j;
            if (bxxk == null) {
                synchronized (bosv.class) {
                    bxxk = f134728j;
                    if (bxxk == null) {
                        bxxk = new bxve(f134727i);
                        f134728j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
