package p000;

import com.google.android.gms.autofill.metrics.MetricsContext;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: kxw */
final /* synthetic */ class kxw implements bmzi {

    /* renamed from: a */
    private final kxx f25371a;

    /* renamed from: b */
    private final bqgg f25372b;

    /* renamed from: c */
    private final kej f25373c;

    /* renamed from: d */
    private final bmza f25374d;

    public kxw(kxx kxx, bqgg bqgg, kej kej, bmza bmza) {
        this.f25371a = kxx;
        this.f25372b = bqgg;
        this.f25373c = kej;
        this.f25374d = bmza;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        boolean z;
        int i;
        kxx kxx = this.f25371a;
        bqgg bqgg = this.f25372b;
        kej kej = this.f25373c;
        bmza bmza = this.f25374d;
        try {
            i = ((kek) bqga.m112780a((Future) bqgg)).f23936a.size();
            z = true;
        } catch (ExecutionException e) {
            i = 0;
            z = false;
        }
        bxvd da = lag.f25529i.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((lag) da.f164949b).f25531a = lae.m18845a(3);
        int i2 = kxx.f25378c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((lag) da.f164949b).f25532b = laf.m18846a(i2);
        bnic<Class> bnic = kej.f23935b;
        ArrayList arrayList = new ArrayList(bnic.size());
        for (Class cls : bnic) {
            arrayList.add(kxx.m18759a(cls));
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        lag lag = (lag) da.f164949b;
        lag.mo14957a();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            lag.f25533c.mo74153d(((laz) arrayList.get(i3)).mo3214a());
        }
        long a = bmza.mo66928a(TimeUnit.MILLISECONDS);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        lag lag2 = (lag) da.f164949b;
        lag2.f25534d = a;
        lag2.f25535e = z;
        lag2.f25536f = i;
        lag2.f25537g = kxx.f25377b;
        bmxv bmxv = kej.f23934a.f23942f;
        if (bmxv.mo66813a()) {
            kzz a2 = kwv.m18700a((MetricsContext) bmxv.mo66814b());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a2.getClass();
            ((lag) da.f164949b).f25538h = a2;
        }
        return (lag) da.mo74062i();
    }
}
