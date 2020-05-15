package p000;

@Deprecated
/* renamed from: boqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boqv extends bxvk implements bxxd {

    /* renamed from: d */
    public static final boqv f134333d;

    /* renamed from: e */
    private static volatile bxxk f134334e;

    /* renamed from: a */
    public int f134335a;

    /* renamed from: b */
    public int f134336b;

    /* renamed from: c */
    public bxtx f134337c = bxtx.f164797b;

    static {
        boqv boqv = new boqv();
        f134333d = boqv;
        bxvk.m124024a(boqv.class, boqv);
    }

    private boqv() {
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
            return bxvk.m124022a(f134333d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new boqv();
        } else {
            if (i2 == 4) {
                return new bxvd(f134333d);
            }
            if (i2 == 5) {
                return f134333d;
            }
            bxxk bxxk = f134334e;
            if (bxxk == null) {
                synchronized (boqv.class) {
                    bxxk = f134334e;
                    if (bxxk == null) {
                        bxxk = new bxve(f134333d);
                        f134334e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
