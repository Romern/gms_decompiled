package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraService;

/* renamed from: atuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atuo extends atvb {

    /* renamed from: a */
    private static final srn f90921a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    public atuo(Messenger messenger, TokenizePanChimeraService tokenizePanChimeraService) {
        super(tokenizePanChimeraService);
        this.f90986e = messenger;
    }

    /* renamed from: a */
    public static Message m76398a(AccountInfo accountInfo, String str, Handler handler) {
        return atvb.m76438a(18, new Bundle(), accountInfo, str, handler);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            return Boolean.valueOf(asiu.m74181a(this.f90985d, askc.m74272b()));
        } catch (asks e) {
            bnsl bnsl = (bnsl) f90921a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atuo", "a", 45, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error looking up whether has seen keyguard setup");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Boolean mo50197a(Void... voidArr) {
        try {
            return Boolean.valueOf(asiu.m74181a(this.f90985d, askc.m74272b()));
        } catch (asks e) {
            bnsl bnsl = (bnsl) f90921a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atuo", "a", 45, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error looking up whether has seen keyguard setup");
            return null;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo50195a(Object obj) {
        Message message;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            try {
                message = Message.obtain((Handler) null, this.f90988g);
            } catch (RemoteException e) {
                return;
            }
        } else {
            Message obtain = Message.obtain((Handler) null, 18);
            Bundle bundle = new Bundle();
            bundle.putBoolean("data_keyguard_setup_required", !bool.booleanValue());
            obtain.setData(bundle);
            message = obtain;
        }
        this.f90986e.send(message);
    }
}
