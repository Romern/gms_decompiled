package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;

/* renamed from: adfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adfp {

    /* renamed from: a */
    public final Context f61564a;

    public adfp(Context context) {
        this.f61564a = context;
    }

    /* renamed from: a */
    public static boolean m50311a(Context context, String str) {
        try {
            ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(new ComponentName("com.android.vending", "com.google.android.finsky.instantapps.EphemeralInstallerActivity"), 128);
            if (activityInfo == null || activityInfo.metaData == null || !activityInfo.metaData.getBoolean(str)) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo33420a() {
        return m50311a(this.f61564a, "canDecodeProtobufSplitName");
    }
}
