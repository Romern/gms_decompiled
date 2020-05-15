package p000;

import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: atud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atud extends atue {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public atud(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
    }

    /* renamed from: a */
    public final void mo50171a(Message message, atsy atsy) {
        if (message.what == 20001) {
            mo50180a(11, atsy);
        }
    }

    /* renamed from: a */
    public final void mo50169a(atsy atsy) {
        if (!atgf.m75807a(this.f90898f).mo49940a() || !atbq.m75408a(atsy.f90858u) || atsy.f90863z) {
            mo50180a(11, atsy);
            return;
        }
        atsy.f90863z = true;
        try {
            mo50182a(atuz.m76430a(atsy.f90857t, atsy.f90861x, mo50185b()));
        } catch (RemoteException e) {
            mo50187b(0, 2);
            mo50178a();
        }
    }
}
