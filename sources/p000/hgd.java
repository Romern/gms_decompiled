package p000;

import android.accounts.Account;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;

/* renamed from: hgd */
final /* synthetic */ class hgd implements C1247om {

    /* renamed from: a */
    private final hgj f19697a;

    public hgd(hgj hgj) {
        this.f19697a = hgj;
    }

    /* renamed from: a */
    public final Object mo12294a() {
        hgj hgj = this.f19697a;
        hvd hvd = hgj.f19712j;
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = hgj.f19706d;
        String str = hgj.f19714l;
        Account account = hgj.f19710h;
        String str2 = hgj.f19707e;
        sdo.m34959a(saveAccountLinkingTokenRequest);
        sdo.m34959a(account);
        sdo.m34977c(str2);
        roz b = rpa.m34196b();
        b.f43472a = new hxe(saveAccountLinkingTokenRequest, str, account, str2);
        return bqdx.m112673a(adbb.m50100a(((rjx) hvd).mo24732b(b.mo24977a())), hgi.f19702a, hgj.f19713k);
    }
}
