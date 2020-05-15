package com.google.android.chimera;

import android.app.admin.DevicePolicyManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class DeviceAdminReceiver extends BroadcastReceiver {
    public static final String ACTION_DEVICE_ADMIN_DISABLED = "android.app.action.DEVICE_ADMIN_DISABLED";
    public static final String ACTION_DEVICE_ADMIN_DISABLE_REQUESTED = "android.app.action.DEVICE_ADMIN_DISABLE_REQUESTED";
    public static final String ACTION_DEVICE_ADMIN_ENABLED = "android.app.action.DEVICE_ADMIN_ENABLED";
    public static final String ACTION_LOCK_TASK_ENTERING = "android.app.action.LOCK_TASK_ENTERING";
    public static final String ACTION_LOCK_TASK_EXITING = "android.app.action.LOCK_TASK_EXITING";
    public static final String ACTION_PASSWORD_CHANGED = "android.app.action.ACTION_PASSWORD_CHANGED";
    public static final String ACTION_PASSWORD_EXPIRING = "android.app.action.ACTION_PASSWORD_EXPIRING";
    public static final String ACTION_PASSWORD_FAILED = "android.app.action.ACTION_PASSWORD_FAILED";
    public static final String ACTION_PASSWORD_SUCCEEDED = "android.app.action.ACTION_PASSWORD_SUCCEEDED";
    public static final String ACTION_PROFILE_PROVISIONING_COMPLETE = "android.app.action.PROFILE_PROVISIONING_COMPLETE";
    public static final String DEVICE_ADMIN_META_DATA = "android.app.device_admin";
    public static final String EXTRA_DISABLE_WARNING = "android.app.extra.DISABLE_WARNING";
    public static final String EXTRA_LOCK_TASK_PACKAGE = "android.app.extra.LOCK_TASK_PACKAGE";

    /* renamed from: b */
    private dee f7620b;

    public DevicePolicyManager getManager(Context context) {
        return this.f7620b.mo8562a(context);
    }

    public ComponentName getWho(Context context) {
        return this.f7620b.mo8567b(context);
    }

    public String onChoosePrivateKeyAlias(Context context, Intent intent, int i, Uri uri, String str) {
        return this.f7620b.mo8563a(context, intent, i, uri, str);
    }

    public CharSequence onDisableRequested(Context context, Intent intent) {
        return this.f7620b.mo8568b(context, intent);
    }

    public void onDisabled(Context context, Intent intent) {
        this.f7620b.mo8569c(context, intent);
    }

    public void onEnabled(Context context, Intent intent) {
        this.f7620b.mo8564a(context, intent);
    }

    public void onLockTaskModeEntering(Context context, Intent intent, String str) {
        this.f7620b.mo8566a(context, intent, str);
    }

    public void onLockTaskModeExiting(Context context, Intent intent) {
        this.f7620b.mo8578j(context, intent);
    }

    public void onPasswordChanged(Context context, Intent intent) {
        this.f7620b.mo8570d(context, intent);
    }

    public void onPasswordExpiring(Context context, Intent intent) {
        this.f7620b.mo8573g(context, intent);
    }

    public void onPasswordFailed(Context context, Intent intent) {
        this.f7620b.mo8571e(context, intent);
    }

    public void onPasswordSucceeded(Context context, Intent intent) {
        this.f7620b.mo8572f(context, intent);
    }

    public void onProfileProvisioningComplete(Context context, Intent intent) {
        this.f7620b.mo8576h(context, intent);
    }

    public void onReadyForUserInitialization(Context context, Intent intent) {
        this.f7620b.mo8577i(context, intent);
    }

    public void onReceive(Context context, Intent intent) {
        this.f7620b.onReceive(context, intent);
    }

    public void onSystemUpdatePending(Context context, Intent intent, long j) {
        this.f7620b.mo8565a(context, intent, j);
    }

    public void setProxy(BroadcastReceiver broadcastReceiver) {
        super.setProxy(broadcastReceiver);
        this.f7620b = new dee(this);
    }
}
