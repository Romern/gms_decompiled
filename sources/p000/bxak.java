package p000;

/* renamed from: bxak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxak extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bxak f161705e;

    /* renamed from: f */
    public static final bxvj f161706f;

    /* renamed from: g */
    private static volatile bxxk f161707g;

    /* renamed from: a */
    public int f161708a;

    /* renamed from: b */
    public bwtd f161709b;

    /* renamed from: c */
    public bwtd f161710c;

    /* renamed from: d */
    public String f161711d = "";

    static {
        bxak bxak = new bxak();
        f161705e = bxak;
        bxvk.m124024a(bxak.class, bxak);
        bwny bwny = bwny.f160414k;
        bxak bxak2 = f161705e;
        f161706f = bxvk.m124006a(bwny, bxak2, bxak2, 255478363, bxzf.MESSAGE);
    }

    private bxak() {
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
            return bxvk.m124022a(f161705e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bxak();
        } else {
            if (i2 == 4) {
                return new bxvd(f161705e);
            }
            if (i2 == 5) {
                return f161705e;
            }
            bxxk bxxk = f161707g;
            if (bxxk == null) {
                synchronized (bxak.class) {
                    bxxk = f161707g;
                    if (bxxk == null) {
                        bxxk = new bxve(f161705e);
                        f161707g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
