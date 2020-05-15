package p000;

/* renamed from: bvpn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvpn extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvpn f157318a;

    /* renamed from: b */
    private static volatile bxxk f157319b;

    static {
        bvpn bvpn = new bvpn();
        f157318a = bvpn;
        bxvk.m124024a(bvpn.class, bvpn);
    }

    private bvpn() {
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
            return bxvk.m124022a(f157318a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvpn();
        }
        if (i2 == 4) {
            return new bxvd(f157318a);
        }
        if (i2 == 5) {
            return f157318a;
        }
        bxxk bxxk = f157319b;
        if (bxxk == null) {
            synchronized (bvpn.class) {
                bxxk = f157319b;
                if (bxxk == null) {
                    bxxk = new bxve(f157318a);
                    f157319b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
