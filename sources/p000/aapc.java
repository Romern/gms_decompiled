package p000;

/* renamed from: aapc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aapc extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final aapc f28738b;

    /* renamed from: c */
    private static volatile bxxk f28739c;

    /* renamed from: a */
    public bxwc f28740a = bxxn.f165040b;

    static {
        aapc aapc = new aapc();
        f28738b = aapc;
        GeneratedMessageLite.m124024a(aapc.class, aapc);
    }

    private aapc() {
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
            return GeneratedMessageLite.m124022a(f28738b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", aapb.class});
        } else if (i2 == 3) {
            return new aapc();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (byte[][][]) null);
            }
            if (i2 == 5) {
                return f28738b;
            }
            bxxk bxxk = f28739c;
            if (bxxk == null) {
                synchronized (aapc.class) {
                    bxxk = f28739c;
                    if (bxxk == null) {
                        bxxk = new bxve(f28738b);
                        f28739c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo17179a() {
        if (!this.f28740a.mo73666a()) {
            this.f28740a = GeneratedMessageLite.m124021a(this.f28740a);
        }
    }
}
