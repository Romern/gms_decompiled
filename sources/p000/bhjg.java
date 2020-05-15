package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bhjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bhjg extends ViewGroup {

    /* renamed from: f */
    public int f118833f;

    /* renamed from: g */
    public int f118834g;

    /* renamed from: h */
    public boolean f118835h;

    /* renamed from: i */
    public int f118836i;

    public bhjg(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private static int m101010a(int i, int i2, int i3) {
        if (i2 != Integer.MIN_VALUE) {
            return i2 != 1073741824 ? i3 : i;
        }
        return Math.min(i3, i);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() != 0) {
            this.f118836i = 1;
            int h = C1280ps.m19923h(this);
            int paddingLeft = h != 1 ? getPaddingLeft() : getPaddingRight();
            int paddingRight = h != 1 ? getPaddingRight() : getPaddingLeft();
            int paddingTop = getPaddingTop();
            int i7 = (i3 - i) - paddingRight;
            int i8 = paddingLeft;
            int i9 = paddingTop;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() == 8) {
                    childAt.setTag(C0126R.C0129id.row_index_key, -1);
                } else {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        i5 = C1260oz.m19820a(marginLayoutParams);
                        i6 = C1260oz.m19822b(marginLayoutParams);
                    } else {
                        i6 = 0;
                        i5 = 0;
                    }
                    int measuredWidth = i8 + i5 + childAt.getMeasuredWidth();
                    if (!this.f118835h && measuredWidth > i7) {
                        paddingTop = i9 + this.f118833f;
                        this.f118836i++;
                        i8 = paddingLeft;
                    }
                    childAt.setTag(C0126R.C0129id.row_index_key, Integer.valueOf(this.f118836i - 1));
                    int i11 = i8 + i5;
                    int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                    int measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                    if (h == 1) {
                        childAt.layout(i7 - measuredWidth2, paddingTop, (i7 - i8) - i5, measuredHeight);
                    } else {
                        childAt.layout(i11, paddingTop, measuredWidth2, measuredHeight);
                    }
                    i8 += i5 + i6 + childAt.getMeasuredWidth() + this.f118834g;
                    i9 = measuredHeight;
                }
            }
            return;
        }
        this.f118836i = 0;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i3 = size;
        } else {
            i3 = Integer.MAX_VALUE;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i3 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = marginLayoutParams.leftMargin;
                    i4 = marginLayoutParams.rightMargin;
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                int i10 = paddingLeft;
                if (paddingLeft + i5 + childAt.getMeasuredWidth() > paddingRight && !this.f118835h) {
                    i6 = getPaddingLeft();
                    i7 = this.f118833f + paddingTop;
                } else {
                    i6 = i10;
                }
                int measuredWidth = i6 + i5 + childAt.getMeasuredWidth();
                int measuredHeight = i7 + childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft = i6 + i5 + i4 + childAt.getMeasuredWidth() + this.f118834g;
                if (i9 == getChildCount() - 1) {
                    i8 += i4;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(m101010a(size, mode, i8 + getPaddingRight()), m101010a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    public bhjg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private final void m101011a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, bhjv.f118875a, 0, 0);
        this.f118833f = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f118834g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public bhjg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f118835h = false;
        m101011a(context, attributeSet);
    }

    public bhjg(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f118835h = false;
        m101011a(context, attributeSet);
    }
}
