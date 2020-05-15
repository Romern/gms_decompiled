package p000;

/* renamed from: bxnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxnx extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bxnx f164105i;

    /* renamed from: j */
    private static volatile bxxk f164106j;

    /* renamed from: a */
    public int f164107a;

    /* renamed from: b */
    public String f164108b = "";

    /* renamed from: c */
    public String f164109c = "";

    /* renamed from: d */
    public String f164110d = "";

    /* renamed from: e */
    public int f164111e;

    /* renamed from: f */
    public int f164112f;

    /* renamed from: g */
    public long f164113g;

    /* renamed from: h */
    public boolean f164114h;

    static {
        bxnx bxnx = new bxnx();
        f164105i = bxnx;
        GeneratedMessageLite.m124024a(bxnx.class, bxnx);
    }

    private bxnx() {
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
            return GeneratedMessageLite.m124022a(f164105i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005င\u0004\u0006ဂ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bxnx();
        } else {
            if (i2 == 4) {
                return new bxvd(f164105i);
            }
            if (i2 == 5) {
                return f164105i;
            }
            bxxk bxxk = f164106j;
            if (bxxk == null) {
                synchronized (bxnx.class) {
                    bxxk = f164106j;
                    if (bxxk == null) {
                        bxxk = new bxve(f164105i);
                        f164106j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
