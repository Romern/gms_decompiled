package p000;

import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.ContactFilter;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.GetContactsParams;
import java.nio.charset.Charset;

/* renamed from: ajkt */
final /* synthetic */ class ajkt implements Runnable {

    /* renamed from: a */
    private final ajmt f70822a;

    /* renamed from: b */
    private final GetContactsParams f70823b;

    public ajkt(ajmt ajmt, GetContactsParams getContactsParams) {
        this.f70822a = ajmt;
        this.f70823b = getContactsParams;
    }

    public final void run() {
        ajmt ajmt = this.f70822a;
        GetContactsParams getContactsParams = this.f70823b;
        try {
            ajyj ajyj = getContactsParams.f81078a;
            NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
            int i = getContactsParams.f81079b;
            int i2 = getContactsParams.f81080c;
            ContactFilter contactFilter = getContactsParams.f81081d;
            Charset charset = NearbySharingChimeraService.f80888a;
            ajyj.mo39084a(nearbySharingChimeraService.mo44421a(i, i2, contactFilter));
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Failed to invoke getContacts callback.");
        }
    }
}
