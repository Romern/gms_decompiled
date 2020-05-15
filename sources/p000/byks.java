package p000;

/* renamed from: byks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byks extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final byks f166786b;

    /* renamed from: c */
    private static volatile bxxk f166787c;

    /* renamed from: a */
    public bxww f166788a = bxww.f165013b;

    static {
        byks byks = new byks();
        f166786b = byks;
        GeneratedMessageLite.m124024a(byks.class, byks);
    }

    private byks() {
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
            return GeneratedMessageLite.m124022a(f166786b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", bykm.f166769a});
        } else if (i2 == 3) {
            return new byks();
        } else {
            if (i2 == 4) {
                return new bxvd(f166786b);
            }
            if (i2 == 5) {
                return f166786b;
            }
            bxxk bxxk = f166787c;
            if (bxxk == null) {
                synchronized (byks.class) {
                    bxxk = f166787c;
                    if (bxxk == null) {
                        bxxk = new bxve(f166786b);
                        f166787c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
