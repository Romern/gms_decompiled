package p000;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: saj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class saj implements sag {

    /* renamed from: a */
    final /* synthetic */ sam f43924a;

    public saj(sam sam) {
        this.f43924a = sam;
    }

    /* renamed from: a */
    public final void mo24901a(ConnectionResult connectionResult) {
        if (connectionResult.mo17671b()) {
            sam sam = this.f43924a;
            sam.mo25298a((scb) null, sam.mo25290C());
            return;
        }
        sad sad = this.f43924a.f43931B;
        if (sad != null) {
            sad.mo6637a(connectionResult);
        }
    }
}
