package p000;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: agky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agky implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f65841a;

    /* renamed from: b */
    final /* synthetic */ AppMetadata f65842b;

    /* renamed from: c */
    final /* synthetic */ agln f65843c;

    public agky(agln agln, AtomicReference atomicReference, AppMetadata appMetadata) {
        this.f65843c = agln;
        this.f65841a = atomicReference;
        this.f65842b = appMetadata;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f65841a) {
            try {
                agln agln = this.f65843c;
                aghq aghq = agln.f65887c;
                if (aghq != null) {
                    this.f65841a.set(aghq.mo35402b(this.f65842b));
                    String str = (String) this.f65841a.get();
                    if (str != null) {
                        this.f65843c.mo35239f().mo35566a(str);
                        this.f65843c.mo35539w().f65626k.mo35463a(str);
                    }
                    this.f65843c.mo35624q();
                    atomicReference = this.f65841a;
                    atomicReference.notify();
                    return;
                }
                agln.mo35497E().f65564c.mo35435a("Failed to get app instance id");
                this.f65841a.notify();
            } catch (RemoteException e) {
                try {
                    this.f65843c.mo35497E().f65564c.mo35436a("Failed to get app instance id", e);
                    atomicReference = this.f65841a;
                } catch (Throwable th) {
                    this.f65841a.notify();
                    throw th;
                }
            }
        }
    }
}
