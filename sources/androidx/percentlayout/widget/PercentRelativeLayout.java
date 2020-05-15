package androidx.percentlayout.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PercentRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    private final anl f1549a = new anl(this);

    public PercentRelativeLayout(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final anm generateLayoutParams(AttributeSet attributeSet) {
        return new anm(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new anm();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        anj a;
        super.onLayout(z, i, i2, i3, i4);
        anl anl = this.f1549a;
        int childCount = anl.f1852a.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            ViewGroup.LayoutParams layoutParams = anl.f1852a.getChildAt(i5).getLayoutParams();
            if ((layoutParams instanceof anm) && (a = ((anm) layoutParams).mo2201a()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    a.mo2198a(marginLayoutParams);
                    marginLayoutParams.leftMargin = a.f1849j.leftMargin;
                    marginLayoutParams.topMargin = a.f1849j.topMargin;
                    marginLayoutParams.rightMargin = a.f1849j.rightMargin;
                    marginLayoutParams.bottomMargin = a.f1849j.bottomMargin;
                    C1260oz.m19821a(marginLayoutParams, C1260oz.m19820a(a.f1849j));
                    C1260oz.m19823b(marginLayoutParams, C1260oz.m19822b(a.f1849j));
                } else {
                    a.mo2198a(layoutParams);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        anj a;
        anj a2;
        anl anl = this.f1549a;
        int size = (View.MeasureSpec.getSize(i) - anl.f1852a.getPaddingLeft()) - anl.f1852a.getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - anl.f1852a.getPaddingTop()) - anl.f1852a.getPaddingBottom();
        int childCount = anl.f1852a.getChildCount();
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= childCount) {
                break;
            }
            View childAt = anl.f1852a.getChildAt(i3);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof anm) && (a2 = ((anm) layoutParams).mo2201a()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    a2.mo2199a(marginLayoutParams, size, size2);
                    a2.f1849j.leftMargin = marginLayoutParams.leftMargin;
                    a2.f1849j.topMargin = marginLayoutParams.topMargin;
                    a2.f1849j.rightMargin = marginLayoutParams.rightMargin;
                    a2.f1849j.bottomMargin = marginLayoutParams.bottomMargin;
                    C1260oz.m19821a(a2.f1849j, C1260oz.m19820a(marginLayoutParams));
                    C1260oz.m19823b(a2.f1849j, C1260oz.m19822b(marginLayoutParams));
                    float f = a2.f1842c;
                    if (f >= 0.0f) {
                        marginLayoutParams.leftMargin = Math.round(((float) size) * f);
                    }
                    float f2 = a2.f1843d;
                    if (f2 >= 0.0f) {
                        marginLayoutParams.topMargin = Math.round(((float) size2) * f2);
                    }
                    float f3 = a2.f1844e;
                    if (f3 >= 0.0f) {
                        marginLayoutParams.rightMargin = Math.round(((float) size) * f3);
                    }
                    float f4 = a2.f1845f;
                    if (f4 >= 0.0f) {
                        marginLayoutParams.bottomMargin = Math.round(((float) size2) * f4);
                    }
                    float f5 = a2.f1846g;
                    if (f5 >= 0.0f) {
                        C1260oz.m19821a(marginLayoutParams, Math.round(((float) size) * f5));
                    } else {
                        z = false;
                    }
                    float f6 = a2.f1847h;
                    if (f6 >= 0.0f) {
                        C1260oz.m19823b(marginLayoutParams, Math.round(((float) size) * f6));
                    } else if (!z) {
                    }
                    if (childAt != null) {
                        int h = C1280ps.m19923h(childAt);
                        int i4 = Build.VERSION.SDK_INT;
                        marginLayoutParams.resolveLayoutDirection(h);
                    }
                } else {
                    a2.mo2199a(layoutParams, size, size2);
                }
            }
            i3++;
        }
        super.onMeasure(i, i2);
        anl anl2 = this.f1549a;
        int childCount2 = anl2.f1852a.getChildCount();
        boolean z2 = false;
        for (int i5 = 0; i5 < childCount2; i5++) {
            View childAt2 = anl2.f1852a.getChildAt(i5);
            ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
            if ((layoutParams2 instanceof anm) && (a = ((anm) layoutParams2).mo2201a()) != null) {
                if ((childAt2.getMeasuredWidthAndState() & -16777216) == 16777216 && a.f1840a >= 0.0f && a.f1849j.width == -2) {
                    layoutParams2.width = -2;
                    z2 = true;
                }
                if ((childAt2.getMeasuredHeightAndState() & -16777216) == 16777216 && a.f1841b >= 0.0f && a.f1849j.height == -2) {
                    layoutParams2.height = -2;
                    z2 = true;
                }
            }
        }
        if (z2) {
            super.onMeasure(i, i2);
        }
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
