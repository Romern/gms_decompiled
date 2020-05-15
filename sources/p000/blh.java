package p000;

/* renamed from: blh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blh extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final blh f5093g;

    /* renamed from: h */
    private static volatile bxxk f5094h;

    /* renamed from: a */
    public int f5095a;

    /* renamed from: b */
    public long f5096b;

    /* renamed from: c */
    public long f5097c;

    /* renamed from: d */
    public int f5098d;

    /* renamed from: e */
    public boolean f5099e;

    /* renamed from: f */
    public int f5100f;

    static {
        blh blh = new blh();
        f5093g = blh;
        GeneratedMessageLite.m124024a(blh.class, blh);
    }

    private blh() {
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
            return GeneratedMessageLite.m124022a(f5093g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003င\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new blh();
        } else {
            if (i2 == 4) {
                return new bxvd(f5093g);
            }
            if (i2 == 5) {
                return f5093g;
            }
            bxxk bxxk = f5094h;
            if (bxxk == null) {
                synchronized (blh.class) {
                    bxxk = f5094h;
                    if (bxxk == null) {
                        bxxk = new bxve(f5093g);
                        f5094h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
