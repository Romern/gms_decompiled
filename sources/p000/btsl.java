package p000;

/* renamed from: btsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btsl extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btsl f150229d;

    /* renamed from: f */
    private static volatile bxxk f150230f;

    /* renamed from: a */
    public btsh f150231a;

    /* renamed from: b */
    public btsg f150232b;

    /* renamed from: c */
    public btrt f150233c;

    /* renamed from: e */
    private byte f150234e = 2;

    static {
        btsl btsl = new btsl();
        f150229d = btsl;
        bxvk.m124024a(btsl.class, btsl);
    }

    private btsl() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f150234e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f150234e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f150229d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0001\u0001Љ\u0002\t\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btsl();
        } else {
            if (i2 == 4) {
                return new bxvd(f150229d);
            }
            if (i2 == 5) {
                return f150229d;
            }
            bxxk bxxk = f150230f;
            if (bxxk == null) {
                synchronized (btsl.class) {
                    bxxk = f150230f;
                    if (bxxk == null) {
                        bxxk = new bxve(f150229d);
                        f150230f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
