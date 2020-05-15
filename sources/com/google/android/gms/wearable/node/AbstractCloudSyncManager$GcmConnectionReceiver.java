package com.google.android.gms.wearable.node;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AbstractCloudSyncManager$GcmConnectionReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ axud f110972a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractCloudSyncManager$GcmConnectionReceiver(axud axud) {
        super("wearable");
        this.f110972a = axud;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (Log.isLoggable("CloudSync", 3)) {
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("Received gcm intent: ");
            sb.append(valueOf);
            Log.d("CloudSync", sb.toString());
        }
        if (ayha.m83998d() == null) {
            String valueOf2 = String.valueOf(intent);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 58);
            sb2.append("Cloud sync manager is not initialized yet. Ignore intent: ");
            sb2.append(valueOf2);
            Log.w("CloudSync", sb2.toString());
        } else if ("com.google.android.gcm.CONNECTED".equals(intent.getAction())) {
            axty.m83203a(4, (String) null);
            this.f110972a.mo53567f();
        } else {
            axty.m83203a(5, (String) null);
            this.f110972a.mo53569h();
        }
    }
}
