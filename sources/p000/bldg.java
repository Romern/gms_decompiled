package p000;

/* renamed from: bldg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bldg extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bldg f126061d;

    /* renamed from: e */
    private static volatile bxxk f126062e;

    /* renamed from: a */
    public int f126063a;

    /* renamed from: b */
    public bleu f126064b;

    /* renamed from: c */
    public String f126065c = "";

    static {
        bldg bldg = new bldg();
        f126061d = bldg;
        GeneratedMessageLite.m124024a(bldg.class, bldg);
    }

    private bldg() {
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
            return GeneratedMessageLite.m124022a(f126061d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bldg();
        } else {
            if (i2 == 4) {
                return new bxvd(f126061d);
            }
            if (i2 == 5) {
                return f126061d;
            }
            bxxk bxxk = f126062e;
            if (bxxk == null) {
                synchronized (bldg.class) {
                    bxxk = f126062e;
                    if (bxxk == null) {
                        bxxk = new bxve(f126061d);
                        f126062e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
