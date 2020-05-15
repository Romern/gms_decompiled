package p000;

/* renamed from: abut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abut extends bxvk implements bxxd {

    /* renamed from: e */
    public static final abut f58463e;

    /* renamed from: f */
    private static volatile bxxk f58464f;

    /* renamed from: a */
    public int f58465a;

    /* renamed from: b */
    public int f58466b;

    /* renamed from: c */
    public abus f58467c;

    /* renamed from: d */
    public int f58468d;

    static {
        abut abut = new abut();
        f58463e = abut;
        bxvk.m124024a(abut.class, abut);
    }

    private abut() {
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
            return bxvk.m124022a(f58463e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဉ\u0001\u0003ဋ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new abut();
        } else {
            if (i2 == 4) {
                return new bxvd(f58463e);
            }
            if (i2 == 5) {
                return f58463e;
            }
            bxxk bxxk = f58464f;
            if (bxxk == null) {
                synchronized (abut.class) {
                    bxxk = f58464f;
                    if (bxxk == null) {
                        bxxk = new bxve(f58463e);
                        f58464f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
