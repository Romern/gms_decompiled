package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: aexs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aexs {

    /* renamed from: a */
    private static final srn f63991a = srn.m36127a(sgj.LOCATION_SHARING);

    /* renamed from: a */
    public static Uri m52660a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri.Builder buildUpon = Uri.parse(cfaz.f183554a.mo6606a().mo80792o()).buildUpon();
            Locale locale = Locale.getDefault();
            String language = locale.getLanguage();
            String lowerCase = locale.getCountry().toLowerCase(Locale.US);
            StringBuilder sb = new StringBuilder(String.valueOf(language).length() + 1 + String.valueOf(lowerCase).length());
            sb.append(language);
            sb.append("-");
            sb.append(lowerCase);
            buildUpon.appendQueryParameter("hl", sb.toString());
            buildUpon.appendQueryParameter("p", str);
            try {
                buildUpon.appendQueryParameter("version", String.valueOf(context.getPackageManager().getPackageInfo(context.getApplicationInfo().packageName, 0).versionCode));
            } catch (PackageManager.NameNotFoundException e) {
                bnsl bnsl = (bnsl) f63991a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("aexs", "a", 66, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Error finding package %s", context.getApplicationInfo().packageName);
            }
            return buildUpon.build();
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("getHelpUrl(): fromWhere must be non-empty)");
        bnsl bnsl2 = (bnsl) f63991a.mo68387b();
        bnsl2.mo68437a(illegalArgumentException);
        bnsl2.mo68432a("aexs", "a", 46, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("getHelpUrl(): fromWhere must be non-empty)");
        throw illegalArgumentException;
    }
}
