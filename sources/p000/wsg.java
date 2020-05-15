package p000;

import android.content.Context;
import android.widget.CompoundButton;

/* renamed from: wsg */
final /* synthetic */ class wsg implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    private final wsl f51239a;

    public wsg(wsl wsl) {
        this.f51239a = wsl;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        wsl wsl = this.f51239a;
        wsl.f51247d.mo73039c().edit().putBoolean("notification_settings_devcie", z).commit();
        Context context = wsl.getContext();
        Context context2 = wsl.getContext();
        boolean e = wsl.f51247d.mo73041e();
        context.startService(butb.m120417b(context2).setAction("com.google.android.gms.nearby.discovery:ACTION_SET_DEVICE_SETTINGS").putExtra("com.google.android.gms.nearby.discovery:EXTRA_CATEGORY_SWITCH_ENABLED", e).putExtra("com.google.android.gms.nearby.discovery:EXTRA_NOTIFICATION_ENABLED", wsl.f51247d.mo73040d()));
        wtv.m42254a(wsl.getContext(), bvin.DEVICES_LIST_VIEW_NOTIFICATIONS_TOGGLED);
    }
}
