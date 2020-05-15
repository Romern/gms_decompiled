package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: oob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1583oob {

    /* renamed from: a */
    private static final bnsn f38059a = odk.m28481a("CAR.MISC");

    /* renamed from: a */
    public static synchronized float m29296a(Context context, String str, float f) {
        synchronized (C1583oob.class) {
            String b = npe.m27161b(context);
            try {
                Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(b);
                int identifier = resourcesForApplication.getIdentifier(str, "dimen", b);
                if (identifier == 0) {
                    bnsi c = f38059a.mo68388c();
                    c.mo68432a("oob", "a", 182, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68420a("Resource not found in gearhead.apk: %s", str);
                    return f;
                }
                float dimension = resourcesForApplication.getDimension(identifier);
                return dimension;
            } catch (PackageManager.NameNotFoundException e) {
                bnsi c2 = f38059a.mo68388c();
                c2.mo68432a("oob", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c2.mo68405a("GearHead not installed, returning default");
                return f;
            }
        }
    }

    /* renamed from: a */
    public static synchronized Drawable m29297a(Context context, String str) {
        Drawable a;
        synchronized (C1583oob.class) {
            a = m29298a(context, str, (DisplayMetrics) null);
        }
        return a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
     arg types: [int, android.util.TypedValue, int]
     candidates:
      ClspMth{android.content.res.Resources.getValue(java.lang.String, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
      ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException} */
    /* renamed from: a */
    public static synchronized Drawable m29298a(Context context, String str, DisplayMetrics displayMetrics) {
        synchronized (C1583oob.class) {
            String b = npe.m27161b(context);
            try {
                Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(b);
                int identifier = resourcesForApplication.getIdentifier(str, "drawable", b);
                if (identifier == 0) {
                    bnsi c = f38059a.mo68388c();
                    c.mo68432a("oob", "a", 130, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68420a("Resource not found in gearhead.apk: %s", str);
                    ColorDrawable colorDrawable = new ColorDrawable(0);
                    return colorDrawable;
                }
                TypedValue typedValue = new TypedValue();
                resourcesForApplication.getValue(identifier, typedValue, true);
                if (typedValue.string != null) {
                    if (typedValue.string.toString().endsWith(".xml")) {
                        aux a = aux.m2149a(resourcesForApplication, identifier, context.getTheme());
                        return a;
                    }
                }
                if (displayMetrics != null) {
                    Drawable drawableForDensity = resourcesForApplication.getDrawableForDensity(identifier, displayMetrics.densityDpi, null);
                    return drawableForDensity;
                }
                Drawable drawable = resourcesForApplication.getDrawable(identifier, null);
                return drawable;
            } catch (PackageManager.NameNotFoundException e) {
                bnsi c2 = f38059a.mo68388c();
                c2.mo68432a("oob", "a", 124, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c2.mo68405a("GearHead not installed, this class will return blank drawables.");
                return new ColorDrawable(0);
            }
        }
    }
}
