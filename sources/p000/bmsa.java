package p000;

/* renamed from: bmsa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmsa extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bmsa f130632f;

    /* renamed from: h */
    private static volatile bxxk f130633h;

    /* renamed from: a */
    public int f130634a;

    /* renamed from: b */
    public bmav f130635b;

    /* renamed from: c */
    public bmaq f130636c;

    /* renamed from: d */
    public bmar f130637d;

    /* renamed from: e */
    public bmrx f130638e;

    /* renamed from: g */
    private byte f130639g = 2;

    static {
        bmsa bmsa = new bmsa();
        f130632f = bmsa;
        bxvk.m124024a(bmsa.class, bmsa);
    }

    private bmsa() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f130639g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f130639g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f130632f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0004\u0004ဉ\u0002", new Object[]{"a", "b", "c", "e", "d"});
        } else if (i2 == 3) {
            return new bmsa();
        } else {
            if (i2 == 4) {
                return new bxvd(f130632f);
            }
            if (i2 == 5) {
                return f130632f;
            }
            bxxk bxxk = f130633h;
            if (bxxk == null) {
                synchronized (bmsa.class) {
                    bxxk = f130633h;
                    if (bxxk == null) {
                        bxxk = new bxve(f130632f);
                        f130633h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
