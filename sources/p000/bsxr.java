package p000;

/* renamed from: bsxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsxr extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bsxr f147603b;

    /* renamed from: c */
    private static volatile bxxk f147604c;

    /* renamed from: a */
    public bxwc f147605a = bxxn.f165040b;

    static {
        bsxr bsxr = new bsxr();
        f147603b = bsxr;
        bxvk.m124024a(bsxr.class, bsxr);
    }

    private bsxr() {
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
            return bxvk.m124022a(f147603b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bsul.class});
        } else if (i2 == 3) {
            return new bsxr();
        } else {
            if (i2 == 4) {
                return new bsxq();
            }
            if (i2 == 5) {
                return f147603b;
            }
            bxxk bxxk = f147604c;
            if (bxxk == null) {
                synchronized (bsxr.class) {
                    bxxk = f147604c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147603b);
                        f147604c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo70724a() {
        if (!this.f147605a.mo73666a()) {
            this.f147605a = bxvk.m124021a(this.f147605a);
        }
    }
}
