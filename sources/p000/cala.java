package p000;

/* renamed from: cala */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cala extends bxvk implements bxxd {

    /* renamed from: h */
    public static final cala f175092h;

    /* renamed from: i */
    private static volatile bxxk f175093i;

    /* renamed from: a */
    public int f175094a;

    /* renamed from: b */
    public int f175095b;

    /* renamed from: c */
    public int f175096c;

    /* renamed from: d */
    public bxwc f175097d = bxxn.f165040b;

    /* renamed from: e */
    public bxww f175098e = bxww.f165013b;

    /* renamed from: f */
    public bxwc f175099f = bxxn.f165040b;

    /* renamed from: g */
    public int f175100g;

    static {
        cala cala = new cala();
        f175092h = cala;
        bxvk.m124024a(cala.class, cala);
    }

    private cala() {
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
            return bxvk.m124022a(f175092h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0001\u0002\u0000\u0001င\u0000\u0002င\u0001\u0003\u001b\u00052\u0006\u001b\bင\u0003", new Object[]{"a", "b", "c", "d", cakw.class, "e", cakz.f175091a, "f", cakx.class, "g"});
        } else if (i2 == 3) {
            return new cala();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (byte[][][]) null);
            }
            if (i2 == 5) {
                return f175092h;
            }
            bxxk bxxk = f175093i;
            if (bxxk == null) {
                synchronized (cala.class) {
                    bxxk = f175093i;
                    if (bxxk == null) {
                        bxxk = new bxve(f175092h);
                        f175093i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo74657c() {
        if (!this.f175097d.mo73666a()) {
            this.f175097d = bxvk.m124021a(this.f175097d);
        }
    }
}
