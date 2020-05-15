package p000;

/* renamed from: bkkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkkt extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final bkkt f124621l;

    /* renamed from: m */
    private static volatile bxxk f124622m;

    /* renamed from: a */
    public int f124623a;

    /* renamed from: b */
    public String f124624b = "";

    /* renamed from: c */
    public String f124625c = "";

    /* renamed from: d */
    public String f124626d = "";

    /* renamed from: e */
    public String f124627e = "";

    /* renamed from: f */
    public String f124628f;

    /* renamed from: g */
    public String f124629g;

    /* renamed from: h */
    public bxvt f124630h;

    /* renamed from: i */
    public boolean f124631i;

    /* renamed from: j */
    public bxwc f124632j;

    /* renamed from: k */
    public String f124633k;

    static {
        bkkt bkkt = new bkkt();
        f124621l = bkkt;
        GeneratedMessageLite.m124024a(bkkt.class, bkkt);
    }

    private bkkt() {
        bxxn bxxn = bxxn.f165040b;
        this.f124628f = "";
        this.f124629g = "";
        this.f124630h = bxvm.f164965b;
        this.f124632j = bxxn.f165040b;
        this.f124633k = "";
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
            return GeneratedMessageLite.m124022a(f124621l, "\u0001\n\u0000\u0001\u0002\u0019\n\u0000\u0002\u0000\u0002ဈ\u0000\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\bဈ\u0005\u0011ဈ\u000e\u0012\u001e\u0013ဇ\u000f\u0014\u001a\u0019ဈ\u0012", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", bklo.m106109b(), "i", "j", "k"});
        } else if (i2 == 3) {
            return new bkkt();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (byte[][]) null);
            }
            if (i2 == 5) {
                return f124621l;
            }
            bxxk bxxk = f124622m;
            if (bxxk == null) {
                synchronized (bkkt.class) {
                    bxxk = f124622m;
                    if (bxxk == null) {
                        bxxk = new bxve(f124621l);
                        f124622m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
