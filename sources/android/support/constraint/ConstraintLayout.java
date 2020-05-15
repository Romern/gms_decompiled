package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.cast.JGCastService;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: a */
    SparseArray f978a = new SparseArray();

    /* renamed from: b */
    C0987fi f979b = new C0987fi();

    /* renamed from: c */
    public C0973ew f980c = null;

    /* renamed from: d */
    private final ArrayList f981d = new ArrayList(100);

    /* renamed from: e */
    private int f982e = 0;

    /* renamed from: f */
    private int f983f = 0;

    /* renamed from: g */
    private int f984g = Integer.MAX_VALUE;

    /* renamed from: h */
    private int f985h = Integer.MAX_VALUE;

    /* renamed from: i */
    private boolean f986i = true;

    /* renamed from: j */
    private int f987j = 2;

    public ConstraintLayout(Context context) {
        super(context);
        m1169a((AttributeSet) null);
    }

    /* renamed from: a */
    private final C0986fh m1167a(int i) {
        if (i == 0) {
            return this.f979b;
        }
        View view = (View) this.f978a.get(i);
        if (view == this) {
            return this.f979b;
        }
        if (view != null) {
            return ((C0971eu) view.getLayoutParams()).f15724Y;
        }
        return null;
    }

    /* renamed from: b */
    public static final C0971eu m1170b() {
        return new C0971eu();
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        int i2 = Build.VERSION.SDK_INT;
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0971eu;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1170b();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0971eu(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0971eu euVar = (C0971eu) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || euVar.f15716Q || isInEditMode) {
                C0986fh fhVar = euVar.f15724Y;
                int g = fhVar.mo10825g();
                int h = fhVar.mo10827h();
                childAt.layout(g, h, fhVar.mo10816c() + g, fhVar.mo10823f() + h);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Object obj;
        int i8;
        int i9;
        boolean z;
        boolean z2;
        int i10;
        boolean z3;
        int baseline;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f;
        int i16;
        C0986fh a;
        C0986fh a2;
        C0986fh a3;
        C0986fh a4;
        int i17 = i;
        int i18 = i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        C0987fi fiVar = this.f979b;
        fiVar.f16589w = paddingLeft;
        fiVar.f16590x = paddingTop;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop2 = getPaddingTop() + getPaddingBottom();
        int paddingLeft2 = getPaddingLeft() + getPaddingRight();
        getLayoutParams();
        if (mode == Integer.MIN_VALUE) {
            i3 = 2;
        } else if (mode == 0) {
            i3 = 2;
            size = 0;
        } else if (mode != 1073741824) {
            i3 = 1;
            size = 0;
        } else {
            size = Math.min(this.f984g, size) - paddingLeft2;
            i3 = 1;
        }
        if (mode2 == Integer.MIN_VALUE) {
            i4 = 2;
        } else if (mode2 == 0) {
            i4 = 2;
            size2 = 0;
        } else if (mode2 != 1073741824) {
            i4 = 1;
            size2 = 0;
        } else {
            size2 = Math.min(this.f985h, size2) - paddingTop2;
            i4 = 1;
        }
        this.f979b.mo10817c(0);
        this.f979b.mo10820d(0);
        this.f979b.mo10824f(i3);
        this.f979b.mo10808a(size);
        this.f979b.mo10826g(i4);
        this.f979b.mo10813b(size2);
        this.f979b.mo10817c((this.f982e - getPaddingLeft()) - getPaddingRight());
        this.f979b.mo10820d((this.f983f - getPaddingTop()) - getPaddingBottom());
        int i19 = -1;
        if (this.f986i) {
            this.f986i = false;
            int childCount = getChildCount();
            int i20 = 0;
            while (true) {
                if (i20 >= childCount) {
                    break;
                } else if (getChildAt(i20).isLayoutRequested()) {
                    this.f981d.clear();
                    C0973ew ewVar = this.f980c;
                    if (ewVar != null) {
                        ewVar.mo10546c(this);
                    }
                    int childCount2 = getChildCount();
                    this.f979b.f16877al.clear();
                    int i21 = 0;
                    while (i21 < childCount2) {
                        View childAt = getChildAt(i21);
                        C0986fh a5 = m1168a(childAt);
                        if (a5 != null) {
                            C0971eu euVar = (C0971eu) childAt.getLayoutParams();
                            a5.mo10807a();
                            a5.f16544K = childAt.getVisibility();
                            a5.f16543J = childAt;
                            C0987fi fiVar2 = this.f979b;
                            fiVar2.f16877al.add(a5);
                            C0986fh fhVar = a5.f16584r;
                            if (fhVar != null) {
                                ((C0991fm) fhVar).mo11018a(a5);
                            }
                            a5.f16584r = fiVar2;
                            if (!euVar.f15714O || !euVar.f15713N) {
                                this.f981d.add(a5);
                            }
                            if (euVar.f15716Q) {
                                C0988fj fjVar = (C0988fj) a5;
                                int i22 = euVar.f15725a;
                                if (i22 != i19 && i22 >= 0) {
                                    fjVar.f16698af = -1.0f;
                                    fjVar.f16699ag = i22;
                                    fjVar.f16700ah = i19;
                                }
                                int i23 = euVar.f15726b;
                                if (i23 != i19 && i23 >= 0) {
                                    fjVar.f16698af = -1.0f;
                                    fjVar.f16699ag = i19;
                                    fjVar.f16700ah = i23;
                                }
                                float f2 = euVar.f15727c;
                                if (f2 != -1.0f && f2 > -1.0f) {
                                    fjVar.f16698af = f2;
                                    fjVar.f16699ag = i19;
                                    fjVar.f16700ah = i19;
                                }
                                i13 = childCount2;
                            } else if (euVar.f15717R == i19 && euVar.f15718S == i19 && euVar.f15719T == i19 && euVar.f15720U == i19 && euVar.f15732h == i19 && euVar.f15733i == i19 && euVar.f15734j == i19 && euVar.f15735k == i19 && euVar.f15736l == i19 && euVar.f15710K == i19 && euVar.f15711L == i19 && euVar.width != i19 && euVar.height != i19) {
                                i13 = childCount2;
                            } else {
                                int i24 = euVar.f15717R;
                                int i25 = euVar.f15718S;
                                int i26 = euVar.f15719T;
                                int i27 = euVar.f15720U;
                                int i28 = euVar.f15721V;
                                int i29 = euVar.f15722W;
                                float f3 = euVar.f15723X;
                                int i30 = Build.VERSION.SDK_INT;
                                i13 = childCount2;
                                if (i24 != -1) {
                                    C0986fh a6 = m1167a(i24);
                                    if (a6 != null) {
                                        a5.mo10810a(2, a6, 2, euVar.leftMargin, i28);
                                    }
                                } else if (!(i25 == -1 || (a4 = m1167a(i25)) == null)) {
                                    a5.mo10810a(2, a4, 4, euVar.leftMargin, i28);
                                }
                                if (i26 != -1) {
                                    C0986fh a7 = m1167a(i26);
                                    if (a7 != null) {
                                        a5.mo10810a(4, a7, 2, euVar.rightMargin, i29);
                                    }
                                } else if (!(i27 == -1 || (a3 = m1167a(i27)) == null)) {
                                    a5.mo10810a(4, a3, 4, euVar.rightMargin, i29);
                                }
                                int i31 = euVar.f15732h;
                                if (i31 != -1) {
                                    C0986fh a8 = m1167a(i31);
                                    if (a8 != null) {
                                        a5.mo10810a(3, a8, 3, euVar.topMargin, euVar.f15742r);
                                    }
                                } else {
                                    int i32 = euVar.f15733i;
                                    if (!(i32 == -1 || (a2 = m1167a(i32)) == null)) {
                                        a5.mo10810a(3, a2, 5, euVar.topMargin, euVar.f15742r);
                                    }
                                }
                                int i33 = euVar.f15734j;
                                if (i33 != -1) {
                                    C0986fh a9 = m1167a(i33);
                                    if (a9 != null) {
                                        a5.mo10810a(5, a9, 3, euVar.bottomMargin, euVar.f15744t);
                                    }
                                } else {
                                    int i34 = euVar.f15735k;
                                    if (!(i34 == -1 || (a = m1167a(i34)) == null)) {
                                        a5.mo10810a(5, a, 5, euVar.bottomMargin, euVar.f15744t);
                                    }
                                }
                                int i35 = euVar.f15736l;
                                if (i35 != -1) {
                                    View view = (View) this.f978a.get(i35);
                                    C0986fh a10 = m1167a(euVar.f15736l);
                                    if (!(a10 == null || view == null || !(view.getLayoutParams() instanceof C0971eu))) {
                                        euVar.f15715P = true;
                                        ((C0971eu) view.getLayoutParams()).f15715P = true;
                                        a5.mo10822e(6).mo10794a(a10.mo10822e(6), 0, -1, 2, 0, true);
                                        a5.mo10822e(3).mo10795b();
                                        a5.mo10822e(5).mo10795b();
                                    }
                                }
                                if (f3 >= 0.0f && f3 != 0.5f) {
                                    a5.f16541H = f3;
                                }
                                float f4 = euVar.f15748x;
                                if (f4 >= 0.0f && f4 != 0.5f) {
                                    a5.f16542I = f4;
                                }
                                if (isInEditMode() && !((i16 = euVar.f15710K) == -1 && euVar.f15711L == -1)) {
                                    int i36 = euVar.f15711L;
                                    a5.f16589w = i16;
                                    a5.f16590x = i36;
                                }
                                if (euVar.f15713N) {
                                    a5.mo10824f(1);
                                    a5.mo10808a(euVar.width);
                                } else if (euVar.width == -1) {
                                    a5.mo10824f(4);
                                    a5.mo10822e(2).f16488c = euVar.leftMargin;
                                    a5.mo10822e(4).f16488c = euVar.rightMargin;
                                } else {
                                    a5.mo10824f(3);
                                    a5.mo10808a(0);
                                }
                                if (euVar.f15714O) {
                                    a5.mo10826g(1);
                                    a5.mo10813b(euVar.height);
                                } else if (euVar.height == -1) {
                                    a5.mo10826g(4);
                                    a5.mo10822e(3).f16488c = euVar.topMargin;
                                    a5.mo10822e(5).f16488c = euVar.bottomMargin;
                                } else {
                                    a5.mo10826g(3);
                                    a5.mo10813b(0);
                                }
                                String str = euVar.f15749y;
                                if (str != null) {
                                    if (str.length() != 0) {
                                        int length = str.length();
                                        int indexOf = str.indexOf(44);
                                        if (indexOf <= 0) {
                                            i15 = 0;
                                            i14 = -1;
                                        } else if (indexOf < length - 1) {
                                            String substring = str.substring(0, indexOf);
                                            i14 = !substring.equalsIgnoreCase("W") ? substring.equalsIgnoreCase("H") ? 1 : -1 : 0;
                                            i15 = indexOf + 1;
                                        } else {
                                            i15 = 0;
                                            i14 = -1;
                                        }
                                        int indexOf2 = str.indexOf(58);
                                        if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                            String substring2 = str.substring(i15, indexOf2);
                                            String substring3 = str.substring(indexOf2 + 1);
                                            if (substring2.length() > 0 && substring3.length() > 0) {
                                                try {
                                                    float parseFloat = Float.parseFloat(substring2);
                                                    float parseFloat2 = Float.parseFloat(substring3);
                                                    if (parseFloat > 0.0f) {
                                                        f = parseFloat2 <= 0.0f ? 0.0f : i14 != 1 ? Math.abs(parseFloat / parseFloat2) : Math.abs(parseFloat2 / parseFloat);
                                                    }
                                                } catch (NumberFormatException e) {
                                                    f = 0.0f;
                                                }
                                            }
                                            f = 0.0f;
                                        } else {
                                            String substring4 = str.substring(i15);
                                            f = substring4.length() > 0 ? Float.parseFloat(substring4) : 0.0f;
                                        }
                                        if (f > 0.0f) {
                                            a5.f16587u = f;
                                            a5.f16588v = i14;
                                        }
                                    } else {
                                        a5.f16587u = 0.0f;
                                    }
                                }
                                a5.f16559Z = euVar.f15700A;
                                a5.f16561aa = euVar.f15701B;
                                a5.f16555V = euVar.f15702C;
                                a5.f16556W = euVar.f15703D;
                                int i37 = euVar.f15704E;
                                int i38 = euVar.f15706G;
                                int i39 = euVar.f15708I;
                                a5.f16569c = i37;
                                a5.f16571e = i38;
                                a5.f16572f = i39;
                                int i40 = euVar.f15705F;
                                int i41 = euVar.f15707H;
                                int i42 = euVar.f15709J;
                                a5.f16570d = i40;
                                a5.f16573g = i41;
                                a5.f16574h = i42;
                            }
                        } else {
                            i13 = childCount2;
                        }
                        i21++;
                        childCount2 = i13;
                        i19 = -1;
                    }
                } else {
                    i20++;
                    i19 = -1;
                }
            }
        }
        int paddingTop3 = getPaddingTop() + getPaddingBottom();
        int paddingLeft3 = getPaddingLeft() + getPaddingRight();
        int childCount3 = getChildCount();
        int i43 = 0;
        while (true) {
            i5 = 8;
            if (i43 >= childCount3) {
                break;
            }
            View childAt2 = getChildAt(i43);
            if (childAt2.getVisibility() != 8) {
                C0971eu euVar2 = (C0971eu) childAt2.getLayoutParams();
                C0986fh fhVar2 = euVar2.f15724Y;
                if (!euVar2.f15716Q) {
                    int i44 = euVar2.width;
                    int i45 = euVar2.height;
                    if (euVar2.f15713N || euVar2.f15714O || euVar2.f15704E == 1 || euVar2.width == -1 || (!euVar2.f15714O && (euVar2.f15705F == 1 || euVar2.height == -1))) {
                        if (i44 == 0 || i44 == -1) {
                            i11 = ViewGroup.getChildMeasureSpec(i17, paddingLeft3, -2);
                            z3 = true;
                        } else {
                            i11 = ViewGroup.getChildMeasureSpec(i17, paddingLeft3, i44);
                            z3 = false;
                        }
                        if (i45 == 0 || i45 == -1) {
                            i12 = ViewGroup.getChildMeasureSpec(i18, paddingTop3, -2);
                            z2 = true;
                        } else {
                            i12 = ViewGroup.getChildMeasureSpec(i18, paddingTop3, i45);
                            z2 = false;
                        }
                        childAt2.measure(i11, i12);
                        i10 = childAt2.getMeasuredWidth();
                        i45 = childAt2.getMeasuredHeight();
                    } else {
                        i10 = i44;
                        z3 = false;
                        z2 = false;
                    }
                    fhVar2.mo10808a(i10);
                    fhVar2.mo10813b(i45);
                    if (z3) {
                        fhVar2.f16539F = i10;
                    }
                    if (z2) {
                        fhVar2.f16540G = i45;
                    }
                    if (euVar2.f15715P && (baseline = childAt2.getBaseline()) != -1) {
                        fhVar2.f16536C = baseline;
                    }
                }
            }
            i43++;
        }
        if (getChildCount() > 0) {
            mo1082a();
        }
        int size3 = this.f981d.size();
        int paddingBottom = paddingTop + getPaddingBottom();
        int paddingRight = paddingLeft + getPaddingRight();
        if (size3 > 0) {
            C0987fi fiVar3 = this.f979b;
            int i46 = fiVar3.f16564ad;
            int i47 = fiVar3.f16565ae;
            int i48 = 0;
            int i49 = 0;
            boolean z4 = false;
            while (i49 < size3) {
                C0986fh fhVar3 = (C0986fh) this.f981d.get(i49);
                if (!(fhVar3 instanceof C0988fj) && (obj = fhVar3.f16543J) != null) {
                    View view2 = (View) obj;
                    if (view2.getVisibility() != i5) {
                        C0971eu euVar3 = (C0971eu) view2.getLayoutParams();
                        if (euVar3.width == -2) {
                            i8 = ViewGroup.getChildMeasureSpec(i17, paddingRight, euVar3.width);
                        } else {
                            i8 = View.MeasureSpec.makeMeasureSpec(fhVar3.mo10816c(), JGCastService.FLAG_PRIVATE_DISPLAY);
                        }
                        if (euVar3.height == -2) {
                            i9 = ViewGroup.getChildMeasureSpec(i18, paddingBottom, euVar3.height);
                        } else {
                            i9 = View.MeasureSpec.makeMeasureSpec(fhVar3.mo10823f(), JGCastService.FLAG_PRIVATE_DISPLAY);
                        }
                        view2.measure(i8, i9);
                        int measuredWidth = view2.getMeasuredWidth();
                        int measuredHeight = view2.getMeasuredHeight();
                        if (measuredWidth != fhVar3.mo10816c()) {
                            fhVar3.mo10808a(measuredWidth);
                            if (i46 != 2 || fhVar3.mo10828i() <= this.f979b.mo10816c()) {
                                i7 = size3;
                                z = true;
                            } else {
                                i7 = size3;
                                this.f979b.mo10808a(Math.max(this.f982e, fhVar3.mo10828i() + fhVar3.mo10822e(4).mo10793a()));
                                z = true;
                            }
                        } else {
                            i7 = size3;
                            z = z4;
                        }
                        if (measuredHeight != fhVar3.mo10823f()) {
                            fhVar3.mo10813b(measuredHeight);
                            if (i47 != 2 || fhVar3.mo10829j() <= this.f979b.mo10823f()) {
                                z = true;
                            } else {
                                this.f979b.mo10813b(Math.max(this.f983f, fhVar3.mo10829j() + fhVar3.mo10822e(5).mo10793a()));
                                z = true;
                            }
                        }
                        if (euVar3.f15715P) {
                            int baseline2 = view2.getBaseline();
                            if (!(baseline2 == -1 || baseline2 == fhVar3.f16536C)) {
                                fhVar3.f16536C = baseline2;
                                z = true;
                            }
                        }
                        int i50 = Build.VERSION.SDK_INT;
                        i48 = combineMeasuredStates(i48, view2.getMeasuredState());
                        z4 = z;
                        i49++;
                        size3 = i7;
                        i5 = 8;
                    }
                }
                i7 = size3;
                i49++;
                size3 = i7;
                i5 = 8;
            }
            if (z4) {
                mo1082a();
            }
            i6 = i48;
        } else {
            i6 = 0;
        }
        int c = this.f979b.mo10816c();
        int f5 = this.f979b.mo10823f();
        int i51 = Build.VERSION.SDK_INT;
        int resolveSizeAndState = resolveSizeAndState(c + paddingRight, i17, i6);
        int resolveSizeAndState2 = resolveSizeAndState(f5 + paddingBottom, i18, i6 << 16);
        int min = Math.min(this.f984g, resolveSizeAndState) & 16777215;
        int min2 = Math.min(this.f985h, resolveSizeAndState2) & 16777215;
        C0987fi fiVar4 = this.f979b;
        if (fiVar4.f16623aj) {
            min |= 16777216;
        }
        if (fiVar4.f16624ak) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
    }

    public final void onViewAdded(View view) {
        int i = Build.VERSION.SDK_INT;
        super.onViewAdded(view);
        C0986fh a = m1168a(view);
        if ((view instanceof Guideline) && !(a instanceof C0988fj)) {
            C0971eu euVar = (C0971eu) view.getLayoutParams();
            euVar.f15724Y = new C0988fj();
            euVar.f15716Q = true;
            ((C0988fj) euVar.f15724Y).mo10880h(euVar.f15712M);
            C0986fh fhVar = euVar.f15724Y;
        }
        this.f978a.put(view.getId(), view);
        this.f986i = true;
    }

    public final void onViewRemoved(View view) {
        int i = Build.VERSION.SDK_INT;
        super.onViewRemoved(view);
        this.f978a.remove(view.getId());
        this.f979b.mo11018a(m1168a(view));
        this.f986i = true;
    }

    public final void removeView(View view) {
        super.removeView(view);
        int i = Build.VERSION.SDK_INT;
    }

    public final void requestLayout() {
        super.requestLayout();
        this.f986i = true;
    }

    public final void setId(int i) {
        this.f978a.remove(getId());
        super.setId(i);
        this.f978a.put(getId(), this);
    }

    /* renamed from: a */
    private final C0986fh m1168a(View view) {
        if (view == this) {
            return this.f979b;
        }
        if (view != null) {
            return ((C0971eu) view.getLayoutParams()).f15724Y;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0971eu(layoutParams);
    }

    /* renamed from: a */
    private final void m1169a(AttributeSet attributeSet) {
        this.f979b.f16543J = this;
        this.f978a.put(getId(), this);
        this.f980c = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0974ex.f15960a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 8) {
                    this.f982e = obtainStyledAttributes.getDimensionPixelOffset(8, this.f982e);
                } else if (index == 9) {
                    this.f983f = obtainStyledAttributes.getDimensionPixelOffset(9, this.f983f);
                } else if (index == 6) {
                    this.f984g = obtainStyledAttributes.getDimensionPixelOffset(6, this.f984g);
                } else if (index == 7) {
                    this.f985h = obtainStyledAttributes.getDimensionPixelOffset(7, this.f985h);
                } else if (index == 85) {
                    this.f987j = obtainStyledAttributes.getInt(85, this.f987j);
                } else if (index == 14) {
                    int resourceId = obtainStyledAttributes.getResourceId(14, 0);
                    C0973ew ewVar = new C0973ew();
                    this.f980c = ewVar;
                    ewVar.mo10542a(getContext(), resourceId);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f979b.f16622ai = this.f987j;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1169a(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1169a(attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1082a() {
        this.f979b.mo10844n();
    }
}
