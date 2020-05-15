package p000;

/* renamed from: bwwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwwc extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bwwc f161211f;

    /* renamed from: g */
    public static final bxvj f161212g;

    /* renamed from: i */
    private static volatile bxxk f161213i;

    /* renamed from: a */
    public int f161214a = 0;

    /* renamed from: b */
    public Object f161215b;

    /* renamed from: c */
    public String f161216c = "";

    /* renamed from: d */
    public bxwc f161217d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f161218e = bxxn.f165040b;

    /* renamed from: h */
    private int f161219h;

    static {
        bwwc bwwc = new bwwc();
        f161211f = bwwc;
        bxvk.m124024a(bwwc.class, bwwc);
        bwny bwny = bwny.f160414k;
        bwwc bwwc2 = f161211f;
        f161212g = bxvk.m124006a(bwny, bwwc2, bwwc2, 217437962, bxzf.MESSAGE);
    }

    private bwwc() {
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
            return bxvk.m124022a(f161211f, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0002\u0000\u0001ျ\u0000\u0002ဈ\u0002\u0003ျ\u0000\u0005\u001b\u0006\u001b", new Object[]{"b", "a", "h", "c", "d", bwur.class, "e", bwuf.class});
        } else if (i2 == 3) {
            return new bwwc();
        } else {
            if (i2 == 4) {
                return new bxvd(f161211f);
            }
            if (i2 == 5) {
                return f161211f;
            }
            bxxk bxxk = f161213i;
            if (bxxk == null) {
                synchronized (bwwc.class) {
                    bxxk = f161213i;
                    if (bxxk == null) {
                        bxxk = new bxve(f161211f);
                        f161213i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
