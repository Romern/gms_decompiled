package p000;

/* renamed from: bwsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwsj extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bwsj f160868h;

    /* renamed from: i */
    public static final bxvj f160869i;

    /* renamed from: k */
    private static volatile bxxk f160870k;

    /* renamed from: a */
    public int f160871a;

    /* renamed from: b */
    public String f160872b = "";

    /* renamed from: c */
    public String f160873c = "";

    /* renamed from: d */
    public String f160874d = "";

    /* renamed from: e */
    public String f160875e = "";

    /* renamed from: f */
    public bxwc f160876f = bxxn.f165040b;

    /* renamed from: g */
    public String f160877g = "";

    /* renamed from: j */
    private boolean f160878j;

    static {
        bwsj bwsj = new bwsj();
        f160868h = bwsj;
        bxvk.m124024a(bwsj.class, bwsj);
        bwny bwny = bwny.f160414k;
        bwsj bwsj2 = f160868h;
        f160869i = bxvk.m124006a(bwny, bwsj2, bwsj2, 254667699, bxzf.MESSAGE);
    }

    private bwsj() {
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
            return bxvk.m124022a(f160868h, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006\u001a\u0007ဈ\u0005\bဇ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "j"});
        } else if (i2 == 3) {
            return new bwsj();
        } else {
            if (i2 == 4) {
                return new bxvd(f160868h);
            }
            if (i2 == 5) {
                return f160868h;
            }
            bxxk bxxk = f160870k;
            if (bxxk == null) {
                synchronized (bwsj.class) {
                    bxxk = f160870k;
                    if (bxxk == null) {
                        bxxk = new bxve(f160868h);
                        f160870k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
