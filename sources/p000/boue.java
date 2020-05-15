package p000;

/* renamed from: boue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boue extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final boue f134915f;

    /* renamed from: g */
    private static volatile bxxk f134916g;

    /* renamed from: a */
    public int f134917a;

    /* renamed from: b */
    public String f134918b = "";

    /* renamed from: c */
    public int f134919c;

    /* renamed from: d */
    public boolean f134920d;

    /* renamed from: e */
    public int f134921e;

    static {
        boue boue = new boue();
        f134915f = boue;
        GeneratedMessageLite.m124024a(boue.class, boue);
    }

    private boue() {
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
            return GeneratedMessageLite.m124022a(f134915f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", bouc.f134913a, "d", "e", boud.f134914a});
        } else if (i2 == 3) {
            return new boue();
        } else {
            if (i2 == 4) {
                return new bxvd(f134915f);
            }
            if (i2 == 5) {
                return f134915f;
            }
            bxxk bxxk = f134916g;
            if (bxxk == null) {
                synchronized (boue.class) {
                    bxxk = f134916g;
                    if (bxxk == null) {
                        bxxk = new bxve(f134915f);
                        f134916g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
