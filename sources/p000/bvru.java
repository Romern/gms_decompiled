package p000;

/* renamed from: bvru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvru extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvru f157462a;

    /* renamed from: b */
    private static volatile bxxk f157463b;

    static {
        bvru bvru = new bvru();
        f157462a = bvru;
        GeneratedMessageLite.m124024a(bvru.class, bvru);
    }

    private bvru() {
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
            return GeneratedMessageLite.m124022a(f157462a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvru();
        }
        if (i2 == 4) {
            return new bxvd(f157462a);
        }
        if (i2 == 5) {
            return f157462a;
        }
        bxxk bxxk = f157463b;
        if (bxxk == null) {
            synchronized (bvru.class) {
                bxxk = f157463b;
                if (bxxk == null) {
                    bxxk = new bxve(f157462a);
                    f157463b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
