package p000;

/* renamed from: bohu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bohu extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bohu f133155d;

    /* renamed from: e */
    private static volatile bxxk f133156e;

    /* renamed from: a */
    public int f133157a;

    /* renamed from: b */
    public int f133158b;

    /* renamed from: c */
    public String f133159c = "";

    static {
        bohu bohu = new bohu();
        f133155d = bohu;
        bxvk.m124024a(bohu.class, bohu);
    }

    private bohu() {
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
            return bxvk.m124022a(f133155d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bohu();
        } else {
            if (i2 == 4) {
                return new bxvd(f133155d);
            }
            if (i2 == 5) {
                return f133155d;
            }
            bxxk bxxk = f133156e;
            if (bxxk == null) {
                synchronized (bohu.class) {
                    bxxk = f133156e;
                    if (bxxk == null) {
                        bxxk = new bxve(f133155d);
                        f133156e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
