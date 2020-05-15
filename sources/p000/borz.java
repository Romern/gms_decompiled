package p000;

/* renamed from: borz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class borz extends bxvk implements bxxd {

    /* renamed from: d */
    public static final borz f134534d;

    /* renamed from: e */
    private static volatile bxxk f134535e;

    /* renamed from: a */
    public int f134536a;

    /* renamed from: b */
    public String f134537b = "";

    /* renamed from: c */
    public String f134538c = "";

    static {
        borz borz = new borz();
        f134534d = borz;
        bxvk.m124024a(borz.class, borz);
    }

    private borz() {
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
            return bxvk.m124022a(f134534d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new borz();
        } else {
            if (i2 == 4) {
                return new bxvd(f134534d);
            }
            if (i2 == 5) {
                return f134534d;
            }
            bxxk bxxk = f134535e;
            if (bxxk == null) {
                synchronized (borz.class) {
                    bxxk = f134535e;
                    if (bxxk == null) {
                        bxxk = new bxve(f134534d);
                        f134535e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
