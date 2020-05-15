package p000;

/* renamed from: bleu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bleu extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bleu f126278h;

    /* renamed from: i */
    private static volatile bxxk f126279i;

    /* renamed from: a */
    public int f126280a;

    /* renamed from: b */
    public int f126281b = 3;

    /* renamed from: c */
    public int f126282c;

    /* renamed from: d */
    public String f126283d = "";

    /* renamed from: e */
    public boolean f126284e;

    /* renamed from: f */
    public bxwc f126285f = bxxn.f165040b;

    /* renamed from: g */
    public boolean f126286g;

    static {
        bleu bleu = new bleu();
        f126278h = bleu;
        bxvk.m124024a(bleu.class, bleu);
    }

    private bleu() {
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
            return bxvk.m124022a(f126278h, "\u0001\u0006\u0000\u0001\u0002\u000f\u0006\u0000\u0001\u0000\u0002ဌ\u0001\u0003ဇ\u0005\tဈ\u0004\fဇ\u000b\r\u001b\u000fဌ\u0002", new Object[]{"a", "b", bles.f126277a, "e", "d", "g", "f", bldt.class, "c", bldm.f126106a});
        } else if (i2 == 3) {
            return new bleu();
        } else {
            if (i2 == 4) {
                return new bxvd(f126278h);
            }
            if (i2 == 5) {
                return f126278h;
            }
            bxxk bxxk = f126279i;
            if (bxxk == null) {
                synchronized (bleu.class) {
                    bxxk = f126279i;
                    if (bxxk == null) {
                        bxxk = new bxve(f126278h);
                        f126279i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
