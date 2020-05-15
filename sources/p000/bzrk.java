package p000;

/* renamed from: bzrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzrk extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bzrk f171153e;

    /* renamed from: f */
    private static volatile bxxk f171154f;

    /* renamed from: a */
    public int f171155a;

    /* renamed from: b */
    public bxwc f171156b = bxxn.f165040b;

    /* renamed from: c */
    public int f171157c;

    /* renamed from: d */
    public String f171158d = "";

    static {
        bzrk bzrk = new bzrk();
        f171153e = bzrk;
        bxvk.m124024a(bzrk.class, bzrk);
    }

    private bzrk() {
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
            return bxvk.m124022a(f171153e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000\u0003ဈ\u0001", new Object[]{"a", "b", bzrj.class, "c", bzpf.f170908a, "d"});
        } else if (i2 == 3) {
            return new bzrk();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (char[][]) null);
            }
            if (i2 == 5) {
                return f171153e;
            }
            bxxk bxxk = f171154f;
            if (bxxk == null) {
                synchronized (bzrk.class) {
                    bxxk = f171154f;
                    if (bxxk == null) {
                        bxxk = new bxve(f171153e);
                        f171154f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo74556c() {
        if (!this.f171156b.mo73666a()) {
            this.f171156b = bxvk.m124021a(this.f171156b);
        }
    }
}
