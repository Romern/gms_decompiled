package p000;

/* renamed from: boqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boqy extends bxvk implements bxxd {

    /* renamed from: e */
    public static final boqy f134353e;

    /* renamed from: f */
    private static volatile bxxk f134354f;

    /* renamed from: a */
    public int f134355a;

    /* renamed from: b */
    public long f134356b;

    /* renamed from: c */
    public long f134357c;

    /* renamed from: d */
    public long f134358d;

    static {
        boqy boqy = new boqy();
        f134353e = boqy;
        bxvk.m124024a(boqy.class, boqy);
    }

    private boqy() {
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
            return bxvk.m124022a(f134353e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new boqy();
        } else {
            if (i2 == 4) {
                return new bxvd(f134353e);
            }
            if (i2 == 5) {
                return f134353e;
            }
            bxxk bxxk = f134354f;
            if (bxxk == null) {
                synchronized (boqy.class) {
                    bxxk = f134354f;
                    if (bxxk == null) {
                        bxxk = new bxve(f134353e);
                        f134354f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
