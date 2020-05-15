package android.support.p002v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: android.support.v7.widget.AlertDialogLayout */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    /* renamed from: a */
    private static int m1299a(View view) {
        int l = C1280ps.m19930l(view);
        if (l > 0) {
            return l;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m1299a(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i3 - i;
        int paddingRight = i8 - getPaddingRight();
        int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int i9 = this.f1214f;
        int i10 = 8388615 & i9;
        int i11 = i9 & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
        if (i11 == 16) {
            i5 = getPaddingTop() + (((i4 - i2) - measuredHeight) / 2);
        } else if (i11 != 80) {
            i5 = getPaddingTop();
        } else {
            i5 = ((getPaddingTop() + i4) - i2) - measuredHeight;
        }
        Drawable drawable = this.f1215g;
        if (drawable != null) {
            i6 = drawable.getIntrinsicHeight();
        } else {
            i6 = 0;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                aac aac = (aac) childAt.getLayoutParams();
                int i13 = aac.f12h;
                if (i13 < 0) {
                    i13 = i10;
                }
                int a = C1256ov.m19815a(i13, C1280ps.m19923h(this)) & 7;
                if (a == 1) {
                    i7 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + aac.leftMargin) - aac.rightMargin;
                } else if (a != 5) {
                    i7 = aac.leftMargin + paddingLeft;
                } else {
                    i7 = (paddingRight - measuredWidth) - aac.rightMargin;
                }
                if (mo1409c(i12)) {
                    i5 += i6;
                }
                int i14 = i5 + aac.topMargin;
                childAt.layout(i7, i14, measuredWidth + i7, i14 + measuredHeight2);
                i5 = i14 + measuredHeight2 + aac.bottomMargin;
            }
        }
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == C0126R.C0129id.topPanel) {
                    view = childAt;
                } else if (id == C0126R.C0129id.buttonPanel) {
                    view2 = childAt;
                } else if ((id == C0126R.C0129id.contentPanel || id == C0126R.C0129id.customPanel) && view3 == null) {
                    view3 = childAt;
                } else {
                    super.onMeasure(i, i2);
                    return;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i9, 0);
            paddingTop += view.getMeasuredHeight();
            i3 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i3 = 0;
        }
        if (view2 != null) {
            view2.measure(i9, 0);
            i5 = m1299a(view2);
            i4 = view2.getMeasuredHeight() - i5;
            paddingTop += i5;
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (view3 == null) {
            i6 = 0;
        } else {
            if (mode != 0) {
                i8 = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode);
            } else {
                i8 = 0;
            }
            view3.measure(i9, i8);
            i6 = view3.getMeasuredHeight();
            paddingTop += i6;
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        }
        int i11 = size - paddingTop;
        if (view2 != null) {
            int i12 = paddingTop - i5;
            int min = Math.min(i11, i4);
            if (min > 0) {
                i11 -= min;
                i5 += min;
            }
            view2.measure(i9, View.MeasureSpec.makeMeasureSpec(i5, JGCastService.FLAG_PRIVATE_DISPLAY));
            paddingTop = i12 + view2.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        }
        if (view3 != null && i11 > 0) {
            view3.measure(i9, View.MeasureSpec.makeMeasureSpec(i11 + i6, mode));
            paddingTop = (paddingTop - i6) + view3.getMeasuredHeight();
            i7 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        } else {
            i7 = i3;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt2 = getChildAt(i14);
            if (childAt2.getVisibility() != 8) {
                i13 = Math.max(i13, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i13 + getPaddingLeft() + getPaddingRight(), i9, i7), View.resolveSizeAndState(paddingTop, i2, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), JGCastService.FLAG_PRIVATE_DISPLAY);
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                if (childAt3.getVisibility() != 8) {
                    aac aac = (aac) childAt3.getLayoutParams();
                    if (aac.width == -1) {
                        int i16 = aac.height;
                        aac.height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, makeMeasureSpec, 0, i2, 0);
                        aac.height = i16;
                    }
                }
            }
        }
    }
}
