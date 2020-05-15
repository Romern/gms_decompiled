package p000;

/* renamed from: borc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class borc extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final borc f134378e;

    /* renamed from: f */
    private static volatile bxxk f134379f;

    /* renamed from: a */
    public int f134380a;

    /* renamed from: b */
    public int f134381b;

    /* renamed from: c */
    public int f134382c;

    /* renamed from: d */
    public int f134383d;

    static {
        borc borc = new borc();
        f134378e = borc;
        GeneratedMessageLite.m124024a(borc.class, borc);
    }

    private borc() {
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
            return GeneratedMessageLite.m124022a(f134378e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", caer.f172850a});
        } else if (i2 == 3) {
            return new borc();
        } else {
            if (i2 == 4) {
                return new bxvd(f134378e);
            }
            if (i2 == 5) {
                return f134378e;
            }
            bxxk bxxk = f134379f;
            if (bxxk == null) {
                synchronized (borc.class) {
                    bxxk = f134379f;
                    if (bxxk == null) {
                        bxxk = new bxve(f134378e);
                        f134379f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
