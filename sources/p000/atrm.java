package p000;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraService;

/* renamed from: atrm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atrm extends adzt {

    /* renamed from: a */
    final /* synthetic */ TokenizePanChimeraService f90710a;

    public atrm(TokenizePanChimeraService tokenizePanChimeraService) {
        this.f90710a = tokenizePanChimeraService;
    }

    public final void handleMessage(Message message) {
        btiy btiy;
        btjq btjq;
        Message message2 = message;
        Bundle data = message.getData();
        data.setClassLoader(TokenizePanChimeraService.class.getClassLoader());
        Messenger messenger = message2.replyTo;
        String string = data.getString("data_billing_id");
        AccountInfo accountInfo = (AccountInfo) data.getParcelable("data_account_info");
        if (accountInfo == null) {
            bnsl bnsl = (bnsl) TokenizePanChimeraService.f108922a.mo68388c();
            bnsl.mo68432a("atrm", "handleMessage", 88, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("AccountInfo cannot be null");
            return;
        }
        String string2 = data.getString("calling_package");
        if (string2 == null) {
            srn srn = TokenizePanChimeraService.f108922a;
        }
        byte[] byteArray = data.getByteArray("data_activation_receipt");
        byte[] byteArray2 = data.getByteArray("data_activation_method");
        String string3 = data.getString("data_session_id");
        long j = data.getLong("android_id");
        String string4 = data.getString("data_bundle_type");
        askf askf = new askf(accountInfo, askc.m74272b(), this.f90710a, string2);
        PushTokenizeRequest pushTokenizeRequest = null;
        String str = "data_untokenized_card";
        switch (message2.what) {
            case 1:
                new atun(data, messenger, askf, this.f90710a).executeOnExecutor(TokenizePanChimeraService.f108923e.mo50146a(), new Boolean[0]);
                return;
            case 2:
                String string5 = data.getString("data_cvv");
                srn srn2 = TokenizePanChimeraService.f108922a;
                if (data.getByteArray("data_card_id") != null) {
                    try {
                        btiy = (btiy) GeneratedMessageLite.m124016a(btiy.f149054c, data.getByteArray("data_card_id"), bxus.m123744c());
                    } catch (bxwf e) {
                        btiy = null;
                    }
                } else {
                    btiy = null;
                }
                byte[] byteArray3 = data.getByteArray("data_eligibility_receipt");
                String a = stm.m36299a(data.getString("alternate_cardholder_name"));
                byte[] byteArray4 = data.getByteArray("data_push_tokenize_request");
                if (byteArray4 != null) {
                    pushTokenizeRequest = (PushTokenizeRequest) sef.m35069a(byteArray4, PushTokenizeRequest.CREATOR);
                }
                new atvc(askf, btiy, string5, byteArray3, string3, string4, a, string2, pushTokenizeRequest, data.getBoolean("data_is_account_tokenization", false), data.getByteArray("data_opaque_card_data"), data.getString("data_server_session_id"), this.f90710a, messenger).executeOnExecutor(TokenizePanChimeraService.f108923e.mo50146a(), new Void[0]);
                return;
            case 3:
            case 5:
            case 10:
            case 15:
            default:
                super.handleMessage(message);
                return;
            case 4:
                new atve(this.f90710a, askf).executeOnExecutor(TokenizePanChimeraService.f108923e.mo50146a(), new Void[0]);
                return;
            case 6:
                new atuu(string, askf, messenger, byteArray, string3, this.f90710a).executeOnExecutor(TokenizePanChimeraService.f108923e.mo50146a(), new Void[0]);
                return;
            case 7:
                new atuy(string, askf, messenger, byteArray, string3, byteArray2, this.f90710a).executeOnExecutor(TokenizePanChimeraService.f108923e.mo50146a(), new Void[0]);
                return;
            case 8:
                new atur(string, messenger, atds.m75666a(askf), this.f90710a).executeOnExecutor(TokenizePanChimeraService.f108923e.mo50146a(), new Void[0]);
                return;
            case 9:
                String str2 = str;
                try {
                    if (data.getByteArray(str2) != null) {
                        btjq = (btjq) GeneratedMessageLite.m124016a(btjq.f149162e, data.getByteArray(str2), bxus.m123744c());
                    } else {
                        btjq = null;
                    }
                } catch (bxwf e2) {
                    srn srn3 = TokenizePanChimeraService.f108922a;
                    btjq = null;
                }
                new atuv(string, btjq, askf, messenger, this.f90710a).executeOnExecutor(TokenizePanChimeraService.f108923e.mo50146a(), new Void[0]);
                return;
            case 11:
                new atus(askf, messenger, this.f90710a).executeOnExecutor(TokenizePanChimeraService.f108923e.mo50146a(), new Void[0]);
                return;
            case 12:
                new atut(this.f90710a, askf).executeOnExecutor(TokenizePanChimeraService.f108923e.mo50146a(), new Void[0]);
                return;
            case 13:
                new atva(askf, (CardInfo) data.getParcelable("data_card_info"), data.getString("activation_code"), byteArray, byteArray2, data.getBoolean("is_activation_code_autofilled"), data.getBoolean("is_activation_code_from_issuer_app"), string3, messenger, this.f90710a).executeOnExecutor(TokenizePanChimeraService.f108923e.mo50146a(), new Void[0]);
                return;
            case 14:
                new atvd(askf, messenger, this.f90710a, j).executeOnExecutor(TokenizePanChimeraService.f108923e.mo50146a(), new Void[0]);
                return;
            case 16:
                new atuw(askf, messenger, this.f90710a, (CardInfo) data.getParcelable("data_card_info")).executeOnExecutor(TokenizePanChimeraService.f108923e.mo50146a(), new Void[0]);
                return;
            case 17:
                new atux(this.f90710a, messenger, askf, data.getByteArray("data_orchestration_callback_data"), string3, data.getByteArray("data_card_id")).executeOnExecutor(TokenizePanChimeraService.f108923e.mo50146a(), new Boolean[0]);
                return;
            case 18:
                new atuo(messenger, this.f90710a).executeOnExecutor(TokenizePanChimeraService.f108923e.mo50146a(), new Void[0]);
                return;
            case 19:
                new atup(askf, messenger, this.f90710a, string4, atgn.m75827a(askf)).executeOnExecutor(TokenizePanChimeraService.f108923e.mo50146a(), new Void[0]);
                return;
            case 20:
                new atuz(askf, messenger, this.f90710a).executeOnExecutor(TokenizePanChimeraService.f108923e.mo50146a(), new Void[0]);
                return;
            case 21:
                new atuq(data, messenger, askf, this.f90710a).executeOnExecutor(TokenizePanChimeraService.f108923e.mo50146a(), new Boolean[0]);
                return;
        }
    }
}
