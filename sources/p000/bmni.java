package p000;

/* renamed from: bmni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmni extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bmni f130103c;

    /* renamed from: e */
    private static volatile bxxk f130104e;

    /* renamed from: a */
    public String f130105a = "";

    /* renamed from: b */
    public String f130106b = "";

    /* renamed from: d */
    private int f130107d;

    static {
        bmni bmni = new bmni();
        f130103c = bmni;
        bxvk.m124024a(bmni.class, bmni);
    }

    private bmni() {
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
            return bxvk.m124022a(f130103c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bmni();
        } else {
            if (i2 == 4) {
                return new bxvd(f130103c);
            }
            if (i2 == 5) {
                return f130103c;
            }
            bxxk bxxk = f130104e;
            if (bxxk == null) {
                synchronized (bmni.class) {
                    bxxk = f130104e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130103c);
                        f130104e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
