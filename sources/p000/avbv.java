package p000;

import com.google.android.gms.common.internal.ClientContext;

/* renamed from: avbv */
final /* synthetic */ class avbv implements bbjo {

    /* renamed from: a */
    private final avbw f92926a;

    public avbv(avbw avbw) {
        this.f92926a = avbw;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avgm.a(com.google.android.gms.common.internal.ClientContext, bxqf, boolean):bxqg
     arg types: [com.google.android.gms.common.internal.ClientContext, bxqf, int]
     candidates:
      avgm.a(com.google.android.gms.common.internal.ClientContext, avgl, java.util.concurrent.atomic.AtomicBoolean):void
      avgm.a(com.google.android.gms.common.internal.ClientContext, bxqf, boolean):bxqg */
    /* renamed from: a */
    public final bqgg mo14476a() {
        bxqf bxqf;
        avbw avbw = this.f92926a;
        avgm avgm = avbw.f92864c;
        ClientContext clientContext = avbw.f92863b;
        if (avbw.f92929l.mo51192a()) {
            bxqf bxqf2 = avbw.f92928k;
            bxvd bxvd = (bxvd) bxqf2.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) bxqf2);
            bxok b = avbw.f92929l.mo51193b();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bxqf bxqf3 = (bxqf) bxvd.f164949b;
            bxqf bxqf4 = bxqf.f164373f;
            b.getClass();
            bxqf3.f164377c = b;
            bxqf3.f164375a |= 4;
            bxqf = (bxqf) bxvd.mo74062i();
        } else {
            bxqf = avbw.f92928k;
        }
        return bqga.m112775a(avgm.mo51201a(clientContext, bxqf, false));
    }
}
