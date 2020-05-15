package p000;

import android.content.Context;
import android.content.ServiceConnection;

/* renamed from: ahzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahzn {

    /* renamed from: a */
    public final Context f68476a;

    /* renamed from: b */
    public ServiceConnection f68477b;

    public ahzn(Context context) {
        this.f68476a = context;
    }

    /* renamed from: a */
    public final void mo37318a() {
        if (this.f68477b != null) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: Device detail service unbind DiscoveryService");
            skh.m35531a().mo25689a(this.f68476a, this.f68477b);
        }
    }
}
