package p000;

/* renamed from: bydz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bydz extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bydz f165878c;

    /* renamed from: d */
    private static volatile bxxk f165879d;

    /* renamed from: a */
    public cbmo f165880a;

    /* renamed from: b */
    public cbds f165881b;

    static {
        bydz bydz = new bydz();
        f165878c = bydz;
        GeneratedMessageLite.m124024a(bydz.class, bydz);
    }

    private bydz() {
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
            return GeneratedMessageLite.m124022a(f165878c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bydz();
        } else {
            if (i2 == 4) {
                return new bxvd(f165878c);
            }
            if (i2 == 5) {
                return f165878c;
            }
            bxxk bxxk = f165879d;
            if (bxxk == null) {
                synchronized (bydz.class) {
                    bxxk = f165879d;
                    if (bxxk == null) {
                        bxxk = new bxve(f165878c);
                        f165879d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
