package p000;

/* renamed from: bojh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bojh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bojh f133272d;

    /* renamed from: e */
    private static volatile bxxk f133273e;

    /* renamed from: a */
    public int f133274a;

    /* renamed from: b */
    public int f133275b;

    /* renamed from: c */
    public boolean f133276c;

    static {
        bojh bojh = new bojh();
        f133272d = bojh;
        GeneratedMessageLite.m124024a(bojh.class, bojh);
    }

    private bojh() {
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
            return GeneratedMessageLite.m124022a(f133272d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", bojg.f133271a, "c"});
        } else if (i2 == 3) {
            return new bojh();
        } else {
            if (i2 == 4) {
                return new bxvd(f133272d);
            }
            if (i2 == 5) {
                return f133272d;
            }
            bxxk bxxk = f133273e;
            if (bxxk == null) {
                synchronized (bojh.class) {
                    bxxk = f133273e;
                    if (bxxk == null) {
                        bxxk = new bxve(f133272d);
                        f133273e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
