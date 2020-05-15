package p000;

import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: attq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class attq extends atue {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public attq(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
    }

    /* renamed from: a */
    public final void mo50171a(Message message, atsy atsy) {
        if (message.what == 9001) {
            message.getData().setClassLoader(attq.class.getClassLoader());
            atsy.f90854q = message.getData().getString("data_wallet_id");
            atsy.f90855r = message.getData().getBoolean("data_warm_welcome_required", false);
            atsy.f90814F = message.getData().getByteArray("data_orchestration_verify_token");
            atsy.f90856s = message.getData().getBoolean("data_keyguard_setup_required", false);
            if (atsy.f90862y || atsy.mo50166d()) {
                mo50180a(10, atsy);
            } else {
                mo50180a(7, atsy);
            }
        }
    }

    /* renamed from: a */
    public final void mo50169a(atsy atsy) {
        String str;
        CardInfo cardInfo = atsy.f90811C;
        if (cardInfo != null) {
            str = cardInfo.f108340a;
        } else {
            str = null;
        }
        try {
            mo50182a(atuv.m76417a(str, atsy.f90812D, atsy.f90857t, atsy.f90861x, mo50185b()));
        } catch (RemoteException e) {
        }
    }
}
