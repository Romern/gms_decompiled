package p000;

import android.os.SystemClock;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: bcik */
final /* synthetic */ class bcik implements bqeg {

    /* renamed from: a */
    private final bcjm f104220a;

    /* renamed from: b */
    private final bqgy f104221b;

    /* renamed from: c */
    private final bqgg f104222c;

    /* renamed from: d */
    private final UUID f104223d;

    /* renamed from: e */
    private final bcmw f104224e;

    public bcik(bcjm bcjm, bqgy bqgy, bqgg bqgg, bcmw bcmw, UUID uuid) {
        this.f104220a = bcjm;
        this.f104221b = bqgy;
        this.f104222c = bqgg;
        this.f104224e = bcmw;
        this.f104223d = uuid;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        long j;
        bcjm bcjm = this.f104220a;
        bqgy bqgy = this.f104221b;
        bqgg bqgg = this.f104222c;
        bcmw bcmw = this.f104224e;
        UUID uuid = this.f104223d;
        if (bqgy.isDone()) {
            j = TimeUnit.MILLISECONDS.toMicros(SystemClock.elapsedRealtime() - ((Long) bqgy.get()).longValue());
        } else {
            j = 0;
        }
        try {
            Void voidR = (Void) bqga.m112780a((Future) bqgg);
            bcfx bcfx = bcjm.f104334c;
            bcnr q = bcns.m89409q();
            q.mo57011b(10003);
            q.mo57012b(bcmw.f104507a.mo57058b().mo57074e());
            q.mo57010a(bcmw.f104507a.mo57059c().mo73781l());
            q.mo57013b(uuid.toString());
            q.mo57014c(11);
            q.mo57003a(1);
            q.mo57004a(j);
            bcfx.mo56753a(q.mo57002a());
        } catch (Exception e) {
            int a = bckc.m89179a().mo56953a(bcjm.f104332a, e.getCause());
            int i = chuv.m149608a(e.getCause()).f189233s.f189211r;
            bcfx bcfx2 = bcjm.f104334c;
            bcnr q2 = bcns.m89409q();
            q2.mo57011b(10003);
            q2.mo57012b(bcmw.f104507a.mo57058b().mo57074e());
            q2.mo57010a(bcmw.f104507a.mo57059c().mo73781l());
            q2.mo57013b(uuid.toString());
            q2.mo57014c(11);
            q2.mo57009a(Integer.valueOf(i));
            q2.mo57003a(a);
            q2.mo57004a(j);
            bcfx2.mo56753a(q2.mo57002a());
        }
        return bqgg;
    }
}
