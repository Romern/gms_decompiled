package p000;

import android.text.TextUtils;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: hjy */
final /* synthetic */ class hjy implements Callable {

    /* renamed from: a */
    private final bqgg f19924a;

    /* renamed from: b */
    private final bqgg f19925b;

    public hjy(bqgg bqgg, bqgg bqgg2) {
        this.f19924a = bqgg;
        this.f19925b = bqgg2;
    }

    public final Object call() {
        bqgg bqgg = this.f19924a;
        bqgg bqgg2 = this.f19925b;
        sek sek = hkh.f19936a;
        bngs j = bngx.m109377j();
        bngs j2 = bngx.m109377j();
        j2.mo67666b((Iterable) bqga.m112780a((Future) bqgg));
        j2.mo67666b((Iterable) bqga.m112780a((Future) bqgg2));
        bngz a = bnnm.m109864a(j2.mo67664a(), hke.f19932a);
        bnrd a2 = a.mo67316o().iterator();
        while (a2.hasNext()) {
            String str = (String) a2.next();
            InternalSignInCredentialWrapper internalSignInCredentialWrapper = (InternalSignInCredentialWrapper) bnny.m109908a(hdv.m14230a(hkf.f19933a)).mo68168d(a.mo67692g(str));
            if (!TextUtils.isEmpty(internalSignInCredentialWrapper.f10233g.f10253f) || a.mo67692g(str).size() <= 1) {
                j.mo67668c(internalSignInCredentialWrapper);
            } else {
                j.mo67668c(new InternalSignInCredentialWrapper(internalSignInCredentialWrapper.f10232f, internalSignInCredentialWrapper.f10233g, internalSignInCredentialWrapper.f10234h, true));
            }
        }
        return j.mo67664a();
    }
}
