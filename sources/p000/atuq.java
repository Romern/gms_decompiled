package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraService;
import java.io.IOException;

/* renamed from: atuq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atuq extends atvb {

    /* renamed from: a */
    private static final srn f90927a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private final askf f90928b;

    /* renamed from: c */
    private final btiy f90929c;

    /* renamed from: h */
    private final String f90930h;

    /* renamed from: i */
    private final String f90931i;

    public atuq(Bundle bundle, Messenger messenger, askf askf, TokenizePanChimeraService tokenizePanChimeraService) {
        super(tokenizePanChimeraService);
        btiy btiy;
        this.f90928b = askf;
        this.f90986e = messenger;
        byte[] byteArray = bundle.getByteArray("data_card_id");
        if (byteArray != null) {
            try {
                btiy = (btiy) bxvk.m124016a(btiy.f149054c, byteArray, bxus.m123744c());
            } catch (bxwf e) {
                bnsl bnsl = (bnsl) f90927a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("atuq", "<init>", 52, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to parse card id");
                btiy = null;
            }
        } else {
            btiy = null;
        }
        this.f90929c = btiy;
        this.f90930h = bundle.getString("data_session_id", null);
        this.f90931i = bundle.getString("data_server_session_id", null);
    }

    /* renamed from: a */
    public static Message m76404a(AccountInfo accountInfo, String str, Handler handler, byte[] bArr, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("data_card_id", bArr);
        bundle.putString("data_session_id", str2);
        bundle.putString("data_server_session_id", str3);
        return atvb.m76438a(21, bundle, accountInfo, str, handler);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Boolean[] boolArr = (Boolean[]) objArr;
        try {
            bxvd da = btkn.f149277e.mo74144da();
            btiy btiy = this.f90929c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btkn btkn = (btkn) da.f164949b;
            btiy.getClass();
            btkn.f149281c = btiy;
            String str = this.f90931i;
            str.getClass();
            btkn.f149279a = 3;
            btkn.f149280b = str;
            String str2 = this.f90930h;
            str2.getClass();
            btkn.f149282d = str2;
            return (btko) atff.m75759a(this.f90928b, "t/cardtokenization/getissuertoscontent", (btkn) da.mo74062i(), btko.f149283c);
        } catch (atfh e) {
            this.f90988g = 101;
            this.f90987f = e.f90231a;
            bnsl bnsl = (bnsl) f90927a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atuq", "a", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error getting issuer tos content");
            return null;
        } catch (IOException e2) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final btko mo50201a(Boolean... boolArr) {
        try {
            bxvd da = btkn.f149277e.mo74144da();
            btiy btiy = this.f90929c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btkn btkn = (btkn) da.f164949b;
            btiy.getClass();
            btkn.f149281c = btiy;
            String str = this.f90931i;
            str.getClass();
            btkn.f149279a = 3;
            btkn.f149280b = str;
            String str2 = this.f90930h;
            str2.getClass();
            btkn.f149282d = str2;
            return (btko) atff.m75759a(this.f90928b, "t/cardtokenization/getissuertoscontent", (btkn) da.mo74062i(), btko.f149283c);
        } catch (atfh e) {
            this.f90988g = 101;
            this.f90987f = e.f90231a;
            bnsl bnsl = (bnsl) f90927a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atuq", "a", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error getting issuer tos content");
            return null;
        } catch (IOException e2) {
            return null;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo50195a(Object obj) {
        Message message;
        btko btko = (btko) obj;
        Bundle bundle = new Bundle();
        bundle.putInt("data_request_type", 21);
        byte[] bArr = null;
        if (btko == null) {
            try {
                message = Message.obtain((Handler) null, this.f90988g);
                btnf btnf = this.f90987f;
                if (btnf != null) {
                    bArr = btnf.mo73642k();
                }
                bundle.putByteArray("tap_and_pay_api_error", bArr);
            } catch (RemoteException e) {
                return;
            }
        } else {
            Message obtain = Message.obtain((Handler) null, 21001);
            bundle.putByteArray("data_response", btko.mo73642k());
            message = obtain;
        }
        message.setData(bundle);
        this.f90986e.send(message);
    }
}
