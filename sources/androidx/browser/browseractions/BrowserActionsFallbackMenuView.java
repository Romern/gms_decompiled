package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a */
    private final int f1471a = getResources().getDimensionPixelOffset(C0126R.dimen.browser_actions_context_menu_min_padding);

    /* renamed from: b */
    private final int f1472b = getResources().getDimensionPixelOffset(C0126R.dimen.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3 = getResources().getDisplayMetrics().widthPixels;
        int i4 = this.f1471a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(i3 - (i4 + i4), this.f1472b), JGCastService.FLAG_PRIVATE_DISPLAY), i2);
    }
}
