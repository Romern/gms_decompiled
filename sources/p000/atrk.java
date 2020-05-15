package p000;

import android.os.Bundle;
import android.os.Message;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: atrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atrk extends atyi {
    public atrk(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
    }

    public final void handleMessage(Message message) {
        Bundle data;
        TokenizePanChimeraActivity tokenizePanChimeraActivity = (TokenizePanChimeraActivity) mo50318b();
        if (tokenizePanChimeraActivity != null) {
            message.getData().setClassLoader(TokenizePanChimeraActivity.class.getClassLoader());
            try {
                tokenizePanChimeraActivity.f108906c.f90832X = (btnf) atxo.m76511b(message, "tap_and_pay_api_error", btnf.f149600f);
            } catch (bxwf e) {
            }
            int i = message.what;
            if (i == 101) {
                try {
                    tokenizePanChimeraActivity.mo59477a((btnf) atxo.m76511b(message, "tap_and_pay_api_error", btnf.f149600f));
                } catch (bxwf e2) {
                    tokenizePanChimeraActivity.mo59477a((btnf) null);
                }
            } else if (i == 102) {
                try {
                    tokenizePanChimeraActivity.mo59482b((btnf) atxo.m76511b(message, "tap_and_pay_api_error", btnf.f149600f));
                    if (cgvo.m147167b() && (data = message.getData()) != null) {
                        atsy atsy = tokenizePanChimeraActivity.f108906c;
                        boolean z = true;
                        if (data.getInt("data_felica_issuer_limit_reached") != 1) {
                            z = false;
                        }
                        atsy.f90827S = z;
                    }
                } catch (bxwf e3) {
                    tokenizePanChimeraActivity.mo59482b((btnf) null);
                }
            } else if (i == 105) {
                tokenizePanChimeraActivity.mo59481b(14);
            } else if (i == 106 || i == 108) {
                atsy atsy2 = tokenizePanChimeraActivity.f108906c;
                atsy2.f90839b = 8;
                atsy2.f90814F = message.getData().getByteArray("data_recovery_token");
                byte[] bArr = tokenizePanChimeraActivity.f108906c.f90814F;
                int i2 = message.what;
                StringBuilder sb = new StringBuilder(67);
                sb.append("Recovery token is null on TokenizePanService error code:");
                sb.append(i2);
                rzz.m34727a(bArr, sb.toString());
                try {
                    tokenizePanChimeraActivity.mo59483b((btnf) atxo.m76511b(message, "tap_and_pay_api_error", btnf.f149600f), tokenizePanChimeraActivity.getString(C0126R.string.common_ok), null);
                } catch (bxwf e4) {
                    tokenizePanChimeraActivity.mo59477a((btnf) null);
                }
            } else if (i != 114) {
                tokenizePanChimeraActivity.f108906c.mo50162a(tokenizePanChimeraActivity).mo50171a(message, tokenizePanChimeraActivity.f108906c);
            } else {
                tokenizePanChimeraActivity.f108906c.f90831W = 7;
                tokenizePanChimeraActivity.mo59481b(27);
            }
        }
    }
}
