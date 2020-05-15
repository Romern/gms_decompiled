package p000;

/* renamed from: byir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byir extends bxvk implements bxxd {

    /* renamed from: b */
    public static final byir f166595b;

    /* renamed from: c */
    private static volatile bxxk f166596c;

    /* renamed from: a */
    public bxwc f166597a = bxxn.f165040b;

    static {
        byir byir = new byir();
        f166595b = byir;
        bxvk.m124024a(byir.class, byir);
    }

    private byir() {
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
            return bxvk.m124022a(f166595b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", byit.class});
        } else if (i2 == 3) {
            return new byir();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (boolean[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f166595b;
            }
            bxxk bxxk = f166596c;
            if (bxxk == null) {
                synchronized (byir.class) {
                    bxxk = f166596c;
                    if (bxxk == null) {
                        bxxk = new bxve(f166595b);
                        f166596c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo74384c() {
        if (!this.f166597a.mo73666a()) {
            this.f166597a = bxvk.m124021a(this.f166597a);
        }
    }
}
