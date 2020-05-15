package p000;

/* renamed from: bomu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bomu extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bomu f133718e;

    /* renamed from: f */
    private static volatile bxxk f133719f;

    /* renamed from: a */
    public int f133720a;

    /* renamed from: b */
    public bomt f133721b;

    /* renamed from: c */
    public boms f133722c;

    /* renamed from: d */
    public String f133723d = "";

    static {
        bomu bomu = new bomu();
        f133718e = bomu;
        bxvk.m124024a(bomu.class, bomu);
    }

    private bomu() {
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
            return bxvk.m124022a(f133718e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bomu();
        } else {
            if (i2 == 4) {
                return new bxvd(f133718e);
            }
            if (i2 == 5) {
                return f133718e;
            }
            bxxk bxxk = f133719f;
            if (bxxk == null) {
                synchronized (bomu.class) {
                    bxxk = f133719f;
                    if (bxxk == null) {
                        bxxk = new bxve(f133718e);
                        f133719f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
