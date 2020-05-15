package p000;

/* renamed from: bouk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bouk extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bouk f134931h;

    /* renamed from: i */
    private static volatile bxxk f134932i;

    /* renamed from: a */
    public int f134933a;

    /* renamed from: b */
    public int f134934b;

    /* renamed from: c */
    public boue f134935c;

    /* renamed from: d */
    public int f134936d;

    /* renamed from: e */
    public int f134937e;

    /* renamed from: f */
    public int f134938f;

    /* renamed from: g */
    public int f134939g;

    static {
        bouk bouk = new bouk();
        f134931h = bouk;
        bxvk.m124024a(bouk.class, bouk);
    }

    private bouk() {
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
            return bxvk.m124022a(f134931h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005", new Object[]{"a", "b", bouf.f134922a, "c", "d", boug.f134923a, "e", boui.m111554b(), "f", bouj.f134930a, "g", bowj.f135142a});
        } else if (i2 == 3) {
            return new bouk();
        } else {
            if (i2 == 4) {
                return new bxvd(f134931h);
            }
            if (i2 == 5) {
                return f134931h;
            }
            bxxk bxxk = f134932i;
            if (bxxk == null) {
                synchronized (bouk.class) {
                    bxxk = f134932i;
                    if (bxxk == null) {
                        bxxk = new bxve(f134931h);
                        f134932i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
