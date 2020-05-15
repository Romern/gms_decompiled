package p000;

/* renamed from: bybi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bybi extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bybi f165500b;

    /* renamed from: d */
    private static volatile bxxk f165501d;

    /* renamed from: a */
    public bxwc f165502a = bxxn.f165040b;

    /* renamed from: c */
    private byte f165503c = 2;

    static {
        bybi bybi = new bybi();
        f165500b = bybi;
        GeneratedMessageLite.m124024a(bybi.class, bybi);
    }

    private bybi() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f165503c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f165503c = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f165500b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", bybc.class});
        } else if (i2 == 3) {
            return new bybi();
        } else {
            if (i2 == 4) {
                return new byba();
            }
            if (i2 == 5) {
                return f165500b;
            }
            bxxk bxxk = f165501d;
            if (bxxk == null) {
                synchronized (bybi.class) {
                    bxxk = f165501d;
                    if (bxxk == null) {
                        bxxk = new bxve(f165500b);
                        f165501d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo74342c() {
        if (!this.f165502a.mo73666a()) {
            this.f165502a = GeneratedMessageLite.m124021a(this.f165502a);
        }
    }
}
