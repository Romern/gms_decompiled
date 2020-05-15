package p000;

/* renamed from: btrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btrb extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final btrb f150056k;

    /* renamed from: l */
    private static volatile bxxk f150057l;

    /* renamed from: a */
    public String f150058a = "";

    /* renamed from: b */
    public btmy f150059b;

    /* renamed from: c */
    public String f150060c = "";

    /* renamed from: d */
    public String f150061d = "";

    /* renamed from: e */
    public btrc f150062e;

    /* renamed from: f */
    public btrd f150063f;

    /* renamed from: g */
    public int f150064g;

    /* renamed from: h */
    public btqk f150065h;

    /* renamed from: i */
    public String f150066i = "";

    /* renamed from: j */
    public int f150067j;

    static {
        btrb btrb = new btrb();
        f150056k = btrb;
        GeneratedMessageLite.m124024a(btrb.class, btrb);
    }

    private btrb() {
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
            return GeneratedMessageLite.m124022a(f150056k, "\u0000\n\u0000\u0000\u0001\r\n\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003Ȉ\u0004Ȉ\u0006\t\u0007\t\t\f\n\t\u000bȈ\r\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new btrb();
        } else {
            if (i2 == 4) {
                return new bxvd(f150056k);
            }
            if (i2 == 5) {
                return f150056k;
            }
            bxxk bxxk = f150057l;
            if (bxxk == null) {
                synchronized (btrb.class) {
                    bxxk = f150057l;
                    if (bxxk == null) {
                        bxxk = new bxve(f150056k);
                        f150057l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
