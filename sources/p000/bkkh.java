package p000;

/* renamed from: bkkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkkh extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bkkh f124544f;

    /* renamed from: g */
    private static volatile bxxk f124545g;

    /* renamed from: a */
    public int f124546a;

    /* renamed from: b */
    public int f124547b = 0;

    /* renamed from: c */
    public Object f124548c;

    /* renamed from: d */
    public int f124549d;

    /* renamed from: e */
    public String f124550e = "";

    static {
        bkkh bkkh = new bkkh();
        f124544f = bkkh;
        GeneratedMessageLite.m124024a(bkkh.class, bkkh);
    }

    private bkkh() {
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
            return GeneratedMessageLite.m124022a(f124544f, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ြ\u0000", new Object[]{"c", "b", "a", "d", bybu.f165599a, "e", bybs.class});
        } else if (i2 == 3) {
            return new bkkh();
        } else {
            if (i2 == 4) {
                return new bxvd(f124544f);
            }
            if (i2 == 5) {
                return f124544f;
            }
            bxxk bxxk = f124545g;
            if (bxxk == null) {
                synchronized (bkkh.class) {
                    bxxk = f124545g;
                    if (bxxk == null) {
                        bxxk = new bxve(f124544f);
                        f124545g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
