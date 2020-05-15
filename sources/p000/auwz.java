package p000;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: auwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auwz implements rka {
    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        aunx aunx = auxe.f92681a;
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
        sb.append("GoogleApiClient connection failed: ");
        sb.append(valueOf);
        aunx.mo50711a(sb.toString(), new Object[0]);
    }
}
