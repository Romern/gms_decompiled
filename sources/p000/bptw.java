package p000;

/* renamed from: bptw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bptw extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bptw f139192c;

    /* renamed from: g */
    private static volatile bxxk f139193g;

    /* renamed from: a */
    public int f139194a;

    /* renamed from: b */
    public long f139195b;

    /* renamed from: d */
    private int f139196d;

    /* renamed from: e */
    private int f139197e;

    /* renamed from: f */
    private byte f139198f = 2;

    static {
        bptw bptw = new bptw();
        f139192c = bptw;
        bxvk.m124024a(bptw.class, bptw);
    }

    private bptw() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m112278a(bptw bptw) {
        bptw.f139194a |= 2;
        bptw.f139196d = 0;
    }

    /* renamed from: b */
    public static /* synthetic */ void m112279b(bptw bptw) {
        bptw.f139194a |= 4;
        bptw.f139197e = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f139198f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f139198f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f139192c, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔂ\u0000\u0002ᔆ\u0001\u0003ᔆ\u0002", new Object[]{"a", "b", "d", "e"});
        } else if (i2 == 3) {
            return new bptw();
        } else {
            if (i2 == 4) {
                return new bxvd(f139192c);
            }
            if (i2 == 5) {
                return f139192c;
            }
            bxxk bxxk = f139193g;
            if (bxxk == null) {
                synchronized (bptw.class) {
                    bxxk = f139193g;
                    if (bxxk == null) {
                        bxxk = new bxve(f139192c);
                        f139193g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
