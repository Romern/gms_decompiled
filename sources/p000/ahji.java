package p000;

import com.google.android.gms.nearby.internal.connection.AcceptConnectionRequestParams;

/* renamed from: ahji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahji extends aigq {

    /* renamed from: a */
    final /* synthetic */ AcceptConnectionRequestParams f67270a;

    /* renamed from: b */
    final /* synthetic */ ahjj f67271b;

    public ahji(ahjj ahjj, AcceptConnectionRequestParams acceptConnectionRequestParams) {
        this.f67271b = ahjj;
        this.f67270a = acceptConnectionRequestParams;
    }

    /* renamed from: a */
    public final void mo36548a(int i) {
        if (i == 0) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68432a("ahji", "a", 432, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("ApiCompat.AdvertiserConnectionLifecycleListener is dropping the result for acceptConnectionRequest() to endpoint %s until onConnectionResult() is called. This is a workaround for legacy clients.", this.f67270a.f80560c);
            return;
        }
        this.f67271b.f67273b.mo36548a(i);
    }
}
