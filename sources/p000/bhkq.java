package p000;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.ViewTreeObserver;
import com.google.android.material.navigation.NavigationView;

/* renamed from: bhkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhkq implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ NavigationView f118918a;

    public bhkq(NavigationView navigationView) {
        this.f118918a = navigationView;
    }

    public final void onGlobalLayout() {
        boolean z;
        NavigationView navigationView = this.f118918a;
        navigationView.getLocationOnScreen(navigationView.f151218f);
        NavigationView navigationView2 = this.f118918a;
        boolean z2 = true;
        if (navigationView2.f151218f[1] == 0) {
            z = true;
        } else {
            z = false;
        }
        bhjs bhjs = navigationView2.f151217e;
        if (bhjs.f118869p != z) {
            bhjs.f118869p = z;
            bhjs.mo63884c();
        }
        NavigationView navigationView3 = this.f118918a;
        navigationView3.f118882c = z;
        Context context = navigationView3.getContext();
        if (context instanceof Activity) {
            int i = Build.VERSION.SDK_INT;
            Activity activity = (Activity) context;
            int height = activity.findViewById(16908290).getHeight();
            int height2 = this.f118918a.getHeight();
            int alpha = Color.alpha(activity.getWindow().getNavigationBarColor());
            NavigationView navigationView4 = this.f118918a;
            if (height != height2 || alpha == 0) {
                z2 = false;
            }
            navigationView4.f118883d = z2;
        }
    }
}
