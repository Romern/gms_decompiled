package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* renamed from: biza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biza implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    private int f122356a;

    /* renamed from: b */
    private boolean f122357b = false;

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!this.f122357b) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            this.f122356a = (view.getRootView().getHeight() - iArr[1]) - view.getHeight();
            this.f122357b = true;
        }
        int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        int max = Math.max(windowInsets.getSystemWindowInsetBottom() - this.f122356a, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (max < marginLayoutParams.bottomMargin + view.getHeight()) {
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, max);
            view.setLayoutParams(marginLayoutParams);
            systemWindowInsetBottom = 0;
        }
        return windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), systemWindowInsetBottom);
    }
}
