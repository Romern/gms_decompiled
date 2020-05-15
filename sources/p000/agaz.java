package p000;

import android.util.Log;

/* renamed from: agaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agaz extends rpf {

    /* renamed from: a */
    final /* synthetic */ rod f65109a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public agaz(rob rob, rod rod) {
        super(rob);
        this.f65109a = rod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24972a(rjd rjd, aucf aucf) {
        agcl agcl = (agcl) rjd;
        rob rob = this.f65109a.f43429b;
        if (rob != null) {
            synchronized (agcl.f65215a) {
                agcb agcb = (agcb) agcl.f65215a.remove(rob);
                if (agcb == null) {
                    Log.w("MdnsServiceBrowserImpl", "Tried to unregister nonexistent listener");
                } else {
                    ((agbz) agcl.mo25289B()).mo35186a(agcb);
                }
            }
        }
        aucf.mo50391a((Object) true);
    }
}
