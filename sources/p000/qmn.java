package p000;

/* renamed from: qmn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qmn extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final qmn f41721b;

    /* renamed from: c */
    private static volatile bxxk f41722c;

    /* renamed from: a */
    public bxwc f41723a = bxxn.f165040b;

    static {
        qmn qmn = new qmn();
        f41721b = qmn;
        GeneratedMessageLite.m124024a(qmn.class, qmn);
    }

    private qmn() {
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
            return GeneratedMessageLite.m124022a(f41721b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", qmm.class});
        } else if (i2 == 3) {
            return new qmn();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (short[][][]) null);
            }
            if (i2 == 5) {
                return f41721b;
            }
            bxxk bxxk = f41722c;
            if (bxxk == null) {
                synchronized (qmn.class) {
                    bxxk = f41722c;
                    if (bxxk == null) {
                        bxxk = new bxve(f41721b);
                        f41722c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo24113a() {
        if (!this.f41723a.mo73666a()) {
            this.f41723a = GeneratedMessageLite.m124021a(this.f41723a);
        }
    }
}
