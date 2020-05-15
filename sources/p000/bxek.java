package p000;

/* renamed from: bxek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxek extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxek f163104b;

    /* renamed from: d */
    private static volatile bxxk f163105d;

    /* renamed from: a */
    public int f163106a;

    /* renamed from: c */
    private int f163107c;

    static {
        bxek bxek = new bxek();
        f163104b = bxek;
        GeneratedMessageLite.m124024a(bxek.class, bxek);
    }

    private bxek() {
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
            return GeneratedMessageLite.m124022a(f163104b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", bxei.f163103a});
        } else if (i2 == 3) {
            return new bxek();
        } else {
            if (i2 == 4) {
                return new bxvd(f163104b);
            }
            if (i2 == 5) {
                return f163104b;
            }
            bxxk bxxk = f163105d;
            if (bxxk == null) {
                synchronized (bxek.class) {
                    bxxk = f163105d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163104b);
                        f163105d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
