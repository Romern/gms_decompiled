package p000;

/* renamed from: bgeo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgeo {

    /* renamed from: a */
    public int f116280a;

    /* renamed from: b */
    public final bfnt[] f116281b;

    /* renamed from: c */
    public int f116282c = 1;

    /* renamed from: d */
    public final bget f116283d;

    /* renamed from: e */
    public final bgeq f116284e;

    /* renamed from: f */
    public final bger f116285f;

    /* renamed from: g */
    public final bgen f116286g;

    /* renamed from: h */
    private final bgep f116287h;

    public bgeo(bfnt[] bfntArr, bgep bgep, bget bget, bgeq bgeq, bger bger) {
        this.f116287h = bgep;
        this.f116283d = bget;
        this.f116284e = bgeq;
        this.f116285f = bger;
        this.f116281b = bfntArr;
        this.f116286g = new bgen(this);
    }

    /* renamed from: a */
    public final void mo62717a() {
        int i = this.f116282c;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                int i3 = bgeu.f116293f;
            } else if (i2 == 2) {
                int i4 = bgeu.f116293f;
            }
            this.f116282c = 4;
            return;
        }
        throw null;
    }

    /* renamed from: b */
    public final void mo62719b(int i) {
        bgep bgep = this.f116287h;
        bgem bgem = new bgem(this);
        int i2 = bgeu.f116293f;
        StringBuilder sb = new StringBuilder(32);
        sb.append("setSingleAlarm for ");
        sb.append(i);
        sb.append("ms");
        sb.toString();
        bgep.f116288a.f116294a.mo62756k().mo62919a(bgem, (long) i);
        this.f116282c = 2;
    }

    /* renamed from: a */
    public final void mo62718a(int i) {
        this.f116280a = i;
        mo62719b(i);
    }
}
