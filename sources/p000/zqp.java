package p000;

import java.io.IOException;
import java.util.List;

/* renamed from: zqp */
final /* synthetic */ class zqp implements Runnable {

    /* renamed from: a */
    private final zqq f55714a;

    /* renamed from: b */
    private final zqn f55715b;

    public zqp(zqq zqq, zqn zqn) {
        this.f55714a = zqq;
        this.f55715b = zqn;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zrc.a(java.util.List, boolean):bngx
     arg types: [bngx, int]
     candidates:
      zrc.a(caae, long):int
      zrc.a(caae, int):long
      zrc.a(cadp, boolean):cadp
      zrj.a(cadz, int):boolean
      zra.a(int, long):bngx
      zrc.a(java.util.List, boolean):bngx */
    public final void run() {
        zqq zqq = this.f55714a;
        zqn zqn = this.f55715b;
        try {
            zqq.f55717b.mo31361a((List) zqn.f55709a, false);
            zqq.f55717b.mo31382a(new yqi(zqn.f55710b, -1, zqn.f55712d, null));
        } catch (IOException e) {
            bnsl bnsl = (bnsl) zqq.f55716a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68409a("Unable to backfill %s data points", zqn.f55709a.size());
        }
    }
}
