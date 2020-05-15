package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: byxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byxv extends bxvk implements bxxd {

    /* renamed from: p */
    public static final byxv f168807p;

    /* renamed from: q */
    private static volatile bxxk f168808q;

    /* renamed from: a */
    public int f168809a;

    /* renamed from: b */
    public int f168810b = 5;

    /* renamed from: c */
    public boolean f168811c = true;

    /* renamed from: d */
    public boolean f168812d = true;

    /* renamed from: e */
    public double f168813e = 18500.0d;

    /* renamed from: f */
    public boolean f168814f;

    /* renamed from: g */
    public int f168815g = 7;

    /* renamed from: h */
    public int f168816h;

    /* renamed from: i */
    public double f168817i = 48000.0d;

    /* renamed from: j */
    public int f168818j = 4;

    /* renamed from: k */
    public int f168819k = 4;

    /* renamed from: l */
    public int f168820l = 4;

    /* renamed from: m */
    public int f168821m = 16;

    /* renamed from: n */
    public byxu f168822n;

    /* renamed from: o */
    public byxw f168823o;

    static {
        byxv byxv = new byxv();
        f168807p = byxv;
        bxvk.m124024a(byxv.class, byxv);
    }

    private byxv() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m125453a(byxv byxv) {
        byxv.f168809a |= 1;
        byxv.f168810b = 5;
    }

    /* renamed from: b */
    public static /* synthetic */ void m125454b(byxv byxv) {
        byxv.f168809a |= 2;
        byxv.f168811c = true;
    }

    /* renamed from: c */
    public static /* synthetic */ void m125455c(byxv byxv) {
        byxv.f168809a |= 4;
        byxv.f168812d = true;
    }

    /* renamed from: d */
    public static /* synthetic */ void m125456d(byxv byxv) {
        byxv.f168809a |= 8;
        byxv.f168813e = 18500.0d;
    }

    /* renamed from: e */
    public static /* synthetic */ void m125457e(byxv byxv) {
        byxv.f168809a |= 16;
        byxv.f168814f = false;
    }

    /* renamed from: f */
    public static /* synthetic */ void m125458f(byxv byxv) {
        byxv.f168809a |= 32;
        byxv.f168815g = 7;
    }

    /* renamed from: g */
    public static /* synthetic */ void m125459g(byxv byxv) {
        byxv.f168809a |= 64;
        byxv.f168816h = 0;
    }

    /* renamed from: h */
    public static /* synthetic */ void m125460h(byxv byxv) {
        byxv.f168809a |= 128;
        byxv.f168817i = 48000.0d;
    }

    /* renamed from: i */
    public static /* synthetic */ void m125461i(byxv byxv) {
        byxv.f168809a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        byxv.f168818j = 4;
    }

    /* renamed from: j */
    public static /* synthetic */ void m125462j(byxv byxv) {
        byxv.f168809a |= 512;
        byxv.f168819k = 4;
    }

    /* renamed from: k */
    public static /* synthetic */ void m125463k(byxv byxv) {
        byxv.f168809a |= 1024;
        byxv.f168820l = 4;
    }

    /* renamed from: l */
    public static /* synthetic */ void m125464l(byxv byxv) {
        byxv.f168809a |= 2048;
        byxv.f168821m = 16;
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
            return bxvk.m124022a(f168807p, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004က\u0003\u0005ဇ\u0004\u0006င\u0005\u0007င\u0006\bက\u0007\tင\b\nင\t\u000bင\n\fင\u000b\rဉ\f\u000eဉ\r", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
        } else if (i2 == 3) {
            return new byxv();
        } else {
            if (i2 == 4) {
                return new bxvd(f168807p);
            }
            if (i2 == 5) {
                return f168807p;
            }
            bxxk bxxk = f168808q;
            if (bxxk == null) {
                synchronized (byxv.class) {
                    bxxk = f168808q;
                    if (bxxk == null) {
                        bxxk = new bxve(f168807p);
                        f168808q = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
