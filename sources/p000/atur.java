package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.util.Base64;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraService;

/* renamed from: atur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atur extends atvb {

    /* renamed from: a */
    private final String f90932a;

    /* renamed from: b */
    private final atds f90933b;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public atur(String str, Messenger messenger, atds atds, TokenizePanChimeraService tokenizePanChimeraService) {
        super(tokenizePanChimeraService);
        this.f90932a = str;
        this.f90986e = messenger;
        this.f90933b = atds;
    }

    /* renamed from: a */
    public static Message m76407a(String str, AccountInfo accountInfo, String str2, String str3, Handler handler) {
        Bundle bundle = new Bundle();
        bundle.putString("data_billing_id", str);
        bundle.putString("data_session_id", str3);
        return atvb.m76438a(8, bundle, accountInfo, str2, handler);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        String str;
        byte[] bArr;
        Void[] voidArr = (Void[]) objArr;
        try {
            atds atds = this.f90933b;
            String str2 = this.f90932a;
            atdz atdz = atds.f90151a;
            atdt b = atdz.mo49878b(atdz.mo49886d(), str2);
            if (b != null) {
                str = b.f90156b;
            } else {
                str = null;
            }
            if (str == null && atds.f90153c.mo49940a()) {
                atgu b2 = atds.f90152b.mo49954b(str2);
                if (b2 != null) {
                    str = b2.f90327d;
                } else {
                    str = null;
                }
            }
            if (str != null) {
                bArr = Base64.decode(str, 0);
            } else {
                bArr = null;
            }
            if (bArr != null) {
                if (bArr.length > 0) {
                    return (btjx) bxvk.m124016a(btjx.f149192h, bArr, bxus.m123744c());
                }
            }
            bxvd da = btjx.f149192h.mo74144da();
            btnv btnv = btnv.UNKNOWN_ACTIVATION_METHOD_TYPE;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((btjx) da.f164949b).f149197d = btnv.mo3214a();
            return (btjx) da.mo74062i();
        } catch (Exception e) {
            this.f90988g = 102;
            return null;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo50195a(Object obj) {
        mo50222a((btjx) obj, 8, 8001);
    }
}
