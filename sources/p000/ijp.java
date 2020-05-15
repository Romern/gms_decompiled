package p000;

import android.content.IntentFilter;
import android.os.Bundle;

/* renamed from: ijp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ijp implements rjz {

    /* renamed from: a */
    final /* synthetic */ ijt f21124a;

    public ijp(ijt ijt) {
        this.f21124a = ijt;
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        ijt.f21129r.mo25416d("GoogleApiClient connection suspended. Cause: %d", Integer.valueOf(i));
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        rjo rjo = axoz.f96226a;
        ijt ijt = this.f21124a;
        rkb rkb = ijt.f21144o;
        ijr ijr = ijt.f21145p;
        rkb.mo24787a((rle) new axse(rkb, ijr, rkb.mo24788a(ijr), new IntentFilter[]{axta.m83152a("com.google.android.gms.wearable.MESSAGE_RECEIVED")}));
    }
}
