package p000;

/* renamed from: bxab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxab extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bxab f161669b;

    /* renamed from: c */
    public static final bxvj f161670c;

    /* renamed from: d */
    private static volatile bxxk f161671d;

    /* renamed from: a */
    public bxvw f161672a = bxwq.f165002b;

    static {
        bxab bxab = new bxab();
        f161669b = bxab;
        bxvk.m124024a(bxab.class, bxab);
        bwog bwog = bwog.f160437f;
        bxab bxab2 = f161669b;
        f161670c = bxvk.m124006a(bwog, bxab2, bxab2, 228982938, bxzf.MESSAGE);
    }

    private bxab() {
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
            return bxvk.m124022a(f161669b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0014", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bxab();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (int[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f161669b;
            }
            bxxk bxxk = f161671d;
            if (bxxk == null) {
                synchronized (bxab.class) {
                    bxxk = f161671d;
                    if (bxxk == null) {
                        bxxk = new bxve(f161669b);
                        f161671d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo73547a() {
        if (!this.f161672a.mo73666a()) {
            this.f161672a = bxvk.m124020a(this.f161672a);
        }
    }
}
