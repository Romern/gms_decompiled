package p000;

/* renamed from: bwic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwic extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwic f159612d;

    /* renamed from: f */
    private static volatile bxxk f159613f;

    /* renamed from: a */
    public int f159614a = 0;

    /* renamed from: b */
    public Object f159615b;

    /* renamed from: c */
    public long f159616c;

    /* renamed from: e */
    private int f159617e;

    static {
        bwic bwic = new bwic();
        f159612d = bwic;
        GeneratedMessageLite.m124024a(bwic.class, bwic);
    }

    private bwic() {
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
            return GeneratedMessageLite.m124022a(f159612d, "\u0001\u0003\u0001\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0005ြ\u0000\u0006ြ\u0000", new Object[]{"b", "a", "e", "c", bmnr.class, bmno.class});
        } else if (i2 == 3) {
            return new bwic();
        } else {
            if (i2 == 4) {
                return new bxvd(f159612d);
            }
            if (i2 == 5) {
                return f159612d;
            }
            bxxk bxxk = f159613f;
            if (bxxk == null) {
                synchronized (bwic.class) {
                    bxxk = f159613f;
                    if (bxxk == null) {
                        bxxk = new bxve(f159612d);
                        f159613f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
