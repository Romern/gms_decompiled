package p000;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: bbpx */
final /* synthetic */ class bbpx implements rka {

    /* renamed from: a */
    private final bbqb f103044a;

    /* renamed from: b */
    private final bqgy f103045b;

    /* renamed from: c */
    private final rkb f103046c;

    public bbpx(bbqb bbqb, bqgy bqgy, rkb rkb) {
        this.f103044a = bbqb;
        this.f103045b = bqgy;
        this.f103046c = rkb;
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        bbqb bbqb = this.f103044a;
        bqgy bqgy = this.f103045b;
        rkb rkb = this.f103046c;
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("Error connecting GoogleApiClient: ");
        sb.append(valueOf);
        bbos.m88294d("ClntIntrcptrFctryV12", sb.toString());
        bbqb.f103056c = null;
        String valueOf2 = String.valueOf(connectionResult.f30067e);
        bqgy.mo69136a((Throwable) new Exception(valueOf2.length() == 0 ? new String("Error calling GMS Core API: ") : "Error calling GMS Core API: ".concat(valueOf2)));
        rkb.mo24803g();
    }
}
