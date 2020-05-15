package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraService;
import java.io.IOException;

/* renamed from: atuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atuv extends atvb {

    /* renamed from: a */
    private final askf f90944a;

    /* renamed from: b */
    private final String f90945b;

    /* renamed from: c */
    private final atds f90946c;

    /* renamed from: h */
    private final btjq f90947h;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public atuv(String str, btjq btjq, askf askf, Messenger messenger, TokenizePanChimeraService tokenizePanChimeraService) {
        super(tokenizePanChimeraService);
        this.f90945b = str;
        this.f90986e = messenger;
        this.f90944a = askf;
        this.f90946c = atds.m75666a(askf);
        this.f90947h = btjq;
    }

    /* renamed from: a */
    public static Message m76417a(String str, byte[] bArr, AccountInfo accountInfo, String str2, Handler handler) {
        Bundle bundle = new Bundle();
        bundle.putString("data_billing_id", str);
        bundle.putByteArray("data_untokenized_card", bArr);
        return atvb.m76438a(9, bundle, accountInfo, str2, handler);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            Bundle bundle = new Bundle();
            bundle.putBoolean("data_keyguard_setup_required", !asiu.m74181a(this.f90985d, this.f90944a.f89125c));
            bundle.putString("data_wallet_id", asix.m74200a(this.f90944a));
            bundle.putBoolean("data_warm_welcome_required", !TextUtils.equals("true", asiu.m74180a("seen_warm_welcome", this.f90985d, this.f90944a.f89125c)));
            btjq btjq = this.f90947h;
            if (btjq != null) {
                bundle.putByteArray("data_orchestration_verify_token", btjq.f149166c.getKey());
            }
            if (TextUtils.isEmpty(this.f90945b)) {
                return bundle;
            }
            CardInfo b = this.f90946c.mo49853b(this.f90945b);
            if (b != null) {
                bundle.putParcelable("data_card_info", b);
                return bundle;
            }
            throw new RuntimeException();
        } catch (asks | RuntimeException e) {
            try {
                this.f90946c.mo49859d();
            } catch (asks | atfh | IOException e2) {
            }
            this.f90988g = 102;
            return null;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo50195a(Object obj) {
        Message message;
        Bundle bundle;
        Bundle bundle2 = (Bundle) obj;
        byte[] bArr = null;
        if (bundle2 == null) {
            try {
                message = Message.obtain((Handler) null, this.f90988g);
                btnf btnf = this.f90987f;
                if (btnf != null) {
                    bArr = btnf.serializeToBytes();
                }
                bundle = new Bundle();
                bundle.putByteArray("tap_and_pay_api_error", bArr);
            } catch (RemoteException e) {
                return;
            }
        } else {
            bundle = bundle2;
            message = Message.obtain((Handler) null, 9001);
        }
        message.setData(bundle);
        this.f90986e.send(message);
    }
}
