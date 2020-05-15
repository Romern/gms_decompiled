package p000;

/* renamed from: bwpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwpo extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bwpo f160582e;

    /* renamed from: f */
    public static final bxvj f160583f;

    /* renamed from: h */
    private static volatile bxxk f160584h;

    /* renamed from: a */
    public String f160585a = "";

    /* renamed from: b */
    public boolean f160586b;

    /* renamed from: c */
    public bwpn f160587c;

    /* renamed from: d */
    public boolean f160588d;

    /* renamed from: g */
    private int f160589g;

    static {
        bwpo bwpo = new bwpo();
        f160582e = bwpo;
        GeneratedMessageLite.m124024a(bwpo.class, bwpo);
        bwny bwny = bwny.f160414k;
        bwpo bwpo2 = f160582e;
        f160583f = GeneratedMessageLite.m124006a(bwny, bwpo2, bwpo2, 284093889, bxzf.MESSAGE);
    }

    private bwpo() {
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
            return GeneratedMessageLite.m124022a(f160582e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဇ\u0002\u0004ဉ\u0003\u0005ဇ\u0004", new Object[]{"g", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bwpo();
        } else {
            if (i2 == 4) {
                return new bxvd(f160582e);
            }
            if (i2 == 5) {
                return f160582e;
            }
            bxxk bxxk = f160584h;
            if (bxxk == null) {
                synchronized (bwpo.class) {
                    bxxk = f160584h;
                    if (bxxk == null) {
                        bxxk = new bxve(f160582e);
                        f160584h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
