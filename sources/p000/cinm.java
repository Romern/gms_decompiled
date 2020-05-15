package p000;

/* renamed from: cinm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cinm extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cinm f190968b;

    /* renamed from: d */
    private static volatile bxxk f190969d;

    /* renamed from: a */
    public bxwc f190970a = bxxn.f165040b;

    /* renamed from: c */
    private byte f190971c = 2;

    static {
        cinm cinm = new cinm();
        f190968b = cinm;
        bxvk.m124024a(cinm.class, cinm);
    }

    private cinm() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f190971c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f190971c = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f190968b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", cinl.class});
        } else if (i2 == 3) {
            return new cinm();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (byte[][][]) null);
            }
            if (i2 == 5) {
                return f190968b;
            }
            bxxk bxxk = f190969d;
            if (bxxk == null) {
                synchronized (cinm.class) {
                    bxxk = f190969d;
                    if (bxxk == null) {
                        bxxk = new bxve(f190968b);
                        f190969d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo86261c() {
        if (!this.f190970a.mo73666a()) {
            this.f190970a = bxvk.m124021a(this.f190970a);
        }
    }
}
