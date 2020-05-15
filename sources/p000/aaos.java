package p000;

/* renamed from: aaos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaos extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final aaos f28714d;

    /* renamed from: e */
    private static volatile bxxk f28715e;

    /* renamed from: a */
    public int f28716a;

    /* renamed from: b */
    public int f28717b;

    /* renamed from: c */
    public String f28718c = "";

    static {
        aaos aaos = new aaos();
        f28714d = aaos;
        GeneratedMessageLite.m124024a(aaos.class, aaos);
    }

    private aaos() {
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
            return GeneratedMessageLite.m124022a(f28714d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", aaoq.f28713a, "c"});
        } else if (i2 == 3) {
            return new aaos();
        } else {
            if (i2 == 4) {
                return new bxvd(f28714d);
            }
            if (i2 == 5) {
                return f28714d;
            }
            bxxk bxxk = f28715e;
            if (bxxk == null) {
                synchronized (aaos.class) {
                    bxxk = f28715e;
                    if (bxxk == null) {
                        bxxk = new bxve(f28714d);
                        f28715e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
