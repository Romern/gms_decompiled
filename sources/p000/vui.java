package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;

/* renamed from: vui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vui extends vtx {

    /* renamed from: a */
    public final SharedPreferences f49990a = super.mo28858l();

    public vui(Context context) {
        super(context);
    }

    /* renamed from: a */
    private static int m41308a(SharedPreferences sharedPreferences) {
        int i = sharedPreferences.getInt("setup_notification_count", 0);
        StringBuilder sb = new StringBuilder(67);
        sb.append("Current car setup notification remind me later count at:");
        sb.append(i);
        sb.toString();
        return i;
    }

    /* renamed from: b */
    public static boolean m41309b(Context context) {
        SharedPreferences a = vtx.m41293a(context);
        if (!a.getBoolean("do_not_show_notification_again", false) && ccrp.m131365c() && ceuz.m138278c() && cevf.m138284b() && ccra.m131312d()) {
            vtm vtm = new vtm(context);
            if (vtm.mo28838a() || vtm.mo28839b() || ((long) m41308a(a)) >= ccrp.m131364b()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final C1102je mo28848d() {
        Intent component = new Intent().setComponent(vqx.m41082c());
        Intent startIntent = IntentOperation.getStartIntent(this.f49970c, vuh.class, "com.google.android.drivingmode.SETUP_REMIND_ME_LATER");
        Intent startIntent2 = IntentOperation.getStartIntent(this.f49970c, vuh.class, "com.google.android.drivingmode.SETUP_CLEAR_NOTIFICATION");
        PendingIntent activity = PendingIntent.getActivity(this.f49970c, 0, component, 134217728);
        PendingIntent service = PendingIntent.getService(this.f49970c, 0, startIntent2, 134217728);
        C1102je d = super.mo28848d();
        d.mo13640e(this.f49970c.getString(C0126R.string.dm_setup_notification_title));
        d.mo13632b(this.f49970c.getString(C0126R.string.dm_setup_notification_text));
        d.mo13620a(activity);
        d.mo13631b(service);
        d.mo13618a(0, this.f49970c.getString(C0126R.string.dm_setup_notification_setup_action_text), activity);
        if (((long) m41308a(this.f49990a)) != ccrp.m131364b() - 1) {
            d.mo13618a(0, this.f49970c.getString(C0126R.string.dm_setup_notification_remind_me_later_action_text), PendingIntent.getService(this.f49970c, 0, startIntent, 134217728));
        } else {
            d.mo13618a(0, this.f49970c.getString(C0126R.string.common_no_thanks), service);
        }
        return d;
    }

    /* renamed from: g */
    public final int mo28850g() {
        return 50384740;
    }

    /* renamed from: a */
    public final void mo28845a() {
        if (m41309b(this.f49970c)) {
            Log.i("CAR.DRIVINGMODE", "Showing Driving Mode Set up Notification");
            super.mo28845a();
            return;
        }
        Log.i("CAR.DRIVINGMODE", "Not showing Driving Mode Set up Notification");
    }

    /* renamed from: b */
    public final void mo28846b() {
        super.mo28846b();
        int i = this.f49990a.getInt("setup_notification_count", 0) + 1;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Increasing set up notification shown count:");
        sb.append(i);
        sb.toString();
        this.f49990a.edit().putInt("setup_notification_count", i).apply();
    }
}
