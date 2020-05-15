package p000;

/* renamed from: qhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qhg extends GeneratedMessageLite implements bxxd {

    /* renamed from: o */
    public static final qhg f41336o;

    /* renamed from: q */
    private static volatile bxxk f41337q;

    /* renamed from: a */
    public int f41338a;

    /* renamed from: b */
    public qhf f41339b;

    /* renamed from: c */
    public long f41340c;

    /* renamed from: d */
    public bxwc f41341d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f41342e = bxxn.f165040b;

    /* renamed from: f */
    public String f41343f = "";

    /* renamed from: g */
    public String f41344g = "";

    /* renamed from: h */
    public String f41345h = "";

    /* renamed from: i */
    public boolean f41346i;

    /* renamed from: j */
    public int f41347j;

    /* renamed from: k */
    public int f41348k = 1;

    /* renamed from: l */
    public qhj f41349l;

    /* renamed from: m */
    public bxwc f41350m = bxxn.f165040b;

    /* renamed from: n */
    public String f41351n = "";

    /* renamed from: p */
    private byte f41352p = 2;

    static {
        qhg qhg = new qhg();
        f41336o = qhg;
        GeneratedMessageLite.m124024a(qhg.class, qhg);
    }

    private qhg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f41352p);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f41352p = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f41336o, "\u0001\r\u0000\u0001\u0001\u0013\r\u0000\u0003\u0001\u0001ဉ\u0000\u0002ဂ\u0003\u0003Л\u0005\u001a\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0006\tင\b\u000eဌ\n\u000fဉ\u000b\u0010\u001b\u0012ဇ\u0007\u0013ဈ\f", new Object[]{"a", "b", "c", "e", qhk.class, "d", "f", "g", "h", "j", "k", qho.m32179b(), "l", "m", qhu.class, "i", "n"});
        } else if (i2 == 3) {
            return new qhg();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (char[][]) null);
            }
            if (i2 == 5) {
                return f41336o;
            }
            bxxk bxxk = f41337q;
            if (bxxk == null) {
                synchronized (qhg.class) {
                    bxxk = f41337q;
                    if (bxxk == null) {
                        bxxk = new bxve(f41336o);
                        f41337q = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo24050a() {
        if (!this.f41350m.mo73666a()) {
            this.f41350m = GeneratedMessageLite.m124021a(this.f41350m);
        }
    }
}
