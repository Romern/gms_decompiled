package p000;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* renamed from: ajd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajd implements C1314qz {

    /* renamed from: a */
    final /* synthetic */ DrawerLayout f639a;

    public ajd(DrawerLayout drawerLayout) {
        this.f639a = drawerLayout;
    }

    /* renamed from: a */
    public final boolean mo812a(View view) {
        if (!this.f639a.mo1927f(view) || this.f639a.mo1908a(view) == 2) {
            return false;
        }
        this.f639a.mo1926e(view);
        return true;
    }
}
