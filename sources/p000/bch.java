package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bch extends bcg {

    /* renamed from: g */
    private azy f2955g;

    /* renamed from: h */
    private final List f2956h = new ArrayList();

    /* renamed from: i */
    private final RectF f2957i = new RectF();

    /* renamed from: j */
    private final RectF f2958j = new RectF();

    public bch(ayo ayo, bcj bcj, List list, axw axw) {
        super(ayo, bcj);
        bcg bcg;
        bcg bcg2;
        String str;
        new Paint();
        bba bba = bcj.f2980r;
        if (bba != null) {
            azy a = bba.mo2972a();
            this.f2955g = a;
            mo2989a(a);
            this.f2955g.mo2939a(this);
        } else {
            this.f2955g = null;
        }
        C1230nw nwVar = new C1230nw(axw.f2512f.size());
        int size = list.size() - 1;
        bcg bcg3 = null;
        while (true) {
            if (size >= 0) {
                bcj bcj2 = (bcj) list.get(size);
                int i = bcj2.f2983u;
                int i2 = i - 1;
                if (i != 0) {
                    if (i2 == 0) {
                        bcg2 = new bch(ayo, bcj2, (List) axw.f2507a.get(bcj2.f2968f), axw);
                    } else if (i2 == 1) {
                        bcg2 = new bcm(ayo, bcj2);
                    } else if (i2 == 2) {
                        bcg2 = new bci(ayo, bcj2);
                    } else if (i2 == 3) {
                        bcg2 = new bck(ayo, bcj2);
                    } else if (i2 == 4) {
                        bcg2 = new bcl(ayo, bcj2);
                    } else if (i2 != 5) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown layer type ");
                        switch (bcj2.f2983u) {
                            case 1:
                                str = "PRE_COMP";
                                break;
                            case 2:
                                str = "SOLID";
                                break;
                            case 3:
                                str = "IMAGE";
                                break;
                            case 4:
                                str = "NULL";
                                break;
                            case 5:
                                str = "SHAPE";
                                break;
                            case 6:
                                str = "TEXT";
                                break;
                            case 7:
                                str = "UNKNOWN";
                                break;
                            default:
                                str = "null";
                                break;
                        }
                        sb.append((Object) str);
                        bek.m2805a(sb.toString());
                        bcg2 = null;
                    } else {
                        bcg2 = new bcp(ayo, bcj2);
                    }
                    if (bcg2 != null) {
                        nwVar.mo15540b(bcg2.f2936c.f2966d, bcg2);
                        if (bcg3 == null) {
                            this.f2956h.add(0, bcg2);
                            int i3 = bcj2.f2984v;
                            int i4 = i3 - 1;
                            if (i3 == 0) {
                                throw null;
                            } else if (i4 == 1 || i4 == 2) {
                                bcg3 = bcg2;
                            }
                        } else {
                            bcg3.f2937d = bcg2;
                            bcg3 = null;
                        }
                    }
                    size--;
                } else {
                    throw null;
                }
            } else {
                for (int i5 = 0; i5 < nwVar.mo15537b(); i5++) {
                    bcg bcg4 = (bcg) nwVar.mo15534a(nwVar.mo15533a(i5));
                    if (!(bcg4 == null || (bcg = (bcg) nwVar.mo15534a(bcg4.f2936c.f2967e)) == null)) {
                        bcg4.f2938e = bcg;
                    }
                }
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo2988a(float f) {
        super.mo2988a(f);
        if (this.f2955g != null) {
            f = ((((Float) this.f2955g.mo2944f()).floatValue() * this.f2936c.f2964b.f2516j) - this.f2936c.f2964b.f2514h) / (this.f2935b.f2550a.mo2860b() + 0.01f);
        }
        bcj bcj = this.f2936c;
        float f2 = bcj.f2974l;
        if (f2 != 0.0f) {
            f /= f2;
        }
        if (this.f2955g == null) {
            f -= bcj.f2975m / bcj.f2964b.mo2860b();
        }
        for (int size = this.f2956h.size() - 1; size >= 0; size--) {
            ((bcg) this.f2956h.get(size)).mo2988a(f);
        }
    }

    /* renamed from: b */
    public final void mo2991b(Canvas canvas, Matrix matrix, int i) {
        RectF rectF = this.f2958j;
        bcj bcj = this.f2936c;
        rectF.set(0.0f, 0.0f, (float) bcj.f2976n, (float) bcj.f2977o);
        matrix.mapRect(this.f2958j);
        canvas.save();
        for (int size = this.f2956h.size() - 1; size >= 0; size--) {
            if (this.f2958j.isEmpty() || canvas.clipRect(this.f2958j)) {
                ((bcg) this.f2956h.get(size)).mo2923a(canvas, matrix, i);
            }
        }
        canvas.restore();
        axq.m2409a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcg.a(android.graphics.RectF, android.graphics.Matrix, boolean):void
     arg types: [android.graphics.RectF, android.graphics.Matrix, int]
     candidates:
      bcg.a(android.graphics.Canvas, android.graphics.Matrix, int):void
      azi.a(android.graphics.Canvas, android.graphics.Matrix, int):void
      bcg.a(android.graphics.RectF, android.graphics.Matrix, boolean):void */
    /* renamed from: a */
    public final void mo2924a(RectF rectF, Matrix matrix, boolean z) {
        super.mo2924a(rectF, matrix, z);
        for (int size = this.f2956h.size() - 1; size >= 0; size--) {
            this.f2957i.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((bcg) this.f2956h.get(size)).mo2924a(this.f2957i, this.f2934a, true);
            rectF.union(this.f2957i);
        }
    }

    /* renamed from: a */
    public final void mo2926a(Object obj, beq beq) {
        super.mo2926a(obj, beq);
        if (obj == ayt.f2571A) {
            ban ban = new ban(beq);
            this.f2955g = ban;
            mo2989a(ban);
        }
    }

    /* renamed from: b */
    public final void mo2992b(bau bau, int i, List list, bau bau2) {
        for (int i2 = 0; i2 < this.f2956h.size(); i2++) {
            ((bcg) this.f2956h.get(i2)).mo2925a(bau, i, list, bau2);
        }
    }
}
