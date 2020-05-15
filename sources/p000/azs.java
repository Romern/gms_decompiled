package p000;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* renamed from: azs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azs implements azx, azo, azq {

    /* renamed from: a */
    private final Path f2703a = new Path();

    /* renamed from: b */
    private final RectF f2704b = new RectF();

    /* renamed from: c */
    private final String f2705c;

    /* renamed from: d */
    private final boolean f2706d;

    /* renamed from: e */
    private final ayo f2707e;

    /* renamed from: f */
    private final azy f2708f;

    /* renamed from: g */
    private final azy f2709g;

    /* renamed from: h */
    private final azy f2710h;

    /* renamed from: i */
    private final azf f2711i = new azf();

    /* renamed from: j */
    private boolean f2712j;

    public azs(ayo ayo, bcg bcg, bbv bbv) {
        this.f2705c = bbv.f2889a;
        this.f2706d = bbv.f2893e;
        this.f2707e = ayo;
        this.f2708f = bbv.f2890b.mo2972a();
        this.f2709g = bbv.f2891c.mo2972a();
        this.f2710h = bbv.f2892d.mo2972a();
        bcg.mo2989a(this.f2708f);
        bcg.mo2989a(this.f2709g);
        bcg.mo2989a(this.f2710h);
        this.f2708f.mo2939a(this);
        this.f2709g.mo2939a(this);
        this.f2710h.mo2939a(this);
    }

    /* renamed from: a */
    public final void mo2922a() {
        this.f2712j = false;
        this.f2707e.invalidateSelf();
    }

    /* renamed from: b */
    public final String mo2930b() {
        return this.f2705c;
    }

    /* renamed from: e */
    public final Path mo2933e() {
        float f;
        if (!this.f2712j) {
            this.f2703a.reset();
            if (!this.f2706d) {
                PointF pointF = (PointF) this.f2709g.mo2944f();
                float f2 = pointF.x / 2.0f;
                float f3 = pointF.y / 2.0f;
                azy azy = this.f2710h;
                if (azy != null) {
                    f = ((baa) azy).mo2946g();
                } else {
                    f = 0.0f;
                }
                float min = Math.min(f2, f3);
                if (f > min) {
                    f = min;
                }
                PointF pointF2 = (PointF) this.f2708f.mo2944f();
                this.f2703a.moveTo(pointF2.x + f2, (pointF2.y - f3) + f);
                this.f2703a.lineTo(pointF2.x + f2, (pointF2.y + f3) - f);
                if (f > 0.0f) {
                    float f4 = f + f;
                    this.f2704b.set((pointF2.x + f2) - f4, (pointF2.y + f3) - f4, pointF2.x + f2, pointF2.y + f3);
                    this.f2703a.arcTo(this.f2704b, 0.0f, 90.0f, false);
                }
                this.f2703a.lineTo((pointF2.x - f2) + f, pointF2.y + f3);
                if (f > 0.0f) {
                    float f5 = f + f;
                    this.f2704b.set(pointF2.x - f2, (pointF2.y + f3) - f5, (pointF2.x - f2) + f5, pointF2.y + f3);
                    this.f2703a.arcTo(this.f2704b, 90.0f, 90.0f, false);
                }
                this.f2703a.lineTo(pointF2.x - f2, (pointF2.y - f3) + f);
                if (f > 0.0f) {
                    float f6 = f + f;
                    this.f2704b.set(pointF2.x - f2, pointF2.y - f3, (pointF2.x - f2) + f6, (pointF2.y - f3) + f6);
                    this.f2703a.arcTo(this.f2704b, 180.0f, 90.0f, false);
                }
                this.f2703a.lineTo((pointF2.x + f2) - f, pointF2.y - f3);
                if (f > 0.0f) {
                    float f7 = f + f;
                    this.f2704b.set((pointF2.x + f2) - f7, pointF2.y - f3, pointF2.x + f2, (pointF2.y - f3) + f7);
                    this.f2703a.arcTo(this.f2704b, 270.0f, 90.0f, false);
                }
                this.f2703a.close();
                this.f2711i.mo2928a(this.f2703a);
            }
            this.f2712j = true;
        }
        return this.f2703a;
    }

    /* renamed from: a */
    public final void mo2925a(bau bau, int i, List list, bau bau2) {
        bem.m2824a(bau, i, list, bau2, this);
    }

    /* renamed from: a */
    public final void mo2926a(Object obj, beq beq) {
        azy azy;
        if (obj == ayt.f2581h) {
            azy = this.f2709g;
        } else if (obj == ayt.f2583j) {
            azy = this.f2708f;
        } else if (obj == ayt.f2582i) {
            azy = this.f2710h;
        } else {
            return;
        }
        azy.f2743d = beq;
    }

    /* renamed from: a */
    public final void mo2927a(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            azg azg = (azg) list.get(i);
            if (azg instanceof azw) {
                azw azw = (azw) azg;
                if (azw.f2738e == 1) {
                    this.f2711i.mo2929a(azw);
                    azw.mo2935a(this);
                }
            }
        }
    }
}
