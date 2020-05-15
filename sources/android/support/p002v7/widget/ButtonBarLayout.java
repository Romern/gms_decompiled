package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;

/* renamed from: android.support.v7.widget.ButtonBarLayout */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a */
    private boolean f1199a;

    /* renamed from: b */
    private int f1200b = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1390tu.f27202k);
        C1280ps.m19886a(this, context, C1390tu.f27202k, attributeSet, obtainStyledAttributes, 0, 0);
        this.f1199a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private final int m1302a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (r1 != false) goto L_0x0050;
     */
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f1199a) {
            if (size > this.f1200b && m1304a()) {
                m1303a(false);
            }
            this.f1200b = size;
        }
        if (m1304a() || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f1199a && !m1304a() && (getMeasuredWidthAndState() & -16777216) == 16777216) {
            m1303a(true);
        }
        super.onMeasure(i, i2);
        int a = m1302a(0);
        if (a >= 0) {
            View childAt = getChildAt(a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            i4 = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (m1304a()) {
                int a2 = m1302a(a + 1);
                if (a2 >= 0) {
                    i4 += getChildAt(a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                i4 += getPaddingBottom();
            }
        }
        if (C1280ps.m19930l(this) != i4) {
            setMinimumHeight(i4);
        }
    }

    /* renamed from: a */
    private final void m1303a(boolean z) {
        int i;
        int i2;
        setOrientation(z ? 1 : 0);
        if (!z) {
            i = 80;
        } else {
            i = 5;
        }
        setGravity(i);
        View findViewById = findViewById(C0126R.C0129id.spacer);
        if (findViewById != null) {
            if (!z) {
                i2 = 4;
            } else {
                i2 = 8;
            }
            findViewById.setVisibility(i2);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    /* renamed from: a */
    private final boolean m1304a() {
        return getOrientation() == 1;
    }
}
