package p000;

/* renamed from: bqhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqhy extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bqhy f140744f;

    /* renamed from: g */
    private static volatile bxxk f140745g;

    /* renamed from: a */
    public int f140746a;

    /* renamed from: b */
    public int f140747b;

    /* renamed from: c */
    public String f140748c = "";

    /* renamed from: d */
    public int f140749d;

    /* renamed from: e */
    public boolean f140750e;

    static {
        bqhy bqhy = new bqhy();
        f140744f = bqhy;
        bxvk.m124024a(bqhy.class, bqhy);
    }

    private bqhy() {
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
            return bxvk.m124022a(f140744f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\f\u0003Ȉ\u0004\f\u0005\u0007", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bqhy();
        } else {
            if (i2 == 4) {
                return new bxvd(f140744f);
            }
            if (i2 == 5) {
                return f140744f;
            }
            bxxk bxxk = f140745g;
            if (bxxk == null) {
                synchronized (bqhy.class) {
                    bxxk = f140745g;
                    if (bxxk == null) {
                        bxxk = new bxve(f140744f);
                        f140745g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
