package p000;

import android.util.Log;

/* renamed from: rwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rwo extends rvd {

    /* renamed from: d */
    private final Throwable f43794d;

    public rwo(Throwable th) {
        super("ReportCrashFix", cdkp.f181122a.mo6606a().mo77798A());
        sdo.m34959a(th);
        this.f43794d = th;
    }

    /* renamed from: a */
    public final boolean mo25188a(rvl rvl) {
        return cdkp.f181122a.mo6606a().mo77839z();
    }

    /* renamed from: b */
    public final rvl mo25189b(rvl rvl) {
        Log.w("ReportCrashFix", "Applying ReportCrashFix", this.f43794d);
        sqx.m36054a(rvl.f43760b, this.f43794d, 134217728);
        rvk d = rvl.mo25205d();
        d.mo25199a(this, 3);
        return d.mo25198a();
    }
}
