package p000;

/* renamed from: bwvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwvx extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwvx f161194c;

    /* renamed from: d */
    public static final bxvj f161195d;

    /* renamed from: e */
    private static volatile bxxk f161196e;

    /* renamed from: a */
    public int f161197a;

    /* renamed from: b */
    public bwwb f161198b;

    static {
        bwvx bwvx = new bwvx();
        f161194c = bwvx;
        bxvk.m124024a(bwvx.class, bwvx);
        bwog bwog = bwog.f160437f;
        bwvx bwvx2 = f161194c;
        f161195d = bxvk.m124006a(bwog, bwvx2, bwvx2, 232060282, bxzf.MESSAGE);
    }

    private bwvx() {
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
            return bxvk.m124022a(f161194c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwvx();
        } else {
            if (i2 == 4) {
                return new bxvd(f161194c);
            }
            if (i2 == 5) {
                return f161194c;
            }
            bxxk bxxk = f161196e;
            if (bxxk == null) {
                synchronized (bwvx.class) {
                    bxxk = f161196e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161194c);
                        f161196e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
