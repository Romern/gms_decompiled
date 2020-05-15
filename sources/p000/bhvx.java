package p000;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: bhvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhvx implements rka {

    /* renamed from: a */
    final /* synthetic */ bhwa f119711a;

    public bhvx(bhwa bhwa) {
        this.f119711a = bhwa;
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        bhwp a = bhuj.m101555a();
        int i = connectionResult.f30065c;
        StringBuilder sb = new StringBuilder(60);
        sb.append("GoogleApiClient connection failure - error code: ");
        sb.append(i);
        a.mo64360b(sb.toString());
        this.f119711a.f119718e = false;
        this.f119711a.f119720g = null;
    }
}
