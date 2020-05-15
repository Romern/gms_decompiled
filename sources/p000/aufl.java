package p000;

/* renamed from: aufl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aufl extends bxvk implements bxxd {

    /* renamed from: a */
    public static final aufl f91693a;

    /* renamed from: c */
    private static volatile bxxk f91694c;

    /* renamed from: b */
    private byte f91695b = 2;

    static {
        aufl aufl = new aufl();
        f91693a = aufl;
        bxvk.m124024a(aufl.class, aufl);
    }

    private aufl() {
        bxxn bxxn = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f91695b);
        }
        byte b = 1;
        if (i2 == 1) {
            if (obj == null) {
                b = 0;
            }
            this.f91695b = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f91693a, "\u0001\u0000", (Object[]) null);
        } else {
            if (i2 == 3) {
                return new aufl();
            }
            if (i2 == 4) {
                return new bxvd(f91693a);
            }
            if (i2 == 5) {
                return f91693a;
            }
            bxxk bxxk = f91694c;
            if (bxxk == null) {
                synchronized (aufl.class) {
                    bxxk = f91694c;
                    if (bxxk == null) {
                        bxxk = new bxve(f91693a);
                        f91694c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
