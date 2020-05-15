package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* renamed from: aymu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aymu {
    /* renamed from: a */
    public static Uri m84284a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            String a = aymn.m84265a(context.getContentResolver(), "context_sensitive_help_url", "https://support.google.com/mobile/?hl=%locale%");
            if (a.contains("%locale%")) {
                Locale locale = Locale.getDefault();
                a = a.replace("%locale%", locale.getLanguage() + "-" + locale.getCountry().toLowerCase(locale));
            }
            Uri.Builder buildUpon = Uri.parse(a).buildUpon();
            buildUpon.appendQueryParameter("p", str);
            try {
                buildUpon.appendQueryParameter("version", String.valueOf(context.getPackageManager().getPackageInfo(context.getApplicationInfo().packageName, 0).versionCode));
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("HelpUrl", "Error finding package " + context.getApplicationInfo().packageName);
            }
            return buildUpon.build();
        }
        throw new IllegalArgumentException("getHelpUrl(): fromWhere must be non-empty");
    }
}
