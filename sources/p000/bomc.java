package p000;

/* renamed from: bomc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bomc extends bxvk implements bxxd {

    /* renamed from: l */
    public static final bomc f133623l;

    /* renamed from: m */
    private static volatile bxxk f133624m;

    /* renamed from: a */
    public int f133625a;

    /* renamed from: b */
    public int f133626b;

    /* renamed from: c */
    public int f133627c;

    /* renamed from: d */
    public int f133628d;

    /* renamed from: e */
    public int f133629e;

    /* renamed from: f */
    public int f133630f;

    /* renamed from: g */
    public int f133631g;

    /* renamed from: h */
    public int f133632h;

    /* renamed from: i */
    public int f133633i;

    /* renamed from: j */
    public boma f133634j;

    /* renamed from: k */
    public long f133635k;

    static {
        bomc bomc = new bomc();
        f133623l = bomc;
        bxvk.m124024a(bomc.class, bomc);
    }

    private bomc() {
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
            return bxvk.m124022a(f133623l, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b\u0004\t\f\n\t\u000b\u0002", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new bomc();
        } else {
            if (i2 == 4) {
                return new bxvd(f133623l);
            }
            if (i2 == 5) {
                return f133623l;
            }
            bxxk bxxk = f133624m;
            if (bxxk == null) {
                synchronized (bomc.class) {
                    bxxk = f133624m;
                    if (bxxk == null) {
                        bxxk = new bxve(f133623l);
                        f133624m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
