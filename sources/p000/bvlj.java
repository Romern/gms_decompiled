package p000;

/* renamed from: bvlj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvlj extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvlj f156547c;

    /* renamed from: e */
    private static volatile bxxk f156548e;

    /* renamed from: a */
    public bxwc f156549a = bxxn.f165040b;

    /* renamed from: b */
    public String f156550b = "";

    /* renamed from: d */
    private int f156551d;

    static {
        bvlj bvlj = new bvlj();
        f156547c = bvlj;
        bxvk.m124024a(bvlj.class, bvlj);
    }

    private bvlj() {
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
            return bxvk.m124022a(f156547c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"d", "a", bvog.class, "b"});
        } else if (i2 == 3) {
            return new bvlj();
        } else {
            if (i2 == 4) {
                return new bxvd(f156547c);
            }
            if (i2 == 5) {
                return f156547c;
            }
            bxxk bxxk = f156548e;
            if (bxxk == null) {
                synchronized (bvlj.class) {
                    bxxk = f156548e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156547c);
                        f156548e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
