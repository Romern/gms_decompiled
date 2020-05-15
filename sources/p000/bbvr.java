package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: bbvr */
final /* synthetic */ class bbvr implements Callable {

    /* renamed from: a */
    private final bbwq f103534a;

    /* renamed from: b */
    private final bcoh f103535b;

    /* renamed from: c */
    private final bcsp f103536c;

    /* renamed from: d */
    private final bqgg f103537d;

    /* renamed from: e */
    private final bqgg f103538e;

    /* renamed from: f */
    private final bqgg f103539f;

    public bbvr(bbwq bbwq, bcoh bcoh, bcsp bcsp, bqgg bqgg, bqgg bqgg2, bqgg bqgg3) {
        this.f103534a = bbwq;
        this.f103535b = bcoh;
        this.f103536c = bcsp;
        this.f103537d = bqgg;
        this.f103538e = bqgg2;
        this.f103539f = bqgg3;
    }

    public final Object call() {
        bbwq bbwq = this.f103534a;
        bcoh bcoh = this.f103535b;
        bcsp bcsp = this.f103536c;
        bqgg bqgg = this.f103537d;
        bqgg bqgg2 = this.f103538e;
        bbyk bbyk = (bbyk) bqga.m112780a((Future) this.f103539f);
        long nextInt = (long) bbwq.f103612j.nextInt(((Integer) bqga.m112780a((Future) bqgg)).intValue());
        long longValue = ((Long) bqga.m112780a((Future) bqgg2)).longValue() + nextInt;
        int b = bbyk.mo56513b();
        int i = b - 1;
        if (b == 0) {
            throw null;
        } else if (i != 1) {
            if (i != 2) {
                bbos.m88291b("LiMsgController", "Conversation profile is not supported.");
                bcso m = bcsp.mo57329m();
                bbon.m88284a();
                m.mo57462a(Long.valueOf(System.currentTimeMillis() + longValue));
                return m.mo57457a();
            }
            bbos.m88294d("LiMsgController", "Failed to get conversation profile");
            bcso m2 = bcsp.mo57329m();
            bbon.m88284a();
            m2.mo57462a(Long.valueOf(System.currentTimeMillis() + nextInt));
            bcsp a = m2.mo57457a();
            bbwq.mo56473c(bcoh).mo56621a(a);
            return a;
        } else if (!bbyk.mo56512a().mo66813a()) {
            bbos.m88294d("LiMsgController", "Got empty conversation profile.");
            return bcsp;
        } else {
            bcsp a2 = bbwq.m88518a(bcsp, (bchq) bbyk.mo56512a().mo66814b(), longValue);
            bbwq.mo56473c(bcoh).mo56621a(a2);
            if (!((bchq) bbyk.mo56512a().mo66814b()).mo56847f().mo66813a()) {
                return a2;
            }
            bbwq.mo56473c(bcoh).mo56630a(a2.mo57317a(), ((bchm) ((bchq) bbyk.mo56512a().mo66814b()).mo56847f().mo66814b()).mo56830a());
            return a2;
        }
    }
}
