package p000;

import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;

/* renamed from: aje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aje implements View.OnApplyWindowInsetsListener {
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        boolean z;
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z2 = true;
        if (windowInsets.getSystemWindowInsetTop() > 0) {
            z = true;
        } else {
            z = false;
        }
        drawerLayout.f1516f = windowInsets;
        drawerLayout.f1517g = z;
        if (z || drawerLayout.getBackground() != null) {
            z2 = false;
        }
        drawerLayout.setWillNotDraw(z2);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
