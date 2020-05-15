package p000;

/* renamed from: brdg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brdg extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final brdg f142507d;

    /* renamed from: f */
    private static volatile bxxk f142508f;

    /* renamed from: a */
    public bral f142509a;

    /* renamed from: b */
    public String f142510b = "";

    /* renamed from: c */
    public String f142511c = "";

    /* renamed from: e */
    private int f142512e;

    static {
        brdg brdg = new brdg();
        f142507d = brdg;
        GeneratedMessageLite.m124024a(brdg.class, brdg);
    }

    private brdg() {
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
            return GeneratedMessageLite.m124022a(f142507d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new brdg();
        } else {
            if (i2 == 4) {
                return new bxvd(f142507d);
            }
            if (i2 == 5) {
                return f142507d;
            }
            bxxk bxxk = f142508f;
            if (bxxk == null) {
                synchronized (brdg.class) {
                    bxxk = f142508f;
                    if (bxxk == null) {
                        bxxk = new bxve(f142507d);
                        f142508f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
