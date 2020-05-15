package p000;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: ahsb */
public final /* synthetic */ class ahsb {

    /* renamed from: a */
    private final bqgy f67920a;

    public ahsb(bqgy bqgy) {
        this.f67920a = bqgy;
    }

    /* renamed from: a */
    public final void mo37008a(IBinder iBinder) {
        buse buse;
        bqgy bqgy = this.f67920a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.location.nearby.common.fastpair.ILocalizedStringWrapperService");
            buse = queryLocalInterface instanceof buse ? (buse) queryLocalInterface : new buse(iBinder);
        } else {
            buse = null;
        }
        bqgy.mo69138b(buse);
    }
}
