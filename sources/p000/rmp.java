package p000;

import com.google.android.gms.signin.internal.SignInResponse;
import java.lang.ref.WeakReference;

/* renamed from: rmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rmp extends aqob {

    /* renamed from: a */
    private final WeakReference f43293a;

    /* renamed from: a */
    public final void mo24903a(SignInResponse signInResponse) {
        rms rms = (rms) this.f43293a.get();
        if (rms != null) {
            rms.f43296a.mo24920a(new rmo(rms, rms, signInResponse));
        }
    }

    public rmp(rms rms) {
        this.f43293a = new WeakReference(rms);
    }
}
