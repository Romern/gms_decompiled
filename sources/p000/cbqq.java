package p000;

/* renamed from: cbqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbqq extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbqq f178052b;

    /* renamed from: c */
    private static volatile bxxk f178053c;

    /* renamed from: a */
    public int f178054a;

    static {
        cbqq cbqq = new cbqq();
        f178052b = cbqq;
        GeneratedMessageLite.m124024a(cbqq.class, cbqq);
    }

    private cbqq() {
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
            return GeneratedMessageLite.m124022a(f178052b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbqq();
        } else {
            if (i2 == 4) {
                return new bxvd(f178052b);
            }
            if (i2 == 5) {
                return f178052b;
            }
            bxxk bxxk = f178053c;
            if (bxxk == null) {
                synchronized (cbqq.class) {
                    bxxk = f178053c;
                    if (bxxk == null) {
                        bxxk = new bxve(f178052b);
                        f178053c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
