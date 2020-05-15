package p000;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: azj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azj implements azq, azx, azo {

    /* renamed from: a */
    private final Path f2637a = new Path();

    /* renamed from: b */
    private final String f2638b;

    /* renamed from: c */
    private final ayo f2639c;

    /* renamed from: d */
    private final azy f2640d;

    /* renamed from: e */
    private final azy f2641e;

    /* renamed from: f */
    private final bbn f2642f;

    /* renamed from: g */
    private final azf f2643g = new azf();

    /* renamed from: h */
    private boolean f2644h;

    public azj(ayo ayo, bcg bcg, bbn bbn) {
        this.f2638b = bbn.f2845a;
        this.f2639c = ayo;
        this.f2640d = bbn.f2847c.mo2972a();
        this.f2641e = bbn.f2846b.mo2972a();
        this.f2642f = bbn;
        bcg.mo2989a(this.f2640d);
        bcg.mo2989a(this.f2641e);
        this.f2640d.mo2939a(this);
        this.f2641e.mo2939a(this);
    }

    /* renamed from: a */
    public final void mo2922a() {
        this.f2644h = false;
        this.f2639c.invalidateSelf();
    }

    /* renamed from: b */
    public final String mo2930b() {
        return this.f2638b;
    }

    /* renamed from: e */
    public final Path mo2933e() {
        if (!this.f2644h) {
            this.f2637a.reset();
            if (!this.f2642f.f2849e) {
                PointF pointF = (PointF) this.f2640d.mo2944f();
                float f = pointF.x / 2.0f;
                float f2 = pointF.y / 2.0f;
                float f3 = f * 0.55228f;
                float f4 = 0.55228f * f2;
                this.f2637a.reset();
                if (this.f2642f.f2848d) {
                    float f5 = -f2;
                    this.f2637a.moveTo(0.0f, f5);
                    float f6 = -f3;
                    float f7 = -f;
                    float f8 = -f4;
                    this.f2637a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
                    float f9 = f4 + 0.0f;
                    this.f2637a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
                    float f10 = f3 + 0.0f;
                    this.f2637a.cubicTo(f10, f2, f, f9, f, 0.0f);
                    this.f2637a.cubicTo(f, f8, f10, f5, 0.0f, f5);
                } else {
                    float f11 = -f2;
                    this.f2637a.moveTo(0.0f, f11);
                    float f12 = f3 + 0.0f;
                    float f13 = -f4;
                    this.f2637a.cubicTo(f12, f11, f, f13, f, 0.0f);
                    float f14 = f4 + 0.0f;
                    this.f2637a.cubicTo(f, f14, f12, f2, 0.0f, f2);
                    float f15 = -f3;
                    float f16 = -f;
                    this.f2637a.cubicTo(f15, f2, f16, f14, f16, 0.0f);
                    this.f2637a.cubicTo(f16, f13, f15, f11, 0.0f, f11);
                }
                PointF pointF2 = (PointF) this.f2641e.mo2944f();
                this.f2637a.offset(pointF2.x, pointF2.y);
                this.f2637a.close();
                this.f2643g.mo2928a(this.f2637a);
                this.f2644h = true;
                return this.f2637a;
            }
            this.f2644h = true;
        }
        return this.f2637a;
    }

    /* renamed from: a */
    public final void mo2925a(bau bau, int i, List list, bau bau2) {
        bem.m2824a(bau, i, list, bau2, this);
    }

    /* renamed from: a */
    public final void mo2926a(Object obj, beq beq) {
        azy azy;
        if (obj == ayt.f2580g) {
            azy = this.f2640d;
        } else if (obj == ayt.f2583j) {
            azy = this.f2641e;
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
                    this.f2643g.mo2929a(azw);
                    azw.mo2935a(this);
                }
            }
        }
    }
}
