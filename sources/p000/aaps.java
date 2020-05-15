package p000;

/* renamed from: aaps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaps extends bxvk implements bxxd {

    /* renamed from: e */
    public static final aaps f28828e;

    /* renamed from: f */
    private static volatile bxxk f28829f;

    /* renamed from: a */
    public int f28830a;

    /* renamed from: b */
    public int f28831b = 0;

    /* renamed from: c */
    public Object f28832c;

    /* renamed from: d */
    public aapu f28833d;

    static {
        aaps aaps = new aaps();
        f28828e = aaps;
        bxvk.m124024a(aaps.class, aaps);
    }

    private aaps() {
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
            return bxvk.m124022a(f28828e, "\u0001\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000", new Object[]{"c", "b", "a", "d", aapr.class, aaop.class, aapk.class, aaph.class, aapq.class, aapz.class});
        } else if (i2 == 3) {
            return new aaps();
        } else {
            if (i2 == 4) {
                return new bxvd(f28828e);
            }
            if (i2 == 5) {
                return f28828e;
            }
            bxxk bxxk = f28829f;
            if (bxxk == null) {
                synchronized (aaps.class) {
                    bxxk = f28829f;
                    if (bxxk == null) {
                        bxxk = new bxve(f28828e);
                        f28829f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
