package p000;

import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: atts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atts extends atue {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public atts(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
    }

    /* renamed from: b */
    private final void m76330b(atsy atsy) {
        int i = atsy.f90831W;
        if (i == 0 || i == 1) {
            mo50180a(15, atsy);
        } else if (!atbq.m75408a(atsy.f90858u) || cgwn.f187872a.mo6606a().mo84643x()) {
            mo50180a(28, atsy);
        } else {
            mo50178a();
        }
    }

    /* renamed from: a */
    public final void mo50171a(Message message, atsy atsy) {
        if (message.what == 17001) {
            atsy.f90828T = message.getData().getInt("data_response", 0);
            m76330b(atsy);
        }
    }

    /* renamed from: a */
    public final void mo50169a(atsy atsy) {
        int i;
        Handler handler;
        if (atsy.f90816H == null || (!((i = atsy.f90828T) == 0 || i == -1) || atsy.mo50164b() || atsy.mo50167e() || atsy.f90862y)) {
            m76330b(atsy);
            return;
        }
        int i2 = atsy.f90831W;
        byte[] bArr = atsy.f90816H;
        AccountInfo accountInfo = atsy.f90857t;
        String str = atsy.f90849l;
        byte[] bArr2 = atsy.f90841d;
        String str2 = atsy.f90861x;
        if (i2 != 5) {
            handler = mo50185b();
        } else {
            handler = null;
        }
        try {
            mo50182a(atux.m76423a(bArr, accountInfo, str, bArr2, str2, handler));
        } catch (RemoteException e) {
        }
        if (i2 == 5) {
            this.f90898f.setResult(0);
            this.f90898f.finish();
        }
    }
}
