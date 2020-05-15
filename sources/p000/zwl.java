package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.vision.internal.Flags;
import java.util.Collections;

/* renamed from: zwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zwl {
    /* renamed from: a */
    public static void m46611a(Context context) {
        zwy zwy;
        brsi.m114534a(context);
        ptm.m31241a(context);
        Flags.m93780a(context);
        try {
            SharedPreferences.Editor edit = zxa.m46625a(context).edit();
            for (zwi zwi : Collections.unmodifiableCollection(zwp.m46614b().f56055a)) {
                if (zwi instanceof zwe) {
                    zwy = new zwr((zwe) zwi);
                } else if (zwi instanceof zwf) {
                    zwy = new zwt((zwf) zwi);
                } else if (zwi instanceof zwg) {
                    zwy = new zwv((zwg) zwi);
                } else if (zwi instanceof zwh) {
                    zwy = new zwx((zwh) zwi);
                } else {
                    String valueOf = String.valueOf(zwi.getClass().getName());
                    throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unexpected flag type: ") : "Unexpected flag type: ".concat(valueOf));
                }
                zwy.mo31546a(edit, zwy.mo31545a().mo25081c());
            }
            stj.m36296a(context, edit, "google_sdk_flags");
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.e("FlagsServiceApi", valueOf2.length() == 0 ? new String("Failed to write shared flags: ") : "Failed to write shared flags: ".concat(valueOf2));
        }
    }
}
