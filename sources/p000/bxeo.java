package p000;

/* renamed from: bxeo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxeo extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bxeo f163115a;

    /* renamed from: b */
    private static volatile bxxk f163116b;

    static {
        bxeo bxeo = new bxeo();
        f163115a = bxeo;
        GeneratedMessageLite.m124024a(bxeo.class, bxeo);
    }

    private bxeo() {
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
            return GeneratedMessageLite.m124022a(f163115a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bxeo();
        }
        if (i2 == 4) {
            return new bxvd(f163115a);
        }
        if (i2 == 5) {
            return f163115a;
        }
        bxxk bxxk = f163116b;
        if (bxxk == null) {
            synchronized (bxeo.class) {
                bxxk = f163116b;
                if (bxxk == null) {
                    bxxk = new bxve(f163115a);
                    f163116b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
