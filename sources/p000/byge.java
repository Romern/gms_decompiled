package p000;

/* renamed from: byge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byge extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final byge f166289c;

    /* renamed from: d */
    private static volatile bxxk f166290d;

    /* renamed from: a */
    public long f166291a;

    /* renamed from: b */
    public long f166292b;

    static {
        byge byge = new byge();
        f166289c = byge;
        GeneratedMessageLite.m124024a(byge.class, byge);
    }

    private byge() {
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
            return GeneratedMessageLite.m124022a(f166289c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0003\u0002\u0003", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new byge();
        } else {
            if (i2 == 4) {
                return new bxvd(f166289c);
            }
            if (i2 == 5) {
                return f166289c;
            }
            bxxk bxxk = f166290d;
            if (bxxk == null) {
                synchronized (byge.class) {
                    bxxk = f166290d;
                    if (bxxk == null) {
                        bxxk = new bxve(f166289c);
                        f166290d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
