package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* renamed from: azv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azv extends aze {

    /* renamed from: c */
    private final bcg f2729c;

    /* renamed from: d */
    private final String f2730d;

    /* renamed from: e */
    private final boolean f2731e;

    /* renamed from: f */
    private final azy f2732f;

    /* renamed from: g */
    private azy f2733g;

    public azv(ayo ayo, bcg bcg, bcd bcd) {
        super(ayo, bcg, bcb.m2653a(bcd.f2925i), bcc.m2655a(bcd.f2926j), bcd.f2923g, bcd.f2921e, bcd.f2922f, bcd.f2919c, bcd.f2918b);
        this.f2729c = bcg;
        this.f2730d = bcd.f2917a;
        this.f2731e = bcd.f2924h;
        azy a = bcd.f2920d.mo2972a();
        this.f2732f = a;
        a.mo2939a(this);
        bcg.mo2989a(this.f2732f);
    }

    /* renamed from: a */
    public final void mo2923a(Canvas canvas, Matrix matrix, int i) {
        if (!this.f2731e) {
            this.f2614b.setColor(((azz) this.f2732f).mo2946g());
            azy azy = this.f2733g;
            if (azy != null) {
                this.f2614b.setColorFilter((ColorFilter) azy.mo2944f());
            }
            super.mo2923a(canvas, matrix, i);
        }
    }

    /* renamed from: b */
    public final String mo2930b() {
        return this.f2730d;
    }

    /* renamed from: a */
    public final void mo2926a(Object obj, beq beq) {
        super.mo2926a(obj, beq);
        if (obj == ayt.f2575b) {
            this.f2732f.f2743d = beq;
        } else if (obj == ayt.f2572B) {
            ban ban = new ban(beq);
            this.f2733g = ban;
            ban.mo2939a(this);
            this.f2729c.mo2989a(this.f2732f);
        }
    }
}
