package p000;

import android.content.Context;
import com.google.android.gms.fido.fido2.api.StateUpdate;
import com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;

/* renamed from: xew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xew implements xes {

    /* renamed from: a */
    public final RequestOptions f52095a;

    /* renamed from: b */
    private final Context f52096b;

    /* renamed from: c */
    private final String f52097c;

    /* renamed from: d */
    private final xbf f52098d;

    /* renamed from: e */
    private final bqgj f52099e;

    public xew(Context context, xbf xbf, bqgj bqgj, RequestOptions requestOptions, String str) {
        this.f52096b = context;
        this.f52095a = requestOptions;
        this.f52097c = str;
        this.f52098d = xbf;
        this.f52099e = bqgj;
    }

    /* renamed from: a */
    public final Integer mo29682a() {
        return 1;
    }

    /* renamed from: a */
    public final void mo29683a(StateUpdate stateUpdate) {
    }

    /* renamed from: b */
    public final bqgg mo29684b() {
        bqgg bqgg;
        bmxv bmxv;
        if (!rfy.m33550g(this.f52096b) || !cdve.m135097b()) {
            bqgg = xhu.f52320a.mo25819b(new xbe(this.f52098d, this.f52095a, this.f52097c));
        } else {
            xbi xbi = new xbi();
            if (xez.m42802c(this.f52095a)) {
                bmxv = bmxv.m108567c(xbi.mo29607a((BrowserRequestOptions) this.f52095a));
            } else {
                bmxv = bmxv.m108567c(xbi.mo29608a(this.f52097c));
            }
            bqgg = bqga.m112775a(bmxv);
        }
        return bqdx.m112673a(bqgg, new xev(this), this.f52099e);
    }
}
