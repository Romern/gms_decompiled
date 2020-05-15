package p000;

/* renamed from: bisk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bisk extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bisk f121575b;

    /* renamed from: e */
    private static volatile bxxk f121576e;

    /* renamed from: a */
    public int f121577a = 1;

    /* renamed from: c */
    private int f121578c;

    /* renamed from: d */
    private byte f121579d = 2;

    static {
        bisk bisk = new bisk();
        f121575b = bisk;
        bxvk.m124024a(bisk.class, bisk);
    }

    private bisk() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121579d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121579d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121575b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"c", "a", bisn.m102793b()});
        } else if (i2 == 3) {
            return new bisk();
        } else {
            if (i2 == 4) {
                return new bxvd(f121575b);
            }
            if (i2 == 5) {
                return f121575b;
            }
            bxxk bxxk = f121576e;
            if (bxxk == null) {
                synchronized (bisk.class) {
                    bxxk = f121576e;
                    if (bxxk == null) {
                        bxxk = new bxve(f121575b);
                        f121576e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
