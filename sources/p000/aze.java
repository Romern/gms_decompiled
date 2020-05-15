package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aze implements azx, azo, azi {

    /* renamed from: a */
    protected final bcg f2613a;

    /* renamed from: b */
    final Paint f2614b;

    /* renamed from: c */
    private final PathMeasure f2615c = new PathMeasure();

    /* renamed from: d */
    private final Path f2616d = new Path();

    /* renamed from: e */
    private final Path f2617e = new Path();

    /* renamed from: f */
    private final RectF f2618f = new RectF();

    /* renamed from: g */
    private final ayo f2619g;

    /* renamed from: h */
    private final List f2620h = new ArrayList();

    /* renamed from: i */
    private final float[] f2621i;

    /* renamed from: j */
    private final azy f2622j;

    /* renamed from: k */
    private final azy f2623k;

    /* renamed from: l */
    private final List f2624l;

    /* renamed from: m */
    private final azy f2625m;

    /* renamed from: n */
    private azy f2626n;

    public aze(ayo ayo, bcg bcg, Paint.Cap cap, Paint.Join join, float f, bbc bbc, bba bba, List list, bba bba2) {
        azc azc = new azc(1);
        this.f2614b = azc;
        this.f2619g = ayo;
        this.f2613a = bcg;
        azc.setStyle(Paint.Style.STROKE);
        this.f2614b.setStrokeCap(cap);
        this.f2614b.setStrokeJoin(join);
        this.f2614b.setStrokeMiter(f);
        this.f2623k = bbc.mo2972a();
        this.f2622j = bba.mo2972a();
        if (bba2 != null) {
            this.f2625m = bba2.mo2972a();
        } else {
            this.f2625m = null;
        }
        this.f2624l = new ArrayList(list.size());
        this.f2621i = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f2624l.add(((bba) list.get(i)).mo2972a());
        }
        bcg.mo2989a(this.f2623k);
        bcg.mo2989a(this.f2622j);
        for (int i2 = 0; i2 < this.f2624l.size(); i2++) {
            bcg.mo2989a((azy) this.f2624l.get(i2));
        }
        azy azy = this.f2625m;
        if (azy != null) {
            bcg.mo2989a(azy);
        }
        this.f2623k.mo2939a(this);
        this.f2622j.mo2939a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((azy) this.f2624l.get(i3)).mo2939a(this);
        }
        azy azy2 = this.f2625m;
        if (azy2 != null) {
            azy2.mo2939a(this);
        }
    }

    /* renamed from: a */
    public final void mo2922a() {
        this.f2619g.invalidateSelf();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* renamed from: a */
    public void mo2923a(Canvas canvas, Matrix matrix, int i) {
        int i2;
        float f;
        float f2;
        float f3;
        Canvas canvas2 = canvas;
        Matrix matrix2 = matrix;
        boolean z = false;
        ben.f3096a[0] = 0.0f;
        ben.f3096a[1] = 0.0f;
        ben.f3096a[2] = 37394.73f;
        ben.f3096a[3] = 39575.234f;
        matrix2.mapPoints(ben.f3096a);
        if (ben.f3096a[0] == ben.f3096a[2] || ben.f3096a[1] == ben.f3096a[3]) {
            axq.m2409a();
            return;
        }
        bac bac = (bac) this.f2623k;
        float b = (((float) i) / 255.0f) * ((float) bac.mo2951b(bac.mo2940b(), bac.mo2942d()));
        float f4 = 100.0f;
        this.f2614b.setAlpha(bem.m2821a((int) ((b / 100.0f) * 255.0f)));
        this.f2614b.setStrokeWidth(((baa) this.f2622j).mo2946g() * ben.m2830a(matrix));
        if (this.f2614b.getStrokeWidth() > 0.0f) {
            if (this.f2624l.isEmpty()) {
                axq.m2409a();
            } else {
                float a = ben.m2830a(matrix);
                for (int i3 = 0; i3 < this.f2624l.size(); i3++) {
                    this.f2621i[i3] = ((Float) ((azy) this.f2624l.get(i3)).mo2944f()).floatValue();
                    if (i3 % 2 == 0) {
                        float[] fArr = this.f2621i;
                        if (fArr[i3] < 1.0f) {
                            fArr[i3] = 1.0f;
                        }
                    } else {
                        float[] fArr2 = this.f2621i;
                        if (fArr2[i3] < 0.1f) {
                            fArr2[i3] = 0.1f;
                        }
                    }
                    float[] fArr3 = this.f2621i;
                    fArr3[i3] = fArr3[i3] * a;
                }
                azy azy = this.f2625m;
                this.f2614b.setPathEffect(new DashPathEffect(this.f2621i, azy != null ? ((Float) azy.mo2944f()).floatValue() * a : 0.0f));
                axq.m2409a();
            }
            azy azy2 = this.f2626n;
            if (azy2 != null) {
                this.f2614b.setColorFilter((ColorFilter) azy2.mo2944f());
                i2 = 0;
            } else {
                i2 = 0;
            }
            while (i2 < this.f2620h.size()) {
                azd azd = (azd) this.f2620h.get(i2);
                if (azd.f2612b != null) {
                    this.f2616d.reset();
                    for (int size = azd.f2611a.size() - 1; size >= 0; size--) {
                        this.f2616d.addPath(((azq) azd.f2611a.get(size)).mo2933e(), matrix2);
                    }
                    this.f2615c.setPath(this.f2616d, z);
                    float length = this.f2615c.getLength();
                    while (this.f2615c.nextContour()) {
                        length += this.f2615c.getLength();
                    }
                    float floatValue = (((Float) azd.f2612b.f2737d.mo2944f()).floatValue() * length) / 360.0f;
                    float floatValue2 = ((((Float) azd.f2612b.f2735b.mo2944f()).floatValue() * length) / f4) + floatValue;
                    float floatValue3 = ((((Float) azd.f2612b.f2736c.mo2944f()).floatValue() * length) / f4) + floatValue;
                    int size2 = azd.f2611a.size() - 1;
                    float f5 = 0.0f;
                    while (size2 >= 0) {
                        this.f2617e.set(((azq) azd.f2611a.get(size2)).mo2933e());
                        this.f2617e.transform(matrix2);
                        this.f2615c.setPath(this.f2617e, z);
                        float length2 = this.f2615c.getLength();
                        if (floatValue3 > length) {
                            float f6 = floatValue3 - length;
                            if (f6 < f5 + length2 && f5 < f6) {
                                if (floatValue2 > length) {
                                    f3 = (floatValue2 - length) / length2;
                                } else {
                                    f3 = 0.0f;
                                }
                                ben.m2835a(this.f2617e, f3, Math.min(f6 / length2, 1.0f), 0.0f);
                                canvas2.drawPath(this.f2617e, this.f2614b);
                                f5 += length2;
                                size2--;
                                z = false;
                            }
                        }
                        float f7 = f5 + length2;
                        if (f7 >= floatValue2 && f5 <= floatValue3) {
                            if (f7 > floatValue3 || floatValue2 >= f5) {
                                if (floatValue2 >= f5) {
                                    f = (floatValue2 - f5) / length2;
                                } else {
                                    f = 0.0f;
                                }
                                if (floatValue3 <= f7) {
                                    f2 = (floatValue3 - f5) / length2;
                                } else {
                                    f2 = 1.0f;
                                }
                                ben.m2835a(this.f2617e, f, f2, 0.0f);
                                canvas2.drawPath(this.f2617e, this.f2614b);
                            } else {
                                canvas2.drawPath(this.f2617e, this.f2614b);
                            }
                        }
                        f5 += length2;
                        size2--;
                        z = false;
                    }
                    axq.m2409a();
                } else {
                    this.f2616d.reset();
                    for (int size3 = azd.f2611a.size() - 1; size3 >= 0; size3--) {
                        this.f2616d.addPath(((azq) azd.f2611a.get(size3)).mo2933e(), matrix2);
                    }
                    axq.m2409a();
                    canvas2.drawPath(this.f2616d, this.f2614b);
                    axq.m2409a();
                }
                i2++;
                f4 = 100.0f;
                z = false;
            }
            axq.m2409a();
            return;
        }
        axq.m2409a();
    }

    /* renamed from: a */
    public final void mo2924a(RectF rectF, Matrix matrix, boolean z) {
        this.f2616d.reset();
        for (int i = 0; i < this.f2620h.size(); i++) {
            azd azd = (azd) this.f2620h.get(i);
            for (int i2 = 0; i2 < azd.f2611a.size(); i2++) {
                this.f2616d.addPath(((azq) azd.f2611a.get(i2)).mo2933e(), matrix);
            }
        }
        this.f2616d.computeBounds(this.f2618f, false);
        float g = ((baa) this.f2622j).mo2946g();
        RectF rectF2 = this.f2618f;
        float f = g / 2.0f;
        rectF2.set(rectF2.left - f, this.f2618f.top - f, this.f2618f.right + f, this.f2618f.bottom + f);
        rectF.set(this.f2618f);
        rectF.set(rectF.left - 4.0f, rectF.top - 4.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        axq.m2409a();
    }

    /* renamed from: a */
    public final void mo2925a(bau bau, int i, List list, bau bau2) {
        bem.m2824a(bau, i, list, bau2, this);
    }

    /* renamed from: a */
    public void mo2926a(Object obj, beq beq) {
        azy azy;
        if (obj == ayt.f2577d) {
            azy = this.f2623k;
        } else if (obj == ayt.f2588o) {
            azy = this.f2622j;
        } else if (obj == ayt.f2572B) {
            ban ban = new ban(beq);
            this.f2626n = ban;
            ban.mo2939a(this);
            this.f2613a.mo2989a(this.f2626n);
            return;
        } else {
            return;
        }
        azy.f2743d = beq;
    }

    /* renamed from: a */
    public final void mo2927a(List list, List list2) {
        azd azd = null;
        azw azw = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            azg azg = (azg) list.get(size);
            if (azg instanceof azw) {
                azw azw2 = (azw) azg;
                if (azw2.f2738e == 2) {
                    azw = azw2;
                }
            }
        }
        if (azw != null) {
            azw.mo2935a(this);
        }
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            azg azg2 = (azg) list2.get(size2);
            if (azg2 instanceof azw) {
                azw azw3 = (azw) azg2;
                if (azw3.f2738e == 2) {
                    if (azd != null) {
                        this.f2620h.add(azd);
                    }
                    azd azd2 = new azd(azw3);
                    azw3.mo2935a(this);
                    azd = azd2;
                }
            }
            if (azg2 instanceof azq) {
                if (azd == null) {
                    azd = new azd(azw);
                }
                azd.f2611a.add((azq) azg2);
            }
        }
        if (azd != null) {
            this.f2620h.add(azd);
        }
    }
}
