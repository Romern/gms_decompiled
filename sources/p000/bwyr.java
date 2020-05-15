package p000;

/* renamed from: bwyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwyr extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwyr f161509d;

    /* renamed from: e */
    public static final bxvj f161510e;

    /* renamed from: g */
    private static volatile bxxk f161511g;

    /* renamed from: a */
    public int f161512a = 0;

    /* renamed from: b */
    public Object f161513b;

    /* renamed from: c */
    public int f161514c;

    /* renamed from: f */
    private int f161515f;

    static {
        bwyr bwyr = new bwyr();
        f161509d = bwyr;
        bxvk.m124024a(bwyr.class, bwyr);
        bwoq bwoq = bwoq.f160480d;
        bwyr bwyr2 = f161509d;
        f161510e = bxvk.m124006a(bwoq, bwyr2, bwyr2, 238549017, bxzf.MESSAGE);
    }

    private bwyr() {
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
            return bxvk.m124022a(f161509d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002့\u0000\u0003ြ\u0000", new Object[]{"b", "a", "f", "c", bwyo.f161503a, bwyq.class});
        } else if (i2 == 3) {
            return new bwyr();
        } else {
            if (i2 == 4) {
                return new bxvd(f161509d);
            }
            if (i2 == 5) {
                return f161509d;
            }
            bxxk bxxk = f161511g;
            if (bxxk == null) {
                synchronized (bwyr.class) {
                    bxxk = f161511g;
                    if (bxxk == null) {
                        bxxk = new bxve(f161509d);
                        f161511g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
