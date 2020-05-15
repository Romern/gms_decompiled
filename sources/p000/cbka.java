package p000;

/* renamed from: cbka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbka extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbka f177382c;

    /* renamed from: d */
    private static volatile bxxk f177383d;

    /* renamed from: a */
    public int f177384a = 0;

    /* renamed from: b */
    public Object f177385b;

    static {
        cbka cbka = new cbka();
        f177382c = cbka;
        GeneratedMessageLite.m124024a(cbka.class, cbka);
    }

    private cbka() {
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
            return GeneratedMessageLite.m124022a(f177382c, "\u0000\u0007\u0001\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"b", "a", cbkj.class, cbjx.class, cbjv.class, cbjz.class, cbju.class, cbjw.class, cbjy.class});
        } else if (i2 == 3) {
            return new cbka();
        } else {
            if (i2 == 4) {
                return new bxvd(f177382c);
            }
            if (i2 == 5) {
                return f177382c;
            }
            bxxk bxxk = f177383d;
            if (bxxk == null) {
                synchronized (cbka.class) {
                    bxxk = f177383d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177382c);
                        f177383d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
