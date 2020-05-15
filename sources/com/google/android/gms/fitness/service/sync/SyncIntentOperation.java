package com.google.android.gms.fitness.service.sync;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SyncIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final srn f32428a = zvt.m46581a();

    public final void onHandleIntent(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("sync_server", false);
        cadu a = cadu.m126522a(intent.getIntExtra("sync_source", 0));
        String stringExtra = intent.getStringExtra("account");
        if (stringExtra == null) {
            bnsl bnsl = (bnsl) f32428a.mo68388c();
            bnsl.mo68432a("com.google.android.gms.fitness.service.sync.SyncIntentOperation", "onHandleIntent", 26, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("SyncIntentOperation should never be triggered with null account");
        } else if (!booleanExtra) {
            zvm.m46573b(this, stringExtra, a);
        } else {
            zvm.m46572a(this, stringExtra, a);
        }
    }
}
