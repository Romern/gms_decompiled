package p000;

/* renamed from: bmrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmrp extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bmrp f130557a;

    /* renamed from: c */
    private static volatile bxxk f130558c;

    /* renamed from: b */
    private byte f130559b = 2;

    static {
        bmrp bmrp = new bmrp();
        f130557a = bmrp;
        GeneratedMessageLite.m124024a(bmrp.class, bmrp);
    }

    private bmrp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f130559b);
        }
        byte b = 1;
        if (i2 == 1) {
            if (obj == null) {
                b = 0;
            }
            this.f130559b = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f130557a, "\u0001\u0000", (Object[]) null);
        } else {
            if (i2 == 3) {
                return new bmrp();
            }
            if (i2 == 4) {
                return new bxvd(f130557a);
            }
            if (i2 == 5) {
                return f130557a;
            }
            bxxk bxxk = f130558c;
            if (bxxk == null) {
                synchronized (bmrp.class) {
                    bxxk = f130558c;
                    if (bxxk == null) {
                        bxxk = new bxve(f130557a);
                        f130558c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
