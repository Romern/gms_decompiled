package p000;

/* renamed from: aqak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqak extends bxvk implements bxxd {

    /* renamed from: f */
    public static final aqak f85401f;

    /* renamed from: g */
    private static volatile bxxk f85402g;

    /* renamed from: a */
    public int f85403a;

    /* renamed from: b */
    public boolean f85404b;

    /* renamed from: c */
    public boolean f85405c;

    /* renamed from: d */
    public String f85406d = "";

    /* renamed from: e */
    public bxtx f85407e = bxtx.f164797b;

    static {
        aqak aqak = new aqak();
        f85401f = aqak;
        bxvk.m124024a(aqak.class, aqak);
    }

    private aqak() {
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
            return bxvk.m124022a(f85401f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ည\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new aqak();
        } else {
            if (i2 == 4) {
                return new bxvd(f85401f);
            }
            if (i2 == 5) {
                return f85401f;
            }
            bxxk bxxk = f85402g;
            if (bxxk == null) {
                synchronized (aqak.class) {
                    bxxk = f85402g;
                    if (bxxk == null) {
                        bxxk = new bxve(f85401f);
                        f85402g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
