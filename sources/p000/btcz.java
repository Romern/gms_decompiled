package p000;

/* renamed from: btcz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btcz extends bxvk implements bxxd {

    /* renamed from: g */
    public static final btcz f148362g;

    /* renamed from: h */
    private static volatile bxxk f148363h;

    /* renamed from: a */
    public bxwc f148364a = bxxn.f165040b;

    /* renamed from: b */
    public bteh f148365b;

    /* renamed from: c */
    public btcu f148366c;

    /* renamed from: d */
    public btea f148367d;

    /* renamed from: e */
    public int f148368e;

    /* renamed from: f */
    public btdy f148369f;

    static {
        btcz btcz = new btcz();
        f148362g = btcz;
        bxvk.m124024a(btcz.class, btcz);
    }

    private btcz() {
        bxvm bxvm = bxvm.f164965b;
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
            return bxvk.m124022a(f148362g, "\u0000\u0006\u0000\u0000\u0001\b\u0006\u0000\u0001\u0000\u0001Ț\u0002\t\u0003\t\u0004\t\u0006\f\b\t", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new btcz();
        } else {
            if (i2 == 4) {
                return new btcy();
            }
            if (i2 == 5) {
                return f148362g;
            }
            bxxk bxxk = f148363h;
            if (bxxk == null) {
                synchronized (btcz.class) {
                    bxxk = f148363h;
                    if (bxxk == null) {
                        bxxk = new bxve(f148362g);
                        f148363h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo70741a() {
        if (!this.f148364a.mo73666a()) {
            this.f148364a = bxvk.m124021a(this.f148364a);
        }
    }
}
