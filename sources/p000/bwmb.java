package p000;

/* renamed from: bwmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwmb extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bwmb f160236a;

    /* renamed from: c */
    private static volatile bxxk f160237c;

    /* renamed from: b */
    private byte f160238b = 2;

    static {
        bwmb bwmb = new bwmb();
        f160236a = bwmb;
        bxvk.m124024a(bwmb.class, bwmb);
    }

    private bwmb() {
        bxxn bxxn = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160238b);
        }
        byte b = 1;
        if (i2 == 1) {
            if (obj == null) {
                b = 0;
            }
            this.f160238b = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f160236a, "\u0001\u0000", (Object[]) null);
        } else {
            if (i2 == 3) {
                return new bwmb();
            }
            if (i2 == 4) {
                return new bxvd(f160236a);
            }
            if (i2 == 5) {
                return f160236a;
            }
            bxxk bxxk = f160237c;
            if (bxxk == null) {
                synchronized (bwmb.class) {
                    bxxk = f160237c;
                    if (bxxk == null) {
                        bxxk = new bxve(f160236a);
                        f160237c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
