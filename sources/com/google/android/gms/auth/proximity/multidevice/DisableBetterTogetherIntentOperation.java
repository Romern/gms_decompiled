package com.google.android.gms.auth.proximity.multidevice;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DisableBetterTogetherIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f11251a = jsy.m17256a("DisableBetterTogether");

    public DisableBetterTogetherIntentOperation() {
    }

    /* renamed from: a */
    public static Intent m6880a(Context context, String str) {
        Intent startIntent = IntentOperation.getStartIntent(context, DisableBetterTogetherIntentOperation.class, "com.google.android.gms.auth.proximity.multidevice.DISABLE_BETTER_TOGETHER");
        startIntent.putExtra("EXTRA_ACCOUNT_NAME", str);
        return startIntent;
    }

    public final void onHandleIntent(Intent intent) {
        jta a = jsz.m17257a();
        String stringExtra = intent.getStringExtra("EXTRA_ACCOUNT_NAME");
        if (stringExtra == null) {
            a.mo14062r(1);
            return;
        }
        SyncedCryptauthDevice a2 = jpv.m17085a(this, stringExtra);
        if (a2 == null) {
            f11251a.mo25418e("Can't disable Better Together because synced metadata is null.", new Object[0]);
            a.mo14062r(2);
            return;
        }
        List list = a2.f11198m;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            jqj.m17124a((String) list.get(i), stringExtra, this);
        }
        a.mo14062r(0);
    }

    public DisableBetterTogetherIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
