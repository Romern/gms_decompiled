package androidx.wear.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BoxInsetLayout extends ViewGroup {

    /* renamed from: a */
    private final int f1779a;

    /* renamed from: b */
    private final int f1780b;

    /* renamed from: c */
    private boolean f1781c;

    /* renamed from: d */
    private Rect f1782d;

    /* renamed from: e */
    private Rect f1783e;

    /* renamed from: f */
    private Drawable f1784f;

    public BoxInsetLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final int m1713a(int i, int i2) {
        return (int) (((float) Math.max(Math.min(i, this.f1780b), Math.min(i2, this.f1779a))) * 0.146447f);
    }

    /* renamed from: b */
    private final int m1715b(avx avx, int i, int i2) {
        if (!this.f1781c || (avx.f2400a & 4) == 0 || (avx.width != -1 && i != 5)) {
            return avx.rightMargin;
        }
        return avx.rightMargin + i2;
    }

    /* renamed from: c */
    private final int m1716c(avx avx, int i, int i2) {
        if (!this.f1781c || (avx.f2400a & 2) == 0 || (avx.height != -1 && i != 48)) {
            return avx.topMargin;
        }
        return avx.topMargin + i2;
    }

    /* renamed from: d */
    private final int m1717d(avx avx, int i, int i2) {
        if (!this.f1781c || (avx.f2400a & 8) == 0 || (avx.height != -1 && i != 80)) {
            return avx.bottomMargin;
        }
        return avx.bottomMargin + i2;
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof avx;
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new avx(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1781c = getResources().getConfiguration().isScreenRound();
        WindowInsets rootWindowInsets = getRootWindowInsets();
        this.f1783e.set(rootWindowInsets.getSystemWindowInsetLeft(), rootWindowInsets.getSystemWindowInsetTop(), rootWindowInsets.getSystemWindowInsetRight(), rootWindowInsets.getSystemWindowInsetBottom());
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft() + this.f1782d.left;
        int paddingRight = ((i3 - i) - getPaddingRight()) - this.f1782d.right;
        int paddingTop = getPaddingTop() + this.f1782d.top;
        int paddingBottom = ((i4 - i2) - getPaddingBottom()) - this.f1782d.bottom;
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                avx avx = (avx) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i11 = avx.gravity;
                if (i11 == -1) {
                    i11 = 8388659;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i11, getLayoutDirection());
                int i12 = i11 & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
                int i13 = i11 & 7;
                int a = m1713a(getMeasuredWidth(), getMeasuredHeight());
                int a2 = m1714a(avx, i13, a);
                int b = m1715b(avx, i13, a);
                i6 = childCount;
                i5 = i10;
                if (avx.width == -1) {
                    i7 = a2 + paddingLeft;
                } else {
                    int i14 = absoluteGravity & 7;
                    if (i14 == 1) {
                        i9 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + a2;
                    } else if (i14 != 5) {
                        i7 = a2 + paddingLeft;
                    } else {
                        i9 = paddingRight - measuredWidth;
                    }
                    i7 = i9 - b;
                }
                int c = m1716c(avx, i12, a);
                int d = m1717d(avx, i12, a);
                if (avx.height == -1) {
                    i8 = c + paddingTop;
                } else {
                    i8 = i12 != 16 ? i12 != 80 ? c + paddingTop : (paddingBottom - measuredHeight) - d : (((((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop) + c) - d;
                }
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            } else {
                i6 = childCount;
                i5 = i10;
            }
            i10 = i5 + 1;
            childCount = i6;
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i;
        int i11 = i2;
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i13 < childCount) {
            int i17 = childCount;
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                avx avx = (avx) childAt.getLayoutParams();
                if (this.f1781c) {
                    if ((avx.f2400a & 1) == 0) {
                        i7 = avx.leftMargin;
                    } else {
                        i7 = 0;
                    }
                    if ((avx.f2400a & 4) == 0) {
                        i8 = avx.rightMargin;
                    } else {
                        i8 = 0;
                    }
                    if ((avx.f2400a & 2) == 0) {
                        i9 = avx.topMargin;
                    } else {
                        i9 = 0;
                    }
                    if ((8 & avx.f2400a) == 0) {
                        i6 = avx.bottomMargin;
                        i5 = i7;
                        i4 = i8;
                        i3 = i9;
                    } else {
                        i5 = i7;
                        i4 = i8;
                        i3 = i9;
                        i6 = 0;
                    }
                } else {
                    int i18 = avx.leftMargin;
                    int i19 = avx.topMargin;
                    int i20 = avx.rightMargin;
                    i6 = avx.bottomMargin;
                    i5 = i18;
                    i4 = i20;
                    i3 = i19;
                }
                measureChildWithMargins(childAt, i, 0, i2, 0);
                i15 = Math.max(i15, childAt.getMeasuredWidth() + i5 + i4);
                i14 = Math.max(i14, childAt.getMeasuredHeight() + i3 + i6);
                i16 = combineMeasuredStates(i16, childAt.getMeasuredState());
            }
            i13++;
            childCount = i17;
        }
        int paddingLeft = getPaddingLeft();
        int i21 = this.f1782d.left;
        int paddingRight = getPaddingRight();
        int i22 = this.f1782d.right;
        int max = Math.max(i14 + getPaddingTop() + this.f1782d.top + getPaddingBottom() + this.f1782d.bottom, getSuggestedMinimumHeight());
        int max2 = Math.max(i15 + paddingLeft + i21 + paddingRight + i22, getSuggestedMinimumWidth());
        Drawable drawable = this.f1784f;
        if (drawable != null) {
            max = Math.max(max, drawable.getMinimumHeight());
            max2 = Math.max(max2, this.f1784f.getMinimumWidth());
        }
        int resolveSizeAndState = resolveSizeAndState(max2, i10, i16);
        int resolveSizeAndState2 = resolveSizeAndState(max, i11, i16 << 16);
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
        int a = m1713a(resolveSizeAndState, resolveSizeAndState2);
        while (i12 < childCount) {
            View childAt2 = getChildAt(i12);
            avx avx2 = (avx) childAt2.getLayoutParams();
            int i23 = avx2.gravity;
            if (i23 == -1) {
                i23 = 8388659;
            }
            int i24 = i23 & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
            int i25 = i23 & 7;
            int paddingLeft2 = getPaddingLeft();
            int i26 = this.f1782d.left;
            int paddingRight2 = getPaddingRight();
            int i27 = this.f1782d.right;
            int paddingTop = getPaddingTop();
            int i28 = this.f1782d.top;
            int paddingBottom = getPaddingBottom();
            int i29 = childCount;
            int i30 = this.f1782d.bottom;
            int a2 = paddingLeft2 + i26 + paddingRight2 + i27 + m1714a(avx2, i25, a) + m1715b(avx2, i25, a);
            int c = paddingTop + i28 + paddingBottom + i30 + m1716c(avx2, i24, a) + m1717d(avx2, i24, a);
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, a2, avx2.width);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, c, avx2.height);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight() - c;
            if (childAt2.getMeasuredWidth() > measuredWidth - a2 || childAt2.getMeasuredHeight() > measuredHeight) {
                childAt2.measure(childMeasureSpec, childMeasureSpec2);
            }
            i12++;
            childCount = i29;
        }
    }

    public final void setForeground(Drawable drawable) {
        super.setForeground(drawable);
        this.f1784f = drawable;
        if (this.f1782d == null) {
            this.f1782d = new Rect();
        }
        if (this.f1784f != null) {
            drawable.getPadding(this.f1782d);
        }
    }

    public BoxInsetLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private final int m1714a(avx avx, int i, int i2) {
        if (!this.f1781c || (avx.f2400a & 1) == 0 || (avx.width != -1 && i != 3)) {
            return avx.leftMargin;
        }
        return avx.leftMargin + i2;
    }

    public BoxInsetLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (this.f1782d == null) {
            this.f1782d = new Rect();
        }
        if (this.f1783e == null) {
            this.f1783e = new Rect();
        }
        this.f1779a = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.f1780b = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new avx(layoutParams);
    }
}
