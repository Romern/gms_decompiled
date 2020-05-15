package p000;

/* renamed from: bzqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzqo extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bzqo f171040e;

    /* renamed from: g */
    private static volatile bxxk f171041g;

    /* renamed from: a */
    public int f171042a;

    /* renamed from: b */
    public boolean f171043b;

    /* renamed from: c */
    public bzqf f171044c;

    /* renamed from: d */
    public String f171045d = "";

    /* renamed from: f */
    private byte f171046f = 2;

    static {
        bzqo bzqo = new bzqo();
        f171040e = bzqo;
        bxvk.m124024a(bzqo.class, bzqo);
    }

    private bzqo() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f171046f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f171046f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f171040e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001ဇ\u0000\u0003ᐉ\u0002\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bzqo();
        } else {
            if (i2 == 4) {
                return new bxvd(f171040e);
            }
            if (i2 == 5) {
                return f171040e;
            }
            bxxk bxxk = f171041g;
            if (bxxk == null) {
                synchronized (bzqo.class) {
                    bxxk = f171041g;
                    if (bxxk == null) {
                        bxxk = new bxve(f171040e);
                        f171041g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
