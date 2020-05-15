package p000;

import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: atuj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atuj extends atue {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public atuj(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
    }

    /* renamed from: a */
    public final void mo50171a(Message message, atsy atsy) {
        if (message.what == 14001) {
            mo50180a(10, atsy);
        }
    }

    /* renamed from: a */
    public final void mo50169a(atsy atsy) {
        try {
            mo50182a(atvd.m76446a(asjm.m74238a(this.f90898f), atsy.f90857t, atsy.f90861x, mo50185b()));
        } catch (RemoteException e) {
        }
    }
}
