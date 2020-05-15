package p000;

/* renamed from: mht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mht {

    /* renamed from: a */
    public boolean f33740a = false;

    /* renamed from: b */
    public final /* synthetic */ mhu f33741b;

    protected mht(mhu mhu) {
        this.f33741b = mhu;
    }

    /* renamed from: a */
    public final void mo20028a(int i, int i2, String str) {
        if (!this.f33740a) {
            String a = stm.m36299a(str);
            bxvd da = mpq.f34203d.mo74144da();
            mpp mpp = mpp.ERROR;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mpq mpq = (mpq) da.f164949b;
            mpq.f34206b = mpp.f34202g;
            mpq.f34205a |= 1;
            this.f33741b.mo20036a((mpq) da.mo74062i(), mhu.m25129a(i, i2, a));
            mib mib = (mib) this.f33741b;
            mib.f33756g.mo19984a(false);
            mib.mo20045d();
            return;
        }
        mhu.f33742a.mo25412b("Listener.onError called after abortRequest", new Object[0]);
    }
}
