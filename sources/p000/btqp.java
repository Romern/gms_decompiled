package p000;

/* renamed from: btqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btqp extends bxvk implements bxxd {

    /* renamed from: o */
    public static final btqp f149992o;

    /* renamed from: p */
    private static volatile bxxk f149993p;

    /* renamed from: a */
    public String f149994a = "";

    /* renamed from: b */
    public btiy f149995b;

    /* renamed from: c */
    public bxyk f149996c;

    /* renamed from: d */
    public btqq f149997d;

    /* renamed from: e */
    public bxwc f149998e;

    /* renamed from: f */
    public bozw f149999f;

    /* renamed from: g */
    public btql f150000g;

    /* renamed from: h */
    public btqn f150001h;

    /* renamed from: i */
    public bxwc f150002i;

    /* renamed from: j */
    public String f150003j;

    /* renamed from: k */
    public int f150004k;

    /* renamed from: l */
    public int f150005l;

    /* renamed from: m */
    public bxwc f150006m;

    /* renamed from: n */
    public int f150007n;

    static {
        btqp btqp = new btqp();
        f149992o = btqp;
        bxvk.m124024a(btqp.class, btqp);
    }

    private btqp() {
        bxxn bxxn = bxxn.f165040b;
        this.f149998e = bxxn.f165040b;
        this.f150002i = bxxn.f165040b;
        this.f150003j = "";
        this.f150006m = bxxn.f165040b;
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
            return bxvk.m124022a(f149992o, "\u0000\u000e\u0000\u0000\u0001\u0011\u000e\u0000\u0003\u0000\u0001Ȉ\u0003\t\u0004\t\u0005\t\u0006\u001b\u0007\t\b\t\t\t\nȈ\u000b\f\r\f\u000fȚ\u0010\f\u0011\u001b", new Object[]{"a", "b", "c", "d", "e", boxe.class, "f", "g", "h", "j", "k", "l", "m", "n", "i", btqn.class});
        } else if (i2 == 3) {
            return new btqp();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f149992o;
            }
            bxxk bxxk = f149993p;
            if (bxxk == null) {
                synchronized (btqp.class) {
                    bxxk = f149993p;
                    if (bxxk == null) {
                        bxxk = new bxve(f149992o);
                        f149993p = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
