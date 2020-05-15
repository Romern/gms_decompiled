package p000;

/* renamed from: bpcu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpcu extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bpcu f135860f;

    /* renamed from: g */
    private static volatile bxxk f135861g;

    /* renamed from: a */
    public int f135862a;

    /* renamed from: b */
    public String f135863b = "";

    /* renamed from: c */
    public String f135864c = "";

    /* renamed from: d */
    public String f135865d = "";

    /* renamed from: e */
    public String f135866e = "";

    static {
        bpcu bpcu = new bpcu();
        f135860f = bpcu;
        GeneratedMessageLite.m124024a(bpcu.class, bpcu);
    }

    private bpcu() {
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
            return GeneratedMessageLite.m124022a(f135860f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bpcu();
        } else {
            if (i2 == 4) {
                return new bxvd(f135860f);
            }
            if (i2 == 5) {
                return f135860f;
            }
            bxxk bxxk = f135861g;
            if (bxxk == null) {
                synchronized (bpcu.class) {
                    bxxk = f135861g;
                    if (bxxk == null) {
                        bxxk = new bxve(f135860f);
                        f135861g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
