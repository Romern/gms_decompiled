package p000;

/* renamed from: bszh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bszh extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bszh f147822d;

    /* renamed from: e */
    private static volatile bxxk f147823e;

    /* renamed from: a */
    public String f147824a = "";

    /* renamed from: b */
    public String f147825b = "";

    /* renamed from: c */
    public bxwc f147826c = bxxn.f165040b;

    static {
        bszh bszh = new bszh();
        f147822d = bszh;
        bxvk.m124024a(bszh.class, bszh);
    }

    private bszh() {
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
            return bxvk.m124022a(f147822d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"a", "b", "c", bszg.class});
        } else if (i2 == 3) {
            return new bszh();
        } else {
            if (i2 == 4) {
                return new bxvd(f147822d);
            }
            if (i2 == 5) {
                return f147822d;
            }
            bxxk bxxk = f147823e;
            if (bxxk == null) {
                synchronized (bszh.class) {
                    bxxk = f147823e;
                    if (bxxk == null) {
                        bxxk = new bxve(f147822d);
                        f147823e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
