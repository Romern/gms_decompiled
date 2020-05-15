package p000;

/* renamed from: bord */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bord extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bord f134384h;

    /* renamed from: i */
    private static volatile bxxk f134385i;

    /* renamed from: a */
    public int f134386a;

    /* renamed from: b */
    public long f134387b;

    /* renamed from: c */
    public long f134388c;

    /* renamed from: d */
    public long f134389d;

    /* renamed from: e */
    public long f134390e;

    /* renamed from: f */
    public long f134391f;

    /* renamed from: g */
    public long f134392g;

    static {
        bord bord = new bord();
        f134384h = bord;
        bxvk.m124024a(bord.class, bord);
    }

    private bord() {
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
            return bxvk.m124022a(f134384h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bord();
        } else {
            if (i2 == 4) {
                return new bxvd(f134384h);
            }
            if (i2 == 5) {
                return f134384h;
            }
            bxxk bxxk = f134385i;
            if (bxxk == null) {
                synchronized (bord.class) {
                    bxxk = f134385i;
                    if (bxxk == null) {
                        bxxk = new bxve(f134384h);
                        f134385i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
