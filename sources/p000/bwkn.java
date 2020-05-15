package p000;

/* renamed from: bwkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwkn extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwkn f159989c;

    /* renamed from: d */
    private static volatile bxxk f159990d;

    /* renamed from: a */
    public int f159991a;

    /* renamed from: b */
    public bmaj f159992b;

    static {
        bwkn bwkn = new bwkn();
        f159989c = bwkn;
        bxvk.m124024a(bwkn.class, bwkn);
    }

    private bwkn() {
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
            return bxvk.m124022a(f159989c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwkn();
        } else {
            if (i2 == 4) {
                return new bxvd(f159989c);
            }
            if (i2 == 5) {
                return f159989c;
            }
            bxxk bxxk = f159990d;
            if (bxxk == null) {
                synchronized (bwkn.class) {
                    bxxk = f159990d;
                    if (bxxk == null) {
                        bxxk = new bxve(f159989c);
                        f159990d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
