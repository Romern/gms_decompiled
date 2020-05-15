package p000;

/* renamed from: aaix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaix extends bxvk implements bxxd {

    /* renamed from: f */
    public static final aaix f28235f;

    /* renamed from: g */
    private static volatile bxxk f28236g;

    /* renamed from: a */
    public int f28237a;

    /* renamed from: b */
    public int f28238b;

    /* renamed from: c */
    public int f28239c;

    /* renamed from: d */
    public int f28240d;

    /* renamed from: e */
    public int f28241e;

    static {
        aaix aaix = new aaix();
        f28235f = aaix;
        bxvk.m124024a(aaix.class, aaix);
    }

    private aaix() {
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
            return bxvk.m124022a(f28235f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", aaiv.f28234a});
        } else if (i2 == 3) {
            return new aaix();
        } else {
            if (i2 == 4) {
                return new bxvd(f28235f);
            }
            if (i2 == 5) {
                return f28235f;
            }
            bxxk bxxk = f28236g;
            if (bxxk == null) {
                synchronized (aaix.class) {
                    bxxk = f28236g;
                    if (bxxk == null) {
                        bxxk = new bxve(f28235f);
                        f28236g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
