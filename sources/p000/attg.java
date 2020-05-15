package p000;

import android.graphics.drawable.Drawable;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: attg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class attg extends atue {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public attg(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
    }

    /* renamed from: a */
    public final void mo50171a(Message message, atsy atsy) {
        int i;
        if (message.what == 11001) {
            boolean z = message.getData().getBoolean("data_attestation_success");
            boolean z2 = !z;
            atsy.f90851n = z2;
            if (z2) {
                atsy.f90831W = 4;
            }
            if (!z) {
                i = 5;
            } else {
                i = 29;
            }
            mo50180a(i, atsy);
        }
    }

    /* renamed from: a */
    public final void mo50169a(atsy atsy) {
        this.f90898f.mo59476a((Drawable) null);
        boolean z = atsy.f90852o;
        try {
            mo50182a(atus.m76409a(atsy.f90857t, atsy.f90861x, mo50185b()));
        } catch (RemoteException e) {
        }
    }
}
