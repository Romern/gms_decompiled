package p000;

/* renamed from: bygn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bygn extends bxvg implements bxvh {

    /* renamed from: a */
    public static final bygn f166357a;

    /* renamed from: c */
    private static volatile bxxk f166358c;

    /* renamed from: b */
    private byte f166359b = 2;

    static {
        bygn bygn = new bygn();
        f166357a = bygn;
        bxvk.m124024a(bygn.class, bygn);
    }

    private bygn() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f166359b);
        }
        byte b = 1;
        if (i2 == 1) {
            if (obj == null) {
                b = 0;
            }
            this.f166359b = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f166357a, "\u0003\u0000", (Object[]) null);
        } else {
            if (i2 == 3) {
                return new bygn();
            }
            if (i2 == 4) {
                return new bxvf(f166357a);
            }
            if (i2 == 5) {
                return f166357a;
            }
            bxxk bxxk = f166358c;
            if (bxxk == null) {
                synchronized (bygn.class) {
                    bxxk = f166358c;
                    if (bxxk == null) {
                        bxxk = new bxve(f166357a);
                        f166358c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
