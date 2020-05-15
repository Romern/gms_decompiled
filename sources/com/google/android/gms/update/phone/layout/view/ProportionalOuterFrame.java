package com.google.android.gms.update.phone.layout.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ProportionalOuterFrame extends RelativeLayout {

    /* renamed from: a */
    private int f109527a;

    /* renamed from: b */
    private int f109528b;

    public ProportionalOuterFrame(Context context) {
        super(context);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f109527a = 0;
        this.f109528b = 0;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        Resources resources = getContext().getResources();
        int size = View.MeasureSpec.getSize(i);
        this.f109527a = Math.max(this.f109527a, (int) (((float) View.MeasureSpec.getSize(i2)) * resources.getFraction(C0126R.dimen.setup_wizard_title_height_fraction, 1, 1)));
        this.f109528b = Math.max(this.f109528b, (int) (((float) size) * resources.getFraction(C0126R.dimen.setup_wizard_border_width_fraction, 1, 1)));
        int dimensionPixelSize = resources.getDimensionPixelSize(C0126R.dimen.setup_wizard_margin_bottom);
        int i3 = this.f109528b;
        setPadding(i3, 0, i3, dimensionPixelSize);
        View findViewById = findViewById(C0126R.C0129id.title_area);
        if (findViewById != null) {
            findViewById.setMinimumHeight(this.f109527a);
        }
        super.onMeasure(i, i2);
    }

    public ProportionalOuterFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProportionalOuterFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
