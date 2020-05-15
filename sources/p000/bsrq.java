package p000;

/* renamed from: bsrq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsrq extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bsrq f146789a;

    /* renamed from: b */
    private static volatile bxxk f146790b;

    static {
        bsrq bsrq = new bsrq();
        f146789a = bsrq;
        GeneratedMessageLite.m124024a(bsrq.class, bsrq);
    }

    private bsrq() {
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
            return GeneratedMessageLite.m124022a(f146789a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bsrq();
        }
        if (i2 == 4) {
            return new bxvd(f146789a);
        }
        if (i2 == 5) {
            return f146789a;
        }
        bxxk bxxk = f146790b;
        if (bxxk == null) {
            synchronized (bsrq.class) {
                bxxk = f146790b;
                if (bxxk == null) {
                    bxxk = new bxve(f146789a);
                    f146790b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
