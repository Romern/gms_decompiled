package p000;

/* renamed from: bylh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bylh extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bylh f166832d;

    /* renamed from: e */
    private static volatile bxxk f166833e;

    /* renamed from: a */
    public int f166834a;

    /* renamed from: b */
    public byla f166835b;

    /* renamed from: c */
    public bylg f166836c;

    static {
        bylh bylh = new bylh();
        f166832d = bylh;
        bxvk.m124024a(bylh.class, bylh);
    }

    private bylh() {
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
            return bxvk.m124022a(f166832d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bylh();
        } else {
            if (i2 == 4) {
                return new bxvd(f166832d);
            }
            if (i2 == 5) {
                return f166832d;
            }
            bxxk bxxk = f166833e;
            if (bxxk == null) {
                synchronized (bylh.class) {
                    bxxk = f166833e;
                    if (bxxk == null) {
                        bxxk = new bxve(f166832d);
                        f166833e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
