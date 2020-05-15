package p000;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: abbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abbp {

    /* renamed from: a */
    final /* synthetic */ abci f57007a;

    /* renamed from: b */
    final /* synthetic */ abbz f57008b;

    /* renamed from: c */
    final /* synthetic */ aard f57009c;

    /* renamed from: d */
    final /* synthetic */ wvd f57010d;

    /* renamed from: e */
    final /* synthetic */ abbu f57011e;

    public abbp(abbu abbu, abci abci, abbz abbz, aard aard, wvd wvd) {
        this.f57011e = abbu;
        this.f57007a = abci;
        this.f57008b = abbz;
        this.f57009c = aard;
        this.f57010d = wvd;
    }

    /* renamed from: a */
    public final void mo31995a(GoogleHelp googleHelp) {
        try {
            abci abci = this.f57007a;
            abbu abbu = this.f57011e;
            abbz abbz = this.f57008b;
            abci.mo32023e(googleHelp, new abbv(abbu.f57021a, abbu.f57022b, abbz, this.f57009c, this.f57010d));
        } catch (RemoteException e) {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
            this.f57011e.mo17719d(abca.f57032a);
        }
    }
}
