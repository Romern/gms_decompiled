package p000;

import android.os.Build;
import android.view.MenuItem;
import android.view.View;

/* renamed from: pc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1264pc {
    @Deprecated
    /* renamed from: a */
    public static View m19826a(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    @Deprecated
    /* renamed from: b */
    public static void m19829b(MenuItem menuItem) {
        menuItem.setShowAsAction(0);
    }

    /* renamed from: a */
    public static void m19827a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C1181ma) {
            ((C1181ma) menuItem).mo15437a(charSequence);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        menuItem.setContentDescription(charSequence);
    }

    @Deprecated
    /* renamed from: a */
    public static void m19828a(MenuItem menuItem, C1263pb pbVar) {
        menuItem.setOnActionExpandListener(new C1262pa(pbVar));
    }
}
