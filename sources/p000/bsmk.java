package p000;

/* renamed from: bsmk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsmk extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bsmk f145036e;

    /* renamed from: f */
    private static volatile bxxk f145037f;

    /* renamed from: a */
    public int f145038a;

    /* renamed from: b */
    public bsmh f145039b;

    /* renamed from: c */
    public bxww f145040c = bxww.f165013b;

    /* renamed from: d */
    public bsmh f145041d;

    static {
        bsmk bsmk = new bsmk();
        f145036e = bsmk;
        GeneratedMessageLite.m124024a(bsmk.class, bsmk);
    }

    private bsmk() {
    }

    /* renamed from: a */
    public final bxww mo70687a() {
        bxww bxww = this.f145040c;
        if (!bxww.f165014a) {
            this.f145040c = bxww.mo74203a();
        }
        return this.f145040c;
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
            return GeneratedMessageLite.m124022a(f145036e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဉ\u0000\u00022\u0003ဉ\u0001", new Object[]{"a", "b", "c", bsmj.f145035a, "d"});
        } else if (i2 == 3) {
            return new bsmk();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (char[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f145036e;
            }
            bxxk bxxk = f145037f;
            if (bxxk == null) {
                synchronized (bsmk.class) {
                    bxxk = f145037f;
                    if (bxxk == null) {
                        bxxk = new bxve(f145036e);
                        f145037f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
