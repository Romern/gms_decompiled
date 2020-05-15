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

/* renamed from: atvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atvd extends atvb {

    /* renamed from: a */
    private final askf f91005a;

    /* renamed from: b */
    private final long f91006b;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public atvd(askf askf, Messenger messenger, TokenizePanChimeraService tokenizePanChimeraService, long j) {
        super(tokenizePanChimeraService);
        this.f91005a = askf;
        this.f90986e = messenger;
        this.f91006b = j;
    }

    /* renamed from: a */
    public static Message m76446a(long j, AccountInfo accountInfo, String str, Handler handler) {
        Bundle bundle = new Bundle();
        bundle.putLong("android_id", j);
        return m76438a(14, bundle, accountInfo, str, handler);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        int b;
        Void[] voidArr = (Void[]) objArr;
        try {
            btnp btnp = (btnp) atff.m75759a(this.f91005a, "t/termsofservice/get", btno.f149668a, btnp.f149670e);
            bxvd da = btqb.f149918g.mo74144da();
            int i = btnp.f149673b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btqb btqb = (btqb) da.f164949b;
            btqb.f149920a = i;
            btqb.f149921b = btnp.f149674c;
            String str = btnp.f149675d;
            str.getClass();
            btqb.f149923d = str;
            String str2 = btnp.f149672a;
            str2.getClass();
            btqb.f149924e = str2;
            String num = Integer.toString(201515033);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btqb btqb2 = (btqb) da.f164949b;
            num.getClass();
            btqb2.f149922c = num;
            btqb2.f149925f = this.f91006b;
            atff.m75759a(this.f91005a, "t/termsofservice/update", (btqb) da.mo74062i(), btqc.f149926a);
            return Boolean.TRUE;
        } catch (atfh e) {
            this.f90988g = 101;
            btnf btnf = e.f90231a;
            if (btnf != null) {
                this.f90987f = btnf;
                btmu a = atvb.m76439a(btnf);
                if (a != null && ((b = btmt.m116934b(a.f149548a)) == 0 || b != 2)) {
                    this.f90988g = 102;
                }
            }
            return Boolean.FALSE;
        } catch (IOException e2) {
            mo50221a(this.f91005a, (int) C0126R.string.tp_add_card_error_title, (int) C0126R.string.tp_add_card_error_content);
            return Boolean.FALSE;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo50195a(Object obj) {
        Message message;
        Boolean bool = (Boolean) obj;
        byte[] bArr = null;
        if (bool != null) {
            try {
                if (bool.booleanValue()) {
                    message = Message.obtain((Handler) null, 14001);
                    this.f90986e.send(message);
                }
            } catch (RemoteException e) {
                return;
            }
        }
        message = Message.obtain((Handler) null, this.f90988g);
        btnf btnf = this.f90987f;
        if (btnf != null) {
            bArr = btnf.serializeToBytes();
        }
        Bundle bundle = new Bundle();
        bundle.putByteArray("tap_and_pay_api_error", bArr);
        message.setData(bundle);
        this.f90986e.send(message);
    }
}
