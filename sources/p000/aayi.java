package p000;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.chimera.Activity;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.Locale;

/* renamed from: aayi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aayi {
    /* renamed from: a */
    public static int m47263a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            throw new Resources.NotFoundException(String.format(Locale.getDefault(), "Attribute not defined by theme (attr = %d)", Integer.valueOf(i)));
        } else if (typedValue.type >= 28 && typedValue.type <= 31) {
            return typedValue.data;
        } else {
            if (typedValue.type == 3) {
                try {
                    return context.getResources().getColor(typedValue.resourceId);
                } catch (Resources.NotFoundException e) {
                    throw new UnsupportedOperationException(String.format(Locale.getDefault(), "Type of attribute is not a color (attr = %d, type = %d)", Integer.valueOf(i), Integer.valueOf(typedValue.type)), e);
                }
            } else {
                throw new UnsupportedOperationException(String.format(Locale.getDefault(), "Type of attribute is not a color (attr = %d, type = %d)", Integer.valueOf(i), Integer.valueOf(typedValue.type)));
            }
        }
    }

    /* renamed from: b */
    public static boolean m47270b() {
        return aaya.m47228a(cegx.m136817b());
    }

    /* renamed from: b */
    public static boolean m47271b(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            throw new Resources.NotFoundException(String.format(Locale.getDefault(), "Attribute not defined by theme (attr = %d)", Integer.valueOf(i)));
        } else if (typedValue.type == 18) {
            return typedValue.data != 0;
        } else {
            throw new UnsupportedOperationException(String.format(Locale.getDefault(), "Type of attribute is not a boolean (attr = %d, type = %d)", Integer.valueOf(i), Integer.valueOf(typedValue.type)));
        }
    }

    /* renamed from: a */
    public static void m47264a(Activity activity, ErrorReport errorReport, int i, int i2, int i3) {
        m47265a(activity, errorReport.f31534Y, i, i2, i3);
    }

    /* renamed from: a */
    private static void m47265a(Activity activity, ThemeSettings themeSettings, int i, int i2, int i3) {
        if (themeSettings != null) {
            int i4 = themeSettings.f31623a;
            if (i4 == 0 || i4 == 1) {
                activity.setTheme(i);
            } else if (i4 == 2) {
                activity.setTheme(i2);
            } else {
                activity.setTheme(i3);
            }
        } else {
            activity.setTheme(i3);
        }
    }

    /* renamed from: a */
    public static void m47266a(Activity activity, HelpConfig helpConfig, int i, int i2, int i3) {
        m47265a(activity, helpConfig.f78801A, i, i2, i3);
    }

    /* renamed from: a */
    public static boolean m47267a() {
        return aaya.m47228a(cehs.f182689a.mo6606a().mo79145a());
    }

    /* renamed from: a */
    public static boolean m47268a(ErrorReport errorReport) {
        ThemeSettings themeSettings;
        return m47270b() && (themeSettings = errorReport.f31534Y) != null && themeSettings.f31623a == 2;
    }

    /* renamed from: a */
    public static boolean m47269a(HelpConfig helpConfig) {
        ThemeSettings themeSettings;
        return m47270b() && (themeSettings = helpConfig.f78801A) != null && themeSettings.f31623a == 2;
    }
}
