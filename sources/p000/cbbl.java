package p000;

/* renamed from: cbbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbbl extends GeneratedMessageLite implements bxxd {

    /* renamed from: p */
    public static final cbbl f176575p;

    /* renamed from: q */
    private static volatile bxxk f176576q;

    /* renamed from: a */
    public cbma f176577a;

    /* renamed from: b */
    public String f176578b = "";

    /* renamed from: c */
    public String f176579c = "";

    /* renamed from: d */
    public String f176580d = "";

    /* renamed from: e */
    public bxte f176581e;

    /* renamed from: f */
    public bxwc f176582f = bxxn.f165040b;

    /* renamed from: g */
    public boolean f176583g;

    /* renamed from: h */
    public String f176584h = "";

    /* renamed from: i */
    public String f176585i = "";

    /* renamed from: j */
    public String f176586j = "";

    /* renamed from: k */
    public cbds f176587k;

    /* renamed from: l */
    public bxvw f176588l = bxwq.f165002b;

    /* renamed from: m */
    public bxww f176589m = bxww.f165013b;

    /* renamed from: n */
    public bxww f176590n = bxww.f165013b;

    /* renamed from: o */
    public long f176591o;

    static {
        cbbl cbbl = new cbbl();
        f176575p = cbbl;
        GeneratedMessageLite.m124024a(cbbl.class, cbbl);
    }

    private cbbl() {
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
            return GeneratedMessageLite.m124022a(f176575p, "\u0000\u000f\u0000\u0000\u0001\u0014\u000f\u0002\u0002\u0000\u0001\t\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\t\u0007\u001b\b\u0007\tȈ\fȈ\rȈ\u000e\t\u000f%\u00102\u00132\u0014\u0002", new Object[]{"a", "b", "c", "d", "e", "f", cbbp.class, "g", "h", "i", "j", "k", "l", "m", cbbk.f176574a, "n", cbbj.f176573a, "o"});
        } else if (i2 == 3) {
            return new cbbl();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (boolean[][][]) null);
            }
            if (i2 == 5) {
                return f176575p;
            }
            bxxk bxxk = f176576q;
            if (bxxk == null) {
                synchronized (cbbl.class) {
                    bxxk = f176576q;
                    if (bxxk == null) {
                        bxxk = new bxve(f176575p);
                        f176576q = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
