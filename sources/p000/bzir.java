package p000;

/* renamed from: bzir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzir extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzir f170226b;

    /* renamed from: c */
    private static volatile bxxk f170227c;

    /* renamed from: a */
    public bxwc f170228a = bxxn.f165040b;

    static {
        bzir bzir = new bzir();
        f170226b = bzir;
        GeneratedMessageLite.m124024a(bzir.class, bzir);
    }

    private bzir() {
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
            return GeneratedMessageLite.m124022a(f170226b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bzio.class});
        } else if (i2 == 3) {
            return new bzir();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (byte[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f170226b;
            }
            bxxk bxxk = f170227c;
            if (bxxk == null) {
                synchronized (bzir.class) {
                    bxxk = f170227c;
                    if (bxxk == null) {
                        bxxk = new bxve(f170226b);
                        f170227c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
