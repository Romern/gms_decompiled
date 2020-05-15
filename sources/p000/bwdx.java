package p000;

/* renamed from: bwdx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwdx extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bwdx f158952b;

    /* renamed from: c */
    private static volatile bxxk f158953c;

    /* renamed from: a */
    public bxwc f158954a = bxxn.f165040b;

    static {
        bwdx bwdx = new bwdx();
        f158952b = bwdx;
        GeneratedMessageLite.m124024a(bwdx.class, bwdx);
    }

    private bwdx() {
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
            return GeneratedMessageLite.m124022a(f158952b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bwdw.class});
        } else if (i2 == 3) {
            return new bwdx();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (short[][]) null);
            }
            if (i2 == 5) {
                return f158952b;
            }
            bxxk bxxk = f158953c;
            if (bxxk == null) {
                synchronized (bwdx.class) {
                    bxxk = f158953c;
                    if (bxxk == null) {
                        bxxk = new bxve(f158952b);
                        f158953c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo73517a() {
        if (!this.f158954a.mo73666a()) {
            this.f158954a = GeneratedMessageLite.m124021a(this.f158954a);
        }
    }
}
