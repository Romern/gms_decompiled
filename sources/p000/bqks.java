package p000;

/* renamed from: bqks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqks extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bqks f141034b;

    /* renamed from: d */
    private static volatile bxxk f141035d;

    /* renamed from: a */
    public ByteString f141036a = ByteString.f164797b;

    /* renamed from: c */
    private int f141037c;

    static {
        bqks bqks = new bqks();
        f141034b = bqks;
        GeneratedMessageLite.m124024a(bqks.class, bqks);
    }

    private bqks() {
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
            return GeneratedMessageLite.m124022a(f141034b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bqks();
        } else {
            if (i2 == 4) {
                return new bxvd(f141034b);
            }
            if (i2 == 5) {
                return f141034b;
            }
            bxxk bxxk = f141035d;
            if (bxxk == null) {
                synchronized (bqks.class) {
                    bxxk = f141035d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141034b);
                        f141035d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
