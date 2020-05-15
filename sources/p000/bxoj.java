package p000;

/* renamed from: bxoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxoj extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bxoj f164158b;

    /* renamed from: c */
    private static volatile bxxk f164159c;

    /* renamed from: a */
    public bxwc f164160a = bxxn.f165040b;

    static {
        bxoj bxoj = new bxoj();
        f164158b = bxoj;
        bxvk.m124024a(bxoj.class, bxoj);
    }

    private bxoj() {
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
            return bxvk.m124022a(f164158b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bxoi.class});
        } else if (i2 == 3) {
            return new bxoj();
        } else {
            if (i2 == 4) {
                return new bxog();
            }
            if (i2 == 5) {
                return f164158b;
            }
            bxxk bxxk = f164159c;
            if (bxxk == null) {
                synchronized (bxoj.class) {
                    bxxk = f164159c;
                    if (bxxk == null) {
                        bxxk = new bxve(f164158b);
                        f164159c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo73595a() {
        if (!this.f164160a.mo73666a()) {
            this.f164160a = bxvk.m124021a(this.f164160a);
        }
    }
}
