package p000;

/* renamed from: bwue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwue extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bwue f161024a;

    /* renamed from: b */
    private static volatile bxxk f161025b;

    static {
        bwue bwue = new bwue();
        f161024a = bwue;
        bxvk.m124024a(bwue.class, bwue);
    }

    private bwue() {
        bxvm bxvm = bxvm.f164965b;
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
            return bxvk.m124022a(f161024a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bwue();
        }
        if (i2 == 4) {
            return new bxvd(f161024a);
        }
        if (i2 == 5) {
            return f161024a;
        }
        bxxk bxxk = f161025b;
        if (bxxk == null) {
            synchronized (bwue.class) {
                bxxk = f161025b;
                if (bxxk == null) {
                    bxxk = new bxve(f161024a);
                    f161025b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
