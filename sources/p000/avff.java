package p000;

import com.google.android.gms.udc.service.UdcContextInitChimeraService;

/* renamed from: avff */
public final /* synthetic */ class avff implements bbjo {

    /* renamed from: a */
    private final UdcContextInitChimeraService f93074a;

    /* renamed from: b */
    private final avgl f93075b;

    public avff(UdcContextInitChimeraService udcContextInitChimeraService, avgl avgl) {
        this.f93074a = udcContextInitChimeraService;
        this.f93075b = avgl;
    }

    /* renamed from: a */
    public final bqgg mo14476a() {
        UdcContextInitChimeraService udcContextInitChimeraService = this.f93074a;
        if (avgm.m78459a(udcContextInitChimeraService).mo51204a(this.f93075b)) {
            return bqga.m112775a((Object) null);
        }
        throw new Exception("generic sync failure (see CEL)");
    }
}
