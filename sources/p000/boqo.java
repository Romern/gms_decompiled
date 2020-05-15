package p000;

/* renamed from: boqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boqo extends bxvk implements bxxd {

    /* renamed from: d */
    public static final boqo f134297d;

    /* renamed from: e */
    private static volatile bxxk f134298e;

    /* renamed from: a */
    public int f134299a;

    /* renamed from: b */
    public String f134300b = "";

    /* renamed from: c */
    public String f134301c = "";

    static {
        boqo boqo = new boqo();
        f134297d = boqo;
        bxvk.m124024a(boqo.class, boqo);
    }

    private boqo() {
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
            return bxvk.m124022a(f134297d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new boqo();
        } else {
            if (i2 == 4) {
                return new bxvd(f134297d);
            }
            if (i2 == 5) {
                return f134297d;
            }
            bxxk bxxk = f134298e;
            if (bxxk == null) {
                synchronized (boqo.class) {
                    bxxk = f134298e;
                    if (bxxk == null) {
                        bxxk = new bxve(f134297d);
                        f134298e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
