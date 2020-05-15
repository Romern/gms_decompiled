package p000;

import java.util.concurrent.ExecutionException;

/* renamed from: bbtv */
final /* synthetic */ class bbtv implements bqeg {

    /* renamed from: a */
    private final bbub f103365a;

    /* renamed from: b */
    private final bqgg f103366b;

    public bbtv(bbub bbub, bqgg bqgg) {
        this.f103365a = bbub;
        this.f103366b = bqgg;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bbub bbub = this.f103365a;
        try {
            if (((bbym) this.f103366b.get()).mo56519c()) {
                return bqga.m112775a((Object) null);
            }
            return bbub.mo56426d();
        } catch (ExecutionException e) {
            bbos.m88292b("MsgReceiver", "error handling in pullOnce: ", e);
        }
    }
}
