package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: sic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sic {

    /* renamed from: a */
    private static final HashMap f44526a = new HashMap();

    /* renamed from: a */
    public static synchronized String m35342a(Context context, String str) {
        synchronized (sic.class) {
            if (TextUtils.isEmpty(str)) {
                str = "GMS/1.0";
            }
            String str2 = (String) f44526a.get(str);
            if (str2 != null) {
                return str2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Mozilla 5.0 (Linux; U; Android ");
            sb.append(Build.VERSION.RELEASE);
            sb.append("; ");
            sb.append(Locale.getDefault().toString());
            String str3 = Build.MODEL;
            if (!TextUtils.isEmpty(str3)) {
                sb.append("; ");
                sb.append(str3);
            }
            String str4 = Build.ID;
            if (!TextUtils.isEmpty(str4)) {
                sb.append("; Build/");
                sb.append(str4);
            }
            sb.append("); ");
            sb.append(context.getPackageName());
            sb.append('/');
            int i = 0;
            try {
                i = svr.m36484b(context).mo26176b(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
            }
            sb.append(i);
            sb.append("; FastParser/1.1; ");
            sb.append(str);
            sb.append("; (gzip)");
            String sb2 = sb.toString();
            f44526a.put(str, sb2);
            return sb2;
        }
    }
}
