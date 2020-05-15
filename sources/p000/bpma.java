package p000;

/* renamed from: bpma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpma extends bxvk implements bxxd {

    /* renamed from: p */
    public static final bpma f138193p;

    /* renamed from: q */
    private static volatile bxxk f138194q;

    /* renamed from: a */
    public int f138195a;

    /* renamed from: b */
    public long f138196b;

    /* renamed from: c */
    public bxwc f138197c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f138198d = bxxn.f165040b;

    /* renamed from: e */
    public long f138199e;

    /* renamed from: f */
    public long f138200f;

    /* renamed from: g */
    public long f138201g;

    /* renamed from: h */
    public int f138202h;

    /* renamed from: i */
    public int f138203i;

    /* renamed from: j */
    public long f138204j;

    /* renamed from: k */
    public long f138205k;

    /* renamed from: l */
    public int f138206l;

    /* renamed from: m */
    public int f138207m;

    /* renamed from: n */
    public long f138208n;

    /* renamed from: o */
    public bplp f138209o;

    static {
        bpma bpma = new bpma();
        f138193p = bpma;
        bxvk.m124024a(bpma.class, bpma);
    }

    private bpma() {
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
            return bxvk.m124022a(f138193p, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0002\u0000\u0001စ\u0000\u0003\u001b\u0004\u001b\u0005ဂ\u0001\u0006ဂ\u0002\u0007ဂ\u0003\bင\u0004\tင\u0005\nဂ\u0006\u000bဂ\u0007\fင\b\rင\t\u000eဂ\n\u000fဉ\u000b", new Object[]{"a", "b", "c", bpme.class, "d", bpmf.class, "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
        } else if (i2 == 3) {
            return new bpma();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f138193p;
            }
            bxxk bxxk = f138194q;
            if (bxxk == null) {
                synchronized (bpma.class) {
                    bxxk = f138194q;
                    if (bxxk == null) {
                        bxxk = new bxve(f138193p);
                        f138194q = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
