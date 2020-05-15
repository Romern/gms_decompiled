package p000;

/* renamed from: bqyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqyq extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bqyq f141967e;

    /* renamed from: f */
    private static volatile bxxk f141968f;

    /* renamed from: a */
    public int f141969a;

    /* renamed from: b */
    public bxtx f141970b = bxtx.f164797b;

    /* renamed from: c */
    public bxwc f141971c = bxxn.f165040b;

    /* renamed from: d */
    public boolean f141972d;

    static {
        bqyq bqyq = new bqyq();
        f141967e = bqyq;
        bxvk.m124024a(bqyq.class, bqyq);
    }

    private bqyq() {
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
            return bxvk.m124022a(f141967e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ည\u0000\u0002\u001c\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bqyq();
        } else {
            if (i2 == 4) {
                return new bqyp();
            }
            if (i2 == 5) {
                return f141967e;
            }
            bxxk bxxk = f141968f;
            if (bxxk == null) {
                synchronized (bqyq.class) {
                    bxxk = f141968f;
                    if (bxxk == null) {
                        bxxk = new bxve(f141967e);
                        f141968f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo69468a() {
        if (!this.f141971c.mo73666a()) {
            this.f141971c = bxvk.m124021a(this.f141971c);
        }
    }
}
