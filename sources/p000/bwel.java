package p000;

/* renamed from: bwel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwel extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bwel f159000b;

    /* renamed from: c */
    private static volatile bxxk f159001c;

    /* renamed from: a */
    public bxwc f159002a = bxxn.f165040b;

    static {
        bwel bwel = new bwel();
        f159000b = bwel;
        GeneratedMessageLite.m124024a(bwel.class, bwel);
    }

    private bwel() {
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
            return GeneratedMessageLite.m124022a(f159000b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bwek.class});
        } else if (i2 == 3) {
            return new bwel();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (boolean[][]) null);
            }
            if (i2 == 5) {
                return f159000b;
            }
            bxxk bxxk = f159001c;
            if (bxxk == null) {
                synchronized (bwel.class) {
                    bxxk = f159001c;
                    if (bxxk == null) {
                        bxxk = new bxve(f159000b);
                        f159001c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
