package p000;

/* renamed from: bkxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkxh {

    /* renamed from: a */
    public final StringBuilder f125376a;

    /* renamed from: b */
    private boolean f125377b;

    public bkxh(StringBuilder sb) {
        this.f125376a = sb;
    }

    /* renamed from: c */
    private final void m106821c(String str) {
        this.f125376a.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 12) {
                this.f125376a.append("\\f");
            } else if (charAt != 13) {
                if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                    switch (charAt) {
                        case 8:
                            this.f125376a.append("\\b");
                            continue;
                        case 9:
                            this.f125376a.append("\\t");
                            continue;
                        case 10:
                            this.f125376a.append("\\n");
                            continue;
                        default:
                            if (charAt > 31) {
                                this.f125376a.append(charAt);
                                break;
                            } else {
                                this.f125376a.append("\\u");
                                this.f125376a.append(Character.forDigit(0, 16));
                                this.f125376a.append(Character.forDigit(0, 16));
                                this.f125376a.append(Character.forDigit((charAt & 240) >> 4, 16));
                                this.f125376a.append(Character.forDigit(charAt & 15, 16));
                                continue;
                            }
                    }
                } else {
                    this.f125376a.append('\\');
                    this.f125376a.append(charAt);
                }
            } else {
                this.f125376a.append("\\r");
            }
        }
        this.f125376a.append('\"');
    }

    /* renamed from: a */
    public final void mo66417a() {
        mo66426f();
        this.f125376a.append('[');
        this.f125377b = false;
    }

    /* renamed from: b */
    public final void mo66421b() {
        this.f125376a.append(']');
        this.f125377b = true;
    }

    /* renamed from: d */
    public final void mo66424d() {
        this.f125376a.append('}');
        this.f125377b = true;
    }

    /* renamed from: e */
    public final void mo66425e() {
        mo66426f();
        this.f125376a.append("null");
    }

    /* renamed from: f */
    public final void mo66426f() {
        if (this.f125377b) {
            this.f125376a.append(',');
        }
        this.f125377b = true;
    }

    /* renamed from: a */
    public final void mo66418a(int i) {
        mo66426f();
        this.f125376a.append(i);
    }

    /* renamed from: b */
    public final void mo66422b(String str) {
        if (str != null) {
            mo66426f();
            m106821c(str);
            return;
        }
        mo66425e();
    }

    /* renamed from: a */
    public final void mo66419a(String str) {
        mo66426f();
        m106821c(str);
        this.f125376a.append(':');
        this.f125377b = false;
    }

    /* renamed from: a */
    public final void mo66420a(boolean z) {
        mo66426f();
        this.f125376a.append(z);
    }

    /* renamed from: c */
    public final void mo66423c() {
        mo66426f();
        this.f125376a.append('{');
        this.f125377b = false;
    }
}
