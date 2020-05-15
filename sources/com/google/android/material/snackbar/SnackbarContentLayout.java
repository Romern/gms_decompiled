package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a */
    public TextView f151225a;

    /* renamed from: b */
    public Button f151226b;

    /* renamed from: c */
    private int f151227c;

    /* renamed from: d */
    private int f151228d;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final boolean m117608a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f151225a.getPaddingTop() == i2 && this.f151225a.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f151225a;
        if (C1280ps.m19941w(textView)) {
            C1280ps.m19885a(textView, C1280ps.m19925i(textView), i2, C1280ps.m19927j(textView), i3);
        } else {
            textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f151225a = (TextView) findViewById(C0126R.C0129id.snackbar_text);
        this.f151226b = (Button) findViewById(C0126R.C0129id.snackbar_action);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (this.f151227c > 0 && getMeasuredWidth() > (i3 = this.f151227c)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, JGCastService.FLAG_PRIVATE_DISPLAY);
            super.onMeasure(i, i2);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0126R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0126R.dimen.design_snackbar_padding_vertical);
        int lineCount = this.f151225a.getLayout().getLineCount();
        if (lineCount <= 1 || this.f151228d <= 0 || this.f151226b.getMeasuredWidth() <= this.f151228d) {
            if (lineCount <= 1) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m117608a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!m117608a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bhne.f119122a);
        this.f151227c = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f151228d = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
    }
}
