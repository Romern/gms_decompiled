package p000;

/* renamed from: qnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qnx extends bxvk implements bxxd {

    /* renamed from: d */
    public static final qnx f41814d;

    /* renamed from: e */
    private static volatile bxxk f41815e;

    /* renamed from: a */
    public bxwc f41816a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f41817b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f41818c = bxxn.f165040b;

    static {
        qnx qnx = new qnx();
        f41814d = qnx;
        bxvk.m124024a(qnx.class, qnx);
    }

    private qnx() {
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
            return bxvk.m124022a(f41814d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001c\u0002\u001c\u0003\u001c", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new qnx();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (float[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f41814d;
            }
            bxxk bxxk = f41815e;
            if (bxxk == null) {
                synchronized (qnx.class) {
                    bxxk = f41815e;
                    if (bxxk == null) {
                        bxxk = new bxve(f41814d);
                        f41815e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: b */
    public final void mo24146b() {
        if (!this.f41817b.mo73666a()) {
            this.f41817b = bxvk.m124021a(this.f41817b);
        }
    }

    /* renamed from: c */
    public final void mo24147c() {
        if (!this.f41818c.mo73666a()) {
            this.f41818c = bxvk.m124021a(this.f41818c);
        }
    }

    /* renamed from: a */
    public final void mo24145a() {
        if (!this.f41816a.mo73666a()) {
            this.f41816a = bxvk.m124021a(this.f41816a);
        }
    }
}
