package p000;

/* renamed from: vvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vvt extends GeneratedMessageLite implements bxxd {

    /* renamed from: p */
    public static final vvt f50051p;

    /* renamed from: r */
    private static volatile bxxk f50052r;

    /* renamed from: a */
    public int f50053a;

    /* renamed from: b */
    public vvz f50054b;

    /* renamed from: c */
    public bxwc f50055c = bxxn.f165040b;

    /* renamed from: d */
    public String f50056d = "";

    /* renamed from: e */
    public String f50057e = "";

    /* renamed from: f */
    public int f50058f;

    /* renamed from: g */
    public boolean f50059g;

    /* renamed from: h */
    public boolean f50060h;

    /* renamed from: i */
    public bxwc f50061i = bxxn.f165040b;

    /* renamed from: j */
    public ByteString f50062j = ByteString.f164797b;

    /* renamed from: k */
    public int f50063k;

    /* renamed from: l */
    public int f50064l;

    /* renamed from: m */
    public vvy f50065m;

    /* renamed from: n */
    public vwa f50066n;

    /* renamed from: o */
    public int f50067o = 2;

    /* renamed from: q */
    private boolean f50068q;

    static {
        vvt vvt = new vvt();
        f50051p = vvt;
        GeneratedMessageLite.m124024a(vvt.class, vvt);
    }

    private vvt() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m41470a(vvt vvt) {
        vvt.f50053a |= 64;
        vvt.f50068q = true;
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
            return GeneratedMessageLite.m124022a(f50051p, "\u0001\u000f\u0000\u0001\u0001\u0017\u000f\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဈ\u0002\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\t\u001c\nည\u0007\u000bဋ\b\fဉ\n\rင\u0003\u000eဈ\u0001\u0011ဋ\t\u0012ဉ\u000b\u0017ဌ\f", new Object[]{"a", "b", "c", vvv.class, "e", "g", "h", "q", "i", "j", "k", "m", "f", "d", "l", "n", "o", vvr.f50050a});
        } else if (i2 == 3) {
            return new vvt();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f50051p;
            }
            bxxk bxxk = f50052r;
            if (bxxk == null) {
                synchronized (vvt.class) {
                    bxxk = f50052r;
                    if (bxxk == null) {
                        bxxk = new bxve(f50051p);
                        f50052r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
