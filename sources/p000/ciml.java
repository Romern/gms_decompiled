package p000;

/* renamed from: ciml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciml extends bxvk implements bxxd {

    /* renamed from: c */
    public static final ciml f190743c;

    /* renamed from: e */
    private static volatile bxxk f190744e;

    /* renamed from: a */
    public int f190745a;

    /* renamed from: b */
    public cimk f190746b;

    /* renamed from: d */
    private byte f190747d = 2;

    static {
        ciml ciml = new ciml();
        f190743c = ciml;
        bxvk.m124024a(ciml.class, ciml);
    }

    private ciml() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f190747d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f190747d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f190743c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new ciml();
        } else {
            if (i2 == 4) {
                return new bxvd(f190743c);
            }
            if (i2 == 5) {
                return f190743c;
            }
            bxxk bxxk = f190744e;
            if (bxxk == null) {
                synchronized (ciml.class) {
                    bxxk = f190744e;
                    if (bxxk == null) {
                        bxxk = new bxve(f190743c);
                        f190744e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
