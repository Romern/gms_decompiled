package p000;

/* renamed from: cbex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbex extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final cbex f176860f;

    /* renamed from: g */
    private static volatile bxxk f176861g;

    /* renamed from: a */
    public cbds f176862a;

    /* renamed from: b */
    public bxww f176863b = bxww.f165013b;

    /* renamed from: c */
    public cbdo f176864c;

    /* renamed from: d */
    public cbdv f176865d;

    /* renamed from: e */
    public cbff f176866e;

    static {
        cbex cbex = new cbex();
        f176860f = cbex;
        GeneratedMessageLite.m124024a(cbex.class, cbex);
    }

    private cbex() {
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
            return GeneratedMessageLite.m124022a(f176860f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\t\u00022\u0003\t\u0004\t\u0005\t", new Object[]{"a", "b", cbew.f176859a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new cbex();
        } else {
            if (i2 == 4) {
                return new cbev();
            }
            if (i2 == 5) {
                return f176860f;
            }
            bxxk bxxk = f176861g;
            if (bxxk == null) {
                synchronized (cbex.class) {
                    bxxk = f176861g;
                    if (bxxk == null) {
                        bxxk = new bxve(f176860f);
                        f176861g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final bxww mo75232c() {
        bxww bxww = this.f176863b;
        if (!bxww.f165014a) {
            this.f176863b = bxww.mo74203a();
        }
        return this.f176863b;
    }

    /* renamed from: a */
    public final boolean mo75231a(String str) {
        str.getClass();
        return this.f176863b.containsKey(str);
    }
}
