package p000;

/* renamed from: bzwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzwh extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzwh f171621c;

    /* renamed from: d */
    private static volatile bxxk f171622d;

    /* renamed from: a */
    public int f171623a;

    /* renamed from: b */
    public boolean f171624b;

    static {
        bzwh bzwh = new bzwh();
        f171621c = bzwh;
        bxvk.m124024a(bzwh.class, bzwh);
    }

    private bzwh() {
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
            return bxvk.m124022a(f171621c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzwh();
        } else {
            if (i2 == 4) {
                return new bxvd(f171621c);
            }
            if (i2 == 5) {
                return f171621c;
            }
            bxxk bxxk = f171622d;
            if (bxxk == null) {
                synchronized (bzwh.class) {
                    bxxk = f171622d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171621c);
                        f171622d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
