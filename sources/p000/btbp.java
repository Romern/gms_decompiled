package p000;

/* renamed from: btbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btbp extends bxvk implements bxxd {

    /* renamed from: l */
    public static final btbp f148186l;

    /* renamed from: m */
    private static volatile bxxk f148187m;

    /* renamed from: a */
    public long f148188a;

    /* renamed from: b */
    public String f148189b = "";

    /* renamed from: c */
    public bzrw f148190c;

    /* renamed from: d */
    public int f148191d;

    /* renamed from: e */
    public bxyk f148192e;

    /* renamed from: f */
    public String f148193f = "";

    /* renamed from: g */
    public String f148194g = "";

    /* renamed from: h */
    public bzrw f148195h;

    /* renamed from: i */
    public bzrw f148196i;

    /* renamed from: j */
    public bzrw f148197j;

    /* renamed from: k */
    public String f148198k = "";

    static {
        btbp btbp = new btbp();
        f148186l = btbp;
        bxvk.m124024a(btbp.class, btbp);
    }

    private btbp() {
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
            return bxvk.m124022a(f148186l, "\u0000\u000b\u0000\u0000\u0001\f\u000b\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0004\t\u0005\f\u0006\t\u0007Ȉ\bȈ\t\t\n\t\u000b\t\fȈ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new btbp();
        } else {
            if (i2 == 4) {
                return new bxvd(f148186l);
            }
            if (i2 == 5) {
                return f148186l;
            }
            bxxk bxxk = f148187m;
            if (bxxk == null) {
                synchronized (btbp.class) {
                    bxxk = f148187m;
                    if (bxxk == null) {
                        bxxk = new bxve(f148186l);
                        f148187m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
