package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.chimera.Activity;

/* renamed from: awfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awfy extends bjzc {
    /* renamed from: a */
    public final boolean mo52115a(Context context, String str, String str2) {
        return awfz.m79885a(context, str, str2);
    }

    /* renamed from: a */
    public final String mo52114a(Activity activity) {
        if (activity instanceof awcl) {
            return ((awcl) activity).mo51881h().f110419c;
        }
        String a = spn.m35852a(activity);
        if (!"com.google.android.gms".equals(a)) {
            return a;
        }
        Log.w("PermissionUtils", "Couldn't find calling package name that differs from GCore.");
        return "";
    }
}
