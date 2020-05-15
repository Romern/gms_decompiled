package p000;

/* renamed from: bopl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bopl extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bopl f134141c;

    /* renamed from: d */
    private static volatile bxxk f134142d;

    /* renamed from: a */
    public long f134143a;

    /* renamed from: b */
    public long f134144b;

    static {
        bopl bopl = new bopl();
        f134141c = bopl;
        bxvk.m124024a(bopl.class, bopl);
    }

    private bopl() {
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
            return bxvk.m124022a(f134141c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0003\u0002\u0003", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bopl();
        } else {
            if (i2 == 4) {
                return new bxvd(f134141c);
            }
            if (i2 == 5) {
                return f134141c;
            }
            bxxk bxxk = f134142d;
            if (bxxk == null) {
                synchronized (bopl.class) {
                    bxxk = f134142d;
                    if (bxxk == null) {
                        bxxk = new bxve(f134141c);
                        f134142d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
