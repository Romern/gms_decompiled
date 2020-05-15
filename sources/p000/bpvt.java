package p000;

/* renamed from: bpvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpvt extends bxvk implements bxxd {

    /* renamed from: o */
    public static final bpvt f139418o;

    /* renamed from: p */
    private static volatile bxxk f139419p;

    /* renamed from: a */
    public int f139420a;

    /* renamed from: b */
    public long f139421b;

    /* renamed from: c */
    public int f139422c;

    /* renamed from: d */
    public long f139423d;

    /* renamed from: e */
    public String f139424e = "";

    /* renamed from: f */
    public String f139425f = "";

    /* renamed from: g */
    public String f139426g = "";

    /* renamed from: h */
    public long f139427h;

    /* renamed from: i */
    public bxwc f139428i = bxxn.f165040b;

    /* renamed from: j */
    public bxwc f139429j = bxxn.f165040b;

    /* renamed from: k */
    public String f139430k = "";

    /* renamed from: l */
    public long f139431l = -1;

    /* renamed from: m */
    public float f139432m;

    /* renamed from: n */
    public boolean f139433n;

    static {
        bpvt bpvt = new bpvt();
        f139418o = bpvt;
        bxvk.m124024a(bpvt.class, bpvt);
    }

    private bpvt() {
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
            return bxvk.m124022a(f139418o, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0002\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0006\u0006\u001a\bဈ\u0004\tဈ\b\nဂ\t\u000bခ\n\fဈ\u0005\r\u001b\u000eဇ\u000b", new Object[]{"a", "b", "c", bpvr.f139412a, "d", "e", "h", "i", "f", "k", "l", "m", "g", "j", bpvs.class, "n"});
        } else if (i2 == 3) {
            return new bpvt();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (float[][]) null);
            }
            if (i2 == 5) {
                return f139418o;
            }
            bxxk bxxk = f139419p;
            if (bxxk == null) {
                synchronized (bpvt.class) {
                    bxxk = f139419p;
                    if (bxxk == null) {
                        bxxk = new bxve(f139418o);
                        f139419p = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
