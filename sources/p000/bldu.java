package p000;

/* renamed from: bldu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bldu extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bldu f126131f;

    /* renamed from: g */
    private static volatile bxxk f126132g;

    /* renamed from: a */
    public int f126133a;

    /* renamed from: b */
    public bleu f126134b;

    /* renamed from: c */
    public String f126135c = "";

    /* renamed from: d */
    public String f126136d = "";

    /* renamed from: e */
    public String f126137e = "";

    static {
        bldu bldu = new bldu();
        f126131f = bldu;
        bxvk.m124024a(bldu.class, bldu);
    }

    private bldu() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f126131f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0006ဈ\u0004", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bldu();
        } else {
            if (i2 == 4) {
                return new bxvd(f126131f);
            }
            if (i2 == 5) {
                return f126131f;
            }
            bxxk bxxk = f126132g;
            if (bxxk == null) {
                synchronized (bldu.class) {
                    bxxk = f126132g;
                    if (bxxk == null) {
                        bxxk = new bxve(f126131f);
                        f126132g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
