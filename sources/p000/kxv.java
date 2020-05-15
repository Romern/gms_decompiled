package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: kxv */
final /* synthetic */ class kxv implements bmzi {

    /* renamed from: a */
    private final kxx f25367a;

    /* renamed from: b */
    private final bqgg f25368b;

    /* renamed from: c */
    private final kem f25369c;

    /* renamed from: d */
    private final bmza f25370d;

    public kxv(kxx kxx, bqgg bqgg, kem kem, bmza bmza) {
        this.f25367a = kxx;
        this.f25368b = bqgg;
        this.f25369c = kem;
        this.f25370d = bmza;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        boolean z;
        kxx kxx = this.f25367a;
        bqgg bqgg = this.f25368b;
        kem kem = this.f25369c;
        bmza bmza = this.f25370d;
        try {
            bqga.m112780a((Future) bqgg);
            z = true;
        } catch (ExecutionException e) {
            z = false;
        }
        bxvd da = lag.f25529i.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((lag) da.f164949b).f25531a = lae.m18845a(4);
        int i = kxx.f25378c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((lag) da.f164949b).f25532b = laf.m18846a(i);
        laz a = kxx.m18759a(kem.f23944b.getClass());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        lag lag = (lag) da.f164949b;
        a.getClass();
        lag.mo14957a();
        lag.f25533c.mo74153d(a.mo3214a());
        long a2 = bmza.mo66928a(TimeUnit.MILLISECONDS);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        lag lag2 = (lag) da.f164949b;
        lag2.f25534d = a2;
        lag2.f25535e = z;
        lag2.f25536f = z ? 1 : 0;
        return (lag) da.mo74062i();
    }
}
