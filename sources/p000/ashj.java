package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.EventLog;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.subscribedfeeds.FeedsGcmReceiverChimeraService;
import java.util.concurrent.Future;

/* renamed from: ashj */
public final /* synthetic */ class ashj implements Runnable {

    /* renamed from: a */
    private final FeedsGcmReceiverChimeraService f88974a;

    /* renamed from: b */
    private final Intent f88975b;

    public ashj(FeedsGcmReceiverChimeraService feedsGcmReceiverChimeraService, Intent intent) {
        this.f88974a = feedsGcmReceiverChimeraService;
        this.f88975b = intent;
    }

    public final void run() {
        Future a;
        FeedsGcmReceiverChimeraService feedsGcmReceiverChimeraService = this.f88974a;
        Intent intent = this.f88975b;
        String stringExtra = intent.getStringExtra("collapse_key");
        String stringExtra2 = intent.getStringExtra("sync_hint");
        if (!TextUtils.isEmpty(stringExtra)) {
            String[] split = TextUtils.split(stringExtra, "_");
            Pair pair = null;
            if (split.length == 2) {
                try {
                    pair = Pair.create(split[0], Integer.valueOf(Integer.parseInt(split[1])));
                } catch (NumberFormatException e) {
                }
            }
            if (pair != null) {
                Future a2 = feedsGcmReceiverChimeraService.mo59204a("QUERY_OPERATION_TYPE");
                Cursor query = feedsGcmReceiverChimeraService.getContentResolver().query(ashq.f88987a, null, "_id=?", new String[]{((Integer) pair.second).toString()}, null);
                a2.cancel(false);
                int i = 2742;
                if (query != null) {
                    while (query.moveToNext()) {
                        try {
                            String string = query.getString(query.getColumnIndexOrThrow("authority"));
                            String string2 = query.getString(query.getColumnIndexOrThrow("feed"));
                            String string3 = query.getString(query.getColumnIndexOrThrow("_sync_account"));
                            String string4 = query.getString(query.getColumnIndexOrThrow("_sync_account_type"));
                            Account account = new Account(string3, string4);
                            if (cgvi.m147138c()) {
                                EventLog.writeEvent(i, string);
                            }
                            if (ContentResolver.getMasterSyncAutomatically()) {
                                if (ContentResolver.getSyncAutomatically(account, string)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("feed", string2);
                                    if (stringExtra2 != null) {
                                        bundle.putString("hint", stringExtra2);
                                    }
                                    ContentResolver.requestSync(account, string, bundle);
                                }
                            }
                            StringBuilder sb = new StringBuilder(String.valueOf(string3).length() + 102 + String.valueOf(string2).length());
                            sb.append("received tickle for a disabled feed, removing feed and forcing a subscribedfeeds sync: account ");
                            sb.append(string3);
                            sb.append(", feed ");
                            sb.append(string2);
                            Log.w("SubscribedFeeds", sb.toString());
                            a = feedsGcmReceiverChimeraService.mo59204a("DELETE_OPERATION_TYPE");
                            feedsGcmReceiverChimeraService.getContentResolver().delete(ashq.f88987a, "_sync_account=? and _sync_account_type=? and authority=?", new String[]{string3, string4, string});
                            a.cancel(false);
                            Bundle bundle2 = new Bundle();
                            bundle2.putBoolean("ignore_settings", true);
                            ContentResolver.requestSync(account, "com.google.android.gms.subscribedfeeds", bundle2);
                            i = 2742;
                        } catch (Throwable th) {
                            query.close();
                            throw th;
                        }
                    }
                    query.close();
                } else {
                    String valueOf = String.valueOf(stringExtra);
                    Log.w("SubscribedFeeds", valueOf.length() == 0 ? new String("received tickle for non-existent feed: ") : "received tickle for non-existent feed: ".concat(valueOf));
                    if (cgvi.m147138c()) {
                        EventLog.writeEvent(2742, "unknown");
                    }
                }
            }
        }
        feedsGcmReceiverChimeraService.mo59205a();
    }
}
