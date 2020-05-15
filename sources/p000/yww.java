package p000;

import android.content.Context;
import android.content.res.Resources;
import android.telephony.TelephonyManager;
import android.util.Log;

/* renamed from: yww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yww {

    /* renamed from: a */
    public static int f54717a = -1;

    /* renamed from: a */
    public static boolean m44953a(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getPhoneType() != 0;
        } catch (Resources.NotFoundException e) {
            Log.e("Fitness", "Unable to determine type of device, assuming phone.", e);
            return true;
        }
    }
}
