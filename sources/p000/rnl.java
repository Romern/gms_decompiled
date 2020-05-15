package p000;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.Set;

/* renamed from: rnl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rnl implements sag {

    /* renamed from: a */
    public final rjm f43385a;

    /* renamed from: b */
    public final rkz f43386b;

    /* renamed from: c */
    public scb f43387c = null;

    /* renamed from: d */
    public Set f43388d = null;

    /* renamed from: e */
    public boolean f43389e = false;

    /* renamed from: f */
    final /* synthetic */ rnm f43390f;

    public rnl(rnm rnm, rjm rjm, rkz rkz) {
        this.f43390f = rnm;
        this.f43385a = rjm;
        this.f43386b = rkz;
    }

    /* renamed from: a */
    public final void mo24942a() {
        scb scb;
        if (this.f43389e && (scb = this.f43387c) != null) {
            this.f43385a.mo24647a(scb, this.f43388d);
        }
    }

    /* renamed from: b */
    public final void mo24943b(ConnectionResult connectionResult) {
        rnm rnm = this.f43390f;
        Status status = rnm.f43391a;
        rni rni = (rni) rnm.f43402l.get(this.f43386b);
        sdo.m34964a(rni.f43375h.f43405o);
        rni.f43369b.mo14032j();
        rni.mo7249a(connectionResult);
    }

    /* renamed from: a */
    public final void mo24901a(ConnectionResult connectionResult) {
        rnm rnm = this.f43390f;
        Status status = rnm.f43391a;
        rnm.f43405o.post(new rnk(this, connectionResult));
    }
}
