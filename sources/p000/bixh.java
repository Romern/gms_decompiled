package p000;

/* renamed from: bixh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bixh extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bixh f122191f;

    /* renamed from: g */
    private static volatile bxxk f122192g;

    /* renamed from: a */
    public int f122193a;

    /* renamed from: b */
    public int f122194b;

    /* renamed from: c */
    public int f122195c;

    /* renamed from: d */
    public String f122196d = "";

    /* renamed from: e */
    public int f122197e = 1;

    static {
        bixh bixh = new bixh();
        f122191f = bixh;
        bxvk.m124024a(bixh.class, bixh);
    }

    private bixh() {
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
            return bxvk.m124022a(f122191f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", biwx.f122146a});
        } else if (i2 == 3) {
            return new bixh();
        } else {
            if (i2 == 4) {
                return new bxvd(f122191f);
            }
            if (i2 == 5) {
                return f122191f;
            }
            bxxk bxxk = f122192g;
            if (bxxk == null) {
                synchronized (bixh.class) {
                    bxxk = f122192g;
                    if (bxxk == null) {
                        bxxk = new bxve(f122191f);
                        f122192g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
