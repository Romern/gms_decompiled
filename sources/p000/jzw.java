package p000;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: jzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jzw implements View.OnApplyWindowInsetsListener {
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        view.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        return windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), 0, 0);
    }
}
