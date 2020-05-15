package p000;

/* renamed from: bgvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgvm extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bgvm f117686g;

    /* renamed from: i */
    private static volatile bxxk f117687i;

    /* renamed from: a */
    public int f117688a;

    /* renamed from: b */
    public bgvr f117689b;

    /* renamed from: c */
    public bgoq f117690c;

    /* renamed from: d */
    public String f117691d = "";

    /* renamed from: e */
    public String f117692e = "";

    /* renamed from: f */
    public String f117693f = "";

    /* renamed from: h */
    private byte f117694h = 2;

    static {
        bgvm bgvm = new bgvm();
        f117686g = bgvm;
        bxvk.m124024a(bgvm.class, bgvm);
    }

    private bgvm() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f117694h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f117694h = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f117686g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bgvm();
        } else {
            if (i2 == 4) {
                return new bxvd(f117686g);
            }
            if (i2 == 5) {
                return f117686g;
            }
            bxxk bxxk = f117687i;
            if (bxxk == null) {
                synchronized (bgvm.class) {
                    bxxk = f117687i;
                    if (bxxk == null) {
                        bxxk = new bxve(f117686g);
                        f117687i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
