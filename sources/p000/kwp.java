package p000;

/* renamed from: kwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kwp extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final kwp f25301c;

    /* renamed from: d */
    private static volatile bxxk f25302d;

    /* renamed from: a */
    public kwr f25303a;

    /* renamed from: b */
    public bxwc f25304b = bxxn.f165040b;

    static {
        kwp kwp = new kwp();
        f25301c = kwp;
        GeneratedMessageLite.m124024a(kwp.class, kwp);
    }

    private kwp() {
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
            return GeneratedMessageLite.m124022a(f25301c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", new Object[]{"a", "b", bxte.class});
        } else if (i2 == 3) {
            return new kwp();
        } else {
            if (i2 == 4) {
                return new bxvd(f25301c);
            }
            if (i2 == 5) {
                return f25301c;
            }
            bxxk bxxk = f25302d;
            if (bxxk == null) {
                synchronized (kwp.class) {
                    bxxk = f25302d;
                    if (bxxk == null) {
                        bxxk = new bxve(f25301c);
                        f25302d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo14898a() {
        if (!this.f25304b.mo73666a()) {
            this.f25304b = GeneratedMessageLite.m124021a(this.f25304b);
        }
    }
}
