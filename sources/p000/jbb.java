package p000;

/* renamed from: jbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jbb extends bxvk implements bxxd {

    /* renamed from: b */
    public static final jbb f22074b;

    /* renamed from: c */
    private static volatile bxxk f22075c;

    /* renamed from: a */
    public bxww f22076a = bxww.f165013b;

    static {
        jbb jbb = new jbb();
        f22074b = jbb;
        bxvk.m124024a(jbb.class, jbb);
    }

    private jbb() {
    }

    /* renamed from: a */
    public final bxww mo13559a() {
        bxww bxww = this.f22076a;
        if (!bxww.f165014a) {
            this.f22076a = bxww.mo74203a();
        }
        return this.f22076a;
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
            return bxvk.m124022a(f22074b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"a", jba.f22073a});
        } else if (i2 == 3) {
            return new jbb();
        } else {
            if (i2 == 4) {
                return new bxvd(f22074b);
            }
            if (i2 == 5) {
                return f22074b;
            }
            bxxk bxxk = f22075c;
            if (bxxk == null) {
                synchronized (jbb.class) {
                    bxxk = f22075c;
                    if (bxxk == null) {
                        bxxk = new bxve(f22074b);
                        f22075c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
