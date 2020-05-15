package p000;

/* renamed from: ayyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayyx extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final ayyx f98774b;

    /* renamed from: d */
    private static volatile bxxk f98775d;

    /* renamed from: a */
    public int f98776a;

    /* renamed from: c */
    private int f98777c;

    static {
        ayyx ayyx = new ayyx();
        f98774b = ayyx;
        GeneratedMessageLite.m124024a(ayyx.class, ayyx);
    }

    private ayyx() {
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
            return GeneratedMessageLite.m124022a(f98774b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new ayyx();
        } else {
            if (i2 == 4) {
                return new bxvd(f98774b);
            }
            if (i2 == 5) {
                return f98774b;
            }
            bxxk bxxk = f98775d;
            if (bxxk == null) {
                synchronized (ayyx.class) {
                    bxxk = f98775d;
                    if (bxxk == null) {
                        bxxk = new bxve(f98774b);
                        f98775d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
