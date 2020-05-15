package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.util.Log;
import com.google.android.gms.trustlet.onbody.internal.OnbodyLure$GserviceChangeReceiver;
import com.google.android.gms.trustlet.onbody.internal.OnbodyLure$UserPresentBroadcastReceiver;
import com.google.android.gms.trustlet.onbody.internal.PhonePositionTrustletChimeraService;

/* renamed from: auvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auvq {

    /* renamed from: a */
    public final Context f92616a;

    /* renamed from: b */
    public final SharedPreferences f92617b;

    /* renamed from: c */
    public boolean f92618c = false;

    /* renamed from: d */
    private OnbodyLure$UserPresentBroadcastReceiver f92619d = null;

    /* renamed from: e */
    private OnbodyLure$GserviceChangeReceiver f92620e = null;

    public auvq(Context context) {
        SharedPreferences a = aupo.m77578a(context);
        this.f92616a = context;
        this.f92617b = a;
        OnbodyLure$GserviceChangeReceiver onbodyLure$GserviceChangeReceiver = new OnbodyLure$GserviceChangeReceiver(this);
        this.f92620e = onbodyLure$GserviceChangeReceiver;
        this.f92616a.registerReceiver(onbodyLure$GserviceChangeReceiver, new IntentFilter("com.google.gservices.intent.action.GSERVICES_CHANGED"));
        mo50978b();
    }

    /* renamed from: a */
    public final void mo50977a() {
        Log.i("Coffee-OnbodyLure", "destroy");
        mo50979c();
        OnbodyLure$GserviceChangeReceiver onbodyLure$GserviceChangeReceiver = this.f92620e;
        if (onbodyLure$GserviceChangeReceiver != null) {
            this.f92616a.unregisterReceiver(onbodyLure$GserviceChangeReceiver);
            this.f92620e = null;
        }
    }

    /* renamed from: b */
    public final void mo50978b() {
        if (mo50980d()) {
            Log.i("Coffee-OnbodyLure", "start lure");
            OnbodyLure$UserPresentBroadcastReceiver onbodyLure$UserPresentBroadcastReceiver = new OnbodyLure$UserPresentBroadcastReceiver(this);
            this.f92619d = onbodyLure$UserPresentBroadcastReceiver;
            this.f92616a.registerReceiver(onbodyLure$UserPresentBroadcastReceiver, new IntentFilter("android.intent.action.USER_PRESENT"));
            this.f92617b.edit().putInt("promotion_status_for_1", 1).apply();
            this.f92618c = true;
        }
    }

    /* renamed from: c */
    public final void mo50979c() {
        Log.i("Coffee-OnbodyLure", "stop lure");
        OnbodyLure$UserPresentBroadcastReceiver onbodyLure$UserPresentBroadcastReceiver = this.f92619d;
        if (onbodyLure$UserPresentBroadcastReceiver != null) {
            this.f92616a.unregisterReceiver(onbodyLure$UserPresentBroadcastReceiver);
            this.f92619d = null;
        }
        this.f92618c = false;
    }

    /* renamed from: d */
    public final boolean mo50980d() {
        int i;
        if (PhonePositionTrustletChimeraService.m93538a(this.f92617b) || !PhonePositionTrustletChimeraService.m93537a(this.f92616a) || this.f92617b.getBoolean("onbody_lure_already_shown", false) || ((i = (int) chac.f188164a.mo6606a().mo84853i()) == 1 ? Settings.Secure.getInt(this.f92616a.getContentResolver(), "lock_screen_show_notifications", -1) <= 0 : !(i != 2 || Settings.Secure.getInt(this.f92616a.getContentResolver(), "lock_screen_allow_private_notifications", -1) > 0))) {
            return false;
        }
        return true;
    }
}
