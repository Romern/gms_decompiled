package p000;

import android.util.Log;

/* renamed from: rwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rwq extends rvd {
    public rwq() {
        super("TempPSFlagCommitFix", 7200);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25188a(rvl rvl) {
        return bpun.STARTUP.equals(rvl.f43759a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final rvl mo25189b(rvl rvl) {
        if (cdkp.m133837d() && cdkp.m133836c() && cgyg.f188052a.mo6606a().mo84751a()) {
            Log.i("TempPSFlagCommitFix", "TempProcessStableFlagCommitFix applied.");
        }
        rvk d = rvl.mo25205d();
        d.mo25199a(this, 3);
        return d.mo25198a();
    }
}
