package p000;

/* renamed from: ayyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayyw extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final ayyw f98770b;

    /* renamed from: d */
    private static volatile bxxk f98771d;

    /* renamed from: a */
    public int f98772a;

    /* renamed from: c */
    private int f98773c;

    static {
        ayyw ayyw = new ayyw();
        f98770b = ayyw;
        GeneratedMessageLite.m124024a(ayyw.class, ayyw);
    }

    private ayyw() {
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
            return GeneratedMessageLite.m124022a(f98770b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new ayyw();
        } else {
            if (i2 == 4) {
                return new bxvd(f98770b);
            }
            if (i2 == 5) {
                return f98770b;
            }
            bxxk bxxk = f98771d;
            if (bxxk == null) {
                synchronized (ayyw.class) {
                    bxxk = f98771d;
                    if (bxxk == null) {
                        bxxk = new bxve(f98770b);
                        f98771d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
