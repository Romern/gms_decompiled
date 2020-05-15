package p000;

/* renamed from: bisl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bisl extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bisl f121580c;

    /* renamed from: d */
    private static volatile bxxk f121581d;

    /* renamed from: a */
    public int f121582a;

    /* renamed from: b */
    public int f121583b = 1;

    static {
        bisl bisl = new bisl();
        f121580c = bisl;
        GeneratedMessageLite.m124024a(bisl.class, bisl);
    }

    private bisl() {
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
            return GeneratedMessageLite.m124022a(f121580c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bisn.m102793b()});
        } else if (i2 == 3) {
            return new bisl();
        } else {
            if (i2 == 4) {
                return new bxvd(f121580c);
            }
            if (i2 == 5) {
                return f121580c;
            }
            bxxk bxxk = f121581d;
            if (bxxk == null) {
                synchronized (bisl.class) {
                    bxxk = f121581d;
                    if (bxxk == null) {
                        bxxk = new bxve(f121580c);
                        f121581d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
