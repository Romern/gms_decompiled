package p000;

/* renamed from: btqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btqg extends bxvk implements bxxd {

    /* renamed from: q */
    public static final btqg f149933q;

    /* renamed from: r */
    private static volatile bxxk f149934r;

    /* renamed from: a */
    public int f149935a;

    /* renamed from: b */
    public String f149936b = "";

    /* renamed from: c */
    public String f149937c = "";

    /* renamed from: d */
    public String f149938d = "";

    /* renamed from: e */
    public String f149939e = "";

    /* renamed from: f */
    public int f149940f;

    /* renamed from: g */
    public String f149941g = "";

    /* renamed from: h */
    public String f149942h = "";

    /* renamed from: i */
    public boolean f149943i;

    /* renamed from: j */
    public bmtv f149944j;

    /* renamed from: k */
    public bmum f149945k;

    /* renamed from: l */
    public String f149946l = "";

    /* renamed from: m */
    public int f149947m;

    /* renamed from: n */
    public String f149948n = "";

    /* renamed from: o */
    public boolean f149949o;

    /* renamed from: p */
    public String f149950p = "";

    static {
        btqg btqg = new btqg();
        f149933q = btqg;
        bxvk.m124024a(btqg.class, btqg);
    }

    private btqg() {
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
            return bxvk.m124022a(f149933q, "\u0000\u0010\u0000\u0000\u0001\u0010\u0010\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0004\u0007Ȉ\b\u0007\t\t\nȈ\u000b\t\fȈ\r\u0004\u000eȈ\u000f\u0007\u0010Ȉ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "i", "j", "h", "k", "l", "m", "n", "o", "p"});
        } else if (i2 == 3) {
            return new btqg();
        } else {
            if (i2 == 4) {
                return new bxvd(f149933q);
            }
            if (i2 == 5) {
                return f149933q;
            }
            bxxk bxxk = f149934r;
            if (bxxk == null) {
                synchronized (btqg.class) {
                    bxxk = f149934r;
                    if (bxxk == null) {
                        bxxk = new bxve(f149933q);
                        f149934r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
