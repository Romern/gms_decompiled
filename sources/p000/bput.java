package p000;

/* renamed from: bput */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bput extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bput f139284e;

    /* renamed from: f */
    private static volatile bxxk f139285f;

    /* renamed from: a */
    public int f139286a;

    /* renamed from: b */
    public int f139287b;

    /* renamed from: c */
    public bpul f139288c;

    /* renamed from: d */
    public bxwc f139289d = bxxn.f165040b;

    static {
        bput bput = new bput();
        f139284e = bput;
        bxvk.m124024a(bput.class, bput);
    }

    private bput() {
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
            return bxvk.m124022a(f139284e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"a", "b", bpun.m112299b(), "c", "d", bpus.class});
        } else if (i2 == 3) {
            return new bput();
        } else {
            if (i2 == 4) {
                return new bpuk();
            }
            if (i2 == 5) {
                return f139284e;
            }
            bxxk bxxk = f139285f;
            if (bxxk == null) {
                synchronized (bput.class) {
                    bxxk = f139285f;
                    if (bxxk == null) {
                        bxxk = new bxve(f139284e);
                        f139285f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo68990a() {
        if (!this.f139289d.mo73666a()) {
            this.f139289d = bxvk.m124021a(this.f139289d);
        }
    }
}
