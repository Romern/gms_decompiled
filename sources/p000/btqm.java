package p000;

/* renamed from: btqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btqm extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btqm f149980e;

    /* renamed from: f */
    private static volatile bxxk f149981f;

    /* renamed from: a */
    public long f149982a;

    /* renamed from: b */
    public int f149983b;

    /* renamed from: c */
    public int f149984c;

    /* renamed from: d */
    public boolean f149985d;

    static {
        btqm btqm = new btqm();
        f149980e = btqm;
        bxvk.m124024a(btqm.class, btqm);
    }

    private btqm() {
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
            return bxvk.m124022a(f149980e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0005\u0002\u000f\u0003\f\u0004\u0007", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btqm();
        } else {
            if (i2 == 4) {
                return new bxvd(f149980e);
            }
            if (i2 == 5) {
                return f149980e;
            }
            bxxk bxxk = f149981f;
            if (bxxk == null) {
                synchronized (btqm.class) {
                    bxxk = f149981f;
                    if (bxxk == null) {
                        bxxk = new bxve(f149980e);
                        f149981f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
