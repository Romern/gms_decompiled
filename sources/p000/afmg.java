package p000;

import com.google.android.gms.mdh.MdhFootprint;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;

/* renamed from: afmg */
final /* synthetic */ class afmg implements Runnable {

    /* renamed from: a */
    private final MdhFootprintListSafeParcelable f64373a;

    /* renamed from: b */
    private final afmt f64374b;

    public afmg(afmt afmt, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        this.f64374b = afmt;
        this.f64373a = mdhFootprintListSafeParcelable;
    }

    public final void run() {
        afmt afmt = this.f64374b;
        MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable = this.f64373a;
        if (afmt.f64402a) {
            basu basu = afmt.f64403b;
            basu.f101684b.mo29376a(basn.m87493a((MdhFootprint) mdhFootprintListSafeParcelable.f80015a.get(0), basu.f101683a));
        }
    }
}
