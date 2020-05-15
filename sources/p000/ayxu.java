package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ayxu */
public final /* synthetic */ class ayxu implements ayvt {

    /* renamed from: a */
    private final aywp f98710a;

    /* renamed from: b */
    private final aywr f98711b;

    public ayxu(aywp aywp, aywr aywr) {
        this.f98710a = aywp;
        this.f98711b = aywr;
    }

    /* renamed from: a */
    public final List mo54455a() {
        aywp aywp = this.f98710a;
        aywr aywr = this.f98711b;
        boolean z = false;
        bmxy.m108601b(aywp != null, "View is not instrumented.");
        ayxj ayxj = aywp.f98636a;
        if (!ayxj.f98680a.isEmpty()) {
            for (ayxh ayxh : ayxj.f98680a) {
                ayxh.mo54510c(aywp);
            }
        }
        bmxy.m108606b(aywp.mo54486c(), "VE is not impressed: %s {attached=%s}", aywp, Boolean.valueOf(((ayww) aywp.f98637b).f98665g));
        if (aywp.mo54487d() == 1) {
            z = true;
        }
        bmxy.m108605b(z, "VE is not visible: %s", aywp);
        bptv a = ayvj.m84936a();
        ArrayList arrayList = new ArrayList();
        ayxk.m85037a(aywp, arrayList);
        return bngx.m109356a(new ayyg(a, arrayList, aywr, 1000 * SystemClock.elapsedRealtime()));
    }
}
