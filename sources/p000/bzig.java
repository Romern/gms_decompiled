package p000;

/* renamed from: bzig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzig extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzig f170175b;

    /* renamed from: d */
    private static volatile bxxk f170176d;

    /* renamed from: a */
    public String f170177a = "";

    /* renamed from: c */
    private int f170178c;

    static {
        bzig bzig = new bzig();
        f170175b = bzig;
        GeneratedMessageLite.m124024a(bzig.class, bzig);
    }

    private bzig() {
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
            return GeneratedMessageLite.m124022a(f170175b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bzig();
        } else {
            if (i2 == 4) {
                return new bxvd(f170175b);
            }
            if (i2 == 5) {
                return f170175b;
            }
            bxxk bxxk = f170176d;
            if (bxxk == null) {
                synchronized (bzig.class) {
                    bxxk = f170176d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170175b);
                        f170176d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
