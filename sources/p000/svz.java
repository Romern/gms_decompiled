package p000;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;

/* renamed from: svz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class svz extends svy {
    /* renamed from: d */
    public final String mo26191d(Context context) {
        ComponentName profileOwner = ((DevicePolicyManager) context.getSystemService("device_policy")).getProfileOwner();
        if (profileOwner != null) {
            return profileOwner.getPackageName();
        }
        return null;
    }

    /* renamed from: e */
    public final String mo26194e(Context context) {
        return ((DevicePolicyManager) context.getSystemService("device_policy")).getDeviceOwner();
    }
}
