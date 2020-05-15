package p000;

/* renamed from: bwlp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwlp extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bwlp f160163e;

    /* renamed from: f */
    private static volatile bxxk f160164f;

    /* renamed from: a */
    public int f160165a;

    /* renamed from: b */
    public String f160166b = "";

    /* renamed from: c */
    public String f160167c = "";

    /* renamed from: d */
    public bxwc f160168d = bxxn.f165040b;

    static {
        bwlp bwlp = new bwlp();
        f160163e = bwlp;
        GeneratedMessageLite.m124024a(bwlp.class, bwlp);
    }

    private bwlp() {
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
            return GeneratedMessageLite.m124022a(f160163e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", bwlo.class});
        } else if (i2 == 3) {
            return new bwlp();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (short[][]) null);
            }
            if (i2 == 5) {
                return f160163e;
            }
            bxxk bxxk = f160164f;
            if (bxxk == null) {
                synchronized (bwlp.class) {
                    bxxk = f160164f;
                    if (bxxk == null) {
                        bxxk = new bxve(f160163e);
                        f160164f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
