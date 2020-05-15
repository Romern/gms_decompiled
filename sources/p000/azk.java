package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: azk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azk implements azi, azx, azo {

    /* renamed from: a */
    private final Path f2645a = new Path();

    /* renamed from: b */
    private final Paint f2646b = new azc(1);

    /* renamed from: c */
    private final bcg f2647c;

    /* renamed from: d */
    private final String f2648d;

    /* renamed from: e */
    private final boolean f2649e;

    /* renamed from: f */
    private final List f2650f = new ArrayList();

    /* renamed from: g */
    private final azy f2651g;

    /* renamed from: h */
    private final azy f2652h;

    /* renamed from: i */
    private azy f2653i;

    /* renamed from: j */
    private final ayo f2654j;

    public azk(ayo ayo, bcg bcg, bby bby) {
        this.f2647c = bcg;
        this.f2648d = bby.f2903b;
        this.f2649e = bby.f2906e;
        this.f2654j = ayo;
        if (bby.f2904c == null || bby.f2905d == null) {
            this.f2651g = null;
            this.f2652h = null;
            return;
        }
        this.f2645a.setFillType(bby.f2902a);
        azy a = bby.f2904c.mo2972a();
        this.f2651g = a;
        a.mo2939a(this);
        bcg.mo2989a(this.f2651g);
        azy a2 = bby.f2905d.mo2972a();
        this.f2652h = a2;
        a2.mo2939a(this);
        bcg.mo2989a(this.f2652h);
    }

    /* renamed from: a */
    public final void mo2922a() {
        this.f2654j.invalidateSelf();
    }

    /* renamed from: b */
    public final String mo2930b() {
        return this.f2648d;
    }

    /* renamed from: a */
    public final void mo2923a(Canvas canvas, Matrix matrix, int i) {
        if (!this.f2649e) {
            this.f2646b.setColor(((azz) this.f2651g).mo2946g());
            this.f2646b.setAlpha(bem.m2821a((int) ((((((float) i) / 255.0f) * ((float) ((Integer) this.f2652h.mo2944f()).intValue())) / 100.0f) * 255.0f)));
            azy azy = this.f2653i;
            if (azy != null) {
                this.f2646b.setColorFilter((ColorFilter) azy.mo2944f());
            }
            this.f2645a.reset();
            for (int i2 = 0; i2 < this.f2650f.size(); i2++) {
                this.f2645a.addPath(((azq) this.f2650f.get(i2)).mo2933e(), matrix);
            }
            canvas.drawPath(this.f2645a, this.f2646b);
            axq.m2409a();
        }
    }

    /* renamed from: a */
    public final void mo2924a(RectF rectF, Matrix matrix, boolean z) {
        this.f2645a.reset();
        for (int i = 0; i < this.f2650f.size(); i++) {
            this.f2645a.addPath(((azq) this.f2650f.get(i)).mo2933e(), matrix);
        }
        this.f2645a.computeBounds(rectF, false);
        rectF.set(rectF.left - 4.0f, rectF.top - 4.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: a */
    public final void mo2925a(bau bau, int i, List list, bau bau2) {
        bem.m2824a(bau, i, list, bau2, this);
    }

    /* renamed from: a */
    public final void mo2926a(Object obj, beq beq) {
        azy azy;
        if (obj == ayt.f2574a) {
            azy = this.f2651g;
        } else if (obj == ayt.f2577d) {
            azy = this.f2652h;
        } else if (obj == ayt.f2572B) {
            ban ban = new ban(beq);
            this.f2653i = ban;
            ban.mo2939a(this);
            this.f2647c.mo2989a(this.f2653i);
            return;
        } else {
            return;
        }
        azy.f2743d = beq;
    }

    /* renamed from: a */
    public final void mo2927a(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            azg azg = (azg) list2.get(i);
            if (azg instanceof azq) {
                this.f2650f.add((azq) azg);
            }
        }
    }
}
