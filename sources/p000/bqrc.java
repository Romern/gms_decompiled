package p000;

/* renamed from: bqrc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqrc extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bqrc f141419b;

    /* renamed from: c */
    private static volatile bxxk f141420c;

    /* renamed from: a */
    public int f141421a;

    static {
        bqrc bqrc = new bqrc();
        f141419b = bqrc;
        bxvk.m124024a(bqrc.class, bqrc);
    }

    private bqrc() {
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
            return bxvk.m124022a(f141419b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bqrc();
        } else {
            if (i2 == 4) {
                return new bxvd(f141419b);
            }
            if (i2 == 5) {
                return f141419b;
            }
            bxxk bxxk = f141420c;
            if (bxxk == null) {
                synchronized (bqrc.class) {
                    bxxk = f141420c;
                    if (bxxk == null) {
                        bxxk = new bxve(f141419b);
                        f141420c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
