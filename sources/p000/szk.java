package p000;

import android.telephony.ServiceState;
import android.telephony.SignalStrength;

/* renamed from: szk */
final /* synthetic */ class szk implements Runnable {

    /* renamed from: a */
    private final szl f45505a;

    /* renamed from: b */
    private final ServiceState f45506b;

    public szk(szl szl, ServiceState serviceState) {
        this.f45505a = szl;
        this.f45506b = serviceState;
    }

    public final void run() {
        szl szl = this.f45505a;
        ServiceState serviceState = this.f45506b;
        szm szm = szl.f45508b;
        int i = szl.f45507a;
        sek sek = szm.f45509a;
        szm.mo26275a(serviceState, i, (SignalStrength) null);
    }
}
