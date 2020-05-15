package p000;

/* renamed from: bocy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bocy extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bocy f132650e;

    /* renamed from: f */
    private static volatile bxxk f132651f;

    /* renamed from: a */
    public int f132652a;

    /* renamed from: b */
    public int f132653b;

    /* renamed from: c */
    public long f132654c;

    /* renamed from: d */
    public long f132655d;

    static {
        bocy bocy = new bocy();
        f132650e = bocy;
        GeneratedMessageLite.m124024a(bocy.class, bocy);
    }

    private bocy() {
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
            return GeneratedMessageLite.m124022a(f132650e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", bocx.f132649a, "c", "d"});
        } else if (i2 == 3) {
            return new bocy();
        } else {
            if (i2 == 4) {
                return new bxvd(f132650e);
            }
            if (i2 == 5) {
                return f132650e;
            }
            bxxk bxxk = f132651f;
            if (bxxk == null) {
                synchronized (bocy.class) {
                    bxxk = f132651f;
                    if (bxxk == null) {
                        bxxk = new bxve(f132650e);
                        f132651f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
