package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* renamed from: rfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class rfj {

    /* renamed from: c */
    public static final int f42871c = rfy.f42893b;

    /* renamed from: d */
    public static final rfj f42872d = new rfj();

    /* renamed from: b */
    public final int mo24590b(Context context) {
        int i = rfy.f42893b;
        return rfy.m33548b(context, 0) ? 18 : 0;
    }

    /* renamed from: c */
    public final PendingIntent mo24592c(Context context, int i, String str) {
        Intent b = mo24591b(context, i, str);
        if (b != null) {
            return PendingIntent.getActivity(context, 0, b, 134217728);
        }
        return null;
    }

    /* renamed from: b */
    public final Intent mo24591b(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            if (context != null) {
                sre.m36090j(context);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(f42871c);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(svr.m36484b(context).mo26176b(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException e) {
                }
            }
            return sbv.m34872a("com.google.android.gms", sb.toString());
        } else if (i != 3) {
            return null;
        } else {
            return sbv.m34871a("com.google.android.gms");
        }
    }
}
