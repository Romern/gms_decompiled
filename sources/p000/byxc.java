package p000;

/* renamed from: byxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byxc extends bxvk implements bxxd {

    /* renamed from: f */
    public static final byxc f168703f;

    /* renamed from: g */
    private static volatile bxxk f168704g;

    /* renamed from: a */
    public int f168705a;

    /* renamed from: b */
    public String f168706b = "";

    /* renamed from: c */
    public bywr f168707c;

    /* renamed from: d */
    public bywz f168708d;

    /* renamed from: e */
    public byxo f168709e;

    static {
        byxc byxc = new byxc();
        f168703f = byxc;
        bxvk.m124024a(byxc.class, byxc);
    }

    private byxc() {
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
            return bxvk.m124022a(f168703f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new byxc();
        } else {
            if (i2 == 4) {
                return new bxvd(f168703f);
            }
            if (i2 == 5) {
                return f168703f;
            }
            bxxk bxxk = f168704g;
            if (bxxk == null) {
                synchronized (byxc.class) {
                    bxxk = f168704g;
                    if (bxxk == null) {
                        bxxk = new bxve(f168703f);
                        f168704g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
