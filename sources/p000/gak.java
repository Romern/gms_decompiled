package p000;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import android.util.Log;

/* renamed from: gak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gak extends smx {
    public gak(Context context) {
        super(context, "appstate");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11595a() {
        return 7425;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo11596a(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        if (cbwf.f178466a.mo6606a().mo75542c()) {
            getContext().deleteDatabase("app_state.db");
            ContentResolver.cancelSync(account, "com.google.android.gms.appstate");
            ContentResolver.setIsSyncable(account, "com.google.android.gms.appstate", 0);
            return false;
        } else if (soz.m35807f(getContext())) {
            Log.i("AppStateSyncAdapter", "In restricted profile; skipping sync.");
            return false;
        } else if (bundle == null || !bundle.getBoolean("initialize", false)) {
            return true;
        } else {
            return false;
        }
    }
}
