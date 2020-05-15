package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraService;
import java.io.IOException;

/* renamed from: atus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atus extends atvb {

    /* renamed from: a */
    private static final srn f90934a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private final askf f90935b;

    public atus(askf askf, Messenger messenger, TokenizePanChimeraService tokenizePanChimeraService) {
        super(tokenizePanChimeraService);
        this.f90935b = askf;
        this.f90986e = messenger;
    }

    /* renamed from: a */
    public static Message m76409a(AccountInfo accountInfo, String str, Handler handler) {
        return atvb.m76438a(11, new Bundle(), accountInfo, str, handler);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            new athq().mo50002b(this.f90935b);
            return (Boolean) askd.f89120l.mo58455c();
        } catch (asks | IOException e) {
            bnsl bnsl = (bnsl) f90934a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atus", "a", 58, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error retrieving storage key");
            mo50221a(this.f90935b, (int) C0126R.string.tp_add_card_error_title, (int) C0126R.string.tp_add_card_error_content);
            return null;
        } catch (atfh e2) {
            btnf btnf = e2.f90231a;
            if (btnf == null) {
                bnsl bnsl2 = (bnsl) f90934a.mo68388c();
                bnsl2.mo68437a(e2);
                bnsl2.mo68432a("atus", "a", 72, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("There was an unexpected TapAndPayApiException unrelated to attestation failures");
                this.f90988g = 101;
                return null;
            }
            this.f90987f = btnf;
            if (athh.m75884a(this.f90935b, this.f90987f)) {
                return Boolean.FALSE;
            }
            this.f90988g = 101;
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Boolean mo50204a(Void... voidArr) {
        try {
            new athq().mo50002b(this.f90935b);
            return (Boolean) askd.f89120l.mo58455c();
        } catch (asks | IOException e) {
            bnsl bnsl = (bnsl) f90934a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atus", "a", 58, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error retrieving storage key");
            mo50221a(this.f90935b, (int) C0126R.string.tp_add_card_error_title, (int) C0126R.string.tp_add_card_error_content);
            return null;
        } catch (atfh e2) {
            btnf btnf = e2.f90231a;
            if (btnf != null) {
                this.f90987f = btnf;
                if (athh.m75884a(this.f90935b, this.f90987f)) {
                    return Boolean.FALSE;
                }
            } else {
                bnsl bnsl2 = (bnsl) f90934a.mo68388c();
                bnsl2.mo68437a(e2);
                bnsl2.mo68432a("atus", "a", 72, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("There was an unexpected TapAndPayApiException unrelated to attestation failures");
            }
            this.f90988g = 101;
            return null;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo50195a(Object obj) {
        Message message;
        Boolean bool = (Boolean) obj;
        try {
            Bundle bundle = new Bundle();
            byte[] bArr = null;
            if (bool != null) {
                message = Message.obtain((Handler) null, 11001);
                bundle.putBoolean("data_attestation_success", bool.booleanValue());
            } else {
                Message obtain = Message.obtain((Handler) null, this.f90988g);
                btnf btnf = this.f90987f;
                if (btnf != null) {
                    bArr = btnf.serializeToBytes();
                }
                bundle.putByteArray("tap_and_pay_api_error", bArr);
                message = obtain;
            }
            message.setData(bundle);
            this.f90986e.send(message);
        } catch (RemoteException e) {
        }
    }
}
