package p000;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;

/* renamed from: hey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hey implements bqfp {

    /* renamed from: a */
    public final bqgy f19626a = bqgy.m112818c();

    /* renamed from: b */
    private final adbj f19627b;

    /* renamed from: c */
    private final bqgg f19628c;

    /* renamed from: d */
    private final long f19629d = SystemClock.elapsedRealtime();

    public hey(adbj adbj, bqgg bqgg) {
        this.f19627b = adbj;
        this.f19628c = bqgg;
    }

    /* renamed from: a */
    public final void mo6480a(Object obj) {
        bqgy bqgy = this.f19626a;
        bxvd da = bonc.f133761e.mo74144da();
        adbj adbj = this.f19627b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bonc bonc = (bonc) da.f164949b;
        bonc.f133764b = adbj.f61319ay;
        bonc.f133763a |= 1;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f19629d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bonc bonc2 = (bonc) da.f164949b;
        int i = bonc2.f133763a | 2;
        bonc2.f133763a = i;
        bonc2.f133765c = elapsedRealtime;
        bonc2.f133763a = i | 4;
        bonc2.f133766d = 0;
        bqgy.mo69138b((bonc) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bqgy bqgy = this.f19626a;
        bxvd da = bonc.f133761e.mo74144da();
        adbj adbj = this.f19627b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bonc bonc = (bonc) da.f164949b;
        bonc.f133764b = adbj.f61319ay;
        bonc.f133763a |= 1;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f19629d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bonc bonc2 = (bonc) da.f164949b;
        bonc2.f133763a |= 2;
        bonc2.f133765c = elapsedRealtime;
        int i = 16;
        if (!this.f19628c.isCancelled() && !(th instanceof CancellationException)) {
            i = adbe.m50109a(th).f61236a;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bonc bonc3 = (bonc) da.f164949b;
        bonc3.f133763a |= 4;
        bonc3.f133766d = i;
        bqgy.mo69138b((bonc) da.mo74062i());
    }
}
