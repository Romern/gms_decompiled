package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: bjvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjvv extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ bjvy f123447a;

    public bjvv(bjvy bjvy) {
        this.f123447a = bjvy;
    }

    public final void onReceive(Context context, Intent intent) {
        context.unregisterReceiver(this);
        int resultCode = getResultCode();
        if (resultCode == -1) {
            this.f123447a.mo65573a(1);
        } else if (resultCode == 1) {
            int intExtra = intent.getIntExtra("errorCode", -1);
            StringBuilder sb = new StringBuilder(35);
            sb.append("SMS failed, error code: ");
            sb.append(intExtra);
            sb.toString();
            this.f123447a.mo65573a(2);
        } else if (resultCode == 2) {
            this.f123447a.mo65573a(3);
        } else if (resultCode != 3) {
            StringBuilder sb2 = new StringBuilder(36);
            sb2.append("SMS failed, result code: ");
            sb2.append(resultCode);
            sb2.toString();
            this.f123447a.mo65573a(2);
        } else {
            this.f123447a.mo65573a(4);
        }
    }
}
