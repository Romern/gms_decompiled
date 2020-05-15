package p000;

/* renamed from: birp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class birp extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final birp f121441b;

    /* renamed from: d */
    private static volatile bxxk f121442d;

    /* renamed from: a */
    public bxwc f121443a = bxxn.f165040b;

    /* renamed from: c */
    private byte f121444c = 2;

    static {
        birp birp = new birp();
        f121441b = birp;
        GeneratedMessageLite.m124024a(birp.class, birp);
    }

    private birp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121444c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121444c = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121441b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", biro.class});
        } else if (i2 == 3) {
            return new birp();
        } else {
            if (i2 == 4) {
                return new bxvd(f121441b);
            }
            if (i2 == 5) {
                return f121441b;
            }
            bxxk bxxk = f121442d;
            if (bxxk == null) {
                synchronized (birp.class) {
                    bxxk = f121442d;
                    if (bxxk == null) {
                        bxxk = new bxve(f121441b);
                        f121442d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
