package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.wallet.service.reauth.ReauthProofTokenRequest;
import com.google.android.gms.wallet.service.reauth.ReauthProofTokenResponse;

/* renamed from: awxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awxm extends dcj implements awxo {
    public awxm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.service.reauth.IReauthService");
    }

    /* renamed from: a */
    public final ReauthProofTokenResponse mo52698a(ReauthProofTokenRequest reauthProofTokenRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, reauthProofTokenRequest);
        Parcel a = mo8526a(1, bj);
        ReauthProofTokenResponse reauthProofTokenResponse = (ReauthProofTokenResponse) dcl.m8163a(a, ReauthProofTokenResponse.CREATOR);
        a.recycle();
        return reauthProofTokenResponse;
    }
}
