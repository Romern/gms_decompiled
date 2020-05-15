package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* renamed from: amfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amfg {

    /* renamed from: a */
    public static final bnhe f74858a = bnhe.m109410a("sgbe_update_contact", "contact_owner_id", "sgbe_update_group", "group_owner_id", "sgbe_update_profile", "user_id");

    /* renamed from: b */
    private static final bngx f74859b = bngx.m109358a("sgbe_update_contact", "sgbe_update_group", "sgbe_update_profile");

    /* renamed from: a */
    public static void m62855a(String str) {
        if (bmxx.m108577a(str)) {
            amdk.m62658a("People_TickleMsgUtil", "Trigger FSA2 sync for all accounts", new Object[0]);
            ContentResolver.requestSync(null, "com.android.contacts", new Bundle());
            return;
        }
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str);
        bundle.putString("feed", valueOf.length() == 0 ? new String("groups/") : "groups/".concat(valueOf));
        if (cfxy.m143780b()) {
            bundle.putString("tickle_feed_source", "chime_tickle_sync");
        }
        ContentResolver.requestSync(new Account(str, "com.google"), "com.android.contacts", bundle);
    }

    /* renamed from: b */
    public static void m62858b(String str) {
        if (bmxx.m108577a(str)) {
            amdk.m62658a("People_TickleMsgUtil", "Trigger profile sync for all accounts since accout name is missing", new Object[0]);
            ContentResolver.requestSync(null, "com.google.android.gms.people", new Bundle());
            return;
        }
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str);
        bundle.putString("feed", valueOf.length() == 0 ? new String("profile/") : "profile/".concat(valueOf));
        if (cfxy.m143780b()) {
            bundle.putString("tickle_feed_source", "chime_tickle_sync");
        }
        ContentResolver.requestSync(new Account(str, "com.google"), "com.google.android.gms.people", bundle);
    }

    /* renamed from: c */
    public static void m62859c(String str) {
        if (bmxx.m108577a(str)) {
            amdk.m62658a("People_TickleMsgUtil", "Trigger FSA2 sync for all accounts", new Object[0]);
            ContentResolver.requestSync(null, "com.android.contacts", new Bundle());
            return;
        }
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str);
        bundle.putString("feed", valueOf.length() == 0 ? new String("contacts/") : "contacts/".concat(valueOf));
        if (cfxy.m143780b()) {
            bundle.putString("tickle_feed_source", "chime_tickle_sync");
        }
        ContentResolver.requestSync(new Account(str, "com.google"), "com.android.contacts", bundle);
    }

    /* renamed from: a */
    public static boolean m62856a(Context context, Intent intent) {
        String a = aakz.m21424a(context).mo16960a(intent);
        if ("send_error".equals(a)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("GCM send error: ");
            sb.append(valueOf);
            Log.e("People_TickleMsgUtil", sb.toString());
            return false;
        } else if (!"deleted_messages".equals(a)) {
            return "gcm".equals(a);
        } else {
            String valueOf2 = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 66);
            sb2.append("GCM server deleted pending messages because they were collapsible.");
            sb2.append(valueOf2);
            Log.e("People_TickleMsgUtil", sb2.toString());
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m62857a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String string = extras.getString("notification_type");
            if (string != null && f74859b.contains(string)) {
                return true;
            }
            amdk.m62659b("People_TickleMsgUtil", "Received msg does not contain valid type. Type we received is [%s]", string);
            return false;
        }
        Log.e("People_TickleMsgUtil", "Received msg with no bundle");
        return false;
    }
}
