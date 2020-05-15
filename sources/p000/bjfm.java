package p000;

import android.accounts.Account;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.wallet.service.reauth.ReauthProofTokenRequest;
import com.google.android.gms.wallet.service.reauth.ReauthProofTokenResponse;
import java.util.Locale;

/* renamed from: bjfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjfm implements bjew {

    /* renamed from: a */
    private final awxn f122629a;

    public bjfm() {
    }

    /* renamed from: a */
    public final bjfd mo52455a(bjfc bjfc) {
        Intent intent;
        String stringExtra = bjfc.f122612a.getStringExtra("extra_reauth_credential");
        bjfc.f122612a.getIntExtra("extra_reauth_credential_type", 0);
        int i = 1;
        try {
            ReauthProofTokenResponse a = this.f122629a.mo52698a(new ReauthProofTokenRequest((Account) bjfc.f122612a.getParcelableExtra("extra_reauth_account"), stringExtra, 3, bjfc.f122612a.getIntExtra("extra_reauth_retryCount", 1)));
            int i2 = a.f110398b;
            if (i2 == 0) {
                String str = a.f110397a;
                long j = a.f110399c;
                intent = bjfd.m103295a(0);
                intent.putExtra("extra_reauth_token", str);
                intent.putExtra("extra_reauth_response_time_ms", j);
            } else {
                if (i2 == 0) {
                    i = -1;
                } else if (i2 != 1) {
                    if (i2 == 2) {
                        i = 2;
                    } else if (i2 == 3) {
                        i = 3;
                    } else {
                        throw new IllegalStateException(String.format(Locale.US, "illegalState: %d", Integer.valueOf(i2)));
                    }
                }
                intent = bjfd.m103296b(i);
            }
        } catch (RemoteException e) {
            intent = bjfd.m103295a(3);
        }
        return new bjfd(intent);
    }

    public bjfm(awxn awxn) {
        this.f122629a = awxn;
    }
}
