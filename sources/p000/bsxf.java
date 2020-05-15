package p000;

/* renamed from: bsxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsxf extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsxf f147542b;

    /* renamed from: c */
    private static volatile bxxk f147543c;

    /* renamed from: a */
    public bxwc f147544a = bxxn.f165040b;

    static {
        bsxf bsxf = new bsxf();
        f147542b = bsxf;
        GeneratedMessageLite.m124024a(bsxf.class, bsxf);
    }

    private bsxf() {
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
            return GeneratedMessageLite.m124022a(f147542b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bsxh.class});
        } else if (i2 == 3) {
            return new bsxf();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f147542b;
            }
            bxxk bxxk = f147543c;
            if (bxxk == null) {
                synchronized (bsxf.class) {
                    bxxk = f147543c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147542b);
                        f147543c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo70718a() {
        if (!this.f147544a.mo73666a()) {
            this.f147544a = GeneratedMessageLite.m124021a(this.f147544a);
        }
    }
}
