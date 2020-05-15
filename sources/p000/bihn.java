package p000;

import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;

/* renamed from: bihn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bihn implements afcs {

    /* renamed from: a */
    final /* synthetic */ biht f120604a;

    public bihn(biht biht) {
        this.f120604a = biht;
    }

    /* renamed from: a */
    public final void mo34763a(afcn afcn) {
        CameraPosition a = this.f120604a.f120618f.mo34748a();
        try {
            this.f120604a.f120618f.f64181a.mo34814h();
            biht.m102402a(afcn, a);
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }
}
