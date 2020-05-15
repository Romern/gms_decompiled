package p000;

/* renamed from: biwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biwt extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final biwt f122122e;

    /* renamed from: g */
    private static volatile bxxk f122123g;

    /* renamed from: a */
    public String f122124a = "";

    /* renamed from: b */
    public int f122125b;

    /* renamed from: c */
    public String f122126c = "";

    /* renamed from: d */
    public bxvt f122127d = bxvm.f164965b;

    /* renamed from: f */
    private int f122128f;

    static {
        biwt biwt = new biwt();
        f122122e = biwt;
        GeneratedMessageLite.m124024a(biwt.class, biwt);
    }

    private biwt() {
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
            return GeneratedMessageLite.m124022a(f122122e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004\u0016", new Object[]{"f", "a", "b", biww.m102917b(), "c", "d"});
        } else if (i2 == 3) {
            return new biwt();
        } else {
            if (i2 == 4) {
                return new bxvd(f122122e);
            }
            if (i2 == 5) {
                return f122122e;
            }
            bxxk bxxk = f122123g;
            if (bxxk == null) {
                synchronized (biwt.class) {
                    bxxk = f122123g;
                    if (bxxk == null) {
                        bxxk = new bxve(f122122e);
                        f122123g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
