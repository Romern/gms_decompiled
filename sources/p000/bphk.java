package p000;

/* renamed from: bphk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bphk extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bphk f137655g;

    /* renamed from: h */
    private static volatile bxxk f137656h;

    /* renamed from: a */
    public int f137657a;

    /* renamed from: b */
    public int f137658b;

    /* renamed from: c */
    public String f137659c = "";

    /* renamed from: d */
    public String f137660d = "";

    /* renamed from: e */
    public int f137661e;

    /* renamed from: f */
    public int f137662f;

    static {
        bphk bphk = new bphk();
        f137655g = bphk;
        bxvk.m124024a(bphk.class, bphk);
    }

    private bphk() {
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
            return bxvk.m124022a(f137655g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", bphy.f137713a, "c", "d", "e", bphj.f137654a, "f", bphi.f137653a});
        } else if (i2 == 3) {
            return new bphk();
        } else {
            if (i2 == 4) {
                return new bxvd(f137655g);
            }
            if (i2 == 5) {
                return f137655g;
            }
            bxxk bxxk = f137656h;
            if (bxxk == null) {
                synchronized (bphk.class) {
                    bxxk = f137656h;
                    if (bxxk == null) {
                        bxxk = new bxve(f137655g);
                        f137656h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
