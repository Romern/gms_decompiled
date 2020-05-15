package p000;

import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.ContactFilter;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.GetContactsCountParams;
import java.nio.charset.Charset;

/* renamed from: ajku */
final /* synthetic */ class ajku implements Runnable {

    /* renamed from: a */
    private final ajmt f70824a;

    /* renamed from: b */
    private final GetContactsCountParams f70825b;

    public ajku(ajmt ajmt, GetContactsCountParams getContactsCountParams) {
        this.f70824a = ajmt;
        this.f70825b = getContactsCountParams;
    }

    public final void run() {
        ajmt ajmt = this.f70824a;
        GetContactsCountParams getContactsCountParams = this.f70825b;
        try {
            ajyn ajyn = getContactsCountParams.f81076a;
            NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
            ContactFilter contactFilter = getContactsCountParams.f81077b;
            Charset charset = NearbySharingChimeraService.f80888a;
            ajyn.mo38891a(nearbySharingChimeraService.mo44421a(0, 0, contactFilter).size());
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Failed to invoke getContactsCount callback.");
        }
    }
}
