package com.google.android.spannedgridlayoutmanager;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.p002v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.cast.JGCastService;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SpannedGridLayoutManager extends abu {

    /* renamed from: F */
    private final Rect f151565F = new Rect();

    /* renamed from: G */
    private final bjcd f151566G = new bjcd();

    /* renamed from: H */
    private final bjce f151567H = new bjce(this);

    /* renamed from: I */
    private int f151568I;

    /* renamed from: a */
    public bjcf f151569a;

    /* renamed from: b */
    public bjca f151570b;

    /* renamed from: c */
    int[] f151571c;

    /* renamed from: d */
    public int f151572d;

    /* renamed from: e */
    public int f151573e;

    /* renamed from: f */
    public int f151574f;

    /* renamed from: g */
    int f151575g = 0;

    /* renamed from: h */
    final ArrayList f151576h = new ArrayList();

    /* renamed from: i */
    final ArrayList f151577i = new ArrayList();

    /* renamed from: j */
    final ArrayList f151578j = new ArrayList();

    /* renamed from: k */
    final ArrayList f151579k = new ArrayList();

    /* renamed from: l */
    aaw f151580l;

    /* renamed from: m */
    aaw f151581m;

    /* renamed from: n */
    public axcg f151582n;

    /* renamed from: o */
    private int f151583o;

    /* renamed from: p */
    private boolean f151584p;

    public SpannedGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        int[] iArr;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ayum.f98528a, i, i2);
        int i3 = obtainStyledAttributes.getInt(2, 1);
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        float[] fArr = null;
        if (resourceId != -1) {
            TypedArray obtainTypedArray = context.getResources().obtainTypedArray(resourceId);
            iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = obtainTypedArray.getDimensionPixelSize(i4, 0);
            }
            obtainTypedArray.recycle();
        } else {
            iArr = null;
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(3, -1);
        if (resourceId2 != -1) {
            TypedArray obtainTypedArray2 = context.getResources().obtainTypedArray(resourceId2);
            fArr = new float[i3];
            for (int i5 = 0; i5 < i3; i5++) {
                fArr[i5] = obtainTypedArray2.getFloat(i5, 1.0f);
            }
            obtainTypedArray2.recycle();
        }
        this.f151570b = new bjca(i3, fArr, iArr);
        int i6 = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.recycle();
        m117932b(i6);
        mo222E();
    }

    /* renamed from: G */
    private final void m117927G() {
        int d = this.f151569a.mo64992d(this.f151574f);
        this.f151572d = d;
        this.f151583o = this.f151574f;
        this.f151573e = d;
    }

    /* renamed from: a */
    private final bjce m117928a(int i, int i2, boolean z) {
        bjce bjce = this.f151567H;
        bjce.f122511d = i;
        bjce.f122512e = i2;
        bjce.f122513f = z;
        bjce.f122514g = false;
        bjce.f122510c = !z ? this.f151574f : this.f151583o;
        bjce.f122515h = false;
        return bjce;
    }

    /* renamed from: b */
    private final void m117932b(int i) {
        this.f151568I = i;
        if (i == 1) {
            this.f151580l = aaw.m168b(this);
            this.f151581m = aaw.m167a(this);
            return;
        }
        this.f151580l = aaw.m167a(this);
        this.f151581m = aaw.m168b(this);
    }

    /* renamed from: c */
    private static final int m117934c(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - i2) - i3, mode) : i;
    }

    /* renamed from: d */
    private final void m117935d(acc acc, acj acj) {
        bjce bjce = this.f151567H;
        bjce.f122508a = acc;
        bjce.f122509b = acj;
    }

    /* renamed from: D */
    public final void mo221D() {
        mo249t();
        this.f151569a = null;
        this.f151572d = 0;
        this.f151574f = 0;
        this.f151573e = 0;
        this.f151583o = 0;
        this.f151584p = false;
        this.f151575g = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final int mo71451F() {
        if (mo250u() != 0) {
            return this.f151572d;
        }
        return 0;
    }

    /* renamed from: b */
    public final boolean mo32b() {
        return true;
    }

    /* renamed from: e */
    public final int mo70e(acj acj) {
        if (this.f151568I == 1) {
            return mo250u();
        }
        return mo71457n();
    }

    /* renamed from: f */
    public final int mo73f(acj acj) {
        return this.f151568I != 1 ? mo71459q() : mo71456m();
    }

    /* renamed from: g */
    public final int mo74g(acj acj) {
        return this.f151568I != 1 ? mo71456m() : mo71459q();
    }

    /* renamed from: j */
    public final boolean mo77j() {
        if (this.f151568I == 1) {
            return mo71455l();
        }
        return true;
    }

    /* renamed from: k */
    public final boolean mo78k() {
        if (this.f151568I != 1) {
            return mo71455l();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo71455l() {
        return mo250u() > 0 && this.f151571c[this.f151570b.f122497a] > this.f151581m.mo124d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final int mo71456m() {
        if (mo250u() != 0) {
            return this.f151571c[this.f151570b.f122497a] - this.f151581m.mo124d();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final int mo71457n() {
        return this.f151581m.mo124d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final int mo71458p() {
        if (mo250u() != 0) {
            return this.f151575g;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final int mo71459q() {
        bjcf bjcf = this.f151569a;
        if (bjcf != null) {
            return bjcf.f122517a;
        }
        return 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abu.a(int, int, int, int, boolean):int
     arg types: [int, ?, int, int, int]
     candidates:
      abu.a(android.view.View, int, int, int, int):void
      abu.a(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean
      abu.a(int, int, int, int, boolean):int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abu.a(int, int, int, int, boolean):int
     arg types: [int, int, int, int, int]
     candidates:
      abu.a(android.view.View, int, int, int, int):void
      abu.a(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean
      abu.a(int, int, int, int, boolean):int */
    /* renamed from: a */
    private final void m117929a(View view, bjcc bjcc, int i, int i2, int i3) {
        int i4;
        int i5;
        if (this.f151568I == 1) {
            i5 = abu.m277a(i, (int) JGCastService.FLAG_PRIVATE_DISPLAY, 0, bjcc.width, false);
            i4 = abu.m277a(this.f116E, i3, 0, i2, true);
        } else {
            int a = abu.m277a(i, (int) JGCastService.FLAG_PRIVATE_DISPLAY, 0, bjcc.height, false);
            int a2 = abu.m277a(this.f115D, i3, 0, i2, true);
            i4 = a;
            i5 = a2;
        }
        mo230a(view, this.f151565F);
        view.measure(m117934c(i5, bjcc.leftMargin + this.f151565F.left, bjcc.rightMargin + this.f151565F.right), m117934c(i4, bjcc.topMargin + this.f151565F.top, bjcc.bottomMargin + this.f151565F.bottom));
    }

    /* renamed from: d */
    public final int mo68d(acj acj) {
        if (this.f151568I != 1) {
            return mo250u();
        }
        return mo71457n();
    }

    /* renamed from: b */
    private final void m117933b(int i, acc acc) {
        int d = this.f151569a.mo64992d(i);
        int f = this.f151569a.mo64994f(i);
        for (int i2 = f; i2 >= d; i2--) {
            mo223a(i2 - this.f151572d, acc);
        }
        if (i == this.f151574f) {
            int i3 = f + 1;
            this.f151572d = i3;
            this.f151574f = this.f151569a.mo64990b(i3);
        }
        if (i == this.f151583o) {
            int i4 = d - 1;
            this.f151573e = i4;
            this.f151583o = this.f151569a.mo64990b(i4);
        }
    }

    /* renamed from: e */
    public final void mo71e(int i) {
        if (i >= mo218A()) {
            i = mo218A() - 1;
        }
        this.f151574f = this.f151569a.mo64990b(i);
        m117927G();
        this.f151584p = true;
        mo249t();
        mo247r();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager.a(int, int, boolean):bjce
     arg types: [int, int, int]
     candidates:
      com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager.a(int, acc, acj):int
      abu.a(int, int, int):int
      abu.a(android.view.View, int, boolean):void
      abu.a(int, acc, acj):int
      abu.a(acc, int, int):void
      abu.a(android.graphics.Rect, int, int):void
      com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager.a(int, int, boolean):bjce */
    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo71454c(int i, acc acc, acj acj) {
        if (mo250u() == 0 || i == 0) {
            return 0;
        }
        m117935d(acc, acj);
        int d = this.f151580l.mo125d(mo245i(0));
        if (i >= 0) {
            int c = this.f151580l.mo123c(mo245i(mo250u() - 1));
            if (this.f151573e == mo218A() - 1) {
                i = Math.min(i, Math.max(c - this.f151580l.mo117a(), 0));
            }
            int i2 = c - i;
            if (i2 < this.f151580l.mo124d()) {
                bjce a = m117928a(this.f151580l.mo123c(mo245i(mo250u() - 1)), this.f151580l.mo124d() - i2, true);
                if (a.mo64988a()) {
                    m117930a(a);
                }
            }
            int c2 = this.f151580l.mo123c(mo245i(this.f151569a.mo64994f(this.f151574f) - this.f151572d));
            while (c2 - i < 0) {
                m117933b(this.f151574f, acc);
                c2 = this.f151580l.mo123c(mo245i(this.f151569a.mo64994f(this.f151574f) - this.f151572d));
            }
        } else {
            if (this.f151574f == 0) {
                i = Math.max(i, -(this.f151580l.mo122c() - d));
            }
            int i3 = d - i;
            if (i3 > 0) {
                bjce a2 = m117928a(d, i3, false);
                if (a2.mo64988a()) {
                    m117930a(a2);
                }
            }
            int d2 = this.f151580l.mo125d(mo245i(this.f151569a.mo64992d(this.f151583o) - this.f151572d));
            while (d2 - i > this.f151580l.mo124d()) {
                m117933b(this.f151583o, acc);
                d2 = this.f151580l.mo125d(mo245i(this.f151569a.mo64992d(this.f151583o) - this.f151572d));
            }
        }
        this.f151580l.mo119a(-i);
        return i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager.a(bjcb, android.view.View, int, int, boolean):void
     arg types: [bjcb, android.view.View, int, int, int]
     candidates:
      com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager.a(android.view.View, bjcc, int, int, int):void
      abu.a(int, int, int, int, boolean):int
      abu.a(android.view.View, int, int, int, int):void
      abu.a(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean
      com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager.a(bjcb, android.view.View, int, int, boolean):void */
    /* renamed from: a */
    private final void m117930a(bjce bjce) {
        int i;
        boolean z;
        bjce bjce2 = bjce;
        while (true) {
            if (bjce2.f122512e > 0 || bjce2.f122515h) {
                if (bjce2.f122513f && bjce2.f122516i.f151573e >= bjce2.f122509b.mo305a() - 1) {
                    return;
                }
                if (bjce2.f122513f || bjce2.f122516i.f151572d > 0) {
                    bjcd bjcd = this.f151566G;
                    bjcd.f122506a = 0;
                    bjcd.f122507b = true;
                    int d = this.f151569a.mo64992d(bjce2.f122510c);
                    int f = this.f151569a.mo64994f(bjce2.f122510c);
                    int i2 = (f - d) + 1;
                    int b = this.f151569a.mo64990b(d);
                    int b2 = (this.f151569a.mo64990b(f) - b) + this.f151569a.mo64989a(f).f122501b;
                    m117931a(this.f151576h, i2);
                    m117931a(this.f151578j, i2);
                    m117931a(this.f151577i, i2);
                    m117931a(this.f151579k, b2 + 1);
                    View[] viewArr = new View[i2];
                    int i3 = 0;
                    while (i3 < i2) {
                        int i4 = i3 + d;
                        View b3 = bjce2.f122508a.mo282b(i4);
                        bjcc bjcc = (bjcc) b3.getLayoutParams();
                        if (!bjcd.f122507b || bjcc.mo256a()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        bjcd.f122507b = z;
                        bjcb a = this.f151569a.mo64989a(i4);
                        viewArr[i3] = b3;
                        int[] iArr = this.f151571c;
                        int i5 = a.f122502c;
                        m117929a(b3, bjcc, iArr[a.f122503d + i5] - iArr[i5], this.f151568I != 1 ? bjcc.width : bjcc.height, 0);
                        this.f151577i.set(i3, Integer.valueOf(this.f151580l.mo118a(b3)));
                        this.f151576h.set(i3, 0);
                        this.f151578j.set(i3, Integer.valueOf(a.f122501b));
                        i3++;
                        viewArr = viewArr;
                        b2 = b2;
                        f = f;
                    }
                    View[] viewArr2 = viewArr;
                    int i6 = f;
                    int i7 = b2;
                    for (int i8 = 0; i8 < i7; i8++) {
                        this.f151579k.set(i8, null);
                    }
                    for (int i9 = 0; i9 < i7; i9++) {
                        int i10 = -1;
                        int i11 = -1;
                        for (int i12 = 0; i12 < i2; i12++) {
                            bjcb a2 = this.f151569a.mo64989a(i12 + d);
                            Integer num = (Integer) this.f151578j.get(i12);
                            if (num.intValue() > 0) {
                                int intValue = ((Integer) this.f151577i.get(i12)).intValue() / num.intValue();
                                int i13 = a2.f122501b;
                                int i14 = 0;
                                while (i14 < i13) {
                                    int i15 = i10;
                                    i10 = (a2.f122500a + i14) - b;
                                    bjcb bjcb = a2;
                                    if (this.f151579k.get(i10) == null && intValue > i11) {
                                        i11 = intValue;
                                    } else {
                                        i10 = i15;
                                    }
                                    i14++;
                                    a2 = bjcb;
                                }
                            }
                        }
                        this.f151579k.set(i10, Integer.valueOf(i11));
                        int i16 = i10 + b;
                        for (int i17 = 0; i17 < i2; i17++) {
                            bjcb a3 = this.f151569a.mo64989a(i17 + d);
                            int i18 = a3.f122500a;
                            if (i18 <= i16) {
                                if (i18 + a3.f122501b > i16) {
                                    ArrayList arrayList = this.f151578j;
                                    arrayList.set(i17, Integer.valueOf(((Integer) arrayList.get(i17)).intValue() - 1));
                                    ArrayList arrayList2 = this.f151577i;
                                    arrayList2.set(i17, Integer.valueOf(Math.max(0, ((Integer) arrayList2.get(i17)).intValue() - i11)));
                                    ArrayList arrayList3 = this.f151576h;
                                    arrayList3.set(i17, Integer.valueOf(((Integer) arrayList3.get(i17)).intValue() + i11));
                                }
                            }
                        }
                    }
                    if (!bjce2.f122513f) {
                        int i19 = bjce2.f122511d;
                        int i20 = i7;
                        while (i20 > 0) {
                            this.f151579k.set(i20, Integer.valueOf(i19));
                            i20--;
                            i19 -= ((Integer) this.f151579k.get(i20)).intValue();
                        }
                        this.f151579k.set(0, Integer.valueOf(i19));
                        for (int i21 = i2 - 1; i21 >= 0; i21--) {
                            bjcb a4 = this.f151569a.mo64989a(i21 + d);
                            int intValue2 = ((Integer) this.f151579k.get((a4.f122500a + a4.f122501b) - b)).intValue();
                            View view = viewArr2[i21];
                            if (bjce2.f122514g) {
                                mo229a(view, 0);
                            } else {
                                mo237b(view, 0);
                            }
                            mo71453a(a4, view, ((Integer) this.f151576h.get(i21)).intValue(), intValue2, false);
                        }
                        i = bjce2.f122511d - ((Integer) this.f151579k.get(0)).intValue();
                    } else {
                        int i22 = bjce2.f122511d;
                        int i23 = 0;
                        while (i23 < i7) {
                            int intValue3 = ((Integer) this.f151579k.get(i23)).intValue() + i22;
                            this.f151579k.set(i23, Integer.valueOf(i22));
                            i23++;
                            i22 = intValue3;
                        }
                        this.f151579k.set(i7, Integer.valueOf(i22));
                        for (int i24 = 0; i24 < i2; i24++) {
                            bjcb a5 = this.f151569a.mo64989a(i24 + d);
                            int intValue4 = ((Integer) this.f151579k.get(a5.f122500a - b)).intValue();
                            View view2 = viewArr2[i24];
                            if (bjce2.f122514g) {
                                mo228a(view2);
                            } else {
                                mo236b(view2);
                            }
                            mo71453a(a5, view2, ((Integer) this.f151576h.get(i24)).intValue(), intValue4, true);
                        }
                        i = ((Integer) this.f151579k.get(i7)).intValue() - bjce2.f122511d;
                    }
                    bjcd.f122506a = i;
                    if (!bjce2.f122514g) {
                        if (d < this.f151572d) {
                            this.f151572d = d;
                            this.f151574f = this.f151569a.mo64990b(d);
                        }
                        int i25 = i6;
                        if (i25 > this.f151573e) {
                            this.f151573e = i25;
                            this.f151583o = this.f151569a.mo64990b(i25);
                        }
                    }
                    bjcd bjcd2 = this.f151566G;
                    if (bjcd2.f122507b) {
                        bjce2.f122512e -= bjcd2.f122506a;
                    }
                    int i26 = bjcd2.f122506a;
                    if (!bjce2.f122513f) {
                        bjce2.f122511d -= i26;
                    } else {
                        bjce2.f122511d += i26;
                    }
                    bjce.mo64988a();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final int mo30b(int i, acc acc, acj acj) {
        return this.f151568I != 1 ? mo71452a(i) : mo71454c(i, acc, acj);
    }

    /* renamed from: b */
    public final int mo60b(acj acj) {
        return this.f151568I != 1 ? mo71451F() : mo71458p();
    }

    public SpannedGridLayoutManager(axcg axcg, int i) {
        this.f151582n = axcg;
        this.f151570b = new bjca(i);
        mo222E();
        m117932b(1);
    }

    /* renamed from: c */
    public final int mo65c(acj acj) {
        return this.f151568I != 1 ? mo71458p() : mo71451F();
    }

    /* renamed from: c */
    public final View mo66c(int i) {
        int i2 = this.f151572d;
        if (i < i2 || i > this.f151573e) {
            return null;
        }
        return mo245i(i - i2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager.a(int, int, boolean):bjce
     arg types: [int, int, int]
     candidates:
      com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager.a(int, acc, acj):int
      abu.a(int, int, int):int
      abu.a(android.view.View, int, boolean):void
      abu.a(int, acc, acj):int
      abu.a(acc, int, int):void
      abu.a(android.graphics.Rect, int, int):void
      com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager.a(int, int, boolean):bjce */
    /* renamed from: c */
    public final void mo34c(acc acc, acj acj) {
        float f;
        int i;
        this.f151571c = new int[(this.f151570b.f122497a + 1)];
        float f2 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f3 = 0.0f;
        while (true) {
            bjca bjca = this.f151570b;
            if (i2 >= bjca.f122497a) {
                break;
            }
            f3 += bjca.f122498b[i2];
            i3 += bjca.f122499c[i2];
            i2++;
        }
        this.f151571c[0] = this.f151581m.mo122c();
        int d = this.f151581m.mo124d();
        if (i3 < d) {
            f = ((float) (d - i3)) / f3;
        } else {
            f = 0.0f;
        }
        int i4 = 1;
        while (true) {
            bjca bjca2 = this.f151570b;
            if (i4 > bjca2.f122497a) {
                break;
            }
            int i5 = i4 - 1;
            float f4 = (bjca2.f122498b[i5] * f) + f2;
            int i6 = (int) f4;
            if (f4 - ((float) i6) > 0.99999f) {
                i6++;
            }
            int i7 = bjca2.f122499c[i5];
            int[] iArr = this.f151571c;
            iArr[i4] = iArr[i5] + i6 + i7;
            i4++;
            f2 = f4 - ((float) i6);
        }
        this.f151569a = new bjcf(this, acc, acj.mo305a());
        if (acj.mo305a() == 0) {
            mo224a(acc);
            this.f151574f = 0;
            m117927G();
            return;
        }
        m117935d(acc, acj);
        int c = this.f151580l.mo122c();
        if (this.f151584p) {
            c = -this.f151574f;
            this.f151584p = false;
            i = 0;
        } else if (mo250u() != 0) {
            int d2 = this.f151580l.mo125d(mo245i(0));
            int i8 = d2 - this.f151574f;
            m117927G();
            i = d2;
            c = i8;
        } else {
            i = 0;
        }
        mo224a(acc);
        bjce a = m117928a(c, this.f151580l.mo124d() - i, true);
        a.f122515h = this.f151580l.mo128f() == 0 && this.f151580l.mo120b() == 0;
        m117930a(a);
        int i9 = a.f122511d;
        if (a.f122512e > 0) {
            a.f122513f = false;
            a.f122510c = this.f151574f;
            a.f122511d = c;
            if (a.mo64988a()) {
                m117930a(a);
                c = a.f122511d;
            }
        }
        if (a.f122509b.f187k && mo250u() != 0 && !a.f122509b.f183g) {
            List list = a.f122508a.f147d;
            int size = list.size();
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                acm acm = (acm) list.get(i12);
                bjcc bjcc = (bjcc) acm.f201a.getLayoutParams();
                if (bjcc == null || !bjcc.mo256a()) {
                    bjcb a2 = this.f151569a.mo64989a(acm.mo322c());
                    if (a2.f122502c == 0) {
                        if (a2.f122500a < this.f151574f) {
                            i10 += this.f151580l.mo118a(acm.f201a);
                        } else {
                            i11 += this.f151580l.mo118a(acm.f201a);
                        }
                    }
                }
            }
            bjce a3 = m117928a(c, i10, false);
            a3.f122514g = true;
            if (i10 > 0 && a3.mo64988a()) {
                m117930a(a3);
            }
            bjce a4 = m117928a(i9, i11, true);
            a4.f122514g = true;
            if (i11 > 0 && a4.mo64988a()) {
                m117930a(a4);
            }
        }
    }

    /* renamed from: a */
    private static final void m117931a(ArrayList arrayList, int i) {
        arrayList.ensureCapacity(i);
        for (int size = arrayList.size(); size < i; size++) {
            arrayList.add(null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo71452a(int i) {
        if (mo250u() == 0 || i == 0) {
            return 0;
        }
        int m = mo71456m();
        if (i < 0) {
            int i2 = this.f151575g;
            if (i + i2 < 0) {
                i = -i2;
                this.f151575g += i;
                this.f151581m.mo119a(-i);
                return i;
            }
        }
        if (i > 0) {
            int i3 = this.f151575g;
            if (i + i3 > m) {
                i = m - i3;
            }
        }
        this.f151575g += i;
        this.f151581m.mo119a(-i);
        return i;
    }

    /* renamed from: a */
    public final int mo15a(int i, acc acc, acj acj) {
        return this.f151568I != 1 ? mo71454c(i, acc, acj) : mo71452a(i);
    }

    /* renamed from: a */
    public final abv mo17a() {
        return new bjcc();
    }

    /* renamed from: a */
    public final abv mo18a(Context context, AttributeSet attributeSet) {
        return new bjcc(context, attributeSet);
    }

    /* renamed from: a */
    public final abv mo19a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new bjcc((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new bjcc(layoutParams);
    }

    /* renamed from: a */
    public final void mo57a(RecyclerView recyclerView, int i) {
        if (i >= mo218A()) {
            i = mo218A() - 1;
        }
        bjbz bjbz = new bjbz(this, recyclerView.getContext());
        bjbz.f161a = i;
        mo226a(bjbz);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo71453a(bjcb bjcb, View view, int i, int i2, boolean z) {
        int i3;
        bjcc bjcc = (bjcc) view.getLayoutParams();
        int[] iArr = this.f151571c;
        int i4 = bjcb.f122502c;
        m117929a(view, bjcc, iArr[bjcb.f122503d + i4] - iArr[i4], i, (int) JGCastService.FLAG_PRIVATE_DISPLAY);
        int i5 = this.f151571c[bjcb.f122502c] - this.f151575g;
        int b = this.f151580l.mo121b(view) + i5;
        if (z) {
            i3 = this.f151580l.mo118a(view) + i2;
        } else {
            i3 = i2;
            i2 -= this.f151580l.mo118a(view);
        }
        if (this.f151568I != 1) {
            abu.m278a(view, i2 + C1260oz.m19820a(bjcc), i5 - bjcc.bottomMargin, i3 + C1260oz.m19820a(bjcc), b - bjcc.bottomMargin);
        } else if (mo248s() == 1) {
            int[] iArr2 = this.f151571c;
            int i6 = iArr2[iArr2.length - 1];
            abu.m278a(view, i6 - (b + C1260oz.m19822b(bjcc)), i2 + bjcc.topMargin, i6 - (i5 + C1260oz.m19822b(bjcc)), i3 + bjcc.topMargin);
        } else {
            abu.m278a(view, i5 + C1260oz.m19820a(bjcc), i2 + bjcc.topMargin, b + C1260oz.m19820a(bjcc), i3 + bjcc.topMargin);
        }
        bjcc.f122504a = bjcb.f122503d;
        bjcc.f122505b = bjcb.f122501b;
    }

    /* renamed from: a */
    public final boolean mo29a(abv abv) {
        return abv instanceof bjcc;
    }
}
