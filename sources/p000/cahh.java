package p000;

/* renamed from: cahh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cahh extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cahh f174545b;

    /* renamed from: c */
    private static volatile bxxk f174546c;

    /* renamed from: a */
    public bxww f174547a = bxww.f165013b;

    static {
        cahh cahh = new cahh();
        f174545b = cahh;
        GeneratedMessageLite.m124024a(cahh.class, cahh);
    }

    private cahh() {
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
            return GeneratedMessageLite.m124022a(f174545b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", cahg.f174544a});
        } else if (i2 == 3) {
            return new cahh();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (byte[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f174545b;
            }
            bxxk bxxk = f174546c;
            if (bxxk == null) {
                synchronized (cahh.class) {
                    bxxk = f174546c;
                    if (bxxk == null) {
                        bxxk = new bxve(f174545b);
                        f174546c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final bxww mo74644c() {
        bxww bxww = this.f174547a;
        if (!bxww.f165014a) {
            this.f174547a = bxww.mo74203a();
        }
        return this.f174547a;
    }
}
