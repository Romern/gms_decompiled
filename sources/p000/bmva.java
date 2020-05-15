package p000;

/* renamed from: bmva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmva extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmva f131007c;

    /* renamed from: d */
    private static volatile bxxk f131008d;

    /* renamed from: a */
    public int f131009a;

    /* renamed from: b */
    public long f131010b;

    static {
        bmva bmva = new bmva();
        f131007c = bmva;
        GeneratedMessageLite.m124024a(bmva.class, bmva);
    }

    private bmva() {
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
            return GeneratedMessageLite.m124022a(f131007c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bmva();
        } else {
            if (i2 == 4) {
                return new bxvd(f131007c);
            }
            if (i2 == 5) {
                return f131007c;
            }
            bxxk bxxk = f131008d;
            if (bxxk == null) {
                synchronized (bmva.class) {
                    bxxk = f131008d;
                    if (bxxk == null) {
                        bxxk = new bxve(f131007c);
                        f131008d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
