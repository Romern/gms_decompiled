package p000;

/* renamed from: byff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byff extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byff f166011d;

    /* renamed from: e */
    private static volatile bxxk f166012e;

    /* renamed from: a */
    public int f166013a;

    /* renamed from: b */
    public String f166014b = "";

    /* renamed from: c */
    public int f166015c;

    static {
        byff byff = new byff();
        f166011d = byff;
        GeneratedMessageLite.m124024a(byff.class, byff);
    }

    private byff() {
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
            return GeneratedMessageLite.m124022a(f166011d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", byfe.f166010a});
        } else if (i2 == 3) {
            return new byff();
        } else {
            if (i2 == 4) {
                return new bxvd(f166011d);
            }
            if (i2 == 5) {
                return f166011d;
            }
            bxxk bxxk = f166012e;
            if (bxxk == null) {
                synchronized (byff.class) {
                    bxxk = f166012e;
                    if (bxxk == null) {
                        bxxk = new bxve(f166011d);
                        f166012e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
