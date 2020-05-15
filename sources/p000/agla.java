package p000;

import android.os.RemoteException;

/* renamed from: agla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agla implements Runnable {

    /* renamed from: a */
    final /* synthetic */ agkt f65846a;

    /* renamed from: b */
    final /* synthetic */ agln f65847b;

    public agla(agln agln, agkt agkt) {
        this.f65847b = agln;
        this.f65846a = agkt;
    }

    public final void run() {
        agln agln = this.f65847b;
        aghq aghq = agln.f65887c;
        if (aghq == null) {
            agln.mo35497E().f65564c.mo35435a("Failed to send current screen to service");
            return;
        }
        try {
            agkt agkt = this.f65846a;
            if (agkt == null) {
                aghq.mo35395a(0, (String) null, (String) null, agln.mo35542z().getPackageName());
            } else {
                aghq.mo35395a(agkt.f65823c, agkt.f65821a, agkt.f65822b, agln.mo35542z().getPackageName());
            }
            this.f65847b.mo35624q();
        } catch (RemoteException e) {
            this.f65847b.mo35497E().f65564c.mo35436a("Failed to send current screen to the service", e);
        }
    }
}
