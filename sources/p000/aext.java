package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* renamed from: aext */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aext {
    /* renamed from: a */
    public static boolean m52661a(Context context, Intent intent, ComponentName componentName) {
        String str;
        if (componentName == null && intent.getAction() == null) {
            return true;
        }
        if (componentName != null) {
            str = componentName.getPackageName();
        } else {
            str = null;
        }
        if (str != null && rfz.m33557a(context).mo24610b(str)) {
            String v = cfaz.f183554a.mo6606a().mo80799v();
            StringBuilder sb = new StringBuilder(String.valueOf(v).length() + 23);
            sb.append(v);
            sb.append(",com.google.android.gms");
            String[] split = sb.toString().split(",");
            for (String str2 : split) {
                if (str2.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
