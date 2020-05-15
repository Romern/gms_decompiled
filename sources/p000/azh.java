package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: azh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azh implements azi, azq, azx, bav {

    /* renamed from: a */
    private final Matrix f2628a;

    /* renamed from: b */
    private final Path f2629b;

    /* renamed from: c */
    private final RectF f2630c;

    /* renamed from: d */
    private final String f2631d;

    /* renamed from: e */
    private final boolean f2632e;

    /* renamed from: f */
    private final List f2633f;

    /* renamed from: g */
    private final ayo f2634g;

    /* renamed from: h */
    private List f2635h;

    /* renamed from: i */
    private bam f2636i;

    /* JADX WARNING: Illegal instructions before constructor call */
    public azh(ayo ayo, bcg bcg, bbz bbz) {
        this(ayo, bcg, r3, r4, r5, r6);
        bbk bbk;
        String str = bbz.f2908a;
        boolean z = bbz.f2910c;
        List list = bbz.f2909b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            azg a = ((bbo) list.get(i2)).mo2977a(ayo, bcg);
            if (a != null) {
                arrayList.add(a);
            }
        }
        List list2 = bbz.f2909b;
        while (true) {
            if (i >= list2.size()) {
                bbk = null;
                break;
            }
            bbo bbo = (bbo) list2.get(i);
            if (bbo instanceof bbk) {
                bbk = (bbk) bbo;
                break;
            }
            i++;
        }
    }

    /* renamed from: a */
    public final void mo2922a() {
        this.f2634g.invalidateSelf();
    }

    /* renamed from: b */
    public final String mo2930b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final List mo2931c() {
        if (this.f2635h == null) {
            this.f2635h = new ArrayList();
            for (int i = 0; i < this.f2633f.size(); i++) {
                azg azg = (azg) this.f2633f.get(i);
                if (azg instanceof azq) {
                    this.f2635h.add((azq) azg);
                }
            }
        }
        return this.f2635h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Matrix mo2932d() {
        bam bam = this.f2636i;
        if (bam != null) {
            return bam.mo2953a();
        }
        this.f2628a.reset();
        return this.f2628a;
    }

    /* renamed from: e */
    public final Path mo2933e() {
        this.f2628a.reset();
        bam bam = this.f2636i;
        if (bam != null) {
            this.f2628a.set(bam.mo2953a());
        }
        this.f2629b.reset();
        if (!this.f2632e) {
            for (int size = this.f2633f.size() - 1; size >= 0; size--) {
                azg azg = (azg) this.f2633f.get(size);
                if (azg instanceof azq) {
                    this.f2629b.addPath(((azq) azg).mo2933e(), this.f2628a);
                }
            }
        }
        return this.f2629b;
    }

    /* renamed from: a */
    public final void mo2923a(Canvas canvas, Matrix matrix, int i) {
        int i2;
        if (!this.f2632e) {
            this.f2628a.set(matrix);
            bam bam = this.f2636i;
            if (bam != null) {
                this.f2628a.preConcat(bam.mo2953a());
                azy azy = this.f2636i.f2773e;
                if (azy != null) {
                    i2 = ((Integer) azy.mo2944f()).intValue();
                } else {
                    i2 = 100;
                }
                i = (int) ((((((float) i2) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
            }
            for (int size = this.f2633f.size() - 1; size >= 0; size--) {
                Object obj = this.f2633f.get(size);
                if (obj instanceof azi) {
                    ((azi) obj).mo2923a(canvas, this.f2628a, i);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo2924a(RectF rectF, Matrix matrix, boolean z) {
        this.f2628a.set(matrix);
        bam bam = this.f2636i;
        if (bam != null) {
            this.f2628a.preConcat(bam.mo2953a());
        }
        this.f2630c.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f2633f.size() - 1; size >= 0; size--) {
            azg azg = (azg) this.f2633f.get(size);
            if (azg instanceof azi) {
                ((azi) azg).mo2924a(this.f2630c, this.f2628a, z);
                rectF.union(this.f2630c);
            }
        }
    }

    public azh(ayo ayo, bcg bcg, String str, boolean z, List list, bbk bbk) {
        new azc();
        new RectF();
        this.f2628a = new Matrix();
        this.f2629b = new Path();
        this.f2630c = new RectF();
        this.f2631d = str;
        this.f2634g = ayo;
        this.f2632e = z;
        this.f2633f = list;
        if (bbk != null) {
            bam a = bbk.mo2978a();
            this.f2636i = a;
            a.mo2956a(bcg);
            this.f2636i.mo2955a(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            azg azg = (azg) list.get(size);
            if (azg instanceof azn) {
                arrayList.add((azn) azg);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((azn) arrayList.get(size2)).mo2934a(list.listIterator(list.size()));
        }
    }

    /* renamed from: a */
    public final void mo2925a(bau bau, int i, List list, bau bau2) {
        if (bau.mo2963a(this.f2631d, i)) {
            if (!"__container".equals(this.f2631d)) {
                bau2 = bau2.mo2962a(this.f2631d);
                if (bau.mo2965c(this.f2631d, i)) {
                    list.add(bau2.mo2961a(this));
                }
            }
            if (bau.mo2966d(this.f2631d, i)) {
                int b = i + bau.mo2964b(this.f2631d, i);
                for (int i2 = 0; i2 < this.f2633f.size(); i2++) {
                    azg azg = (azg) this.f2633f.get(i2);
                    if (azg instanceof bav) {
                        ((bav) azg).mo2925a(bau, b, list, bau2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo2926a(Object obj, beq beq) {
        bam bam = this.f2636i;
        if (bam != null) {
            bam.mo2957a(obj, beq);
        }
    }

    /* renamed from: a */
    public final void mo2927a(List list, List list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f2633f.size());
        arrayList.addAll(list);
        for (int size = this.f2633f.size() - 1; size >= 0; size--) {
            azg azg = (azg) this.f2633f.get(size);
            azg.mo2927a(arrayList, this.f2633f.subList(0, size));
            arrayList.add(azg);
        }
    }
}
