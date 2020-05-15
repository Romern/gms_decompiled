package p000;

/* renamed from: bxuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxuw extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxuw f164878b;

    /* renamed from: c */
    private static volatile bxxk f164879c;

    /* renamed from: a */
    public bxwc f164880a = bxxn.f165040b;

    static {
        bxuw bxuw = new bxuw();
        f164878b = bxuw;
        GeneratedMessageLite.m124024a(bxuw.class, bxuw);
    }

    private bxuw() {
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
            return GeneratedMessageLite.m124022a(f164878b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bxuw();
        } else {
            if (i2 == 4) {
                return new bxuv();
            }
            if (i2 == 5) {
                return f164878b;
            }
            bxxk bxxk = f164879c;
            if (bxxk == null) {
                synchronized (bxuw.class) {
                    bxxk = f164879c;
                    if (bxxk == null) {
                        bxxk = new bxve(f164878b);
                        f164879c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo73907c() {
        if (!this.f164880a.mo73666a()) {
            this.f164880a = GeneratedMessageLite.m124021a(this.f164880a);
        }
    }
}
