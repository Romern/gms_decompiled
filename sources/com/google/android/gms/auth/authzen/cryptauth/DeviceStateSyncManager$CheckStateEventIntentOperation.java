package com.google.android.gms.auth.authzen.cryptauth;

import android.accounts.Account;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceStateSyncManager$CheckStateEventIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        JSONObject jSONObject;
        igu.f20977g.mo25409a("Received %s event", intent.getAction());
        if (!((Boolean) igt.f20965o.mo58455c()).booleanValue()) {
            igu.f20977g.mo25414c("Device state fast sync is disabled", new Object[0]);
        } else if (intent.getAction().equals("com.google.android.gms.auth.authzen.cryptauth.DEVICE_STATE_CHECK_DELAY_COMPLETE")) {
            igu.f20977g.mo25409a("Delay complete, performing device state check.", new Object[0]);
            igu a = igu.m15430a(this);
            List b = a.f20984f.mo13006b();
            Boolean bool = null;
            Long valueOf = !b.isEmpty() ? Long.valueOf(((ihb) b.get(b.size() - 1)).f21000a) : null;
            long currentTimeMillis = System.currentTimeMillis();
            if (valueOf != null) {
                long longValue = currentTimeMillis - valueOf.longValue();
                if (longValue < 0) {
                    igu.f20977g.mo25416d("Invalid timestamp recorded, reseting history.", new Object[0]);
                    a.f20984f.mo13005a();
                } else if (longValue < 30000) {
                    igu.f20977g.mo25414c("Skipping sync since last one was %dms ago.", Long.valueOf(longValue));
                    return;
                }
            }
            boolean b2 = a.f20979a.mo12994b();
            ihc ihc = a.f20984f;
            List b3 = ihc.mo13006b();
            if (b3.isEmpty()) {
                b3.add(new ihb(currentTimeMillis, b2, 1));
            } else {
                ihb ihb = (ihb) b3.get(b3.size() - 1);
                if (ihb.f21001b == b2) {
                    b3.remove(b3.size() - 1);
                    b3.add(new ihb(currentTimeMillis, b2, ihb.f21002c + 1));
                } else {
                    b3.add(new ihb(currentTimeMillis, b2, 1));
                }
            }
            if (b3.size() > 5) {
                b3.remove(0);
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = b3.iterator();
            while (true) {
                if (it.hasNext()) {
                    ihb ihb2 = (ihb) it.next();
                    try {
                        jSONObject = new JSONObject();
                        jSONObject.put("timestamp_millis", ihb2.f21000a);
                        jSONObject.put("is_secure", ihb2.f21001b);
                        jSONObject.put("count", ihb2.f21002c);
                    } catch (JSONException e) {
                        ihc.f21003b.mo25417e("Unable to convert to JSON", e, new Object[0]);
                        jSONObject = null;
                    }
                    if (jSONObject == null) {
                        break;
                    }
                    jSONArray.put(jSONObject);
                } else if (ihc.f21004a.edit().putString("screenlock_state_history", jSONArray.toString()).commit()) {
                    NetworkInfo activeNetworkInfo = a.f20981c.getActiveNetworkInfo();
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        igu.f20977g.mo25409a("No network connectivity. Skipping sync.", new Object[0]);
                        return;
                    }
                    List b4 = a.f20984f.mo13006b();
                    if (b4.size() >= 5) {
                        ihb ihb3 = (ihb) b4.get(b4.size() - 1);
                        if (ihb3.f21000a - ((ihb) b4.get(0)).f21000a <= 172800000 && ihb3.f21002c < 5) {
                            igu.f20977g.mo25416d("Screenlock state not reliable, skipping sync with server.", new Object[0]);
                            return;
                        }
                    }
                    ihc ihc2 = a.f20984f;
                    if (ihc2.f21004a.contains("acknowledged_secure_lock_state")) {
                        bool = Boolean.valueOf(ihc2.f21004a.getBoolean("acknowledged_secure_lock_state", false));
                    }
                    if (bool != null && b2 == bool.booleanValue()) {
                        igu.f20977g.mo25414c("The server is in sync with current state. Nothing to do", new Object[0]);
                        return;
                    }
                    igu.f20977g.mo25409a("Syncing device state with the server", new Object[0]);
                    Iterator it2 = a.f20982d.mo12988a().iterator();
                    boolean z = true;
                    while (true) {
                        if (it2.hasNext()) {
                            Account account = (Account) it2.next();
                            try {
                                if (a.f20983e.mo12989a(account, 3) == null) {
                                    igu.f20977g.mo25414c("Network unreliable. Skipping sync.", new Object[0]);
                                    break;
                                }
                                boolean a2 = a.f20980b.mo13010a(300, account.name, 9, 3);
                                z &= a2;
                                if (!a2) {
                                    igu.f20977g.mo25416d("Updating device state failed for account %s.", sek.m35081a(account.name));
                                }
                            } catch (gid e2) {
                                igu.f20977g.mo25414c("Invalid credentials for account %s. Ignoring account.", sek.m35081a(account.name));
                            }
                        } else if (z) {
                            igu.f20977g.mo25414c("Device state updated successfully.", new Object[0]);
                            boolean b5 = a.f20979a.mo12994b();
                            if (b5 != b2) {
                                a.f20984f.f21004a.edit().remove("acknowledged_secure_lock_state").commit();
                                return;
                            } else {
                                a.f20984f.f21004a.edit().putBoolean("acknowledged_secure_lock_state", b5).commit();
                                return;
                            }
                        }
                    }
                    igu.f20977g.mo25414c("Device state failed for at least one account.", new Object[0]);
                    return;
                }
            }
            igu.f20977g.mo25418e("Failed to write to SharedPreferences, skipping screenlock check.", new Object[0]);
        } else {
            igu.f20977g.mo25409a("Delaying device state check.", new Object[0]);
            new skc(getApplicationContext()).mo25675a("DeviceStateSyncManager", 3, SystemClock.elapsedRealtime() + 15000, IntentOperation.getPendingIntent(this, DeviceStateSyncManager$CheckStateEventIntentOperation.class, new Intent("com.google.android.gms.auth.authzen.cryptauth.DEVICE_STATE_CHECK_DELAY_COMPLETE"), 0, 134217728), getPackageName());
        }
    }
}
