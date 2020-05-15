package p000;

import android.location.Location;

/* renamed from: beys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class beys implements bhbp {

    /* renamed from: a */
    final /* synthetic */ beyv f113025a;

    public beys(beyv beyv) {
        this.f113025a = beyv;
    }

    /* renamed from: a */
    public final void mo61257a(bfkr bfkr) {
        Location location;
        if (bfkr != null && this.f113025a.f113047j) {
            beyv beyv = this.f113025a;
            if (!beyv.f113048k) {
                location = beyv.f113053p;
            } else {
                location = beyv.f113054q;
            }
            if (beyv.m96092a(bfkr, location, beyv.f113052o)) {
                this.f113025a.mo61262a(bfkr);
            }
        }
    }
}
