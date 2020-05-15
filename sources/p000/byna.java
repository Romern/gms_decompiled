package p000;

/* renamed from: byna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byna extends bxvk implements bxxd {

    /* renamed from: a */
    public static final byna f167099a;

    /* renamed from: b */
    private static volatile bxxk f167100b;

    static {
        byna byna = new byna();
        f167099a = byna;
        bxvk.m124024a(byna.class, byna);
    }

    private byna() {
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
            return bxvk.m124022a(f167099a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new byna();
        }
        if (i2 == 4) {
            return new bxvd(f167099a);
        }
        if (i2 == 5) {
            return f167099a;
        }
        bxxk bxxk = f167100b;
        if (bxxk == null) {
            synchronized (byna.class) {
                bxxk = f167100b;
                if (bxxk == null) {
                    bxxk = new bxve(f167099a);
                    f167100b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
