package p000;

/* renamed from: aywu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aywu extends bxvg implements aywv {

    /* renamed from: f */
    public static final aywu f98650f;

    /* renamed from: h */
    private static volatile bxxk f98651h;

    /* renamed from: a */
    public int f98652a;

    /* renamed from: b */
    public bxvt f98653b = bxvm.f164965b;

    /* renamed from: c */
    public bptu f98654c;

    /* renamed from: d */
    public int f98655d;

    /* renamed from: e */
    public long f98656e;

    /* renamed from: g */
    private byte f98657g = 2;

    static {
        aywu aywu = new aywu();
        f98650f = aywu;
        bxvk.m124024a(aywu.class, aywu);
    }

    private aywu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f98657g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f98657g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f98650f, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0001\u0001\u0002\u0016\u0004ᐉ\u0000\u0005ဌ\u0001\u0006ဂ\u0002", new Object[]{"a", "b", "c", "d", bpbz.f135694a, "e"});
        } else if (i2 == 3) {
            return new aywu();
        } else {
            if (i2 == 4) {
                return new bxvf(f98650f);
            }
            if (i2 == 5) {
                return f98650f;
            }
            bxxk bxxk = f98651h;
            if (bxxk == null) {
                synchronized (aywu.class) {
                    bxxk = f98651h;
                    if (bxxk == null) {
                        bxxk = new bxve(f98650f);
                        f98651h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
