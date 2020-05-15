package p000;

/* renamed from: cbrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbrh extends GeneratedMessageLite implements bxxd {

    /* renamed from: t */
    public static final cbrh f178114t;

    /* renamed from: u */
    private static volatile bxxk f178115u;

    /* renamed from: a */
    public int f178116a;

    /* renamed from: b */
    public int f178117b;

    /* renamed from: c */
    public String f178118c = "";

    /* renamed from: d */
    public cbrd f178119d;

    /* renamed from: e */
    public cbrd f178120e;

    /* renamed from: f */
    public int f178121f;

    /* renamed from: g */
    public int f178122g;

    /* renamed from: h */
    public int f178123h;

    /* renamed from: i */
    public int f178124i;

    /* renamed from: j */
    public int f178125j;

    /* renamed from: k */
    public int f178126k;

    /* renamed from: l */
    public int f178127l;

    /* renamed from: m */
    public boolean f178128m;

    /* renamed from: n */
    public String f178129n = "";

    /* renamed from: o */
    public int f178130o;

    /* renamed from: p */
    public bxwc f178131p = bxxn.f165040b;

    /* renamed from: q */
    public bxwc f178132q = bxxn.f165040b;

    /* renamed from: r */
    public bxwc f178133r = bxxn.f165040b;

    /* renamed from: s */
    public bxwc f178134s = bxxn.f165040b;

    static {
        cbrh cbrh = new cbrh();
        f178114t = cbrh;
        GeneratedMessageLite.m124024a(cbrh.class, cbrh);
    }

    private cbrh() {
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
            return GeneratedMessageLite.m124022a(f178114t, "\u0000\u0013\u0000\u0000\u0001\u0015\u0013\u0000\u0004\u0000\u0001\f\u0002Ȉ\u0003\t\u0004\t\u0005\f\u0006\f\u0007\f\b\u0004\t\u0004\u000b\f\f\f\r\f\u000fȈ\u0010\f\u0011\u001b\u0012\u001b\u0013\u001b\u0014\u001b\u0015\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "k", "l", "i", "j", "a", "n", "o", "p", cbox.class, "q", cbov.class, "r", cbpa.class, "s", cbpb.class, "m"});
        } else if (i2 == 3) {
            return new cbrh();
        } else {
            if (i2 == 4) {
                return new cbre();
            }
            if (i2 == 5) {
                return f178114t;
            }
            bxxk bxxk = f178115u;
            if (bxxk == null) {
                synchronized (cbrh.class) {
                    bxxk = f178115u;
                    if (bxxk == null) {
                        bxxk = new bxve(f178114t);
                        f178115u = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
