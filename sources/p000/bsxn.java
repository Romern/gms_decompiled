package p000;

/* renamed from: bsxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsxn extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bsxn f147586d;

    /* renamed from: e */
    private static volatile bxxk f147587e;

    /* renamed from: a */
    public int f147588a;

    /* renamed from: b */
    public int f147589b;

    /* renamed from: c */
    public bxww f147590c = bxww.f165013b;

    static {
        bsxn bsxn = new bsxn();
        f147586d = bsxn;
        GeneratedMessageLite.m124024a(bsxn.class, bsxn);
    }

    private bsxn() {
    }

    /* renamed from: a */
    public final bxww mo70721a() {
        bxww bxww = this.f147590c;
        if (!bxww.f165014a) {
            this.f147590c = bxww.mo74203a();
        }
        return this.f147590c;
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
            return GeneratedMessageLite.m124022a(f147586d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001င\u0000\u00022", new Object[]{"a", "b", "c", bsxm.f147585a});
        } else if (i2 == 3) {
            return new bsxn();
        } else {
            if (i2 == 4) {
                return new bsxl();
            }
            if (i2 == 5) {
                return f147586d;
            }
            bxxk bxxk = f147587e;
            if (bxxk == null) {
                synchronized (bsxn.class) {
                    bxxk = f147587e;
                    if (bxxk == null) {
                        bxxk = new bxve(f147586d);
                        f147587e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
