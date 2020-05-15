package p000;

import android.telephony.ServiceState;
import android.telephony.SignalStrength;

/* renamed from: szi */
final /* synthetic */ class szi implements Runnable {

    /* renamed from: a */
    private final szj f45497a;

    /* renamed from: b */
    private final ServiceState f45498b;

    /* renamed from: c */
    private final int f45499c;

    /* renamed from: d */
    private final SignalStrength f45500d;

    public szi(szj szj, ServiceState serviceState, int i, SignalStrength signalStrength) {
        this.f45497a = szj;
        this.f45498b = serviceState;
        this.f45499c = i;
        this.f45500d = signalStrength;
    }

    public final void run() {
        szj szj = this.f45497a;
        ServiceState serviceState = this.f45498b;
        int i = this.f45499c;
        SignalStrength signalStrength = this.f45500d;
        szm szm = szj.f45504d;
        Logger Logger = szm.f45509a;
        szm.mo26275a(serviceState, i, signalStrength);
    }
}
