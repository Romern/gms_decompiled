package p000;

/* renamed from: cafw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cafw extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cafw f173023b;

    /* renamed from: c */
    private static volatile bxxk f173024c;

    /* renamed from: a */
    public bxwc f173025a = bxxn.f165040b;

    static {
        cafw cafw = new cafw();
        f173023b = cafw;
        GeneratedMessageLite.m124024a(cafw.class, cafw);
    }

    private cafw() {
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
            return GeneratedMessageLite.m124022a(f173023b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cafv.class});
        } else if (i2 == 3) {
            return new cafw();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (char[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f173023b;
            }
            bxxk bxxk = f173024c;
            if (bxxk == null) {
                synchronized (cafw.class) {
                    bxxk = f173024c;
                    if (bxxk == null) {
                        bxxk = new bxve(f173023b);
                        f173024c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo74639c() {
        if (!this.f173025a.mo73666a()) {
            this.f173025a = GeneratedMessageLite.m124021a(this.f173025a);
        }
    }
}
