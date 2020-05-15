package p000;

/* renamed from: byuj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byuj extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final byuj f168295f;

    /* renamed from: g */
    private static volatile bxxk f168296g;

    /* renamed from: a */
    public int f168297a;

    /* renamed from: b */
    public int f168298b;

    /* renamed from: c */
    public int f168299c;

    /* renamed from: d */
    public int f168300d;

    /* renamed from: e */
    public int f168301e = 110;

    static {
        byuj byuj = new byuj();
        f168295f = byuj;
        GeneratedMessageLite.m124024a(byuj.class, byuj);
    }

    private byuj() {
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
            return GeneratedMessageLite.m124022a(f168295f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", byuh.f168293a, "c", byug.m125353b(), "d", byui.f168294a, "e", byuk.f168302a});
        } else if (i2 == 3) {
            return new byuj();
        } else {
            if (i2 == 4) {
                return new bxvd(f168295f);
            }
            if (i2 == 5) {
                return f168295f;
            }
            bxxk bxxk = f168296g;
            if (bxxk == null) {
                synchronized (byuj.class) {
                    bxxk = f168296g;
                    if (bxxk == null) {
                        bxxk = new bxve(f168295f);
                        f168296g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
