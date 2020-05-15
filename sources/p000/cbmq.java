package p000;

/* renamed from: cbmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbmq extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbmq f177666b;

    /* renamed from: c */
    private static volatile bxxk f177667c;

    /* renamed from: a */
    public bxtx f177668a = bxtx.f164797b;

    static {
        cbmq cbmq = new cbmq();
        f177666b = cbmq;
        bxvk.m124024a(cbmq.class, cbmq);
    }

    private cbmq() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f177666b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbmq();
        } else {
            if (i2 == 4) {
                return new bxvd(f177666b);
            }
            if (i2 == 5) {
                return f177666b;
            }
            bxxk bxxk = f177667c;
            if (bxxk == null) {
                synchronized (cbmq.class) {
                    bxxk = f177667c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177666b);
                        f177667c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
