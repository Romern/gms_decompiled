package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: aeqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aeqx extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ aeqy f63650a;

    public aeqx(aeqy aeqy) {
        this.f63650a = aeqy;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.location.MODE_CHANGED".equals(intent.getAction())) {
            int i = 0;
            boolean booleanExtra = intent.getBooleanExtra("android.location.extra.LOCATION_ENABLED", false);
            aeqy aeqy = this.f63650a;
            if (booleanExtra) {
                i = 3;
            }
            aeqy.mo34468a(i);
        }
    }
}
