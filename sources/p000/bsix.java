package p000;

/* renamed from: bsix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsix extends bxvk implements bsiy {

    /* renamed from: e */
    public static final bsix f144763e;

    /* renamed from: f */
    private static volatile bxxk f144764f;

    /* renamed from: a */
    public bsjk f144765a;

    /* renamed from: b */
    public long f144766b;

    /* renamed from: c */
    public int f144767c;

    /* renamed from: d */
    public boolean f144768d;

    static {
        bsix bsix = new bsix();
        f144763e = bsix;
        bxvk.m124024a(bsix.class, bsix);
    }

    private bsix() {
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
            return bxvk.m124022a(f144763e, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\t\u0003\u0002\u0004\u0004\u0005\u0007", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bsix();
        } else {
            if (i2 == 4) {
                return new bxvd(f144763e);
            }
            if (i2 == 5) {
                return f144763e;
            }
            bxxk bxxk = f144764f;
            if (bxxk == null) {
                synchronized (bsix.class) {
                    bxxk = f144764f;
                    if (bxxk == null) {
                        bxxk = new bxve(f144763e);
                        f144764f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
