package p000;

/* renamed from: bvfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvfb extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvfb f155839a;

    /* renamed from: b */
    private static volatile bxxk f155840b;

    static {
        bvfb bvfb = new bvfb();
        f155839a = bvfb;
        bxvk.m124024a(bvfb.class, bvfb);
    }

    private bvfb() {
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
            return bxvk.m124022a(f155839a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvfb();
        }
        if (i2 == 4) {
            return new bxvd(f155839a);
        }
        if (i2 == 5) {
            return f155839a;
        }
        bxxk bxxk = f155840b;
        if (bxxk == null) {
            synchronized (bvfb.class) {
                bxxk = f155840b;
                if (bxxk == null) {
                    bxxk = new bxve(f155839a);
                    f155840b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
