package p000;

/* renamed from: ajhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajhg extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final ajhg f70622e;

    /* renamed from: f */
    private static volatile bxxk f70623f;

    /* renamed from: a */
    public int f70624a;

    /* renamed from: b */
    public String f70625b = "";

    /* renamed from: c */
    public String f70626c = "";

    /* renamed from: d */
    public String f70627d = "";

    static {
        ajhg ajhg = new ajhg();
        f70622e = ajhg;
        GeneratedMessageLite.m124024a(ajhg.class, ajhg);
    }

    private ajhg() {
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
            return GeneratedMessageLite.m124022a(f70622e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new ajhg();
        } else {
            if (i2 == 4) {
                return new bxvd(f70622e);
            }
            if (i2 == 5) {
                return f70622e;
            }
            bxxk bxxk = f70623f;
            if (bxxk == null) {
                synchronized (ajhg.class) {
                    bxxk = f70623f;
                    if (bxxk == null) {
                        bxxk = new bxve(f70622e);
                        f70623f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
