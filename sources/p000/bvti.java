package p000;

/* renamed from: bvti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvti extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvti f157568a;

    /* renamed from: b */
    private static volatile bxxk f157569b;

    static {
        bvti bvti = new bvti();
        f157568a = bvti;
        GeneratedMessageLite.m124024a(bvti.class, bvti);
    }

    private bvti() {
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
            return GeneratedMessageLite.m124022a(f157568a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvti();
        }
        if (i2 == 4) {
            return new bxvd(f157568a);
        }
        if (i2 == 5) {
            return f157568a;
        }
        bxxk bxxk = f157569b;
        if (bxxk == null) {
            synchronized (bvti.class) {
                bxxk = f157569b;
                if (bxxk == null) {
                    bxxk = new bxve(f157568a);
                    f157569b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
