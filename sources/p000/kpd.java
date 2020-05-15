package p000;

/* renamed from: kpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kpd extends bxvk implements bxxd {

    /* renamed from: c */
    public static final kpd f24723c;

    /* renamed from: d */
    private static volatile bxxk f24724d;

    /* renamed from: a */
    public bxwc f24725a = bxxn.f165040b;

    /* renamed from: b */
    public int f24726b;

    static {
        kpd kpd = new kpd();
        f24723c = kpd;
        bxvk.m124024a(kpd.class, kpd);
    }

    private kpd() {
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
            return bxvk.m124022a(f24723c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"a", kpe.class, "b"});
        } else if (i2 == 3) {
            return new kpd();
        } else {
            if (i2 == 4) {
                return new bxvd(f24723c);
            }
            if (i2 == 5) {
                return f24723c;
            }
            bxxk bxxk = f24724d;
            if (bxxk == null) {
                synchronized (kpd.class) {
                    bxxk = f24724d;
                    if (bxxk == null) {
                        bxxk = new bxve(f24723c);
                        f24724d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo14761a() {
        if (!this.f24725a.mo73666a()) {
            this.f24725a = bxvk.m124021a(this.f24725a);
        }
    }
}
