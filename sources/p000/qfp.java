package p000;

import android.content.Context;
import android.os.Build;
import android.os.SystemProperties;
import android.provider.Settings;

/* renamed from: qfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qfp {

    /* renamed from: a */
    public static final Logger f41122a = qgn.m32143a("ParamsBuilder");

    /* renamed from: b */
    public static final String f41123b = String.format("https://%s/checkin", SystemProperties.get("gms.checkin.sw_domain", "android.clients.google.com"));

    /* renamed from: c */
    public final Context f41124c;

    /* renamed from: d */
    public final boolean f41125d;

    public qfp(Context context, boolean z) {
        this.f41124c = context;
        this.f41125d = z;
    }

    /* renamed from: a */
    public final boolean mo24015a() {
        int i = Build.VERSION.SDK_INT;
        try {
            if (Settings.Global.getInt(this.f41124c.getContentResolver(), "euicc_provisioned") == 1) {
                return true;
            }
            return false;
        } catch (Settings.SettingNotFoundException e) {
            return false;
        }
    }
}
