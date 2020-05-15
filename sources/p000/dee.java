package p000;

import android.app.admin.DeviceAdminReceiver;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: dee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dee extends DeviceAdminReceiver {

    /* renamed from: a */
    private final com.google.android.chimera.DeviceAdminReceiver f12973a;

    public dee(com.google.android.chimera.DeviceAdminReceiver deviceAdminReceiver) {
        this.f12973a = deviceAdminReceiver;
    }

    /* renamed from: a */
    public final DevicePolicyManager mo8562a(Context context) {
        return super.getManager(context);
    }

    /* renamed from: b */
    public final ComponentName mo8567b(Context context) {
        return super.getWho(context);
    }

    /* renamed from: c */
    public final void mo8569c(Context context, Intent intent) {
        super.onDisabled(context, intent);
    }

    /* renamed from: d */
    public final void mo8570d(Context context, Intent intent) {
        super.onPasswordChanged(context, intent);
    }

    /* renamed from: e */
    public final void mo8571e(Context context, Intent intent) {
        super.onPasswordFailed(context, intent);
    }

    /* renamed from: f */
    public final void mo8572f(Context context, Intent intent) {
        super.onPasswordSucceeded(context, intent);
    }

    /* renamed from: g */
    public final void mo8573g(Context context, Intent intent) {
        super.onPasswordExpiring(context, intent);
    }

    public final DevicePolicyManager getManager(Context context) {
        return this.f12973a.getManager(context);
    }

    public final ComponentName getWho(Context context) {
        return this.f12973a.getWho(context);
    }

    /* renamed from: h */
    public final void mo8576h(Context context, Intent intent) {
        super.onProfileProvisioningComplete(context, intent);
    }

    /* renamed from: i */
    public final void mo8577i(Context context, Intent intent) {
        super.onReadyForUserInitialization(context, intent);
    }

    /* renamed from: j */
    public final void mo8578j(Context context, Intent intent) {
        super.onLockTaskModeExiting(context, intent);
    }

    public final String onChoosePrivateKeyAlias(Context context, Intent intent, int i, Uri uri, String str) {
        return this.f12973a.onChoosePrivateKeyAlias(context, intent, i, uri, str);
    }

    public final CharSequence onDisableRequested(Context context, Intent intent) {
        return this.f12973a.onDisableRequested(context, intent);
    }

    public final void onDisabled(Context context, Intent intent) {
        this.f12973a.onDisabled(context, intent);
    }

    public final void onEnabled(Context context, Intent intent) {
        this.f12973a.onEnabled(context, intent);
    }

    public final void onLockTaskModeEntering(Context context, Intent intent, String str) {
        this.f12973a.onLockTaskModeEntering(context, intent, str);
    }

    public final void onLockTaskModeExiting(Context context, Intent intent) {
        this.f12973a.onLockTaskModeExiting(context, intent);
    }

    public final void onPasswordChanged(Context context, Intent intent) {
        this.f12973a.onPasswordChanged(context, intent);
    }

    public final void onPasswordExpiring(Context context, Intent intent) {
        this.f12973a.onPasswordExpiring(context, intent);
    }

    public final void onPasswordFailed(Context context, Intent intent) {
        this.f12973a.onPasswordFailed(context, intent);
    }

    public final void onPasswordSucceeded(Context context, Intent intent) {
        this.f12973a.onPasswordSucceeded(context, intent);
    }

    public final void onProfileProvisioningComplete(Context context, Intent intent) {
        this.f12973a.onProfileProvisioningComplete(context, intent);
    }

    public final void onReadyForUserInitialization(Context context, Intent intent) {
        this.f12973a.onReadyForUserInitialization(context, intent);
    }

    public final void onSystemUpdatePending(Context context, Intent intent, long j) {
        this.f12973a.onSystemUpdatePending(context, intent, j);
    }

    /* renamed from: a */
    public final String mo8563a(Context context, Intent intent, int i, Uri uri, String str) {
        return super.onChoosePrivateKeyAlias(context, intent, i, uri, str);
    }

    /* renamed from: b */
    public final CharSequence mo8568b(Context context, Intent intent) {
        return super.onDisableRequested(context, intent);
    }

    /* renamed from: a */
    public final void mo8564a(Context context, Intent intent) {
        super.onEnabled(context, intent);
    }

    /* renamed from: a */
    public final void mo8565a(Context context, Intent intent, long j) {
        super.onSystemUpdatePending(context, intent, j);
    }

    /* renamed from: a */
    public final void mo8566a(Context context, Intent intent, String str) {
        super.onLockTaskModeEntering(context, intent, str);
    }
}
