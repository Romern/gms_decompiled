package p000;

/* renamed from: dme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dme extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final dme f13503d;

    /* renamed from: e */
    private static volatile bxxk f13504e;

    /* renamed from: a */
    public int f13505a;

    /* renamed from: b */
    public String f13506b = "";

    /* renamed from: c */
    public int f13507c;

    static {
        dme dme = new dme();
        f13503d = dme;
        GeneratedMessageLite.m124024a(dme.class, dme);
    }

    private dme() {
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
            return GeneratedMessageLite.m124022a(f13503d, "\u0001\u0002\u0000\u0001\u0001\u001e\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u001eင\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new dme();
        } else {
            if (i2 == 4) {
                return new bxvd(f13503d);
            }
            if (i2 == 5) {
                return f13503d;
            }
            bxxk bxxk = f13504e;
            if (bxxk == null) {
                synchronized (dme.class) {
                    bxxk = f13504e;
                    if (bxxk == null) {
                        bxxk = new bxve(f13503d);
                        f13504e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
