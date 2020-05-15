package p000;

/* renamed from: lsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lsz extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final lsz f32870k;

    /* renamed from: m */
    private static volatile bxxk f32871m;

    /* renamed from: a */
    public int f32872a;

    /* renamed from: b */
    public String f32873b = "";

    /* renamed from: c */
    public String f32874c = "";

    /* renamed from: d */
    public lsx f32875d;

    /* renamed from: e */
    public bxwc f32876e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f32877f = bxxn.f165040b;

    /* renamed from: g */
    public bxwc f32878g = bxxn.f165040b;

    /* renamed from: h */
    public lss f32879h;

    /* renamed from: i */
    public String f32880i = "";

    /* renamed from: j */
    public int f32881j;

    /* renamed from: l */
    private byte f32882l = 2;

    static {
        lsz lsz = new lsz();
        f32870k = lsz;
        GeneratedMessageLite.m124024a(lsz.class, lsz);
    }

    private lsz() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f32882l);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f32882l = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f32870k, "\u0001\t\u0000\u0001\u0003#\t\u0000\u0003\u0003\u0003ᔈ\u0000\u0004ထ\u0002\u0006Л\u0007б\n1\u0014ဈ\u0001 ဉ\u0003!ဈ\u0004#ဌ\u0005", new Object[]{"a", "b", "d", "g", ltr.class, "e", lsy.class, "f", lsw.class, "c", "h", "i", "j", lsq.f32850a});
        } else if (i2 == 3) {
            return new lsz();
        } else {
            if (i2 == 4) {
                return new bxvd(f32870k);
            }
            if (i2 == 5) {
                return f32870k;
            }
            bxxk bxxk = f32871m;
            if (bxxk == null) {
                synchronized (lsz.class) {
                    bxxk = f32871m;
                    if (bxxk == null) {
                        bxxk = new bxve(f32870k);
                        f32871m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo19596a() {
        if (!this.f32877f.mo73666a()) {
            this.f32877f = GeneratedMessageLite.m124021a(this.f32877f);
        }
    }
}
