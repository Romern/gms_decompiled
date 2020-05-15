package p000;

/* renamed from: bkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bkk f4980d;

    /* renamed from: e */
    private static volatile bxxk f4981e;

    /* renamed from: a */
    public int f4982a;

    /* renamed from: b */
    public long f4983b;

    /* renamed from: c */
    public long f4984c;

    static {
        bkk bkk = new bkk();
        f4980d = bkk;
        bxvk.m124024a(bkk.class, bkk);
    }

    private bkk() {
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
            return bxvk.m124022a(f4980d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဂ\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bkk();
        } else {
            if (i2 == 4) {
                return new bxvd(f4980d);
            }
            if (i2 == 5) {
                return f4980d;
            }
            bxxk bxxk = f4981e;
            if (bxxk == null) {
                synchronized (bkk.class) {
                    bxxk = f4981e;
                    if (bxxk == null) {
                        bxxk = new bxve(f4980d);
                        f4981e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
