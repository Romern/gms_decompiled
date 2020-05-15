package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* renamed from: azt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azt implements azi, azq, azn, azx, azo {

    /* renamed from: a */
    private final Matrix f2713a = new Matrix();

    /* renamed from: b */
    private final Path f2714b = new Path();

    /* renamed from: c */
    private final ayo f2715c;

    /* renamed from: d */
    private final bcg f2716d;

    /* renamed from: e */
    private final String f2717e;

    /* renamed from: f */
    private final boolean f2718f;

    /* renamed from: g */
    private final azy f2719g;

    /* renamed from: h */
    private final azy f2720h;

    /* renamed from: i */
    private final bam f2721i;

    /* renamed from: j */
    private azh f2722j;

    public azt(ayo ayo, bcg bcg, bbw bbw) {
        this.f2715c = ayo;
        this.f2716d = bcg;
        this.f2717e = bbw.f2894a;
        this.f2718f = bbw.f2898e;
        azy a = bbw.f2895b.mo2972a();
        this.f2719g = a;
        bcg.mo2989a(a);
        this.f2719g.mo2939a(this);
        azy a2 = bbw.f2896c.mo2972a();
        this.f2720h = a2;
        bcg.mo2989a(a2);
        this.f2720h.mo2939a(this);
        bam a3 = bbw.f2897d.mo2978a();
        this.f2721i = a3;
        a3.mo2956a(bcg);
        this.f2721i.mo2955a(this);
    }

    /* renamed from: a */
    public final void mo2922a() {
        this.f2715c.invalidateSelf();
    }

    /* renamed from: b */
    public final String mo2930b() {
        return this.f2717e;
    }

    /* renamed from: e */
    public final Path mo2933e() {
        Path e = this.f2722j.mo2933e();
        this.f2714b.reset();
        float floatValue = ((Float) this.f2719g.mo2944f()).floatValue();
        float floatValue2 = ((Float) this.f2720h.mo2944f()).floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f2713a.set(this.f2721i.mo2954a(((float) i) + floatValue2));
            this.f2714b.addPath(e, this.f2713a);
        }
        return this.f2714b;
    }

    /* renamed from: a */
    public final void mo2923a(Canvas canvas, Matrix matrix, int i) {
        float floatValue = ((Float) this.f2719g.mo2944f()).floatValue();
        float floatValue2 = ((Float) this.f2720h.mo2944f()).floatValue();
        float floatValue3 = ((Float) this.f2721i.f2776h.mo2944f()).floatValue() / 100.0f;
        float floatValue4 = ((Float) this.f2721i.f2777i.mo2944f()).floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f2713a.set(matrix);
            float f = (float) i2;
            this.f2713a.preConcat(this.f2721i.mo2954a(f + floatValue2));
            this.f2722j.mo2923a(canvas, this.f2713a, (int) (((float) i) * bem.m2819a(floatValue3, floatValue4, f / floatValue)));
        }
    }

    /* renamed from: a */
    public final void mo2924a(RectF rectF, Matrix matrix, boolean z) {
        this.f2722j.mo2924a(rectF, matrix, z);
    }

    /* renamed from: a */
    public final void mo2925a(bau bau, int i, List list, bau bau2) {
        bem.m2824a(bau, i, list, bau2, this);
    }

    /* renamed from: a */
    public final void mo2926a(Object obj, beq beq) {
        azy azy;
        if (!this.f2721i.mo2957a(obj, beq)) {
            if (obj == ayt.f2590q) {
                azy = this.f2719g;
            } else if (obj == ayt.f2591r) {
                azy = this.f2720h;
            } else {
                return;
            }
            azy.f2743d = beq;
        }
    }

    /* renamed from: a */
    public final void mo2927a(List list, List list2) {
        this.f2722j.mo2927a(list, list2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0004 A[LOOP:0: B:2:0x0004->B:5:0x000e, LOOP_START] */
    /* renamed from: a */
    public final void mo2934a(ListIterator listIterator) {
        if (this.f2722j == null) {
            while (listIterator.hasPrevious() && listIterator.previous() != this) {
            }
            ArrayList arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add(listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            this.f2722j = new azh(this.f2715c, this.f2716d, "Repeater", this.f2718f, arrayList, null);
        }
    }
}
