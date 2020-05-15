package p000;

/* renamed from: bipq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bipq extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bipq f121200c;

    /* renamed from: e */
    private static volatile bxxk f121201e;

    /* renamed from: a */
    public int f121202a;

    /* renamed from: b */
    public int f121203b = 1;

    /* renamed from: d */
    private byte f121204d = 2;

    static {
        bipq bipq = new bipq();
        f121200c = bipq;
        GeneratedMessageLite.m124024a(bipq.class, bipq);
    }

    private bipq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121204d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121204d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121200c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"a", "b", bisf.m102782b()});
        } else if (i2 == 3) {
            return new bipq();
        } else {
            if (i2 == 4) {
                return new bxvd(f121200c);
            }
            if (i2 == 5) {
                return f121200c;
            }
            bxxk bxxk = f121201e;
            if (bxxk == null) {
                synchronized (bipq.class) {
                    bxxk = f121201e;
                    if (bxxk == null) {
                        bxxk = new bxve(f121200c);
                        f121201e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
