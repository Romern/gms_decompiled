package p000;

import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: attr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class attr extends atue {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public attr(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
    }

    /* renamed from: a */
    public final void mo50171a(Message message, atsy atsy) {
        if (message.what == 16001) {
            atsy.f90826R = message.getData().getInt("data_felica_current_default");
            atsy.f90831W = 1;
            mo50180a(30, atsy);
        }
    }

    /* renamed from: a */
    public final void mo50169a(atsy atsy) {
        if (!atgf.m75807a(this.f90898f).mo49940a()) {
            mo50184a((String) null, (String) null);
        } else if (!atsy.f90811C.mo59217a()) {
            mo50184a((String) null, (String) null);
        } else {
            try {
                mo50182a(atuw.m76419a(atsy.f90857t, atsy.f90861x, mo50185b(), atsy.f90811C));
            } catch (RemoteException e) {
                mo50187b(0, 2);
                mo50178a();
            }
        }
    }
}
