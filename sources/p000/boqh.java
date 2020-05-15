package p000;

/* renamed from: boqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boqh extends bxvk implements bxxd {

    /* renamed from: e */
    public static final boqh f134264e;

    /* renamed from: f */
    private static volatile bxxk f134265f;

    /* renamed from: a */
    public int f134266a;

    /* renamed from: b */
    public int f134267b;

    /* renamed from: c */
    public String f134268c = "";

    /* renamed from: d */
    public String f134269d = "";

    static {
        boqh boqh = new boqh();
        f134264e = boqh;
        bxvk.m124024a(boqh.class, boqh);
    }

    private boqh() {
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
            return bxvk.m124022a(f134264e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", boqf.f134263a, "c", "d"});
        } else if (i2 == 3) {
            return new boqh();
        } else {
            if (i2 == 4) {
                return new bxvd(f134264e);
            }
            if (i2 == 5) {
                return f134264e;
            }
            bxxk bxxk = f134265f;
            if (bxxk == null) {
                synchronized (boqh.class) {
                    bxxk = f134265f;
                    if (bxxk == null) {
                        bxxk = new bxve(f134264e);
                        f134265f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
