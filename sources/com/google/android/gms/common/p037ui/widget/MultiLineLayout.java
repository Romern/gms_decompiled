package com.google.android.gms.common.p037ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.gms.common.ui.widget.MultiLineLayout */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MultiLineLayout extends ViewGroup {

    /* renamed from: a */
    private int f30400a = 0;

    /* renamed from: b */
    private int f30401b = 0;

    public MultiLineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private final int m22737a(int i) {
        return sse.m36204a() ? i - getPaddingStart() : getPaddingStart();
    }

    /* renamed from: b */
    private final int m22739b(int i) {
        return (i - getPaddingStart()) - getPaddingEnd();
    }

    public final int getPaddingEnd() {
        return !sse.m36204a() ? getPaddingRight() : getPaddingLeft();
    }

    public final int getPaddingStart() {
        return !sse.m36204a() ? getPaddingLeft() : getPaddingRight();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int a = m22737a(i5);
        int paddingTop2 = getPaddingTop();
        int b = m22739b(i5);
        int childCount = getChildCount();
        int i6 = 1;
        this.f30400a = 1;
        this.f30401b = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (this.f30401b < measuredHeight) {
                    this.f30401b = measuredHeight;
                }
                if (m22738a(a, measuredWidth, paddingStart, b)) {
                    this.f30400a += i6;
                    a = m22737a(i5);
                    paddingTop2 += i8 + paddingTop;
                    i8 = 0;
                }
                if (sse.m36204a()) {
                    childAt.layout(a - measuredWidth, paddingTop2, a, paddingTop2 + measuredHeight);
                    a -= measuredWidth + paddingStart;
                } else {
                    childAt.layout(a, paddingTop2, a + measuredWidth, paddingTop2 + measuredHeight);
                    a += measuredWidth + paddingStart;
                }
                i8 = Math.max(i8, measuredHeight);
            }
            i7++;
            i6 = 1;
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5 = i;
        int i6 = i2;
        int resolveSize = resolveSize(Integer.MAX_VALUE, i5);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int a = m22737a(resolveSize);
        int paddingTop2 = getPaddingTop();
        int b = m22739b(resolveSize);
        int childCount = getChildCount();
        this.f30400a = 1;
        this.f30401b = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            int i11 = childCount;
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i5, i6);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (this.f30401b < measuredHeight) {
                    this.f30401b = measuredHeight;
                }
                if (m22738a(a, measuredWidth, paddingStart, b)) {
                    this.f30400a++;
                    a = m22737a(resolveSize);
                    paddingTop2 += i10 + paddingTop;
                    i10 = 0;
                }
                if (!sse.m36204a()) {
                    i4 = a + measuredWidth;
                } else {
                    i4 = a - measuredWidth;
                }
                i8 = Math.max(i8, i4);
                i9 = Math.max(i9, paddingTop2 + measuredHeight);
                if (!sse.m36204a()) {
                    a += measuredWidth + paddingStart;
                } else {
                    a -= measuredWidth + paddingStart;
                }
                i10 = Math.max(i10, measuredHeight);
            }
            i7++;
            childCount = i11;
        }
        if (sse.m36204a()) {
            i3 = i8 - getPaddingEnd();
        } else {
            i3 = i8 + getPaddingEnd();
        }
        setMeasuredDimension(resolveSize(i3, i5), resolveSize(i9 + getPaddingBottom(), i6));
    }

    /* renamed from: a */
    private static final boolean m22738a(int i, int i2, int i3, int i4) {
        return !sse.m36204a() ? i + i2 > i4 : i - i2 < i3;
    }
}
