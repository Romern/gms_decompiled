package p000;

import android.location.Location;
import android.os.Looper;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: bihi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bihi implements afcs {

    /* renamed from: a */
    final /* synthetic */ boolean f120598a;

    /* renamed from: b */
    public final /* synthetic */ biht f120599b;

    public bihi(biht biht, boolean z) {
        this.f120599b = biht;
        this.f120598a = z;
    }

    /* renamed from: a */
    public final void mo34763a(afcn afcn) {
        biht biht = this.f120599b;
        if (!biht.f120634v) {
            bihr bihr = biht.f120632t;
            if (bihr != null) {
                bihr.mo64611a();
                return;
            }
            return;
        }
        Location c = afcn.mo34757c();
        if (c == null) {
            this.f120599b.f120614b = false;
            afcn.mo34753a(new bihg(this));
            if (this.f120598a) {
                new adzt(Looper.getMainLooper()).postDelayed(new bihh(this), cggj.f186839a.mo6606a().mo83702b());
                return;
            }
            bihr bihr2 = this.f120599b.f120632t;
            if (bihr2 != null) {
                bihr2.mo64611a();
                return;
            }
            return;
        }
        bihr bihr3 = this.f120599b.f120632t;
        if (bihr3 != null) {
            bihr3.mo64612a(new LatLng(c.getLatitude(), c.getLongitude()));
        }
    }
}
