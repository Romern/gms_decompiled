package p000;

/* renamed from: blpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blpb extends bxvk implements bxxd {

    /* renamed from: a */
    public static final blpb f127190a;

    /* renamed from: c */
    private static volatile bxxk f127191c;

    /* renamed from: b */
    private byte f127192b = 2;

    static {
        blpb blpb = new blpb();
        f127190a = blpb;
        bxvk.m124024a(blpb.class, blpb);
    }

    private blpb() {
        bxxn bxxn = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127192b);
        }
        byte b = 1;
        if (i2 == 1) {
            if (obj == null) {
                b = 0;
            }
            this.f127192b = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f127190a, "\u0001\u0000", (Object[]) null);
        } else {
            if (i2 == 3) {
                return new blpb();
            }
            if (i2 == 4) {
                return new bxvd(f127190a);
            }
            if (i2 == 5) {
                return f127190a;
            }
            bxxk bxxk = f127191c;
            if (bxxk == null) {
                synchronized (blpb.class) {
                    bxxk = f127191c;
                    if (bxxk == null) {
                        bxxk = new bxve(f127190a);
                        f127191c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
