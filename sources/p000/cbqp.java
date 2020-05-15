package p000;

/* renamed from: cbqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbqp extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbqp f178048c;

    /* renamed from: d */
    private static volatile bxxk f178049d;

    /* renamed from: a */
    public bxwc f178050a = bxxn.f165040b;

    /* renamed from: b */
    public String f178051b = "";

    static {
        cbqp cbqp = new cbqp();
        f178048c = cbqp;
        bxvk.m124024a(cbqp.class, cbqp);
    }

    private cbqp() {
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
            return bxvk.m124022a(f178048c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbqp();
        } else {
            if (i2 == 4) {
                return new cbqo();
            }
            if (i2 == 5) {
                return f178048c;
            }
            bxxk bxxk = f178049d;
            if (bxxk == null) {
                synchronized (cbqp.class) {
                    bxxk = f178049d;
                    if (bxxk == null) {
                        bxxk = new bxve(f178048c);
                        f178049d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo75243c() {
        if (!this.f178050a.mo73666a()) {
            this.f178050a = bxvk.m124021a(this.f178050a);
        }
    }
}
