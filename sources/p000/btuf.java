package p000;

/* renamed from: btuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btuf extends bxvg implements bxvh {

    /* renamed from: a */
    public static final btuf f150458a;

    /* renamed from: f */
    private static volatile bxxk f150459f;

    /* renamed from: b */
    private int f150460b;

    /* renamed from: c */
    private String f150461c = "";

    /* renamed from: d */
    private String f150462d = "";

    /* renamed from: e */
    private byte f150463e = 2;

    static {
        btuf btuf = new btuf();
        f150458a = btuf;
        bxvk.m124024a(btuf.class, btuf);
    }

    private btuf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f150463e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f150463e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f150458a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001", new Object[]{"b", "c", "d"});
        } else if (i2 == 3) {
            return new btuf();
        } else {
            if (i2 == 4) {
                return new bxvf(f150458a);
            }
            if (i2 == 5) {
                return f150458a;
            }
            bxxk bxxk = f150459f;
            if (bxxk == null) {
                synchronized (btuf.class) {
                    bxxk = f150459f;
                    if (bxxk == null) {
                        bxxk = new bxve(f150458a);
                        f150459f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
