package p000;

import android.accounts.Account;
import com.google.android.gms.auth.api.identity.MatchPasswordResult;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;

/* renamed from: hgr */
final /* synthetic */ class hgr implements C1247om {

    /* renamed from: a */
    private final hhe f19727a;

    public hgr(hhe hhe) {
        this.f19727a = hhe;
    }

    /* renamed from: a */
    public final Object mo12294a() {
        hhe hhe = this.f19727a;
        bngs j = bngx.m109377j();
        MatchPasswordResult matchPasswordResult = (MatchPasswordResult) hhe.f19763r.mo2448b();
        if (matchPasswordResult.f10238b) {
            j.mo67666b((Iterable) matchPasswordResult.f10237a);
        } else {
            j.mo67668c((Account) hhe.f19758m.get(hhe.f19766u.mo2448b()));
        }
        hvd hvd = hhe.f19756k;
        SavePasswordRequest savePasswordRequest = hhe.f19752g;
        bngx a = j.mo67664a();
        String str = hhe.f19749d;
        sdo.m34959a(savePasswordRequest);
        sdo.m34975b(!a.isEmpty(), "At least 1 Account is required.");
        sdo.m34977c(str);
        roz b = rpa.m34196b();
        b.f43472a = new hxc(savePasswordRequest, a, str);
        return bqdx.m112673a(adbb.m50100a(((rjx) hvd).mo24732b(b.mo24977a())), hgn.f19723a, hhe.f19753h);
    }
}
