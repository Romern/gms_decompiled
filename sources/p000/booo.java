package p000;

/* renamed from: booo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class booo extends bxvk implements bxxd {

    /* renamed from: c */
    public static final booo f133961c;

    /* renamed from: d */
    private static volatile bxxk f133962d;

    /* renamed from: a */
    public String f133963a = "";

    /* renamed from: b */
    public long f133964b;

    static {
        booo booo = new booo();
        f133961c = booo;
        bxvk.m124024a(booo.class, booo);
    }

    private booo() {
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
            return bxvk.m124022a(f133961c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new booo();
        } else {
            if (i2 == 4) {
                return new bxvd(f133961c);
            }
            if (i2 == 5) {
                return f133961c;
            }
            bxxk bxxk = f133962d;
            if (bxxk == null) {
                synchronized (booo.class) {
                    bxxk = f133962d;
                    if (bxxk == null) {
                        bxxk = new bxve(f133961c);
                        f133962d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
