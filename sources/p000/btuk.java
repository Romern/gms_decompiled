package p000;

/* renamed from: btuk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btuk extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btuk f150497e;

    /* renamed from: f */
    private static volatile bxxk f150498f;

    /* renamed from: a */
    public int f150499a;

    /* renamed from: b */
    public int f150500b;

    /* renamed from: c */
    public String f150501c = "";

    /* renamed from: d */
    public btui f150502d;

    static {
        btuk btuk = new btuk();
        f150497e = btuk;
        bxvk.m124024a(btuk.class, btuk);
    }

    private btuk() {
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
            return bxvk.m124022a(f150497e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0002\u0003ဈ\u0001", new Object[]{"a", "b", btup.f150513a, "d", "c"});
        } else if (i2 == 3) {
            return new btuk();
        } else {
            if (i2 == 4) {
                return new bxvd(f150497e);
            }
            if (i2 == 5) {
                return f150497e;
            }
            bxxk bxxk = f150498f;
            if (bxxk == null) {
                synchronized (btuk.class) {
                    bxxk = f150498f;
                    if (bxxk == null) {
                        bxxk = new bxve(f150497e);
                        f150498f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
