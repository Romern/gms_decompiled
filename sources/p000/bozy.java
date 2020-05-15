package p000;

/* renamed from: bozy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bozy extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bozy f135464c;

    /* renamed from: d */
    private static volatile bxxk f135465d;

    /* renamed from: a */
    public int f135466a;

    /* renamed from: b */
    public int f135467b;

    static {
        bozy bozy = new bozy();
        f135464c = bozy;
        GeneratedMessageLite.m124024a(bozy.class, bozy);
    }

    private bozy() {
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
            return GeneratedMessageLite.m124022a(f135464c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bozx.f135463a});
        } else if (i2 == 3) {
            return new bozy();
        } else {
            if (i2 == 4) {
                return new bxvd(f135464c);
            }
            if (i2 == 5) {
                return f135464c;
            }
            bxxk bxxk = f135465d;
            if (bxxk == null) {
                synchronized (bozy.class) {
                    bxxk = f135465d;
                    if (bxxk == null) {
                        bxxk = new bxve(f135464c);
                        f135465d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
