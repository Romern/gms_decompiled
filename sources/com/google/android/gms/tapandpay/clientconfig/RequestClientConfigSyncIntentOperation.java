package com.google.android.gms.tapandpay.clientconfig;

import android.content.Intent;
import com.google.android.gms.libs.scheduler.PendingCallback;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RequestClientConfigSyncIntentOperation extends asjx {

    /* renamed from: a */
    public static final /* synthetic */ int f108322a = 0;

    /* renamed from: b */
    private static final srn f108323b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public final void mo49205a(Intent intent) {
        String stringExtra = intent.getStringExtra("client_app_package");
        if (stringExtra == null) {
            bnsl bnsl = (bnsl) f108323b.mo68387b();
            bnsl.mo68432a("com.google.android.gms.tapandpay.clientconfig.RequestClientConfigSyncIntentOperation", "a", 51, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Must specify the client app package name in the intent");
            return;
        }
        Intent intent2 = new Intent();
        intent2.setClassName(stringExtra, "com.google.commerce.tapandpay.android.clientconfig.sync.ClientConfigSyncService");
        intent2.setAction("com.google.android.gms.gcm.ACTION_TASK_READY");
        intent2.putExtra("tag", "sync_client_config");
        intent2.putExtra("callback", new PendingCallback(new asjz()));
        startService(intent2);
    }
}
