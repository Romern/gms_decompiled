package p000;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: auxq */
final /* synthetic */ class auxq implements rka {

    /* renamed from: a */
    static final rka f92739a = new auxq();

    private auxq() {
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        aunx aunx = auxs.f92741a;
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
        sb.append("GoogleApiClient connection failed: ");
        sb.append(valueOf);
        aunx.mo50711a(sb.toString(), new Object[0]);
    }
}
