package p000;

/* renamed from: bixe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bixe extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bixe f122174d;

    /* renamed from: e */
    private static volatile bxxk f122175e;

    /* renamed from: a */
    public int f122176a;

    /* renamed from: b */
    public String f122177b = "";

    /* renamed from: c */
    public int f122178c;

    static {
        bixe bixe = new bixe();
        f122174d = bixe;
        GeneratedMessageLite.m124024a(bixe.class, bixe);
    }

    private bixe() {
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
            return GeneratedMessageLite.m124022a(f122174d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bixe();
        } else {
            if (i2 == 4) {
                return new bxvd(f122174d);
            }
            if (i2 == 5) {
                return f122174d;
            }
            bxxk bxxk = f122175e;
            if (bxxk == null) {
                synchronized (bixe.class) {
                    bxxk = f122175e;
                    if (bxxk == null) {
                        bxxk = new bxve(f122174d);
                        f122175e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
