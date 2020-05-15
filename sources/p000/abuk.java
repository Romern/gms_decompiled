package p000;

/* renamed from: abuk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abuk extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxvu f58407c = new abuj();

    /* renamed from: d */
    public static final abuk f58408d;

    /* renamed from: e */
    private static volatile bxxk f58409e;

    /* renamed from: a */
    public bxwc f58410a = bxxn.f165040b;

    /* renamed from: b */
    public bxvt f58411b = bxvm.f164965b;

    static {
        abuk abuk = new abuk();
        f58408d = abuk;
        bxvk.m124024a(abuk.class, abuk);
    }

    private abuk() {
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
            return bxvk.m124022a(f58408d, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001e", new Object[]{"a", abtd.class, "b", abtf.m48247b()});
        } else if (i2 == 3) {
            return new abuk();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (char[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f58408d;
            }
            bxxk bxxk = f58409e;
            if (bxxk == null) {
                synchronized (abuk.class) {
                    bxxk = f58409e;
                    if (bxxk == null) {
                        bxxk = new bxve(f58408d);
                        f58409e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo32348a() {
        if (!this.f58411b.mo73666a()) {
            this.f58411b = bxvk.m124019a(this.f58411b);
        }
    }
}
