package p000;

/* renamed from: canf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class canf extends bxvk implements bxxd {

    /* renamed from: d */
    public static final canf f175355d;

    /* renamed from: f */
    private static volatile bxxk f175356f;

    /* renamed from: a */
    public int f175357a;

    /* renamed from: b */
    public String f175358b = "";

    /* renamed from: c */
    public String f175359c = "";

    /* renamed from: e */
    private byte f175360e = 2;

    static {
        canf canf = new canf();
        f175355d = canf;
        bxvk.m124024a(canf.class, canf);
    }

    private canf() {
        bxxn bxxn = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f175360e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f175360e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f175355d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new canf();
        } else {
            if (i2 == 4) {
                return new bxvd(f175355d);
            }
            if (i2 == 5) {
                return f175355d;
            }
            bxxk bxxk = f175356f;
            if (bxxk == null) {
                synchronized (canf.class) {
                    bxxk = f175356f;
                    if (bxxk == null) {
                        bxxk = new bxve(f175355d);
                        f175356f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
