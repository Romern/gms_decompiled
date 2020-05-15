package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.util.TimerTask;

/* renamed from: agbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agbr extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ agbt f65167a;

    public agbr(agbt agbt) {
        this.f65167a = agbt;
    }

    public final void run() {
        agbt agbt = this.f65167a;
        agcm agcm = agbt.f65168a;
        synchronized (agbt.f65180j) {
            agbt agbt2 = this.f65167a;
            if (agbt2.f65186p != null) {
                if (!agbt2.f65187q && agbt2.f65188r) {
                    bnsl bnsl = (bnsl) agbt.f65168a.f65218b.mo68387b();
                    bnsl.mo68432a("agbr", "run", 596, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68415a("Haven't received multicast response in the last %d ms.", this.f65167a.f65178h);
                    this.f65167a.f65189s.set(true);
                    agbt agbt3 = this.f65167a;
                    qwo a = agbt3.f65176f.mo24335a(agbt3.mo35207c().mo73642k());
                    a.mo24328b((int) BaseMfiEventCallback.TYPE_INTERRUPTED_ERROR);
                    a.mo24327b();
                }
                this.f65167a.f65186p = null;
            }
        }
    }
}
