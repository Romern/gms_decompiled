package p000;

/* renamed from: buga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buga extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final buga f153763c;

    /* renamed from: d */
    private static volatile bxxk f153764d;

    /* renamed from: a */
    public int f153765a = 0;

    /* renamed from: b */
    public Object f153766b;

    static {
        buga buga = new buga();
        f153763c = buga;
        GeneratedMessageLite.m124024a(buga.class, buga);
    }

    private buga() {
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
            return GeneratedMessageLite.m124022a(f153763c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", bufz.class, bufx.class, bufy.class, bufw.class});
        } else if (i2 == 3) {
            return new buga();
        } else {
            if (i2 == 4) {
                return new bxvd(f153763c);
            }
            if (i2 == 5) {
                return f153763c;
            }
            bxxk bxxk = f153764d;
            if (bxxk == null) {
                synchronized (buga.class) {
                    bxxk = f153764d;
                    if (bxxk == null) {
                        bxxk = new bxve(f153763c);
                        f153764d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
