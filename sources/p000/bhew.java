package p000;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: bhew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhew extends C1443vt {
    public bhew(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final MenuItem mo16217a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= 5) {
            mo16252e();
            MenuItem a = super.mo16217a(i, i2, i3, charSequence);
            if (a instanceof C1446vw) {
                ((C1446vw) a).mo16281a(true);
            }
            mo16253f();
            return a;
        }
        throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }
}
