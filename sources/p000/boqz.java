package p000;

/* renamed from: boqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boqz extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final boqz f134359e;

    /* renamed from: f */
    private static volatile bxxk f134360f;

    /* renamed from: a */
    public int f134361a;

    /* renamed from: b */
    public boolean f134362b;

    /* renamed from: c */
    public boolean f134363c;

    /* renamed from: d */
    public boolean f134364d;

    static {
        boqz boqz = new boqz();
        f134359e = boqz;
        GeneratedMessageLite.m124024a(boqz.class, boqz);
    }

    private boqz() {
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
            return GeneratedMessageLite.m124022a(f134359e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new boqz();
        } else {
            if (i2 == 4) {
                return new bxvd(f134359e);
            }
            if (i2 == 5) {
                return f134359e;
            }
            bxxk bxxk = f134360f;
            if (bxxk == null) {
                synchronized (boqz.class) {
                    bxxk = f134360f;
                    if (bxxk == null) {
                        bxxk = new bxve(f134359e);
                        f134360f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
