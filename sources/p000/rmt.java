package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;

/* renamed from: rmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rmt implements rmy {

    /* renamed from: a */
    private final rnb f43317a;

    public rmt(rnb rnb) {
        this.f43317a = rnb;
    }

    /* renamed from: a */
    public final rle mo24892a(rle rle) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: a */
    public final void mo24894a(int i) {
    }

    /* renamed from: a */
    public final void mo24895a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo24896a(ConnectionResult connectionResult, rjo rjo, boolean z) {
    }

    /* renamed from: b */
    public final void mo24897b(rle rle) {
        this.f43317a.f43358l.f43325e.add(rle);
    }

    /* renamed from: b */
    public final boolean mo24898b() {
        return true;
    }

    /* renamed from: c */
    public final void mo24899c() {
        rnb rnb = this.f43317a;
        rnb.f43347a.lock();
        try {
            rnb.f43356j = new rms(rnb, rnb.f43354h, rnb.f43355i, rnb.f43350d, rnb.f43360n, rnb.f43347a, rnb.f43349c);
            rnb.f43356j.mo24893a();
            rnb.f43348b.signalAll();
        } finally {
            rnb.f43347a.unlock();
        }
    }

    /* renamed from: a */
    public final void mo24893a() {
        for (rjm rjm : this.f43317a.f43352f.values()) {
            rjm.mo14032j();
        }
        this.f43317a.f43358l.f43328h = Collections.emptySet();
    }
}
