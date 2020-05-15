package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraService;
import java.io.IOException;

/* renamed from: atux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atux extends atvb {

    /* renamed from: a */
    private static final srn f90956a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private final byte[] f90957b;

    /* renamed from: c */
    private final askf f90958c;

    /* renamed from: h */
    private final String f90959h;

    /* renamed from: i */
    private final btiy f90960i;

    /* renamed from: j */
    private byte[] f90961j;

    public atux(TokenizePanChimeraService tokenizePanChimeraService, Messenger messenger, askf askf, byte[] bArr, String str, byte[] bArr2) {
        super(tokenizePanChimeraService);
        this.f90986e = messenger;
        this.f90957b = bArr;
        this.f90958c = askf;
        this.f90959h = str;
        btiy btiy = null;
        if (bArr2 != null) {
            try {
                btiy = (btiy) bxvk.m124016a(btiy.f149054c, bArr2, bxus.m123744c());
            } catch (bxwf e) {
                bnsl bnsl = (bnsl) f90956a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("atux", "<init>", 63, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to parse card id");
            }
        }
        this.f90960i = btiy;
    }

    /* renamed from: a */
    public static Message m76423a(byte[] bArr, AccountInfo accountInfo, String str, byte[] bArr2, String str2, Handler handler) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("data_orchestration_callback_data", bArr);
        bundle.putString("data_session_id", str);
        bundle.putByteArray("data_card_id", bArr2);
        return atvb.m76438a(17, bundle, accountInfo, str2, handler);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Boolean[] boolArr = (Boolean[]) objArr;
        bxvd da = btme.f149477d.mo74144da();
        bxtx a = bxtx.m123261a(this.f90957b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btme btme = (btme) da.f164949b;
        a.getClass();
        btme.f149479a = a;
        String str = this.f90959h;
        str.getClass();
        btme.f149481c = str;
        btiy btiy = this.f90960i;
        if (btiy != null) {
            btiy.getClass();
            btme.f149480b = btiy;
        }
        int i = 1;
        try {
            int b = btmf.m116918b(((btmg) atff.m75759a(this.f90958c, "t/cardtokenization/savetoplatform", da.mo74062i(), btmg.f149482b)).f149484a);
            if (b == 0) {
                b = 1;
            }
            return Integer.valueOf(btmf.m116917a(b));
        } catch (atfh e) {
            btmu a2 = atvb.m76439a(e.f90231a);
            if (a2 != null) {
                int b2 = btmt.m116934b(a2.f149548a);
                if (b2 != 0) {
                    i = b2;
                }
                if (i - 2 == 15) {
                    this.f90987f = e.f90231a;
                    byte[] k = a2.f149549b.mo73780k();
                    this.f90961j = k;
                    if (k == null || k.length == 0) {
                        this.f90988g = 102;
                        bnsl bnsl = (bnsl) f90956a.mo68388c();
                        bnsl.mo68432a("atux", "a", 111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Server should never return CVN_EXPIRED without a recovery token.");
                        return null;
                    }
                    this.f90988g = 108;
                    return null;
                }
            }
            bnsl bnsl2 = (bnsl) f90956a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("atux", "a", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Error saving to platform");
            return -1;
        } catch (IOException e2) {
            return -1;
        } catch (Exception e3) {
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Integer mo50212a(Boolean... boolArr) {
        bxvd da = btme.f149477d.mo74144da();
        bxtx a = bxtx.m123261a(this.f90957b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btme btme = (btme) da.f164949b;
        a.getClass();
        btme.f149479a = a;
        String str = this.f90959h;
        str.getClass();
        btme.f149481c = str;
        btiy btiy = this.f90960i;
        if (btiy != null) {
            btiy.getClass();
            btme.f149480b = btiy;
        }
        int i = 1;
        try {
            int b = btmf.m116918b(((btmg) atff.m75759a(this.f90958c, "t/cardtokenization/savetoplatform", da.mo74062i(), btmg.f149482b)).f149484a);
            if (b == 0) {
                b = 1;
            }
            return Integer.valueOf(btmf.m116917a(b));
        } catch (atfh e) {
            btmu a2 = atvb.m76439a(e.f90231a);
            if (a2 != null) {
                int b2 = btmt.m116934b(a2.f149548a);
                if (b2 != 0) {
                    i = b2;
                }
                if (i - 2 == 15) {
                    this.f90987f = e.f90231a;
                    byte[] k = a2.f149549b.mo73780k();
                    this.f90961j = k;
                    if (k == null || k.length == 0) {
                        this.f90988g = 102;
                        bnsl bnsl = (bnsl) f90956a.mo68388c();
                        bnsl.mo68432a("atux", "a", 111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Server should never return CVN_EXPIRED without a recovery token.");
                        return null;
                    }
                    this.f90988g = 108;
                    return null;
                }
            }
            bnsl bnsl2 = (bnsl) f90956a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("atux", "a", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Error saving to platform");
            return -1;
        } catch (IOException e2) {
            return -1;
        } catch (Exception e3) {
            return -1;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo50195a(Object obj) {
        Message message;
        Integer num = (Integer) obj;
        if (this.f90986e != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("data_request_type", 17);
            byte[] bArr = null;
            if (num == null) {
                try {
                    message = Message.obtain((Handler) null, this.f90988g);
                    btnf btnf = this.f90987f;
                    if (btnf != null) {
                        bArr = btnf.mo73642k();
                    }
                    bundle.putByteArray("tap_and_pay_api_error", bArr);
                    bundle.putByteArray("data_recovery_token", this.f90961j);
                } catch (RemoteException e) {
                    return;
                }
            } else {
                Message obtain = Message.obtain((Handler) null, 17001);
                bundle.putInt("data_response", num.intValue());
                message = obtain;
            }
            message.setData(bundle);
            this.f90986e.send(message);
        }
    }
}
