package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: awfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awfz {

    /* renamed from: a */
    public static final bjzc f94285a = new awfy();

    /* renamed from: a */
    public static boolean m79885a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            Log.w("PermissionUtils", "Cannot check permissions without a valid package name.");
            int i = spn.f44932a;
            return false;
        }
        ClientContext clientContext = new ClientContext();
        clientContext.f30212b = spn.m35897i(context, str);
        clientContext.f30215e = str;
        if (sfr.m35174a(context, clientContext).mo25481a(str2) == 0) {
            return true;
        }
        return false;
    }
}
