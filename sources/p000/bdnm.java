package p000;

import android.app.Activity;
import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bdnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdnm extends bdnh implements bdez, bdkj {

    /* renamed from: h */
    private static final bnrt f106068h = bnrt.m110178a("bdnm");

    /* renamed from: a */
    public final bdkg f106069a;

    /* renamed from: b */
    public final Application f106070b;

    /* renamed from: c */
    public final Object f106071c = new Object();

    /* renamed from: d */
    public final int f106072d;

    /* renamed from: e */
    public final bdne f106073e;

    /* renamed from: f */
    public final List f106074f;

    /* renamed from: g */
    public final AtomicInteger f106075g = new AtomicInteger();

    /* renamed from: i */
    private final cijl f106076i;

    /* renamed from: j */
    private final bdpz f106077j = bdpz.m91271a();

    public bdnm(bdkh bdkh, Application application, cijl cijl, bmxv bmxv, bdne bdne) {
        this.f106069a = bdkh.mo58105a(bqfb.INSTANCE, this.f106077j);
        this.f106070b = application;
        this.f106076i = cijl;
        int b = ((bdnc) bmxv.mo66814b()).mo58193b();
        this.f106072d = b;
        this.f106074f = new ArrayList(b);
        this.f106073e = bdne;
        bdfd.m90662a(application).mo57955a(this);
    }

    /* renamed from: a */
    public final void mo58212a() {
        bdnd[] bdndArr;
        if (this.f106075g.get() > 0) {
            bdhp.m90826a(bqdx.m112673a(((bqgk) this.f106076i.mo6445a()).mo25814a(new bdnj(this), 1, TimeUnit.SECONDS), bdnk.f106065a, (Executor) this.f106076i.mo6445a()));
            return;
        }
        synchronized (this.f106071c) {
            if (!this.f106074f.isEmpty()) {
                List list = this.f106074f;
                bdndArr = (bdnd[]) list.toArray(new bdnd[list.size()]);
                this.f106074f.clear();
            } else {
                bdndArr = null;
            }
        }
        if (bdndArr != null) {
            bdhp.m90826a(bqga.m112776a(new bdnl(this, bdndArr), (Executor) this.f106076i.mo6445a()));
        }
    }

    /* renamed from: b */
    public final void mo58031b() {
        bdfd.m90662a(this.f106070b).mo57956b(this);
        synchronized (this.f106071c) {
            this.f106074f.clear();
        }
    }

    /* renamed from: c */
    public final void mo58086c() {
    }

    /* renamed from: b */
    public final void mo57952b(Activity activity) {
        mo58212a();
    }

    /* renamed from: a */
    public final void mo58208a(bdnd bdnd) {
        if (this.f106077j.mo58288b()) {
            return;
        }
        if (!bdnd.m91134a(bdnd)) {
            bnrq bnrq = (bnrq) f106068h.mo68388c();
            bnrq.mo68432a("bdnm", "a", 78, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68405a("skip logging NetworkEvent due to empty bandwidth/latency data");
            return;
        }
        this.f106075g.incrementAndGet();
        bdhp.m90826a(bqga.m112776a(new bdni(this, bdnd), (Executor) this.f106076i.mo6445a()));
    }
}
