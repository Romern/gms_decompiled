package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.DisableSelectedTokenRequest;
import com.google.android.gms.tapandpay.service.TapAndPayChimeraService;

/* renamed from: atin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atin extends atki {
    public atin(DisableSelectedTokenRequest disableSelectedTokenRequest, String str, aswm aswm) {
        super("DisableSelectedToken", disableSelectedTokenRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49244a(status);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atgn.a(atgu, boolean):boolean
     arg types: [atgu, int]
     candidates:
      atgn.a(java.util.List, java.util.List):java.util.Map
      atgn.a(java.lang.String, int):boolean
      atgn.a(atgu, boolean):boolean */
    /* renamed from: b */
    public final void mo50005b(Context context) {
        try {
            atds a = atds.m75666a(askg.m74277a(context));
            String str = ((DisableSelectedTokenRequest) this.f90410b).f108525a;
            if (!a.f90151a.mo49884c(str)) {
                int i = 0;
                if (a.f90152b.mo49952a(str)) {
                    atgn atgn = a.f90152b;
                    atgu b = atgn.mo49954b(str);
                    if (b == null) {
                        ((bnsl) atgn.f90301a.mo68388c()).mo68405a("Card not found");
                        i = 15003;
                    } else if (!atgn.mo49950a(b, false)) {
                        i = 8;
                    }
                } else {
                    i = 15003;
                }
                this.f90414d.mo49244a(new Status(i));
                return;
            }
            throw new UnsupportedOperationException("Cannot disable selected token for NFC-AB cards");
        } catch (asks e) {
            bnsl bnsl = (bnsl) TapAndPayChimeraService.f108661a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atin", "b", 2089, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error retrieving account");
            throw new aaaj(13, "Error retrieving account", null);
        }
    }
}
