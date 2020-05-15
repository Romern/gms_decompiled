package p000;

/* renamed from: abpu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abpu extends bxvk implements bxxd {

    /* renamed from: c */
    public static final abpu f57904c;

    /* renamed from: f */
    private static volatile bxxk f57905f;

    /* renamed from: a */
    public bxwc f57906a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f57907b = bxxn.f165040b;

    /* renamed from: d */
    private int f57908d;

    /* renamed from: e */
    private boolean f57909e;

    static {
        abpu abpu = new abpu();
        f57904c = abpu;
        bxvk.m124024a(abpu.class, abpu);
    }

    private abpu() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m48051a(abpu abpu) {
        abpu.f57908d |= 1;
        abpu.f57909e = true;
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
            return bxvk.m124022a(f57904c, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဇ\u0000", new Object[]{"d", "a", abps.class, "b", abpt.class, "e"});
        } else if (i2 == 3) {
            return new abpu();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (int[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f57904c;
            }
            bxxk bxxk = f57905f;
            if (bxxk == null) {
                synchronized (abpu.class) {
                    bxxk = f57905f;
                    if (bxxk == null) {
                        bxxk = new bxve(f57904c);
                        f57905f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo32278a() {
        if (!this.f57906a.mo73666a()) {
            this.f57906a = bxvk.m124021a(this.f57906a);
        }
    }
}
