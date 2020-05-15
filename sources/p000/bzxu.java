package p000;

/* renamed from: bzxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzxu extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzxu f171798d;

    /* renamed from: e */
    private static volatile bxxk f171799e;

    /* renamed from: a */
    public int f171800a;

    /* renamed from: b */
    public int f171801b;

    /* renamed from: c */
    public String f171802c = "";

    static {
        bzxu bzxu = new bzxu();
        f171798d = bzxu;
        GeneratedMessageLite.m124024a(bzxu.class, bzxu);
    }

    private bzxu() {
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
            return GeneratedMessageLite.m124022a(f171798d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", bzxs.f171797a, "c"});
        } else if (i2 == 3) {
            return new bzxu();
        } else {
            if (i2 == 4) {
                return new bxvd(f171798d);
            }
            if (i2 == 5) {
                return f171798d;
            }
            bxxk bxxk = f171799e;
            if (bxxk == null) {
                synchronized (bzxu.class) {
                    bxxk = f171799e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171798d);
                        f171799e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
