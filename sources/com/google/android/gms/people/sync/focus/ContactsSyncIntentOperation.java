package com.google.android.gms.people.sync.focus;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContactsSyncIntentOperation extends IntentOperation {
    public ContactsSyncIntentOperation() {
        amig.m62939a();
    }

    /* renamed from: a */
    private static final void m68203a(Context context, Exception exc) {
        ande.f76660a.mo41719a(context).mo41718a(exc, ((Double) amhz.f74928a.mo41191a()).doubleValue());
        Log.e("FSA2_ContactsSyncIntentOp", "Exception thrown when preparing for contacts sync", exc);
    }

    public final void onHandleIntent(Intent intent) {
        NetworkCapabilities networkCapabilities;
        long j;
        Context applicationContext = getApplicationContext();
        if (cfxe.f185877a.mo6606a().mo82862D() && m68204a(intent)) {
            amvj.m63368a(applicationContext).mo41382e();
        }
        if (cfyk.f186101a.mo6606a().mo83099c() && m68204a(intent)) {
            for (Account account : gre.m13768b(intent)) {
                Log.i("FSA2_ContactsSyncIntentOp", "Cleared progress notification for non-existing account.");
                sex.m35104a(applicationContext).mo25444a("com.google.android.gms.people.sync.focus.notification.sync_progress.tag.".concat(account.name), 2);
            }
        }
        if (cfvx.m143256b() && m68204a(intent)) {
            List<Account> b = gre.m13768b(intent);
            alsj a = alsj.m61651a(applicationContext);
            for (Account account2 : b) {
                Log.i("FSA2_ContactsSyncIntentOp", "Clearing FSA2 sync status preference for removed account");
                a.mo40704h(account2.name);
            }
            if (cfvx.f185816a.mo6606a().mo82810b()) {
                return;
            }
        }
        if (!cgbt.m144707c()) {
            return;
        }
        if (cfye.f186095a.mo6606a().mo83067a() && !amwz.m63595a(applicationContext)) {
            Log.e("FSA2_ContactsSyncIntentOp", "Gms doesn't have contacts permission.");
        } else if (!"android.intent.action.ACTION_POWER_CONNECTED".equals(intent.getAction())) {
            try {
                amwk.INSTANCE.mo41484a(applicationContext);
            } catch (amyc e) {
                Log.e("FSA2_ContactsSyncIntentOp", "Failed to prepare for Contacts sync", e);
            } catch (SecurityException e2) {
                if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo83044u()).booleanValue()) {
                    m68203a(applicationContext, e2);
                    return;
                }
                throw e2;
            } catch (Exception e3) {
                if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo83043t()).booleanValue()) {
                    m68203a(applicationContext, e3);
                    return;
                }
                throw e3;
            }
        } else if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo83005bf()).booleanValue()) {
            amvg a2 = amvg.m63359a();
            int i = Build.VERSION.SDK_INT;
            ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService("connectivity");
            if (connectivityManager != null) {
                networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            } else {
                networkCapabilities = null;
            }
            int a3 = amvg.m63358a(networkCapabilities);
            if (cfvu.f185805a.mo6606a().mo82804f() && (networkCapabilities == null || !networkCapabilities.hasTransport(1))) {
                amvg.m63360a(4, amvg.m63358a(networkCapabilities), null);
                return;
            }
            alsj a4 = alsj.m61651a(applicationContext);
            bnic<Account> b2 = a2.f76003b.mo41678b(applicationContext);
            bxvd da = amkx.f75126e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amkx amkx = (amkx) da.f164949b;
            amkx.f75131d = a3 - 1;
            amkx.f75128a = 4 | amkx.f75128a;
            for (Account account3 : b2) {
                if (cfvu.f185805a.mo6606a().mo82800b()) {
                    try {
                        j = new amwl(new amwm(applicationContext.getContentResolver(), account3)).mo41486a();
                    } catch (amyc e4) {
                        Log.e("FSA2_ContactsSyncOnChargingOp", "Exception thrown when getting last full sync timestamp", e4);
                        j = 0;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    long d = cfvu.f185805a.mo6606a().mo82802d();
                    if (currentTimeMillis - j < TimeUnit.SECONDS.toMillis(d)) {
                        TimeUnit.SECONDS.toDays(d);
                        amvg.m63360a(3, a3, account3.name);
                    }
                }
                long j2 = a4.f74200a.getLong(alsj.m61655d("focus_sync_timestamp_on_charging_", account3.name), 0);
                long currentTimeMillis2 = System.currentTimeMillis();
                long e5 = cfvu.f185805a.mo6606a().mo82803e();
                if (currentTimeMillis2 - j2 < TimeUnit.SECONDS.toMillis(e5)) {
                    TimeUnit.SECONDS.toHours(e5);
                    amvg.m63360a(2, a3, account3.name);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("force", true);
                    bundle.putBoolean("expedited", true);
                    if (cfvu.m143235d()) {
                        bundle.putBoolean("TRIGGERED_BY_CHARGING", true);
                    }
                    ContentResolver.requestSync(account3, "com.android.contacts", bundle);
                    String str = account3.name;
                    a4.f74200a.edit().putLong(alsj.m61655d("focus_sync_timestamp_on_charging_", account3.name), System.currentTimeMillis()).apply();
                    if (cfvu.m143233b()) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        amkx amkx2 = (amkx) da.f164949b;
                        amkx2.f75129b = 2;
                        amkx2.f75128a |= 1;
                        almk.m61263a().mo40516a((amkx) da.mo74062i(), account3.name);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m68204a(Intent intent) {
        return "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction()) && intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED");
    }
}
