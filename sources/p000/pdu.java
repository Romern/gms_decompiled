package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: pdu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pdu extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ pdz f38887a;

    public pdu(pdz pdz) {
        this.f38887a = pdz;
    }

    public final void onReceive(Context context, Intent intent) {
        pdz pdz = this.f38887a;
        bnsn bnsn = pdz.f38896a;
        if (!pdz.f38900D) {
            pdz.mo22946a(intent);
            return;
        }
        pds pds = new pds(this);
        this.f38887a.f38944u.postDelayed(pds, 60000);
        this.f38887a.f38897A.post(new pdt(this, intent, pds));
    }
}
