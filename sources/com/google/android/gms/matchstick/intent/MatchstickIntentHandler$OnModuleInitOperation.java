package com.google.android.gms.matchstick.intent;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation;
import com.google.android.libraries.matchstick.task.ScheduledTaskService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MatchstickIntentHandler$OnModuleInitOperation extends qlf {

    /* renamed from: a */
    static final String[] f79957a = {"com.google.android.gms.matchstick.net.MessagingService", "com.google.android.gms.matchstick.task.ScheduledTaskService", "com.google.android.gms.matchstick.ui.MessageActivity", "com.google.android.gms.matchstick.data.LighterContentProvider", "com.google.android.gms.matchstick.data.DatabaseProvider", "com.google.android.gms.matchstick.data.AppDataProvider", "com.google.android.gms.matchstick.GcmBroadcastReceiver", "com.google.android.gms.matchstick.settings.MatchstickSettingsActivity", "com.google.android.gms.matchstick.settings.RegistrationActivity", "com.google.android.gms.matchstick.call.CallEntryActivity", "com.google.android.gms.matchstick.contacts.reachability.ReachabilityService"};

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: afiw.a(android.content.Context, boolean):void
     arg types: [android.content.Context, int]
     candidates:
      afiw.a(java.lang.String, android.content.Context):void
      afiw.a(android.content.Context, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: afiw.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      afiw.a(android.content.Context, long, int):void
      afiw.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        long j;
        boolean z;
        int i2 = 1;
        new Object[1][0] = Integer.valueOf(i);
        int i3 = Build.VERSION.SDK_INT;
        Context baseContext = getBaseContext();
        for (String str : f79957a) {
            afiw.m53136a(getBaseContext(), str, true);
        }
        afiw.m53142e(baseContext);
        afiw.m53143f(getBaseContext());
        azqf.m86130a(getBaseContext());
        if (azqf.m86149c() && cfgs.m139391K()) {
            afiw.m53140c(baseContext);
        }
        if (azdl.m85412a(getBaseContext()).mo54735I() && (!cfgs.m139391K() || !cfgs.m139409o())) {
            afiw.m53141d(getBaseContext());
        }
        int i4 = i & 2;
        int i5 = i & 4;
        int i6 = i & 8;
        if (i4 != 0) {
            afiw.m53144g(baseContext);
            afiw.m53137a(baseContext, false);
        }
        if (!(i5 == 0 && i6 == 0)) {
            azph.m85998a(baseContext).mo55125a(i5 == 0 ? 481 : 482);
            afiw.m53137a(baseContext, cfeo.f183719a.mo6606a().mo81053ce());
            azdl a = azdl.m85412a(baseContext);
            if (!a.f99088a.contains("tachystick_activated")) {
                SharedPreferences.Editor edit = a.f99088a.edit();
                if (a.f99088a.getInt("num_accepted_calls", 0) > 0) {
                    z = true;
                } else {
                    z = false;
                }
                edit.putBoolean("tachystick_activated", z);
                edit.apply();
            }
        }
        try {
            if (azcl.m85289a(getBaseContext()).getWritableDatabase().getVersion() != 55) {
                azoj.m85933c("IntentHandler", "Failed to update database", new Object[0]);
            }
            if (i4 == 0) {
                j = cfeo.f183719a.mo6606a().mo80997bD();
            } else {
                j = cfeo.f183719a.mo6606a().mo80999bF();
            }
            if (i4 != 0) {
                i2 = 3;
            }
            afiw.m53135a(baseContext, j, i2);
            azdl a2 = azdl.m85412a(baseContext);
            if (a2.mo54785j() == 0 || a2.mo54782i() == 0) {
                Intent intent2 = new Intent("com.google.android.apps.libraries.matchstick.action.RUN_SYNC_CHECKER");
                intent2.setClassName(baseContext, "com.google.android.gms.matchstick.net.MessagingService");
                azor.m85956a(baseContext, 77772, intent2);
                azor.m85956a(baseContext, 77772, SilentRegisterIntentOperation.m94569a(baseContext, (String) null));
            }
            afiw.m53134a(baseContext);
            ScheduledTaskService.m94659a(baseContext, "gms:matchstick:pingDuo", cfeo.f183719a.mo6606a().mo80932S(), (float) cfeo.f183719a.mo6606a().mo80930Q());
        } catch (SQLiteException e) {
        }
    }
}
