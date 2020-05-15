package p000;

/* renamed from: bvyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvyk extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bvyk f158178g;

    /* renamed from: h */
    private static volatile bxxk f158179h;

    /* renamed from: a */
    public int f158180a;

    /* renamed from: b */
    public int f158181b;

    /* renamed from: c */
    public int f158182c;

    /* renamed from: d */
    public bvwb f158183d;

    /* renamed from: e */
    public boolean f158184e;

    /* renamed from: f */
    public bvxo f158185f;

    static {
        bvyk bvyk = new bvyk();
        f158178g = bvyk;
        bxvk.m124024a(bvyk.class, bvyk);
    }

    private bvyk() {
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
            return bxvk.m124022a(f158178g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bvyk();
        } else {
            if (i2 == 4) {
                return new bxvd(f158178g);
            }
            if (i2 == 5) {
                return f158178g;
            }
            bxxk bxxk = f158179h;
            if (bxxk == null) {
                synchronized (bvyk.class) {
                    bxxk = f158179h;
                    if (bxxk == null) {
                        bxxk = new bxve(f158178g);
                        f158179h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
