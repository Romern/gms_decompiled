package p000;

/* renamed from: bups */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bups extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bups f154672a;

    /* renamed from: b */
    private static volatile bxxk f154673b;

    static {
        bups bups = new bups();
        f154672a = bups;
        bxvk.m124024a(bups.class, bups);
    }

    private bups() {
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
            return bxvk.m124022a(f154672a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bups();
        }
        if (i2 == 4) {
            return new bxvd(f154672a);
        }
        if (i2 == 5) {
            return f154672a;
        }
        bxxk bxxk = f154673b;
        if (bxxk == null) {
            synchronized (bups.class) {
                bxxk = f154673b;
                if (bxxk == null) {
                    bxxk = new bxve(f154672a);
                    f154673b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
