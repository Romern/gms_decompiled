package p000;

/* renamed from: bqid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqid extends GeneratedMessageLite implements bxxd {

    /* renamed from: r */
    public static final bqid f140771r;

    /* renamed from: s */
    private static volatile bxxk f140772s;

    /* renamed from: a */
    public String f140773a = "";

    /* renamed from: b */
    public String f140774b = "";

    /* renamed from: c */
    public int f140775c;

    /* renamed from: d */
    public String f140776d = "";

    /* renamed from: e */
    public bxyk f140777e;

    /* renamed from: f */
    public int f140778f;

    /* renamed from: g */
    public int f140779g;

    /* renamed from: h */
    public String f140780h = "";

    /* renamed from: i */
    public String f140781i = "";

    /* renamed from: j */
    public String f140782j = "";

    /* renamed from: k */
    public String f140783k = "";

    /* renamed from: l */
    public boolean f140784l;

    /* renamed from: m */
    public boolean f140785m;

    /* renamed from: n */
    public boolean f140786n;

    /* renamed from: o */
    public int f140787o;

    /* renamed from: p */
    public bxwc f140788p = bxxn.f165040b;

    /* renamed from: q */
    public String f140789q = "";

    static {
        bqid bqid = new bqid();
        f140771r = bqid;
        GeneratedMessageLite.m124024a(bqid.class, bqid);
    }

    private bqid() {
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
            return GeneratedMessageLite.m124022a(f140771r, "\u0000\u0011\u0000\u0000\u0001\u0016\u0011\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004Ȉ\u0005\t\u0006\f\u0007Ȉ\bȈ\tȈ\nȈ\u000b\u0007\u0010\u0007\u0011\u0007\u0013\f\u0014\u001b\u0015Ȉ\u0016\f", new Object[]{"a", "b", "c", "d", "e", "f", "h", "i", "j", "k", "l", "m", "n", "o", "p", bqic.class, "q", "g"});
        } else if (i2 == 3) {
            return new bqid();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (byte[][][]) null);
            }
            if (i2 == 5) {
                return f140771r;
            }
            bxxk bxxk = f140772s;
            if (bxxk == null) {
                synchronized (bqid.class) {
                    bxxk = f140772s;
                    if (bxxk == null) {
                        bxxk = new bxve(f140771r);
                        f140772s = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
