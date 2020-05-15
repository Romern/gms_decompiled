package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: rkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class rkm implements rkl {
    /* renamed from: a */
    public abstract void mo24826a(Status status);

    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        Status bo = rkk.mo7183bo();
        if (bo.mo17710c()) {
            mo24827b(rkk);
            return;
        }
        mo24826a(bo);
        if (rkk instanceof rkh) {
            try {
                ((rkh) rkk).mo12460c();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(rkk);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("ResultCallbacks", sb.toString(), e);
            }
        }
    }

    /* renamed from: b */
    public abstract void mo24827b(rkk rkk);
}
