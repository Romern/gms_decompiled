package p000;

/* renamed from: bymi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bymi extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bymi f167024b;

    /* renamed from: c */
    private static volatile bxxk f167025c;

    /* renamed from: a */
    public bxww f167026a = bxww.f165013b;

    static {
        bymi bymi = new bymi();
        f167024b = bymi;
        GeneratedMessageLite.m124024a(bymi.class, bymi);
    }

    private bymi() {
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
            return GeneratedMessageLite.m124022a(f167024b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", bymh.f167023a});
        } else if (i2 == 3) {
            return new bymi();
        } else {
            if (i2 == 4) {
                return new bxvd(f167024b);
            }
            if (i2 == 5) {
                return f167024b;
            }
            bxxk bxxk = f167025c;
            if (bxxk == null) {
                synchronized (bymi.class) {
                    bxxk = f167025c;
                    if (bxxk == null) {
                        bxxk = new bxve(f167024b);
                        f167025c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
