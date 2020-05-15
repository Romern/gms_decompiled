package p000;

/* renamed from: bmso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmso extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bmso f130719g;

    /* renamed from: i */
    private static volatile bxxk f130720i;

    /* renamed from: a */
    public int f130721a;

    /* renamed from: b */
    public bmav f130722b;

    /* renamed from: c */
    public bmaq f130723c;

    /* renamed from: d */
    public bmar f130724d;

    /* renamed from: e */
    public bmsl f130725e;

    /* renamed from: f */
    public int f130726f;

    /* renamed from: h */
    private byte f130727h = 2;

    static {
        bmso bmso = new bmso();
        f130719g = bmso;
        bxvk.m124024a(bmso.class, bmso);
    }

    private bmso() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f130727h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f130727h = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f130719g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0004ᐉ\u0003\u0005ဌ\u0004\u0006ဉ\u0002", new Object[]{"a", "b", "c", "e", "f", bwgz.m121953b(), "d"});
        } else if (i2 == 3) {
            return new bmso();
        } else {
            if (i2 == 4) {
                return new bxvd(f130719g);
            }
            if (i2 == 5) {
                return f130719g;
            }
            bxxk bxxk = f130720i;
            if (bxxk == null) {
                synchronized (bmso.class) {
                    bxxk = f130720i;
                    if (bxxk == null) {
                        bxxk = new bxve(f130719g);
                        f130720i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
