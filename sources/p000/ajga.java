package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.messages.internal.RegisterStatusCallbackRequest;

/* renamed from: ajga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajga extends buqn {

    /* renamed from: a */
    final /* synthetic */ RegisterStatusCallbackRequest f70550a;

    /* renamed from: b */
    final /* synthetic */ ajgf f70551b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajga(ajgf ajgf, String str, RegisterStatusCallbackRequest registerStatusCallbackRequest) {
        super(str);
        this.f70551b = ajgf;
        this.f70550a = registerStatusCallbackRequest;
    }

    public final void run() {
        aixw a = this.f70551b.mo38595a(this.f70550a.f80758e);
        RegisterStatusCallbackRequest registerStatusCallbackRequest = this.f70550a;
        if (a.f70031e.mo38253c(registerStatusCallbackRequest.f80755b)) {
            boolean z = true;
            if (registerStatusCallbackRequest.f80756c) {
                ajas ajas = a.f70033g;
                ajcl ajcl = registerStatusCallbackRequest.f80759f;
                srn srn = ahfq.f67120a;
                ajcl.f12819a.hashCode();
                boolean register = ajas.f70272a.register(ajcl);
                if (!register) {
                    bnsl bnsl = (bnsl) ahfq.f67120a.mo68390d();
                    bnsl.mo68432a("ajas", "a", 22, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68409a("Failed to register status callback: %s", ajcl.f12819a.hashCode());
                }
                z = register;
            } else {
                ajas ajas2 = a.f70033g;
                ajcl ajcl2 = registerStatusCallbackRequest.f80759f;
                srn srn2 = ahfq.f67120a;
                ajcl2.f12819a.hashCode();
                if (!ajas2.f70272a.unregister(ajcl2)) {
                    bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68390d();
                    bnsl2.mo68432a("ajas", "b", 31, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68409a("No status callback found to unregister: %s", ajcl2.f12819a.hashCode());
                }
            }
            aixw.m58159a(!z ? Status.f30109c : Status.f30107a, registerStatusCallbackRequest.f80755b);
            if (z && registerStatusCallbackRequest.f80756c) {
                a.mo38235a();
            }
        }
    }
}
