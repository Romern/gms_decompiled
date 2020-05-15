package p000;

/* renamed from: bsvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsvp extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bsvp f147317b;

    /* renamed from: c */
    private static volatile bxxk f147318c;

    /* renamed from: a */
    public bxwc f147319a = bxxn.f165040b;

    static {
        bsvp bsvp = new bsvp();
        f147317b = bsvp;
        bxvk.m124024a(bsvp.class, bsvp);
    }

    private bsvp() {
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
            return bxvk.m124022a(f147317b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bsvq.class});
        } else if (i2 == 3) {
            return new bsvp();
        } else {
            if (i2 == 4) {
                return new bxvd(f147317b);
            }
            if (i2 == 5) {
                return f147317b;
            }
            bxxk bxxk = f147318c;
            if (bxxk == null) {
                synchronized (bsvp.class) {
                    bxxk = f147318c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147317b);
                        f147318c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
