package p000;

/* renamed from: bymp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bymp extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bymp f167047b;

    /* renamed from: c */
    private static volatile bxxk f167048c;

    /* renamed from: a */
    public bxwc f167049a = bxxn.f165040b;

    static {
        bymp bymp = new bymp();
        f167047b = bymp;
        GeneratedMessageLite.m124024a(bymp.class, bymp);
    }

    private bymp() {
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
            return GeneratedMessageLite.m124022a(f167047b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bymp();
        } else {
            if (i2 == 4) {
                return new bymo();
            }
            if (i2 == 5) {
                return f167047b;
            }
            bxxk bxxk = f167048c;
            if (bxxk == null) {
                synchronized (bymp.class) {
                    bxxk = f167048c;
                    if (bxxk == null) {
                        bxxk = new bxve(f167047b);
                        f167048c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo74394c() {
        if (!this.f167049a.mo73666a()) {
            this.f167049a = GeneratedMessageLite.m124021a(this.f167049a);
        }
    }
}
