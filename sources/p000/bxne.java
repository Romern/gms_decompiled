package p000;

/* renamed from: bxne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxne extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxne f164022b;

    /* renamed from: c */
    private static volatile bxxk f164023c;

    /* renamed from: a */
    public bxwc f164024a = bxxn.f165040b;

    static {
        bxne bxne = new bxne();
        f164022b = bxne;
        GeneratedMessageLite.m124024a(bxne.class, bxne);
    }

    private bxne() {
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
            return GeneratedMessageLite.m124022a(f164022b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bxnd.class});
        } else if (i2 == 3) {
            return new bxne();
        } else {
            if (i2 == 4) {
                return new bxvd(f164022b);
            }
            if (i2 == 5) {
                return f164022b;
            }
            bxxk bxxk = f164023c;
            if (bxxk == null) {
                synchronized (bxne.class) {
                    bxxk = f164023c;
                    if (bxxk == null) {
                        bxxk = new bxve(f164022b);
                        f164023c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
