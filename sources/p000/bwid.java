package p000;

/* renamed from: bwid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwid extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bwid f159618e;

    /* renamed from: f */
    private static volatile bxxk f159619f;

    /* renamed from: a */
    public int f159620a;

    /* renamed from: b */
    public bwiu f159621b;

    /* renamed from: c */
    public bmnr f159622c;

    /* renamed from: d */
    public long f159623d;

    static {
        bwid bwid = new bwid();
        f159618e = bwid;
        bxvk.m124024a(bwid.class, bwid);
    }

    private bwid() {
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
            return bxvk.m124022a(f159618e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001\u0004ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bwid();
        } else {
            if (i2 == 4) {
                return new bxvd(f159618e);
            }
            if (i2 == 5) {
                return f159618e;
            }
            bxxk bxxk = f159619f;
            if (bxxk == null) {
                synchronized (bwid.class) {
                    bxxk = f159619f;
                    if (bxxk == null) {
                        bxxk = new bxve(f159618e);
                        f159619f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
