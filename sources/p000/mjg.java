package p000;

/* renamed from: mjg */
public final /* synthetic */ class mjg implements Runnable {

    /* renamed from: a */
    private final mji f33823a;

    public mjg(mji mji) {
        this.f33823a = mji;
    }

    public final void run() {
        aqzp aqzp = this.f33823a.f33828b;
        mjj.f33830d.mo25409a("onCompleted", new Object[0]);
        mjj mjj = (mjj) aqzp;
        mht mht = mjj.f33839m;
        if (mht.f33740a) {
            mhu.f33742a.mo25412b("Listener.onCompleted called after abortRequest", new Object[0]);
        } else {
            ((mib) mht.f33741b).f33756g.mo19984a(true);
            bxvd da = mpq.f34203d.mo74144da();
            mpp mpp = mpp.COMPLETE;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mpq mpq = (mpq) da.f164949b;
            mpq.f34206b = mpp.f34202g;
            mpq.f34205a = 1 | mpq.f34205a;
            mht.f33741b.mo20036a((mpq) da.mo74062i(), (mpn) null);
        }
        mjj.mo20087b();
    }
}
