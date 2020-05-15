package p000;

import com.google.android.gms.udc.service.UdcContextInitChimeraService;

/* renamed from: avfe */
public final /* synthetic */ class avfe implements bbjo {

    /* renamed from: a */
    private final UdcContextInitChimeraService f93072a;

    /* renamed from: b */
    private final avgl f93073b;

    public avfe(UdcContextInitChimeraService udcContextInitChimeraService, avgl avgl) {
        this.f93072a = udcContextInitChimeraService;
        this.f93073b = avgl;
    }

    /* renamed from: a */
    public final bqgg mo14476a() {
        UdcContextInitChimeraService udcContextInitChimeraService = this.f93072a;
        if (avgm.m78459a(udcContextInitChimeraService).mo51204a(this.f93073b)) {
            return bqga.m112775a((Object) null);
        }
        throw new Exception("generic sync failure (see CEL)");
    }
}
