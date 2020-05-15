package p000;

import android.location.Location;

/* renamed from: bful */
final /* synthetic */ class bful implements aubw {

    /* renamed from: a */
    private final bfun f115348a;

    public bful(bfun bfun) {
        this.f115348a = bfun;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        bfun bfun = this.f115348a;
        bfun.f115351a.post(new bfum(bfun, (Location) obj));
    }
}
