package p000;

import android.os.RemoteException;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.car.CarChimeraService;
import java.io.Closeable;

/* renamed from: nlb */
public final /* synthetic */ class nlb implements Closeable {

    /* renamed from: a */
    private final oux f35940a;

    public nlb(oux oux) {
        this.f35940a = oux;
    }

    public final void close() {
        oux oux = this.f35940a;
        bnsn bnsn = CarChimeraService.f29307a;
        try {
            oux.mo22595a();
        } catch (RemoteException e) {
            bnsi c = CarChimeraService.f29307a.mo68388c();
            c.mo68437a(e);
            c.mo68432a("com.google.android.gms.car.CarChimeraService", "a", (int) BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Failed to call transferStateCallbacks.close().");
        }
    }
}
