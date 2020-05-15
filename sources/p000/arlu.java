package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: arlu */
final /* synthetic */ class arlu implements auca {

    /* renamed from: a */
    private final arly f87867a;

    public arlu(arly arly) {
        this.f87867a = arly;
    }

    /* renamed from: a */
    public final aucb mo13157a(Object obj) {
        Void voidR = (Void) obj;
        arwg arwg = this.f87867a.f87871b.f87860e;
        if (arwg == null) {
            return aucu.m76777a((Exception) new rjp(Status.f30109c));
        }
        aucf aucf = new aucf();
        try {
            arwg.mo48825a(new arvd(new arlp(aucf)));
        } catch (RemoteException e) {
            arls.f87856a.mo25410a((Throwable) e);
        }
        return aucf.f91388a;
    }
}
