package p000;

/* renamed from: boev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boev extends bxvk implements bxxd {

    /* renamed from: d */
    public static final boev f132855d;

    /* renamed from: e */
    private static volatile bxxk f132856e;

    /* renamed from: a */
    public int f132857a;

    /* renamed from: b */
    public int f132858b = 1000;

    /* renamed from: c */
    public String f132859c = "";

    static {
        boev boev = new boev();
        f132855d = boev;
        bxvk.m124024a(boev.class, boev);
    }

    private boev() {
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
            return bxvk.m124022a(f132855d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", boeu.f132854a, "c"});
        } else if (i2 == 3) {
            return new boev();
        } else {
            if (i2 == 4) {
                return new bxvd(f132855d);
            }
            if (i2 == 5) {
                return f132855d;
            }
            bxxk bxxk = f132856e;
            if (bxxk == null) {
                synchronized (boev.class) {
                    bxxk = f132856e;
                    if (bxxk == null) {
                        bxxk = new bxve(f132855d);
                        f132856e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
