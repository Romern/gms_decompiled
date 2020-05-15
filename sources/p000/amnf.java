package p000;

/* renamed from: amnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amnf extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final amnf f75449e;

    /* renamed from: f */
    private static volatile bxxk f75450f;

    /* renamed from: a */
    public int f75451a;

    /* renamed from: b */
    public int f75452b;

    /* renamed from: c */
    public String f75453c = "";

    /* renamed from: d */
    public bxwc f75454d = bxxn.f165040b;

    static {
        amnf amnf = new amnf();
        f75449e = amnf;
        GeneratedMessageLite.m124024a(amnf.class, amnf);
    }

    private amnf() {
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
            return GeneratedMessageLite.m124022a(f75449e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", amne.class});
        } else if (i2 == 3) {
            return new amnf();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f75449e;
            }
            bxxk bxxk = f75450f;
            if (bxxk == null) {
                synchronized (amnf.class) {
                    bxxk = f75450f;
                    if (bxxk == null) {
                        bxxk = new bxve(f75449e);
                        f75450f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo41221a() {
        if (!this.f75454d.mo73666a()) {
            this.f75454d = GeneratedMessageLite.m124021a(this.f75454d);
        }
    }
}
