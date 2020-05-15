package p000;

import android.accounts.Account;
import android.net.Uri;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SignInCredential;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: hoz */
final /* synthetic */ class hoz implements Callable {

    /* renamed from: a */
    private final bqgg f20145a;

    /* renamed from: b */
    private final bqgg f20146b;

    public hoz(bqgg bqgg, bqgg bqgg2) {
        this.f20145a = bqgg;
        this.f20146b = bqgg2;
    }

    public final Object call() {
        Uri uri;
        bqgg bqgg = this.f20145a;
        bqgg bqgg2 = this.f20146b;
        alky alky = (alky) bqga.m112780a((Future) bqgg);
        try {
            bngs j = bngx.m109377j();
            Iterator it = ((List) bqga.m112780a((Future) bqgg2)).iterator();
            while (it.hasNext()) {
                hpg hpg = (hpg) it.next();
                bmxv c = bnfi.m109235a(alky.mo12459b()).mo67507c(new hpd(hpg));
                if (c.mo66813a()) {
                    alzr alzr = (alzr) c.mo66814b();
                    if (alzr.mo41069j() != null) {
                        String j2 = alzr.mo41069j();
                        sdo.m34959a((Object) j2);
                        uri = Uri.parse(j2);
                    } else {
                        uri = null;
                    }
                    Account account = hpg.f20158a;
                    j.mo67668c(new InternalSignInCredentialWrapper(account, new SignInCredential(account.name, alzr.mo41064d(), alzr.mo41066g(), alzr.mo41067h(), uri, null, null), hpg.f20159b, false));
                    it = it;
                }
            }
            return j.mo67664a();
        } finally {
            alky.mo12459b().mo12460c();
            alky.mo12460c();
        }
    }
}
