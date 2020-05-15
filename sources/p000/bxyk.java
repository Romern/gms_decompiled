package p000;

/* renamed from: bxyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxyk extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxyk f165095c;

    /* renamed from: d */
    private static volatile bxxk f165096d;

    /* renamed from: a */
    public long f165097a;

    /* renamed from: b */
    public int f165098b;

    static {
        bxyk bxyk = new bxyk();
        f165095c = bxyk;
        bxvk.m124024a(bxyk.class, bxyk);
    }

    private bxyk() {
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
            return bxvk.m124022a(f165095c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bxyk();
        } else {
            if (i2 == 4) {
                return new bxvd(f165095c);
            }
            if (i2 == 5) {
                return f165095c;
            }
            bxxk bxxk = f165096d;
            if (bxxk == null) {
                synchronized (bxyk.class) {
                    bxxk = f165096d;
                    if (bxxk == null) {
                        bxxk = new bxve(f165095c);
                        f165096d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
