package p000;

/* renamed from: bxmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxmo extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bxmo f163965b;

    /* renamed from: c */
    public static final bxvj f163966c;

    /* renamed from: d */
    private static volatile bxxk f163967d;

    /* renamed from: a */
    public bxwc f163968a = bxxn.f165040b;

    static {
        bxmo bxmo = new bxmo();
        f163965b = bxmo;
        bxvk.m124024a(bxmo.class, bxmo);
        bxcf bxcf = bxcf.f162779a;
        bxmo bxmo2 = f163965b;
        f163966c = bxvk.m124006a(bxcf, bxmo2, bxmo2, 87665812, bxzf.MESSAGE);
    }

    private bxmo() {
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
            return bxvk.m124022a(f163965b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bxmm.class});
        } else if (i2 == 3) {
            return new bxmo();
        } else {
            if (i2 == 4) {
                return new bxmn();
            }
            if (i2 == 5) {
                return f163965b;
            }
            bxxk bxxk = f163967d;
            if (bxxk == null) {
                synchronized (bxmo.class) {
                    bxxk = f163967d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163965b);
                        f163967d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo73592a() {
        if (!this.f163968a.mo73666a()) {
            this.f163968a = bxvk.m124021a(this.f163968a);
        }
    }
}
