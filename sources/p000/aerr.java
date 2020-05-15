package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: aerr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aerr extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ aers f63694a;

    public aerr(aers aers) {
        this.f63694a = aers;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.location.PROVIDERS_CHANGED".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("android.location.extra.PROVIDER_NAME");
            boolean booleanExtra = intent.getBooleanExtra("android.location.extra.PROVIDER_ENABLED", false);
            if (stringExtra != null) {
                this.f63694a.mo34493a(stringExtra, booleanExtra);
            }
        }
    }
}
