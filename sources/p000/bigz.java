package p000;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p002v7.widget.Toolbar;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: bigz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bigz {

    /* renamed from: a */
    private final String f120577a;

    /* renamed from: b */
    private Resources f120578b;

    public bigz(ComponentName componentName, PackageManager packageManager) {
        String packageName = componentName.getPackageName();
        this.f120577a = packageName;
        try {
            this.f120578b = packageManager.getResourcesForApplication(packageName);
        } catch (PackageManager.NameNotFoundException e) {
            this.f120578b = null;
            Log.e("ColorHelper", "getResourcesForApplication failed", e);
        }
    }

    /* renamed from: a */
    public static Toolbar m102376a(Activity activity) {
        try {
            Toolbar toolbar = (Toolbar) activity.findViewById(C0126R.C0129id.action_bar);
            if (toolbar != null) {
                return toolbar;
            }
            if (Log.isLoggable("ColorHelper", 6)) {
                Log.e("ColorHelper", "Failed to get action bar; couldn't get view.");
            }
            return null;
        } catch (ClassCastException e) {
            if (Log.isLoggable("ColorHelper", 6)) {
                Log.e("ColorHelper", "Failed to get action bar; View is wrong class.", e);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static void m102377a(Drawable drawable, int i) {
        drawable.mutate().setColorFilter(Color.rgb(Color.red(i), Color.green(i), Color.blue(i)), PorterDuff.Mode.SRC_ATOP);
        drawable.setAlpha(Color.alpha(i));
    }

    /* renamed from: a */
    public static void m102378a(Activity activity, int i, int i2, int i3) {
        Toolbar a = m102376a(activity);
        if (a != null) {
            int i4 = Build.VERSION.SDK_INT;
            a.setBackgroundColor(i);
            a.mo1680b(i3);
            Drawable i5 = a.mo1699i();
            if (i5 != null) {
                m102377a(i5, i3);
                a.mo1681b(i5);
            }
            int i6 = Build.VERSION.SDK_INT;
            activity.getWindow().setStatusBarColor(i2);
        }
    }

    /* renamed from: a */
    public final int mo64606a(String str) {
        int identifier = this.f120578b.getIdentifier(str, "color", this.f120577a);
        if (identifier != 0) {
            try {
                return this.f120578b.getColor(identifier);
            } catch (Resources.NotFoundException e) {
                throw new bigy(e);
            }
        } else {
            throw new bigy(String.format("No color found for name: %s in package: %s", str, this.f120577a));
        }
    }
}
