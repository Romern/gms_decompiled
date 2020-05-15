package p000;

import android.util.Pair;
import com.google.android.gms.auth.api.proxy.AuthChimeraService;
import com.google.android.gms.auth.api.proxy.ProxyGrpcRequest;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: ibk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ibk extends hxs implements sjr {

    /* renamed from: a */
    public final AuthChimeraService f20675a;

    /* renamed from: b */
    private final sjn f20676b;

    /* renamed from: c */
    private final ClientContext f20677c;

    /* renamed from: d */
    private final Object f20678d = new Object();

    /* renamed from: e */
    private volatile C1231nx f20679e;

    public ibk(AuthChimeraService authChimeraService, sjn sjn, ClientContext clientContext) {
        sdo.m34959a(clientContext);
        this.f20677c = clientContext;
        sdo.m34959a(sjn);
        this.f20676b = sjn;
        this.f20675a = authChimeraService;
    }

    /* renamed from: a */
    public final void mo12790a(hxq hxq) {
        this.f20676b.mo25649a(new ibr(this.f20677c, hxq));
    }

    /* renamed from: a */
    public final void mo12791a(hxq hxq, ProxyGrpcRequest proxyGrpcRequest) {
        if (this.f20679e == null) {
            synchronized (this.f20678d) {
                if (this.f20679e == null) {
                    this.f20679e = new ibj(this);
                }
            }
        }
        this.f20676b.mo25649a(new ibt(this.f20677c, hxq, proxyGrpcRequest, (shl) this.f20679e.mo15546a(new Pair(proxyGrpcRequest.f10297b, Integer.valueOf(proxyGrpcRequest.f10298c)))));
    }

    /* renamed from: a */
    public final void mo12792a(hxq hxq, ProxyRequest proxyRequest) {
        this.f20676b.mo25649a(new ibu(this.f20677c, hxq, proxyRequest));
    }
}
