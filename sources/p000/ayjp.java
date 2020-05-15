package p000;

import android.content.res.Resources;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ayjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayjp {
    /* renamed from: a */
    public static String m84116a(Resources resources, String str) {
        try {
            return resources.getResourcePackageName(C0126R.anim.abc_fade_in);
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable("PackageHelper", 5)) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 81);
                sb.append("Could not get resources package for package \"");
                sb.append(str);
                sb.append("\". Falling back to app package name.");
                Log.w("PackageHelper", sb.toString());
            }
            return str;
        }
    }
}
