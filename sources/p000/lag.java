package p000;

/* renamed from: lag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lag extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final lag f25529i;

    /* renamed from: j */
    private static volatile bxxk f25530j;

    /* renamed from: a */
    public int f25531a;

    /* renamed from: b */
    public int f25532b;

    /* renamed from: c */
    public bxvt f25533c = bxvm.f164965b;

    /* renamed from: d */
    public long f25534d;

    /* renamed from: e */
    public boolean f25535e;

    /* renamed from: f */
    public int f25536f;

    /* renamed from: g */
    public boolean f25537g;

    /* renamed from: h */
    public kzz f25538h;

    static {
        lag lag = new lag();
        f25529i = lag;
        GeneratedMessageLite.m124024a(lag.class, lag);
    }

    private lag() {
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
            return GeneratedMessageLite.m124022a(f25529i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001\f\u0002\f\u0003,\u0004\u0002\u0005\u0007\u0006\u0004\u0007\u0007\b\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new lag();
        } else {
            if (i2 == 4) {
                return new bxvd(f25529i);
            }
            if (i2 == 5) {
                return f25529i;
            }
            bxxk bxxk = f25530j;
            if (bxxk == null) {
                synchronized (lag.class) {
                    bxxk = f25530j;
                    if (bxxk == null) {
                        bxxk = new bxve(f25529i);
                        f25530j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo14957a() {
        if (!this.f25533c.mo73666a()) {
            this.f25533c = GeneratedMessageLite.m124019a(this.f25533c);
        }
    }
}
