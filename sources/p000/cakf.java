package p000;

/* renamed from: cakf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cakf extends bxvk implements bxxd {

    /* renamed from: j */
    public static final cakf f174968j;

    /* renamed from: k */
    private static volatile bxxk f174969k;

    /* renamed from: a */
    public int f174970a;

    /* renamed from: b */
    public cajw f174971b;

    /* renamed from: c */
    public String f174972c = "";

    /* renamed from: d */
    public bxvt f174973d = bxvm.f164965b;

    /* renamed from: e */
    public cajz f174974e;

    /* renamed from: f */
    public cajs f174975f;

    /* renamed from: g */
    public cajt f174976g;

    /* renamed from: h */
    public boolean f174977h;

    /* renamed from: i */
    public String f174978i = "";

    static {
        cakf cakf = new cakf();
        f174968j = cakf;
        bxvk.m124024a(cakf.class, cakf);
    }

    private cakf() {
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
            return bxvk.m124022a(f174968j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003\u001e\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဇ\u0006\nဈ\b", new Object[]{"a", "b", "c", "d", cake.m126717b(), "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new cakf();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (int[]) null);
            }
            if (i2 == 5) {
                return f174968j;
            }
            bxxk bxxk = f174969k;
            if (bxxk == null) {
                synchronized (cakf.class) {
                    bxxk = f174969k;
                    if (bxxk == null) {
                        bxxk = new bxve(f174968j);
                        f174969k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
