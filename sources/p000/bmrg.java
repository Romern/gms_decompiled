package p000;

/* renamed from: bmrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmrg extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmrg f130485d;

    /* renamed from: e */
    private static volatile bxxk f130486e;

    /* renamed from: a */
    public int f130487a;

    /* renamed from: b */
    public bmbs f130488b;

    /* renamed from: c */
    public bmeu f130489c;

    static {
        bmrg bmrg = new bmrg();
        f130485d = bmrg;
        bxvk.m124024a(bmrg.class, bmrg);
    }

    private bmrg() {
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
            return bxvk.m124022a(f130485d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmrg();
        } else {
            if (i2 == 4) {
                return new bxvd(f130485d);
            }
            if (i2 == 5) {
                return f130485d;
            }
            bxxk bxxk = f130486e;
            if (bxxk == null) {
                synchronized (bmrg.class) {
                    bxxk = f130486e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130485d);
                        f130486e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
