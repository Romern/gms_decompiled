package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.support.p002v7.view.menu.ActionMenuItemView;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.cast.JGCastService;

/* renamed from: android.support.v7.widget.ActionMenuView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ActionMenuView extends LinearLayoutCompat implements C1442vs, C1460wj {

    /* renamed from: a */
    public C1443vt f1163a;

    /* renamed from: b */
    public boolean f1164b;

    /* renamed from: c */
    public C1485xh f1165c;

    /* renamed from: d */
    public C1441vr f1166d;

    /* renamed from: e */
    public C0006ads f1167e;

    /* renamed from: i */
    private Context f1168i;

    /* renamed from: j */
    private int f1169j;

    /* renamed from: k */
    private C1457wg f1170k;

    /* renamed from: l */
    private boolean f1171l;

    /* renamed from: m */
    private int f1172m;

    /* renamed from: n */
    private int f1173n;

    /* renamed from: o */
    private int f1174o;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public static final C1488xk m1285b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return m1286d();
        }
        C1488xk xkVar = layoutParams instanceof C1488xk ? new C1488xk((C1488xk) layoutParams) : new C1488xk(layoutParams);
        if (xkVar.f12h <= 0) {
            xkVar.f12h = 16;
        }
        return xkVar;
    }

    /* renamed from: d */
    public static final C1488xk m1286d() {
        C1488xk xkVar = new C1488xk();
        xkVar.f12h = 16;
        return xkVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ aac mo1295a(ViewGroup.LayoutParams layoutParams) {
        return m1285b(layoutParams);
    }

    /* renamed from: a */
    public final void mo1220a(C1443vt vtVar) {
        this.f1163a = vtVar;
    }

    /* renamed from: a */
    public final void mo1299a(C1457wg wgVar, C1441vr vrVar) {
        this.f1170k = wgVar;
        this.f1166d = vrVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ aac mo1304c() {
        return m1286d();
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1488xk;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1286d();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1485xh xhVar = this.f1165c;
        if (xhVar != null) {
            xhVar.mo470a(false);
            if (this.f1165c.mo16472e()) {
                this.f1165c.mo16471d();
                this.f1165c.mo16470c();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1302b();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (this.f1171l) {
            int childCount = getChildCount();
            int i8 = (i4 - i2) / 2;
            int i9 = this.f1216h;
            int i10 = i3 - i;
            int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
            boolean a = aek.m624a(this);
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt.getVisibility() != 8) {
                    C1488xk xkVar = (C1488xk) childAt.getLayoutParams();
                    if (xkVar.f27580a) {
                        int measuredWidth = childAt.getMeasuredWidth();
                        if (mo1303b(i13)) {
                            measuredWidth += i9;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        if (a) {
                            i6 = getPaddingLeft() + xkVar.leftMargin;
                            i7 = i6 + measuredWidth;
                        } else {
                            i7 = (getWidth() - getPaddingRight()) - xkVar.rightMargin;
                            i6 = i7 - measuredWidth;
                        }
                        int i14 = i8 - (measuredHeight / 2);
                        childAt.layout(i6, i14, i7, measuredHeight + i14);
                        paddingRight -= measuredWidth;
                        i11 = 1;
                    } else {
                        paddingRight -= (childAt.getMeasuredWidth() + xkVar.leftMargin) + xkVar.rightMargin;
                        mo1303b(i13);
                        i12++;
                    }
                }
            }
            if (childCount == 1 && i11 == 0) {
                View childAt2 = getChildAt(0);
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i15 = (i10 / 2) - (measuredWidth2 / 2);
                int i16 = i8 - (measuredHeight2 / 2);
                childAt2.layout(i15, i16, measuredWidth2 + i15, measuredHeight2 + i16);
                return;
            }
            int i17 = i12 - (i11 ^ 1);
            if (i17 > 0) {
                i5 = paddingRight / i17;
            } else {
                i5 = 0;
            }
            int max = Math.max(0, i5);
            if (a) {
                int width = getWidth() - getPaddingRight();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt3 = getChildAt(i18);
                    C1488xk xkVar2 = (C1488xk) childAt3.getLayoutParams();
                    if (childAt3.getVisibility() != 8 && !xkVar2.f27580a) {
                        int i19 = width - xkVar2.rightMargin;
                        int measuredWidth3 = childAt3.getMeasuredWidth();
                        int measuredHeight3 = childAt3.getMeasuredHeight();
                        int i20 = i8 - (measuredHeight3 / 2);
                        childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                        width = i19 - ((measuredWidth3 + xkVar2.leftMargin) + max);
                    }
                }
                return;
            }
            int paddingLeft = getPaddingLeft();
            for (int i21 = 0; i21 < childCount; i21++) {
                View childAt4 = getChildAt(i21);
                C1488xk xkVar3 = (C1488xk) childAt4.getLayoutParams();
                if (childAt4.getVisibility() != 8 && !xkVar3.f27580a) {
                    int i22 = paddingLeft + xkVar3.leftMargin;
                    int measuredWidth4 = childAt4.getMeasuredWidth();
                    int measuredHeight4 = childAt4.getMeasuredHeight();
                    int i23 = i8 - (measuredHeight4 / 2);
                    childAt4.layout(i22, i23, i22 + measuredWidth4, measuredHeight4 + i23);
                    paddingLeft = i22 + measuredWidth4 + xkVar3.rightMargin + max;
                }
            }
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        boolean z3;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z4;
        boolean z5;
        int i11;
        ActionMenuItemView actionMenuItemView;
        boolean z6;
        int i12;
        boolean z7;
        C1443vt vtVar;
        boolean z8 = this.f1171l;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.f1171l = z;
        if (z8 != z) {
            this.f1172m = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f1171l || (vtVar = this.f1163a) == null || size == this.f1172m)) {
            this.f1172m = size;
            vtVar.mo16242b(true);
        }
        int childCount = getChildCount();
        if (!this.f1171l) {
            i3 = 0;
        } else if (childCount > 0) {
            int mode = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i);
            int size3 = View.MeasureSpec.getSize(i2);
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
            int i13 = size2 - (paddingLeft + paddingRight);
            int i14 = this.f1173n;
            int i15 = i13 / i14;
            int i16 = i13 % i14;
            if (i15 == 0) {
                setMeasuredDimension(i13, 0);
                return;
            }
            int i17 = i14 + (i16 / i15);
            int childCount2 = getChildCount();
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            boolean z9 = false;
            long j = 0;
            int i22 = 0;
            while (i21 < childCount2) {
                View childAt = getChildAt(i21);
                int i23 = size3;
                if (childAt.getVisibility() == 8) {
                    i7 = mode;
                    i8 = i13;
                    i9 = paddingTop;
                } else {
                    boolean z10 = childAt instanceof ActionMenuItemView;
                    int i24 = i19 + 1;
                    if (z10) {
                        int i25 = this.f1174o;
                        i10 = i24;
                        z4 = false;
                        childAt.setPadding(i25, 0, i25, 0);
                    } else {
                        i10 = i24;
                        z4 = false;
                    }
                    C1488xk xkVar = (C1488xk) childAt.getLayoutParams();
                    xkVar.f27585f = z4;
                    xkVar.f27582c = z4 ? 1 : 0;
                    xkVar.f27581b = z4;
                    xkVar.f27583d = z4;
                    xkVar.leftMargin = z4;
                    xkVar.rightMargin = z4;
                    if (!z10 || !((ActionMenuItemView) childAt).mo1211c()) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    xkVar.f27584e = z5;
                    if (!xkVar.f27580a) {
                        i11 = i15;
                    } else {
                        i11 = 1;
                    }
                    i8 = i13;
                    C1488xk xkVar2 = (C1488xk) childAt.getLayoutParams();
                    i7 = mode;
                    i9 = paddingTop;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingTop, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z10) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView == null || !actionMenuItemView.mo1211c()) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (i11 <= 0) {
                        i12 = 0;
                    } else if (z6 && i11 < 2) {
                        i12 = 0;
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i11 * i17, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i12 = measuredWidth / i17;
                        if (measuredWidth % i17 != 0) {
                            i12++;
                        }
                        if (z6 && i12 < 2) {
                            i12 = 2;
                        }
                    }
                    if (xkVar2.f27580a) {
                        z7 = false;
                    } else {
                        z7 = z6;
                    }
                    xkVar2.f27583d = z7;
                    xkVar2.f27581b = i12;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i12 * i17, JGCastService.FLAG_PRIVATE_DISPLAY), makeMeasureSpec);
                    i18 = Math.max(i18, i12);
                    if (xkVar.f27583d) {
                        i22++;
                    }
                    z9 |= xkVar.f27580a;
                    i15 -= i12;
                    i20 = Math.max(i20, childAt.getMeasuredHeight());
                    if (i12 == 1) {
                        j |= (long) (1 << i21);
                    }
                    i19 = i10;
                }
                i21++;
                size3 = i23;
                paddingTop = i9;
                i13 = i8;
                mode = i7;
            }
            int i26 = mode;
            int i27 = i13;
            int i28 = size3;
            boolean z11 = !z9 ? false : i19 == 2;
            boolean z12 = false;
            while (true) {
                if (i22 > 0) {
                    if (i15 <= 0) {
                        break;
                    }
                    int i29 = Integer.MAX_VALUE;
                    int i30 = 0;
                    long j2 = 0;
                    for (int i31 = 0; i31 < childCount2; i31++) {
                        C1488xk xkVar3 = (C1488xk) getChildAt(i31).getLayoutParams();
                        if (xkVar3.f27583d) {
                            int i32 = xkVar3.f27581b;
                            if (i32 < i29) {
                                j2 = 1 << i31;
                                i29 = i32;
                                i30 = 1;
                            } else if (i32 == i29) {
                                i30++;
                                j2 |= 1 << i31;
                            }
                        }
                    }
                    j |= j2;
                    if (i30 > i15) {
                        break;
                    }
                    int i33 = i29 + 1;
                    int i34 = 0;
                    while (i34 < childCount2) {
                        View childAt2 = getChildAt(i34);
                        C1488xk xkVar4 = (C1488xk) childAt2.getLayoutParams();
                        int i35 = i20;
                        long j3 = (long) (1 << i34);
                        if ((j2 & j3) == 0) {
                            if (xkVar4.f27581b == i33) {
                                j |= j3;
                            }
                            z3 = z11;
                        } else {
                            if (!z11) {
                                z3 = z11;
                            } else if (!xkVar4.f27584e || i15 != 1) {
                                z3 = z11;
                            } else {
                                int i36 = this.f1174o;
                                z3 = z11;
                                childAt2.setPadding(i36 + i17, 0, i36, 0);
                            }
                            xkVar4.f27581b++;
                            xkVar4.f27585f = true;
                            i15--;
                        }
                        i34++;
                        i20 = i35;
                        z11 = z3;
                    }
                    z12 = true;
                } else {
                    i4 = i20;
                    break;
                }
            }
            i4 = i20;
            if (z9) {
                z2 = false;
            } else {
                z2 = i19 == 1;
            }
            if (i15 > 0 && j != 0 && (i15 < i19 - 1 || z2 || i18 > 1)) {
                float bitCount = (float) Long.bitCount(j);
                if (!z2) {
                    if ((j & 1) != 0 && !((C1488xk) getChildAt(0).getLayoutParams()).f27584e) {
                        bitCount -= 8.0f;
                    }
                    int i37 = childCount2 - 1;
                    if ((j & ((long) (1 << i37))) != 0 && !((C1488xk) getChildAt(i37).getLayoutParams()).f27584e) {
                        bitCount -= 8.0f;
                    }
                }
                if (bitCount > 0.0f) {
                    i6 = (int) (((float) (i15 * i17)) / bitCount);
                } else {
                    i6 = 0;
                }
                boolean z13 = z12;
                for (int i38 = 0; i38 < childCount2; i38++) {
                    if ((j & ((long) (1 << i38))) != 0) {
                        View childAt3 = getChildAt(i38);
                        C1488xk xkVar5 = (C1488xk) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            xkVar5.f27582c = i6;
                            xkVar5.f27585f = true;
                            if (i38 == 0 && !xkVar5.f27584e) {
                                xkVar5.leftMargin = (-i6) / 2;
                            }
                            z13 = true;
                        } else if (xkVar5.f27580a) {
                            xkVar5.f27582c = i6;
                            xkVar5.f27585f = true;
                            xkVar5.rightMargin = (-i6) / 2;
                            z13 = true;
                        } else {
                            if (i38 != 0) {
                                xkVar5.leftMargin = i6 / 2;
                            }
                            if (i38 != childCount2 - 1) {
                                xkVar5.rightMargin = i6 / 2;
                            }
                        }
                    }
                }
                z12 = z13;
            }
            if (z12) {
                for (int i39 = 0; i39 < childCount2; i39++) {
                    View childAt4 = getChildAt(i39);
                    C1488xk xkVar6 = (C1488xk) childAt4.getLayoutParams();
                    if (xkVar6.f27585f) {
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((xkVar6.f27581b * i17) + xkVar6.f27582c, JGCastService.FLAG_PRIVATE_DISPLAY), childMeasureSpec);
                    }
                }
            }
            if (i26 != 1073741824) {
                i5 = i4;
            } else {
                i5 = i28;
            }
            setMeasuredDimension(i27, i5);
            return;
        } else {
            i3 = 0;
        }
        while (i3 < childCount) {
            C1488xk xkVar7 = (C1488xk) getChildAt(i3).getLayoutParams();
            xkVar7.rightMargin = 0;
            xkVar7.leftMargin = 0;
            i3++;
        }
        super.onMeasure(i, i2);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo1411e();
        float f = context.getResources().getDisplayMetrics().density;
        this.f1173n = (int) (56.0f * f);
        this.f1174o = (int) (f * 4.0f);
        this.f1168i = context;
        this.f1169j = 0;
    }

    /* renamed from: a */
    public final Menu mo1296a() {
        if (this.f1163a == null) {
            Context context = getContext();
            C1443vt vtVar = new C1443vt(context);
            this.f1163a = vtVar;
            vtVar.mo16223a(new C1489xl(this));
            C1485xh xhVar = new C1485xh(context);
            this.f1165c = xhVar;
            xhVar.mo16475i();
            C1485xh xhVar2 = this.f1165c;
            C1457wg wgVar = this.f1170k;
            if (wgVar == null) {
                wgVar = new C1487xj();
            }
            xhVar2.f27365e = wgVar;
            this.f1163a.mo16225a(this.f1165c, this.f1168i);
            this.f1165c.mo16469a(this);
        }
        return this.f1163a;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1285b(layoutParams);
    }

    /* renamed from: a */
    public final C1488xk generateLayoutParams(AttributeSet attributeSet) {
        return new C1488xk(getContext(), attributeSet);
    }

    /* renamed from: b */
    public final void mo1302b() {
        C1485xh xhVar = this.f1165c;
        if (xhVar != null) {
            xhVar.mo16473g();
        }
    }

    /* renamed from: a */
    public final void mo1298a(int i) {
        if (this.f1169j != i) {
            this.f1169j = i;
            if (i != 0) {
                this.f1168i = new ContextThemeWrapper(getContext(), i);
            } else {
                this.f1168i = getContext();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo1303b(int i) {
        boolean z = false;
        if (i != 0) {
            View childAt = getChildAt(i - 1);
            View childAt2 = getChildAt(i);
            if (i < getChildCount() && (childAt instanceof C1486xi)) {
                z = ((C1486xi) childAt).mo1213e();
            }
            if (i > 0 && (childAt2 instanceof C1486xi)) {
                return ((C1486xi) childAt2).mo1212d() | z;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final void mo1300a(C1485xh xhVar) {
        this.f1165c = xhVar;
        xhVar.mo16469a(this);
    }

    /* renamed from: a */
    public final boolean mo1221a(C1446vw vwVar) {
        return this.f1163a.mo16227a(vwVar, 0);
    }
}
