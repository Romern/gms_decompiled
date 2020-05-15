package com.google.android.gms.auth.account.accounttransfer;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.chimera.IntentOperation;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountTransferChimeraReceiver extends BroadcastReceiver {

    /* renamed from: b */
    private static final sek f9962b = ght.m13171a("AccountTransfer", "AccountTransferReceiver");

    /* renamed from: c */
    private static final Collection f9963c = Arrays.asList("com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE", "com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE", "com.google.android.gms.auth.START_ACCOUNT_EXPORT");

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            String stringExtra = intent.getStringExtra("key_extra_account_type");
            f9962b.mo25412b("onReceive(intent=%s, accountType=%s)", action, stringExtra);
            if (f9963c.contains(action)) {
                Intent startIntent = IntentOperation.getStartIntent(context, AccountTransferIntentOperation.class, action);
                if (stringExtra != null) {
                    startIntent.putExtra("key_extra_account_type", stringExtra);
                }
                if (startIntent == null) {
                    f9962b.mo25416d("IntentOperation null", new Object[0]);
                } else {
                    context.startService(startIntent);
                }
            }
        } else {
            f9962b.mo25416d("onReceive(intent=null)", new Object[0]);
        }
    }
}
