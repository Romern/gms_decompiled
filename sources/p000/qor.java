package p000;

/* renamed from: qor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qor extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final qor f41889b;

    /* renamed from: c */
    private static volatile bxxk f41890c;

    /* renamed from: a */
    public bxwc f41891a = bxxn.f165040b;

    static {
        qor qor = new qor();
        f41889b = qor;
        GeneratedMessageLite.m124024a(qor.class, qor);
    }

    private qor() {
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
            return GeneratedMessageLite.m124022a(f41889b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", qov.class});
        } else if (i2 == 3) {
            return new qor();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (byte[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f41889b;
            }
            bxxk bxxk = f41890c;
            if (bxxk == null) {
                synchronized (qor.class) {
                    bxxk = f41890c;
                    if (bxxk == null) {
                        bxxk = new bxve(f41889b);
                        f41890c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo24176a() {
        if (!this.f41891a.mo73666a()) {
            this.f41891a = GeneratedMessageLite.m124021a(this.f41891a);
        }
    }
}
