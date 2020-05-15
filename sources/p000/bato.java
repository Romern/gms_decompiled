package p000;

/* renamed from: bato */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bato extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bato f101710f;

    /* renamed from: g */
    private static volatile bxxk f101711g;

    /* renamed from: a */
    public int f101712a;

    /* renamed from: b */
    public String f101713b = "";

    /* renamed from: c */
    public String f101714c = "";

    /* renamed from: d */
    public int f101715d;

    /* renamed from: e */
    public int f101716e;

    static {
        bato bato = new bato();
        f101710f = bato;
        GeneratedMessageLite.m124024a(bato.class, bato);
    }

    private bato() {
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
            return GeneratedMessageLite.m124022a(f101710f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bato();
        } else {
            if (i2 == 4) {
                return new bxvd(f101710f);
            }
            if (i2 == 5) {
                return f101710f;
            }
            bxxk bxxk = f101711g;
            if (bxxk == null) {
                synchronized (bato.class) {
                    bxxk = f101711g;
                    if (bxxk == null) {
                        bxxk = new bxve(f101710f);
                        f101711g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
