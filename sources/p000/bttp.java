package p000;

/* renamed from: bttp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bttp extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bttp f150373j;

    /* renamed from: k */
    private static volatile bxxk f150374k;

    /* renamed from: a */
    public int f150375a;

    /* renamed from: b */
    public bzvu f150376b;

    /* renamed from: c */
    public bxwc f150377c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f150378d;

    /* renamed from: e */
    public bttg f150379e;

    /* renamed from: f */
    public ByteString f150380f;

    /* renamed from: g */
    public bxwc f150381g;

    /* renamed from: h */
    public String f150382h;

    /* renamed from: i */
    public bxwc f150383i;

    static {
        bttp bttp = new bttp();
        f150373j = bttp;
        GeneratedMessageLite.m124024a(bttp.class, bttp);
    }

    private bttp() {
        ByteString bxtx = bxtx.f164797b;
        this.f150378d = bxxn.f165040b;
        this.f150380f = bxtx.f164797b;
        this.f150381g = bxxn.f165040b;
        this.f150382h = "";
        this.f150383i = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f150373j, "\u0001\b\u0000\u0001\u0001\u000e\b\u0000\u0004\u0000\u0001ဉ\u0000\u0002\u001b\u0004\u001b\u0006ဉ\u0004\u0007ည\u0006\b\u001b\nဈ\u0007\u000e\u001b", new Object[]{"a", "b", "c", btsd.class, "d", btru.class, "e", "f", "g", bttm.class, "h", "i", bttj.class});
        } else if (i2 == 3) {
            return new bttp();
        } else {
            if (i2 == 4) {
                return new bxvd(f150373j);
            }
            if (i2 == 5) {
                return f150373j;
            }
            bxxk bxxk = f150374k;
            if (bxxk == null) {
                synchronized (bttp.class) {
                    bxxk = f150374k;
                    if (bxxk == null) {
                        bxxk = new bxve(f150373j);
                        f150374k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
