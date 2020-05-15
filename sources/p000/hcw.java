package p000;

import android.accounts.Account;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;

/* renamed from: hcw */
final /* synthetic */ class hcw implements C1247om {

    /* renamed from: a */
    private final hdf f19482a;

    public hcw(hdf hdf) {
        this.f19482a = hdf;
    }

    /* renamed from: a */
    public final Object mo12294a() {
        hdf hdf = this.f19482a;
        AuthorizationRequest authorizationRequest = hdf.f19496b;
        Account account = authorizationRequest.f10203e;
        String str = authorizationRequest.f10204f;
        if (account == null) {
            hvd hvd = hdf.f19507m;
            String str2 = hdf.f19497c;
            String str3 = hdf.f19498d;
            sdo.m34977c(str2);
            sdo.m34977c(str3);
            roz b = rpa.m34196b();
            b.f43472a = new hxd(str3, str2);
            return bqdx.m112673a(adbb.m50100a(((rjx) hvd).mo24701a(b.mo24977a())), new hcq(hdf, str), hdf.f19502h);
        } else if (!soz.m35796b(hdf.getContext().getApplicationContext(), account, hdf.f19497c) || !hdf.m14204a(account, str)) {
            hdf.f19494a.mo25416d("Requested account does not satisfy the hostedDomain restriction", new Object[0]);
            return bqga.m112777a((Throwable) adbe.m50106a(28441));
        } else {
            hdf.f19506l = account;
            return bqga.m112775a(bmxv.m108566b(adcq.EXTERNAL_ACCOUNT_CHOOSER));
        }
    }
}
