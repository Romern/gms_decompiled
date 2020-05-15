package p000;

/* renamed from: agno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agno extends bxvk implements bxxd {

    /* renamed from: e */
    public static final agno f66134e;

    /* renamed from: f */
    private static volatile bxxk f66135f;

    /* renamed from: a */
    public bxvw f66136a = bxwq.f165002b;

    /* renamed from: b */
    public bxvw f66137b = bxwq.f165002b;

    /* renamed from: c */
    public bxwc f66138c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f66139d = bxxn.f165040b;

    static {
        agno agno = new agno();
        f66134e = agno;
        bxvk.m124024a(agno.class, agno);
    }

    private agno() {
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
            return bxvk.m124022a(f66134e, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"a", "b", "c", agnh.class, "d", agnp.class});
        } else if (i2 == 3) {
            return new agno();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (float[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f66134e;
            }
            bxxk bxxk = f66135f;
            if (bxxk == null) {
                synchronized (agno.class) {
                    bxxk = f66135f;
                    if (bxxk == null) {
                        bxxk = new bxve(f66134e);
                        f66135f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: b */
    public final void mo35761b() {
        if (!this.f66139d.mo73666a()) {
            this.f66139d = bxvk.m124021a(this.f66139d);
        }
    }

    /* renamed from: a */
    public final void mo35760a() {
        if (!this.f66138c.mo73666a()) {
            this.f66138c = bxvk.m124021a(this.f66138c);
        }
    }
}
