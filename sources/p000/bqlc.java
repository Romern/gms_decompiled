package p000;

/* renamed from: bqlc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqlc extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bqlc f141077c;

    /* renamed from: d */
    private static volatile bxxk f141078d;

    /* renamed from: a */
    public String f141079a = "";

    /* renamed from: b */
    public bxwc f141080b = bxxn.f165040b;

    static {
        bqlc bqlc = new bqlc();
        f141077c = bqlc;
        bxvk.m124024a(bqlc.class, bqlc);
    }

    private bqlc() {
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
            return bxvk.m124022a(f141077c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"a", "b", bqlb.class});
        } else if (i2 == 3) {
            return new bqlc();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f141077c;
            }
            bxxk bxxk = f141078d;
            if (bxxk == null) {
                synchronized (bqlc.class) {
                    bxxk = f141078d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141077c);
                        f141078d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
