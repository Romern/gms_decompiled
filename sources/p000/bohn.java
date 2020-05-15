package p000;

/* renamed from: bohn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bohn extends bxvk implements bxxd {

    /* renamed from: n */
    public static final bohn f133102n;

    /* renamed from: o */
    private static volatile bxxk f133103o;

    /* renamed from: a */
    public int f133104a;

    /* renamed from: b */
    public int f133105b;

    /* renamed from: c */
    public String f133106c = "";

    /* renamed from: d */
    public int f133107d;

    /* renamed from: e */
    public bohp f133108e;

    /* renamed from: f */
    public boht f133109f;

    /* renamed from: g */
    public bohv f133110g;

    /* renamed from: h */
    public boho f133111h;

    /* renamed from: i */
    public bohq f133112i;

    /* renamed from: j */
    public bohu f133113j;

    /* renamed from: k */
    public bohr f133114k;

    /* renamed from: l */
    public bohs f133115l;

    /* renamed from: m */
    public bohk f133116m;

    static {
        bohn bohn = new bohn();
        f133102n = bohn;
        bxvk.m124024a(bohn.class, bohn);
    }

    private bohn() {
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
            return bxvk.m124022a(f133102n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bင\u0002\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b", new Object[]{"a", "b", bohl.f133101a, "c", "e", "f", "g", "h", "i", "d", "j", "k", "l", "m"});
        } else if (i2 == 3) {
            return new bohn();
        } else {
            if (i2 == 4) {
                return new bxvd(f133102n);
            }
            if (i2 == 5) {
                return f133102n;
            }
            bxxk bxxk = f133103o;
            if (bxxk == null) {
                synchronized (bohn.class) {
                    bxxk = f133103o;
                    if (bxxk == null) {
                        bxxk = new bxve(f133102n);
                        f133103o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
