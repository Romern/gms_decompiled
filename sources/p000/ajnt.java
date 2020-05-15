package p000;

/* renamed from: ajnt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajnt extends bxvk implements bxxd {

    /* renamed from: e */
    public static final ajnt f71007e;

    /* renamed from: f */
    private static volatile bxxk f71008f;

    /* renamed from: a */
    public int f71009a;

    /* renamed from: b */
    public String f71010b = "";

    /* renamed from: c */
    public int f71011c;

    /* renamed from: d */
    public long f71012d;

    static {
        ajnt ajnt = new ajnt();
        f71007e = ajnt;
        bxvk.m124024a(ajnt.class, ajnt);
    }

    private ajnt() {
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
            return bxvk.m124022a(f71007e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဌ\u0001\u0004ဂ\u0002", new Object[]{"a", "b", "c", ajnr.f71006a, "d"});
        } else if (i2 == 3) {
            return new ajnt();
        } else {
            if (i2 == 4) {
                return new bxvd(f71007e);
            }
            if (i2 == 5) {
                return f71007e;
            }
            bxxk bxxk = f71008f;
            if (bxxk == null) {
                synchronized (ajnt.class) {
                    bxxk = f71008f;
                    if (bxxk == null) {
                        bxxk = new bxve(f71007e);
                        f71008f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
