package p000;

import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: nup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nup extends ntg {

    /* renamed from: a */
    private final WeakReference f36553a;

    public nup(nur nur) {
        this.f36553a = new WeakReference(nur);
    }

    /* renamed from: a */
    public final void mo21558a(int i, Bundle bundle) {
        bnsn bnsn = nur.f36554a;
        nur nur = (nur) this.f36553a.get();
        if (nur != null) {
            synchronized (nur) {
                if (!nur.f36563j) {
                    nur.f36563j = true;
                    nuu.m27792a(new nuo(nur, bundle));
                    return;
                }
                bnsi d = nur.f36554a.mo68390d();
                d.mo68432a("nup", "a", 274, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68405a("Projection already configured, ignoring configuration");
            }
        }
    }
}
