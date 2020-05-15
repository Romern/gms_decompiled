package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: aolx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aolx implements rjz, rka {

    /* renamed from: a */
    final /* synthetic */ aolz f78433a;

    public aolx(aolz aolz) {
        this.f78433a = aolz;
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        aolz aolz = this.f78433a;
        if (aolz.f78441g) {
            aolz.f78436b.mo42332x();
        }
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        aolz aolz = this.f78433a;
        aolz.f78440f = aolz.f78436b.mo42330c();
        if (!this.f78433a.f78439e.mo24805i() && !this.f78433a.f78439e.mo24806j()) {
            this.f78433a.f78439e.mo24801e();
        }
        aolz aolz2 = this.f78433a;
        if (aolz2.f78441g) {
            aolz2.f78436b.mo42313a(aolz2, aolz2.f78442h);
        }
        this.f78433a.f78443i.mo42988e();
        this.f78433a.f78438d = true;
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        aoly aoly = this.f78433a.f78443i;
        if (aoly != null) {
            aoly.mo42986a(connectionResult);
        }
    }
}
