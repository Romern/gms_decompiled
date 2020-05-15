package p000;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: bbun */
final /* synthetic */ class bbun implements Callable {

    /* renamed from: a */
    private final bbwq f103440a;

    /* renamed from: b */
    private final bqgg f103441b;

    /* renamed from: c */
    private final bqgg f103442c;

    /* renamed from: d */
    private final bcoh f103443d;

    /* renamed from: e */
    private final bctr f103444e;

    /* renamed from: f */
    private final int f103445f;

    public bbun(bbwq bbwq, bqgg bqgg, bqgg bqgg2, bcoh bcoh, bctr bctr, int i) {
        this.f103440a = bbwq;
        this.f103441b = bqgg;
        this.f103442c = bqgg2;
        this.f103443d = bcoh;
        this.f103444e = bctr;
        this.f103445f = i;
    }

    public final Object call() {
        bctr bctr;
        ExecutionException executionException;
        bbwq bbwq = this.f103440a;
        bqgg bqgg = this.f103441b;
        bqgg bqgg2 = this.f103442c;
        bcoh bcoh = this.f103443d;
        bctr bctr2 = this.f103444e;
        int i = this.f103445f;
        bcte n = ((bctr) bqgg.get()).mo57374n();
        try {
            n.mo57512a((Long) ((bbyu) bqga.m112780a((Future) bqgg2)).mo56541a().mo66814b());
            n.mo57506a(bctk.f104865h);
            bctr = n.mo57502a();
            bcfx bcfx = bbwq.f103608f;
            bcnr q = bcns.m89409q();
            q.mo57011b(10);
            q.mo57012b(bcoh.mo57058b().mo57074e());
            q.mo57010a(bcoh.mo57059c().mo73781l());
            q.mo57013b(bctr2.mo57359a());
            q.mo57008a(bctr2.mo57361c());
            q.mo57015d(i);
            bcfx.mo56753a(q.mo57002a());
            executionException = null;
        } catch (ExecutionException e) {
            bbos.m88292b("LiMsgController", "Failed to send message", e);
            bcnr q2 = bcns.m89409q();
            q2.mo57011b(11);
            q2.mo57012b(bcoh.mo57058b().mo57074e());
            q2.mo57010a(bcoh.mo57059c().mo73781l());
            q2.mo57013b(bctr2.mo57359a());
            q2.mo57008a(bctr2.mo57361c());
            q2.mo57015d(i);
            if (e.getCause() != null && (e.getCause() instanceof bcke)) {
                q2.mo57003a(10);
            }
            bbwq.f103608f.mo56753a(q2.mo57002a());
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            bbon.m88284a();
            n.mo57512a(Long.valueOf(timeUnit.toMicros(System.currentTimeMillis())));
            n.mo57506a(bctk.f104864g);
            bctr = n.mo57502a();
            executionException = e;
        }
        bcrt bcrt = (bcrt) bctr;
        bbwq.mo56473c(bcoh).mo56624a(bctr, bcrt.f104746d.longValue());
        bbwq.mo56473c(bcoh).mo56634a(Arrays.asList(bctr), bctk.f104863f, bcrt.f104749g);
        bbwq.mo56331c(bcoh, bcrt.f104745c);
        if (executionException == null) {
            return null;
        }
        throw executionException;
    }
}
