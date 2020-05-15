package com.google.android.gms.tapandpay.widgets.cardlist;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StackedCardsLayout extends ViewGroup {

    /* renamed from: a */
    private int f109005a;

    /* renamed from: b */
    private int f109006b;

    /* renamed from: c */
    private final Rect f109007c;

    /* renamed from: d */
    private final Rect f109008d;

    public StackedCardsLayout(Context context) {
        super(context);
        this.f109006b = Integer.MAX_VALUE;
        this.f109007c = new Rect();
        this.f109008d = new Rect();
    }

    /* renamed from: a */
    public final void mo59509a(int i) {
        this.f109006b = i;
        requestLayout();
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingStart = getPaddingStart();
        int paddingEnd = (i3 - i) - getPaddingEnd();
        int i5 = (((i4 - i2) - paddingBottom) - paddingTop) - this.f109005a;
        int i6 = i5 >= 0 ? 0 : childCount > 1 ? (-i5) / (childCount - 1) : 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = i7 + 1;
                C1280ps.m19918f(childAt, TypedValue.applyDimension(1, (float) (i8 + i8), getResources().getDisplayMetrics()));
                this.f109008d.set(marginLayoutParams.leftMargin + paddingStart, marginLayoutParams.topMargin + paddingTop, paddingEnd - marginLayoutParams.rightMargin, marginLayoutParams.topMargin + paddingTop + measuredHeight);
                Gravity.apply(17, childAt.getMeasuredWidth(), measuredHeight, this.f109008d, this.f109007c);
                childAt.layout(this.f109007c.left, this.f109007c.top, this.f109007c.right, this.f109007c.bottom);
                paddingTop += Math.min((measuredHeight + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin, this.f109006b) - i6;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        this.f109005a = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                measureChildWithMargins(childAt, i, 0, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE), 0);
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                int i5 = this.f109005a;
                if (i4 != childCount - 1) {
                    measuredHeight = Math.min(measuredHeight, this.f109006b);
                }
                this.f109005a = i5 + measuredHeight;
                i3 = Math.max(i3, childAt.getMeasuredWidth() + marginLayoutParams.rightMargin + marginLayoutParams.leftMargin);
                combineMeasuredStates(0, childAt.getMeasuredState());
            }
        }
        int paddingStart = getPaddingStart();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = this.f109005a + getPaddingBottom() + getPaddingTop();
        this.f109005a = paddingBottom;
        this.f109005a = Math.max(paddingBottom, getSuggestedMinimumHeight());
        setMeasuredDimension(resolveSizeAndState(Math.max(i3 + paddingStart + paddingEnd, getSuggestedMinimumWidth()), i, 0), resolveSizeAndState(this.f109005a, i2, 0));
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public StackedCardsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StackedCardsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f109006b = Integer.MAX_VALUE;
        this.f109007c = new Rect();
        this.f109008d = new Rect();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, eoi.f15404p, i, 0);
        try {
            this.f109006b = obtainStyledAttributes.getDimensionPixelOffset(0, Integer.MAX_VALUE);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
