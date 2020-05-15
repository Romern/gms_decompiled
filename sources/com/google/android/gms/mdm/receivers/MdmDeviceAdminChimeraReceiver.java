package com.google.android.gms.mdm.receivers;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.DeviceAdminReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MdmDeviceAdminChimeraReceiver extends DeviceAdminReceiver {
    public final void onDisabled(Context context, Intent intent) {
        afzq.m53760a(context, false);
    }

    public final void onEnabled(Context context, Intent intent) {
        afzq.m53760a(context, true);
    }
}
