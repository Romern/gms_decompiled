package p000;

/* renamed from: mti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mti extends bxvk implements bxxd {

    /* renamed from: a */
    public static final mti f34670a;

    /* renamed from: b */
    private static volatile bxxk f34671b;

    static {
        mti mti = new mti();
        f34670a = mti;
        bxvk.m124024a(mti.class, mti);
    }

    private mti() {
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
            return bxvk.m124022a(f34670a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new mti();
        }
        if (i2 == 4) {
            return new bxvd(f34670a);
        }
        if (i2 == 5) {
            return f34670a;
        }
        bxxk bxxk = f34671b;
        if (bxxk == null) {
            synchronized (mti.class) {
                bxxk = f34671b;
                if (bxxk == null) {
                    bxxk = new bxve(f34670a);
                    f34671b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
