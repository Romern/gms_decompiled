package p000;

/* renamed from: byqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byqq extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final byqq f167409i;

    /* renamed from: j */
    private static volatile bxxk f167410j;

    /* renamed from: a */
    public int f167411a;

    /* renamed from: b */
    public boolean f167412b;

    /* renamed from: c */
    public int f167413c;

    /* renamed from: d */
    public long f167414d;

    /* renamed from: e */
    public long f167415e;

    /* renamed from: f */
    public long f167416f;

    /* renamed from: g */
    public long f167417g;

    /* renamed from: h */
    public boolean f167418h;

    static {
        byqq byqq = new byqq();
        f167409i = byqq;
        GeneratedMessageLite.m124024a(byqq.class, byqq);
    }

    private byqq() {
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
            return GeneratedMessageLite.m124022a(f167409i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0005\u0005ဇ\u0006\u0007ဂ\u0003\bဂ\u0004", new Object[]{"a", "b", "c", byqr.f167419a, "d", "g", "h", "e", "f"});
        } else if (i2 == 3) {
            return new byqq();
        } else {
            if (i2 == 4) {
                return new bxvd(f167409i);
            }
            if (i2 == 5) {
                return f167409i;
            }
            bxxk bxxk = f167410j;
            if (bxxk == null) {
                synchronized (byqq.class) {
                    bxxk = f167410j;
                    if (bxxk == null) {
                        bxxk = new bxve(f167409i);
                        f167410j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
