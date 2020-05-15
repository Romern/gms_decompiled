package p000;

/* renamed from: caah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caah extends bxvk implements bxxd {

    /* renamed from: d */
    public static final caah f172333d;

    /* renamed from: e */
    private static volatile bxxk f172334e;

    /* renamed from: a */
    public int f172335a;

    /* renamed from: b */
    public String f172336b = "";

    /* renamed from: c */
    public bxwc f172337c = bxxn.f165040b;

    static {
        caah caah = new caah();
        f172333d = caah;
        bxvk.m124024a(caah.class, caah);
    }

    private caah() {
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
            return bxvk.m124022a(f172333d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", "c", caal.class});
        } else if (i2 == 3) {
            return new caah();
        } else {
            if (i2 == 4) {
                return new caag();
            }
            if (i2 == 5) {
                return f172333d;
            }
            bxxk bxxk = f172334e;
            if (bxxk == null) {
                synchronized (caah.class) {
                    bxxk = f172334e;
                    if (bxxk == null) {
                        bxxk = new bxve(f172333d);
                        f172334e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo74596c() {
        if (!this.f172337c.mo73666a()) {
            this.f172337c = bxvk.m124021a(this.f172337c);
        }
    }
}
