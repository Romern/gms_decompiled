package p000;

import android.content.IntentFilter;
import android.os.Bundle;

/* renamed from: auxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auxr implements rjz {

    /* renamed from: a */
    final /* synthetic */ auxs f92740a;

    public auxr(auxs auxs) {
        this.f92740a = auxs;
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        aunx aunx = auxs.f92741a;
        StringBuilder sb = new StringBuilder(57);
        sb.append("GoogleApiClient connection suspended - cause: ");
        sb.append(i);
        aunx.mo50711a(sb.toString(), new Object[0]);
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        auxs.f92741a.mo50711a("GoogleApiClient connected", new Object[0]);
        IntentFilter intentFilter = new IntentFilter("com.google.android.gms.auth.trustagent.trustlet.ACTION_PERSONAL_NEARBY_ALERT");
        synchronized (this.f92740a.f92745d) {
            auxs auxs = this.f92740a;
            if (!auxs.f92746e) {
                auxs.f92744c.registerReceiver(auxs.f92747f, intentFilter, "com.google.android.gms.permission.INTERNAL_BROADCAST", null);
                this.f92740a.f92746e = true;
            }
            for (auxt auxt : this.f92740a.f92748g.keySet()) {
                auxt.mo51019c();
            }
            this.f92740a.mo51035a();
        }
    }
}
