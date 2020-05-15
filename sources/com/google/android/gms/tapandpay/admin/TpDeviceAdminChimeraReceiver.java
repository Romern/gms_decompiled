package com.google.android.gms.tapandpay.admin;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.DeviceAdminReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TpDeviceAdminChimeraReceiver extends DeviceAdminReceiver {
    public final void onDisabled(Context context, Intent intent) {
        TpDeviceAdminIntentOperation.m93013a(context, "com.google.android.gms.tapandpay.admin.DEVICE_ADMIN_DISABLED");
    }

    public final void onEnabled(Context context, Intent intent) {
        TpDeviceAdminIntentOperation.m93013a(context, "com.google.android.gms.tapandpay.admin.DEVICE_ADMIN_ENABLED");
    }

    public final void onPasswordChanged(Context context, Intent intent) {
        TpDeviceAdminIntentOperation.m93013a(context, "com.google.android.gms.tapandpay.admin.DEVICE_ADMIN_PASSWORD_CHANGED");
    }
}
