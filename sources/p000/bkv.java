package p000;

/* renamed from: bkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkv extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bkv f5038a;

    /* renamed from: b */
    private static volatile bxxk f5039b;

    static {
        bkv bkv = new bkv();
        f5038a = bkv;
        bxvk.m124024a(bkv.class, bkv);
    }

    private bkv() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f5038a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bkv();
        }
        if (i2 == 4) {
            return new bxvd(f5038a);
        }
        if (i2 == 5) {
            return f5038a;
        }
        bxxk bxxk = f5039b;
        if (bxxk == null) {
            synchronized (bkv.class) {
                bxxk = f5039b;
                if (bxxk == null) {
                    bxxk = new bxve(f5038a);
                    f5039b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
