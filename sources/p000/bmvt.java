package p000;

/* renamed from: bmvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmvt extends bxvk implements bxxd {

    /* renamed from: n */
    public static final bmvt f131089n;

    /* renamed from: o */
    private static volatile bxxk f131090o;

    /* renamed from: a */
    public int f131091a;

    /* renamed from: b */
    public String f131092b = "";

    /* renamed from: c */
    public String f131093c = "";

    /* renamed from: d */
    public long f131094d;

    /* renamed from: e */
    public int f131095e;

    /* renamed from: f */
    public bmuy f131096f;

    /* renamed from: g */
    public bxwc f131097g = bxxn.f165040b;

    /* renamed from: h */
    public bmvp f131098h;

    /* renamed from: i */
    public bxwc f131099i = bxxn.f165040b;

    /* renamed from: j */
    public bmvk f131100j;

    /* renamed from: k */
    public bxwc f131101k = bxxn.f165040b;

    /* renamed from: l */
    public bxwc f131102l = bxxn.f165040b;

    /* renamed from: m */
    public bmvn f131103m;

    static {
        bmvt bmvt = new bmvt();
        f131089n = bmvt;
        bxvk.m124024a(bmvt.class, bmvt);
    }

    private bmvt() {
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
            return bxvk.m124022a(f131089n, "\u0001\f\u0000\u0001\u0001h\f\u0000\u0004\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0006ဂ\u0002\u0007ဌ\u0003\u000bဉ\u0004\f\u001b\rဉ\u0005\u0010\u001beဉ\ff\u001bg\u001bhဉ\r", new Object[]{"a", "b", "c", "d", "e", bmvr.f131088a, "f", "g", bmvv.class, "h", "i", bmvb.class, "j", "k", bmvj.class, "l", bmvo.class, "m"});
        } else if (i2 == 3) {
            return new bmvt();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (float[][]) null);
            }
            if (i2 == 5) {
                return f131089n;
            }
            bxxk bxxk = f131090o;
            if (bxxk == null) {
                synchronized (bmvt.class) {
                    bxxk = f131090o;
                    if (bxxk == null) {
                        bxxk = new bxve(f131089n);
                        f131090o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
