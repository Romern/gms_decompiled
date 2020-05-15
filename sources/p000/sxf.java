package p000;

/* renamed from: sxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sxf extends GeneratedMessageLite implements bxxd {

    /* renamed from: o */
    public static final sxf f45339o;

    /* renamed from: p */
    private static volatile bxxk f45340p;

    /* renamed from: a */
    public int f45341a;

    /* renamed from: b */
    public long f45342b;

    /* renamed from: c */
    public bxwc f45343c = bxxn.f165040b;

    /* renamed from: d */
    public String f45344d = "";

    /* renamed from: e */
    public long f45345e;

    /* renamed from: f */
    public int f45346f;

    /* renamed from: g */
    public int f45347g;

    /* renamed from: h */
    public int f45348h;

    /* renamed from: i */
    public String f45349i = "";

    /* renamed from: j */
    public String f45350j = "";

    /* renamed from: k */
    public int f45351k;

    /* renamed from: l */
    public int f45352l;

    /* renamed from: m */
    public String f45353m = "";

    /* renamed from: n */
    public String f45354n = "";

    static {
        sxf sxf = new sxf();
        f45339o = sxf;
        GeneratedMessageLite.m124024a(sxf.class, sxf);
    }

    private sxf() {
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
            return GeneratedMessageLite.m124022a(f45339o, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0001\u0000\u0001စ\u0001\u0002\u001b\u0003ဈ\u0002\u0004စ\u0003\u0006င\u0004\u0007င\u0005\bင\u0006\tဈ\u0007\nဈ\b\u000bင\t\fင\n\rဈ\u000b\u000eဈ\f", new Object[]{"a", "b", "c", sxl.class, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
        } else if (i2 == 3) {
            return new sxf();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (boolean[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f45339o;
            }
            bxxk bxxk = f45340p;
            if (bxxk == null) {
                synchronized (sxf.class) {
                    bxxk = f45340p;
                    if (bxxk == null) {
                        bxxk = new bxve(f45339o);
                        f45340p = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
