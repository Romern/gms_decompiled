package p000;

/* renamed from: boab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boab extends bxvk implements bxxd {

    /* renamed from: b */
    public static final boab f132441b;

    /* renamed from: d */
    private static volatile bxxk f132442d;

    /* renamed from: a */
    public String f132443a = "";

    /* renamed from: c */
    private int f132444c;

    static {
        boab boab = new boab();
        f132441b = boab;
        bxvk.m124024a(boab.class, boab);
    }

    private boab() {
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
            return bxvk.m124022a(f132441b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new boab();
        } else {
            if (i2 == 4) {
                return new bxvd(f132441b);
            }
            if (i2 == 5) {
                return f132441b;
            }
            bxxk bxxk = f132442d;
            if (bxxk == null) {
                synchronized (boab.class) {
                    bxxk = f132442d;
                    if (bxxk == null) {
                        bxxk = new bxve(f132441b);
                        f132442d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
