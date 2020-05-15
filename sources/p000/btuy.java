package p000;

/* renamed from: btuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btuy extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btuy f150646b;

    /* renamed from: d */
    private static volatile bxxk f150647d;

    /* renamed from: a */
    public int f150648a;

    /* renamed from: c */
    private int f150649c;

    static {
        btuy btuy = new btuy();
        f150646b = btuy;
        GeneratedMessageLite.m124024a(btuy.class, btuy);
    }

    private btuy() {
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
            return GeneratedMessageLite.m124022a(f150646b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", btuw.f150645a});
        } else if (i2 == 3) {
            return new btuy();
        } else {
            if (i2 == 4) {
                return new bxvd(f150646b);
            }
            if (i2 == 5) {
                return f150646b;
            }
            bxxk bxxk = f150647d;
            if (bxxk == null) {
                synchronized (btuy.class) {
                    bxxk = f150647d;
                    if (bxxk == null) {
                        bxxk = new bxve(f150646b);
                        f150647d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
