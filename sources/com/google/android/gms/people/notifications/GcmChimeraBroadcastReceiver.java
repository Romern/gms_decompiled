package com.google.android.gms.people.notifications;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.WakefulBroadcastReceiver;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmChimeraBroadcastReceiver extends WakefulBroadcastReceiver {
    /* JADX WARNING: Removed duplicated region for block: B:90:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0240  */
    public final void onReceive(Context context, Intent intent) {
        String str;
        String str2;
        char c;
        String str3;
        String str4;
        Context context2 = context;
        Intent intent2 = intent;
        if (!cfxy.m143781c()) {
            Log.e("People_ChimeReceiver", "New tickle sync is not enabled.");
            return;
        }
        if (intent2 != null) {
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
            sb.append("Intent message received from chime is [");
            sb.append(valueOf);
            sb.append("]");
            sb.toString();
            if (!amfg.m62856a(context, intent) && !amfg.m62857a(intent)) {
                str = "Not a valid Contact tickle message.";
            } else if ("gcm".equals(aakz.m21424a(context).mo16960a(intent2))) {
                Bundle extras = intent.getExtras();
                String string = extras.getString("notification_type");
                String string2 = extras.getString((String) amfg.f74858a.get(string));
                if (!bmxx.m108577a(string2)) {
                    amff amff = new amff(context2);
                    SharedPreferences sharedPreferences = amff.f74857a.f74200a;
                    String valueOf2 = String.valueOf(string2);
                    String string3 = sharedPreferences.getString(valueOf2.length() == 0 ? new String("tickle_sync_gaia_cache_account_name_") : "tickle_sync_gaia_cache_account_name_".concat(valueOf2), null);
                    long currentTimeMillis = System.currentTimeMillis();
                    SharedPreferences sharedPreferences2 = amff.f74857a.f74200a;
                    String valueOf3 = String.valueOf(string2);
                    String str5 = "tickle_sync_gaia_id_cache_last_update_timestamp_";
                    if ((currentTimeMillis - sharedPreferences2.getLong(valueOf3.length() == 0 ? new String("tickle_sync_gaia_id_cache_last_update_timestamp_") : "tickle_sync_gaia_id_cache_last_update_timestamp_".concat(valueOf3), 0)) / 1000 >= cfxy.f186083a.mo6606a().mo83061e() || string3 == null) {
                        if (string3 != null) {
                            alsj alsj = amff.f74857a;
                            SharedPreferences sharedPreferences3 = alsj.f74200a;
                            String valueOf4 = String.valueOf(string2);
                            if (sharedPreferences3.contains(valueOf4.length() == 0 ? new String("tickle_sync_gaia_cache_account_name_") : "tickle_sync_gaia_cache_account_name_".concat(valueOf4))) {
                                SharedPreferences.Editor edit = alsj.f74200a.edit();
                                String valueOf5 = String.valueOf(string2);
                                edit.remove(valueOf5.length() == 0 ? new String("tickle_sync_gaia_cache_account_name_") : "tickle_sync_gaia_cache_account_name_".concat(valueOf5)).apply();
                            }
                            SharedPreferences sharedPreferences4 = alsj.f74200a;
                            String valueOf6 = String.valueOf(string2);
                            if (valueOf6.length() == 0) {
                                str3 = str5;
                                str4 = new String(str3);
                            } else {
                                str3 = str5;
                                str4 = str3.concat(valueOf6);
                            }
                            if (sharedPreferences4.contains(str4)) {
                                SharedPreferences.Editor edit2 = alsj.f74200a.edit();
                                String valueOf7 = String.valueOf(string2);
                                edit2.remove(valueOf7.length() == 0 ? new String(str3) : str3.concat(valueOf7)).apply();
                            }
                        }
                        Iterator it = soz.m35801d(context2, context.getPackageName()).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Account account = (Account) it.next();
                                new amfd(context2, account, amff).start();
                                try {
                                    Thread.sleep(cfxy.f186083a.mo6606a().mo83059c());
                                } catch (InterruptedException e) {
                                    amdk.m62659b("People_AccountUtil", "Current thread is interrupted. %s", e.getMessage());
                                }
                                if (string2.equals(amfe.f74856a)) {
                                    str2 = account.name;
                                    break;
                                }
                            } else if (string3 == null) {
                                amdk.m62659b("People_AccountUtil", "Failed to find account name for ID %s", string2);
                                str2 = null;
                            }
                        }
                    }
                    str2 = string3;
                } else {
                    Log.e("People_ChimeReceiver", "Did not specify obfuscated Gaia Id in the tickle message payload.");
                    str2 = null;
                }
                if (!bmxx.m108577a(str2) || cfxy.f186083a.mo6606a().mo83062f()) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 18);
                    sb2.append("Account name is [");
                    sb2.append(str2);
                    sb2.append("]");
                    sb2.toString();
                    int hashCode = string.hashCode();
                    if (hashCode != -1484389806) {
                        if (hashCode != -556418767) {
                            if (hashCode == 1549625307 && string.equals("sgbe_update_profile")) {
                                c = 0;
                                if (c != 0) {
                                    amfg.m62858b(str2);
                                    return;
                                } else if (c == 1) {
                                    extras.getString("contact_ids");
                                    amfg.m62859c(str2);
                                    return;
                                } else if (c == 2) {
                                    amfg.m62855a(str2);
                                    return;
                                } else {
                                    return;
                                }
                            }
                        } else if (string.equals("sgbe_update_group")) {
                            c = 2;
                            if (c != 0) {
                            }
                        }
                    } else if (string.equals("sgbe_update_contact")) {
                        c = 1;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else {
                    Log.e("People_ChimeReceiver", "account name not found. cancel tickle sync.");
                    return;
                }
            } else {
                str = "Not a Google Cloud Message.";
            }
        } else {
            str = "Received intent message is null.";
        }
        Log.e("People_ChimeReceiver", str);
    }
}
