package p000;

/* renamed from: acr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acr {

    /* renamed from: a */
    public int f232a = 0;

    /* renamed from: b */
    public int f233b = 0;

    /* renamed from: c */
    public int f234c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f235d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f236e = 0;

    /* renamed from: f */
    public int f237f = 0;

    /* renamed from: g */
    public boolean f238g = false;

    /* renamed from: h */
    public boolean f239h = false;

    /* renamed from: a */
    public final void mo402a(int i, int i2) {
        this.f234c = i;
        this.f235d = i2;
        this.f239h = true;
        if (!this.f238g) {
            if (i != Integer.MIN_VALUE) {
                this.f232a = i;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f233b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f232a = i2;
        }
        if (i != Integer.MIN_VALUE) {
            this.f233b = i;
        }
    }

    /* renamed from: b */
    public final void mo403b(int i, int i2) {
        this.f239h = false;
        if (i != Integer.MIN_VALUE) {
            this.f236e = i;
            this.f232a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f237f = i2;
            this.f233b = i2;
        }
    }
}
