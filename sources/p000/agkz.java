package p000;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;

/* renamed from: agkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agkz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AppMetadata f65844a;

    /* renamed from: b */
    final /* synthetic */ agln f65845b;

    public agkz(agln agln, AppMetadata appMetadata) {
        this.f65845b = agln;
        this.f65844a = appMetadata;
    }

    public final void run() {
        agln agln = this.f65845b;
        aghq aghq = agln.f65887c;
        if (aghq != null) {
            try {
                aghq.mo35396a(this.f65844a);
                this.f65845b.mo35235b().mo35420s();
                this.f65845b.mo35617a(aghq, null, this.f65844a);
                this.f65845b.mo35624q();
            } catch (RemoteException e) {
                this.f65845b.mo35497E().f65564c.mo35436a("Failed to send app launch to the service", e);
            }
        } else {
            agln.mo35497E().f65564c.mo35435a("Discarding data. Failed to send app launch");
        }
    }
}
