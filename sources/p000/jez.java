package p000;

/* renamed from: jez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jez extends bxvk implements bxxd {

    /* renamed from: a */
    public static final jez f22335a;

    /* renamed from: e */
    private static volatile bxxk f22336e;

    /* renamed from: b */
    private int f22337b;

    /* renamed from: c */
    private String f22338c = "";

    /* renamed from: d */
    private byte f22339d = 2;

    static {
        jez jez = new jez();
        f22335a = jez;
        bxvk.m124024a(jez.class, jez);
    }

    private jez() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f22339d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f22339d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f22335a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔈ\u0000", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new jez();
        } else {
            if (i2 == 4) {
                return new bxvd(f22335a);
            }
            if (i2 == 5) {
                return f22335a;
            }
            bxxk bxxk = f22336e;
            if (bxxk == null) {
                synchronized (jez.class) {
                    bxxk = f22336e;
                    if (bxxk == null) {
                        bxxk = new bxve(f22335a);
                        f22336e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
