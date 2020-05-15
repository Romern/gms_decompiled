package p000;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* renamed from: rmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rmh implements rmy {

    /* renamed from: a */
    public final rnb f43279a;

    public rmh(rnb rnb) {
        this.f43279a = rnb;
    }

    /* renamed from: a */
    public final rle mo24892a(rle rle) {
        try {
            this.f43279a.f43358l.f43331k.mo24980a(rle);
            rmx rmx = this.f43279a.f43358l;
            rjm rjm = (rjm) rmx.f43327g.get(rle.f43219d);
            sdo.m34966a(rjm, "Appropriate Api was not requested.");
            if (rjm.mo24648p() || !this.f43279a.f43353g.containsKey(rle.f43219d)) {
                if (rjm instanceof sdx) {
                    rjn rjn = ((sdx) rjm).f44080a;
                    rjm = null;
                }
                rle.mo24856b(rjm);
                return rle;
            }
            rle.mo9481a(new Status(17));
            return rle;
        } catch (DeadObjectException e) {
            this.f43279a.mo24920a(new rmg(this, this));
        }
    }

    /* renamed from: a */
    public final void mo24893a() {
    }

    /* renamed from: a */
    public final void mo24895a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo24896a(ConnectionResult connectionResult, rjo rjo, boolean z) {
    }

    /* renamed from: b */
    public final void mo24897b(rle rle) {
        mo24892a(rle);
    }

    /* renamed from: c */
    public final void mo24899c() {
    }

    /* renamed from: b */
    public final boolean mo24898b() {
        rmx rmx = this.f43279a.f43358l;
        rmx.f43322b.lock();
        rmx.f43322b.unlock();
        this.f43279a.mo24919a((ConnectionResult) null);
        return true;
    }

    /* renamed from: a */
    public final void mo24894a(int i) {
        this.f43279a.mo24919a((ConnectionResult) null);
        this.f43279a.f43359m.mo24873a(i);
    }
}
