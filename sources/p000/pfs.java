package p000;

import com.google.android.gms.cast.internal.ApplicationStatus;

/* renamed from: pfs */
final /* synthetic */ class pfs implements Runnable {

    /* renamed from: a */
    private final pfu f39042a;

    /* renamed from: b */
    private final ApplicationStatus f39043b;

    public pfs(pfu pfu, ApplicationStatus applicationStatus) {
        this.f39042a = pfu;
        this.f39043b = applicationStatus;
    }

    public final void run() {
        boolean z;
        pfu pfu = this.f39042a;
        ApplicationStatus applicationStatus = this.f39043b;
        pfv pfv = pfu.f39047a;
        ptx ptx = pfv.f39050a;
        String str = applicationStatus.f29887a;
        if (!ptk.m31236a(str, pfv.f39061k)) {
            pfv.f39061k = str;
            z = true;
        } else {
            z = false;
        }
        pfv.f39050a.mo23670a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(pfv.f39055e));
        pfv.f39055e = false;
    }
}
