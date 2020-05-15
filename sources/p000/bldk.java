package p000;

/* renamed from: bldk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bldk extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bldk f126094f;

    /* renamed from: g */
    private static volatile bxxk f126095g;

    /* renamed from: a */
    public int f126096a;

    /* renamed from: b */
    public bleu f126097b;

    /* renamed from: c */
    public String f126098c = "";

    /* renamed from: d */
    public String f126099d = "";

    /* renamed from: e */
    public String f126100e = "";

    static {
        bldk bldk = new bldk();
        f126094f = bldk;
        bxvk.m124024a(bldk.class, bldk);
    }

    private bldk() {
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
            return bxvk.m124022a(f126094f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bldk();
        } else {
            if (i2 == 4) {
                return new bxvd(f126094f);
            }
            if (i2 == 5) {
                return f126094f;
            }
            bxxk bxxk = f126095g;
            if (bxxk == null) {
                synchronized (bldk.class) {
                    bxxk = f126095g;
                    if (bxxk == null) {
                        bxxk = new bxve(f126094f);
                        f126095g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
